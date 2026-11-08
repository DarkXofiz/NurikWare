import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import net.fabricmc.loader.api.metadata.CustomValue;
import net.fabricmc.loader.impl.FabricLoaderImpl;

public final class Main {
   private static final String MC_MAIN = "net.minecraft.client.main.Main";
   private static final String MODS_RESOURCE = "/nurikware-mods.json";

   public static void main(String[] v0) throws Throwable {
      Path v1 = resolveGameDir(v0);
      Files.createDirectories(v1);
      Path v2 = selfPath();
      System.setProperty("java.awt.headless", "true");
      System.setProperty("fabric.development", "false");
      System.setProperty("fabric.skipMcProvider", "true");
      System.setProperty("mixin.env.remapRefMap", "false");
      System.setProperty("user.dir", v1.toString());
      FabricLoaderImpl v3 = FabricLoaderImpl.INSTANCE;
      v3.setGameDir(v1);
      v3.setLaunchArguments(v0);
      v3.setRawGameVersion(readGameVersion());
      List v4 = registerMods(v3, v2);
      instantiate(v3, v4);
      v3.invokeEntrypoints("preLaunch", PreLaunchEntrypoint.class, PreLaunchEntrypoint::onPreLaunch);
      Class v5 = Class.forName("net.minecraft.client.main.Main");
      Method v6 = v5.getDeclaredMethod("main", String[].class);
      v6.setAccessible(true);
      v6.invoke(null, v0);
   }

   private static Path resolveGameDir(String[] v0) {
      for (int i1 = 0; i1 < v0.length - 1; i1++) {
         if ("--gameDir".equals(v0[i1])) {
            return Paths.get(v0[i1 + 1]).toAbsolutePath().normalize();
         }
      }

      return Paths.get(".").toAbsolutePath().normalize();
   }

   private static Path selfPath() {
      try {
         Serializable v0 = Main.class.getProtectionDomain().getCodeSource().getLocation().toURI();
         Path v1 = Paths.get(v0);
         if (Files.isRegularFile(v1)) {
            try {
               FileSystem v2 = FileSystems.newFileSystem(v1, (ClassLoader)null);
               return v2.getRootDirectories().iterator().next();
            } catch (Throwable throwable) {
            }
         }

         return v1;
      } catch (Throwable throwable1) {
         return Paths.get(".").toAbsolutePath().normalize();
      }
   }

   private static String readGameVersion() {
      try {
         String v3;
         try (Object v0 = Main.class.getResourceAsStream("/version.json")) {
            if (v0 == null) {
               return "1.21.11";
            }

            Object v1 = NurikWareJson.parse(new String(v0.readAllBytes(), StandardCharsets.UTF_8));
            Object v2 = ((Map)v1).get("id");
            v3 = v2 == null ? "1.21.11" : v2.toString();
         }

         return v3;
      } catch (Throwable throwable1) {
         return "1.21.11";
      }
   }

   private static List<Object[]> registerMods(FabricLoaderImpl v0, Path v1) throws Exception {
      ArrayList v2 = new ArrayList();
      InputStream v3 = Main.class.getResourceAsStream("/nurikware-mods.json");
      if (v3 == null) {
         return v2;
      } else {
         Object v5 = v3;

         String v4;
         try {
            v4 = new String(v5.readAllBytes(), StandardCharsets.UTF_8);
         } catch (Throwable throwable1) {
            if (v3 != null) {
               try {
                  v5.close();
               } catch (Throwable throwable) {
                  throwable1.addSuppressed(throwable);
               }
            }

            throw throwable1;
         }

         if (v3 != null) {
            v3.close();
         }

         Object object3 = NurikWareJson.parse(v4);
         Object v6 = (List)object3;
         Object v7 = Collections.singletonList(v1);

         for (Object v9 : v6) {
            Map v10 = (Map)v9;
            NurikWareMeta v11 = new NurikWareMeta(
               str(v10.get("id")),
               str(v10.get("name")),
               str(v10.get("desc")),
               str(v10.get("version")),
               str(v10.get("environment")),
               toCvMap(v10.get("custom")),
               toStrMap(v10.get("contact")),
               toStrList(v10.get("license")),
               toStrList(v10.get("provides")),
               toStrList(v10.get("authors")),
               v10.get("icon") == null ? null : str(v10.get("icon"))
            );
            NurikWareContainer v12 = new NurikWareContainer(v11, v7);
            v0.registerMod(v12);
            Object v13 = v10.get("entrypoints");
            if (v13 instanceof List) {
               for (Object v15 : (List)v13) {
                  List v16 = (List)v15;
                  v2.add(new Object[]{str(v16.get(0)), str(v16.get(1)), v12});
               }
            }
         }

         return v2;
      }
   }

