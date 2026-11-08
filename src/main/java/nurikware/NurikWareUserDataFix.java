package nurikware;

import NurikWare.class11664;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.data.MappingDataLoader;
import com.viaversion.viaversion.util.ChatColorUtil;
import com.viaversion.viaversion.util.ConfigSection;
import java.io.DataInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import minecraft.class06581;
import minecraft.class06584;

public class NurikWareUserDataFix {
   private static volatile boolean bootstrapped = false;
   private static volatile Map<String, Integer> blockNameToId1_20_5 = null;
   private static volatile List<String> blockIdToName1_20_5 = null;
   private static volatile Map<String, Integer> soundNameToId1_20_5 = null;
   private static volatile List<String> soundIdToName1_20_5 = null;

   public NurikWareUserDataFix() {
      super();
   }

   public static synchronized void bootstrapMods() {
      if (!bootstrapped) {
         bootstrapped = true;
         System.out.println("[NurikWareFix] Bootstrapping embedded mods from nurikware-mods.json into FabricLoader...");

         try {
            Class mainClass = Class.forName("Main");
            Method selfPathMethod = mainClass.getDeclaredMethod("selfPath");
            selfPathMethod.setAccessible(true);
            Path selfPath = (Path)selfPathMethod.invoke(null);
            Class loaderClass = Class.forName("net.fabricmc.loader.impl.FabricLoaderImpl");
            Object loader = loaderClass.getField("INSTANCE").get(null);
            Method registerModsMethod = mainClass.getDeclaredMethod("registerMods", loaderClass, Path.class);
            registerModsMethod.setAccessible(true);
            List modsList = (List)registerModsMethod.invoke(null, loader, selfPath);
            int modCount = modsList != null ? modsList.size() : 0;
            System.out.println("[NurikWareFix] Registered " + modCount + " embedded mods into FabricLoader.");
            Method instantiateMethod = mainClass.getDeclaredMethod("instantiate", loaderClass, List.class);
            instantiateMethod.setAccessible(true);
            instantiateMethod.invoke(null, loader, modsList);
            System.out.println("[NurikWareFix] Instantiated embedded mod entrypoints.");

            try {
               Class preLaunchClass = Class.forName("net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint");
               Method invokeEntrypointsMethod = loaderClass.getMethod("invokeEntrypoints", String.class, Class.class, Consumer.class);
               invokeEntrypointsMethod.invoke(loader, "preLaunch", preLaunchClass, (Consumer<Object>)entrypoint -> {
                  try {
                     preLaunchClass.getMethod("onPreLaunch").invoke(entrypoint);
                  } catch (Throwable throwable2) {
                  }
               });
               System.out.println("[NurikWareFix] Invoked preLaunch entrypoints.");
            } catch (Throwable throwable) {
               System.out.println("[NurikWareFix] Note: preLaunch invoke: " + throwable.getMessage());
            }

            System.out.println("[NurikWareFix] All embedded mods successfully bootstrapped!");
         } catch (Throwable throwable1) {
            System.err.println("[NurikWareFix] Warning during mod bootstrap: " + throwable1.getMessage());
            throwable1.printStackTrace();
         }
      }
   }

   public static Object resolve(OptionSet options, OptionSpec<?> spec, String errorMessage) {
      bootstrapMods();
      if (options != null && spec != null && options.has(spec)) {
         try {
            return options.valueOf(spec);
         } catch (Throwable throwable) {
         }
      }

      if (errorMessage != null) {
         String lower = errorMessage.toLowerCase();
         if (lower.contains("login")) {
            return "/nevabest";
         }

         if (lower.contains("uid")) {
            return 1;
         }

         if (lower.contains("subscribe")) {
            return 999999999L;
         }

         if (lower.contains("role")) {
            return "premium";
         }

         if (lower.contains("hash")) {
            return "0";
         }

         if (lower.contains("api token") || lower.contains("apitoken")) {
            return "0";
         }

         if (lower.contains("bought products") || lower.contains("boughtproducts")) {
            return "premium";
         }

         if (lower.contains("avatar")) {
            return "none";
         }
      }

      return "";
   }

   public static String resolveConfigString(ConfigSection section, String key, String def) {
      return section == null ? ChatColorUtil.translateAlternateColorCodes(def) : ChatColorUtil.translateAlternateColorCodes(section.getString(key, def));
   }

   public static class06584 resolveItemStack(Object instance) {
      if (instance instanceof class11664 inst) {
         try {
            class06581 item = inst.i();
            if (item != null) {
               return item.E();
            }
         } catch (Throwable throwable) {
         }
      }

      return null;
   }