   private static void instantiate(FabricLoaderImpl v0, List<Object[]> v1) {
      for (Object[] v3 : v1) {
         String v4 = (String)v3[0];
         String v5 = (String)v3[1];
         NurikWareContainer v6 = (NurikWareContainer)v3[2];

         try {
            v0.registerEntrypoint(v4, create(v5), v6);
         } catch (Throwable throwable) {
            System.err.println("[NurikWare] entrypoint " + v4 + " " + v5 + " failed: " + throwable);
         }
      }
   }

   private static Object create(String v0) throws Throwable {
      int i1 = v0.indexOf("::");
      if (i1 < 0) {
         Serializable oclass1 = Class.forName(v0);
         Object constructor = oclass1.getDeclaredConstructor();
         constructor.setAccessible(true);
         return constructor.newInstance();
      } else {
         Serializable v2 = v0.substring(0, i1);
         Object v3 = v0.substring(i1 + 2);
         Class v4 = Class.forName(v2);

         for (Method v8 : v4.getDeclaredMethods()) {
            if (v8.getName().equals(v3) && v8.getParameterCount() == 0) {
               v8.setAccessible(true);
               return new Main.MethodEntry(v8);
            }
         }

         Object field = v4.getDeclaredField(v3);
         field.setAccessible(true);
         return field.get(null);
      }
   }

   private static String str(Object v0) {
      return v0 == null ? "" : v0.toString();
   }

   private static List<String> toStrList(Object v0) {
      ArrayList v1 = new ArrayList();
      if (v0 instanceof List) {
         for (Object v3 : (List)v0) {
            if (v3 != null) {
               v1.add(v3.toString());
            }
         }
      }

      return v1;
   }

   private static Map<String, String> toStrMap(Object v0) {
      LinkedHashMap v1 = new LinkedHashMap();
      if (v0 instanceof Map) {
         for (Entry v3 : ((Map)v0).entrySet()) {
            if (v3.getValue() != null) {
               v1.put(v3.getKey().toString(), v3.getValue().toString());
            }
         }
      }

      return v1;
   }

   private static Map<String, CustomValue> toCvMap(Object v0) {
      LinkedHashMap v1 = new LinkedHashMap();
      if (v0 instanceof Map) {
         for (Entry v3 : ((Map)v0).entrySet()) {
            v1.put(v3.getKey().toString(), toCv(v3.getValue()));
         }
      }

      return v1;
   }

   private static CustomValue toCv(Object v0) {
      if (v0 == null) {
         return NurikWareCv.Nil.INSTANCE;
      } else if (v0 instanceof Map) {
         Cloneable linkedhashmap = new LinkedHashMap();

         for (Object entry : ((Map)v0).entrySet()) {
            linkedhashmap.put(entry.getKey().toString(), toCv(entry.getValue()));
         }

         return new NurikWareCv.Obj(linkedhashmap);
      } else if (!(v0 instanceof List)) {
         if (v0 instanceof Boolean) {
            return new NurikWareCv.Bool((Boolean)v0);
         } else {
            return (CustomValue)(v0 instanceof Number ? new NurikWareCv.Num((Number)v0) : new NurikWareCv.Str(v0.toString()));
         }
      } else {
         Cloneable v1 = new ArrayList();

         for (Object v3 : (List)v0) {
            v1.add(toCv(v3));
         }

         return new NurikWareCv.Arr(v1);
      }
   }

   private Main() {
      super();
   }

   private static final class MethodEntry implements ModInitializer, ClientModInitializer, PreLaunchEntrypoint {
      private final Method m;

      MethodEntry(Method var1) {
         super();
         this.m = var1;
      }

      private void call() {
         try {
            this.m.invoke(null);
         } catch (Throwable throwable) {
            throw throwable instanceof RuntimeException ? (RuntimeException)throwable : new RuntimeException(throwable);
         }
      }

      public void onInitialize() {
         this.call();
      }

      public void onInitializeClient() {
         this.call();
      }

      public void onPreLaunch() {
         this.call();
      }
   }
}