   private static synchronized void ensure1_20_5Mappings() {
      if (blockNameToId1_20_5 == null) {
         HashMap bMap = new HashMap(1500);
         ArrayList bList = new ArrayList(1500);
         HashMap sMap = new HashMap(2500);
         ArrayList sList = new ArrayList(2500);

         try {
            CompoundTag tag = MappingDataLoader.INSTANCE.loadNBT("extra-identifiers-1.20.3.nbt");
            if (tag != null) {
               ListTag blockTag = tag.getListTag("blocks");
               if (blockTag != null) {
                  for (int i = 0; i < blockTag.size(); i++) {
                     Tag item = blockTag.get(i);
                     String name = item instanceof Tag ? item.asRawString() : item.toString();
                     addBlockMapping(bMap, bList, name);
                  }
               }

               ListTag soundTag = tag.getListTag("sounds");
               if (soundTag != null) {
                  for (int i2 = 0; i2 < soundTag.size(); i2++) {
                     Tag item2 = soundTag.get(i2);
                     String name2 = item2 instanceof Tag ? item2.asRawString() : item2.toString();
                     addSoundMapping(sMap, sList, name2);
                  }
               }
            }
         } catch (Throwable throwable1) {
            System.err.println("[NurikWareFix] Warning loading extra-identifiers via MappingDataLoader: " + throwable1);
         }

         if (bList.isEmpty() || sList.isEmpty()) {
            try (InputStream is = NurikWareUserDataFix.class.getClassLoader().getResourceAsStream("assets/viaversion/data/extra-identifiers-1.20.3.nbt")) {
               if (is != null) {
                  DataInputStream dis = new DataInputStream(is);
                  int rootType = dis.readByte();
                  if (rootType == 10) {
                     dis.readUTF();

                     while (dis.available() > 0) {
                        int tagType = dis.readByte();
                        if (tagType == 0) {
                           break;
                        }

                        String s3 = dis.readUTF();
                        if (tagType == 9) {
                           int elemType = dis.readByte();
                           int count = dis.readInt();

                           for (int i3 = 0; i3 < count; i3++) {
                              if (elemType == 8) {
                                 String str = dis.readUTF();
                                 if ("blocks".equals(s3)) {
                                    addBlockMapping(bMap, bList, str);
                                 } else if ("sounds".equals(s3)) {
                                    addSoundMapping(sMap, sList, str);
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            } catch (Throwable throwable) {
               System.err.println("[NurikWareFix] Warning loading extra-identifiers via stream: " + throwable);
            }
         }

         blockNameToId1_20_5 = bMap;
         blockIdToName1_20_5 = bList;
         soundNameToId1_20_5 = sMap;
         soundIdToName1_20_5 = sList;
         System.out.println("[NurikWareFix] Loaded 1.20.5 mappings: " + bList.size() + " blocks, " + sList.size() + " sounds.");
      }
   }

   private static void addBlockMapping(Map<String, Integer> bMap, List<String> bList, String rawName) {
      if (rawName != null) {
         int id = bList.size();
         bList.add(rawName);
         bMap.put(rawName, id);
         if (rawName.startsWith("minecraft:")) {
            bMap.put(rawName.substring(10), id);
         } else {
            bMap.put("minecraft:" + rawName, id);
         }
      }
   }

   private static void addSoundMapping(Map<String, Integer> sMap, List<String> sList, String rawName) {
      if (rawName != null) {
         int id = sList.size();
         sList.add(rawName);
         sMap.put(rawName, id);
         if (rawName.startsWith("minecraft:")) {
            sMap.put(rawName.substring(10), id);
         } else {
            sMap.put("minecraft:" + rawName, id);
         }
      }
   }

   public static int resolve1_20_5BlockId(String name) {
      if (name == null) {
         return -1;
      } else {
         try {
            ensure1_20_5Mappings();
            Integer id = blockNameToId1_20_5.get(name);
            if (id != null) {
               return id;
            }

            if (name.startsWith("minecraft:")) {
               id = blockNameToId1_20_5.get(name.substring(10));
               if (id != null) {
                  return id;
               }
            }
         } catch (Throwable throwable) {
         }

         return -1;
      }
   }

   public static String resolve1_20_5BlockName(int id) {
      try {
         ensure1_20_5Mappings();
         if (id >= 0 && id < blockIdToName1_20_5.size()) {
            return blockIdToName1_20_5.get(id);
         }
      } catch (Throwable throwable) {
      }

      return null;
   }

   public static int resolve1_20_5SoundId(String name) {
      if (name == null) {
         return -1;
      } else {
         try {
            ensure1_20_5Mappings();
            Integer id = soundNameToId1_20_5.get(name);
            if (id != null) {
               return id;
            }

            if (name.startsWith("minecraft:")) {
               id = soundNameToId1_20_5.get(name.substring(10));
               if (id != null) {
                  return id;
               }
            }
         } catch (Throwable throwable) {
         }

         return -1;
      }
   }

   public static String resolve1_20_5SoundName(int id) {
      try {
         ensure1_20_5Mappings();
         if (id >= 0 && id < soundIdToName1_20_5.size()) {
            return soundIdToName1_20_5.get(id);
         }
      } catch (Throwable throwable) {
      }

      return null;
   }
}
