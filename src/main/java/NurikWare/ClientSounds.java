package NurikWare;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import minecraft.class00392;
import minecraft.class03448;
import minecraft.class06202;
import minecraft.class06541;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.nfd.NFDFilterItem;
import org.lwjgl.util.nfd.NativeFileDialog;
import org.lwjgl.util.nfd.NFDFilterItem.Buffer;

@class11080(
   L = "ClientSounds",
   y = class11072.MISC,
   N = class11106.CLIENT
)
public class ClientSounds extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public static Object u_0 = LogManager.getLogger(String.class);

   public ClientSounds() {
      super();
      this.j();
      this.L_0 = class11524.N(this, "toggle-sounds", true);
      this.L_1 = new class11535("custom", false);
      this.L_2 = new class11535("default", true);
      this.L_3 = (class11517)class11524.N(this, "sound-type", (class11535)this.L_1, (class11535)this.L_2).N(var1 -> {
         this.j();
         return ((class11507)this.L_0).i();
      });
      this.L_4 = (class11532)class11524.N(this, "select-enable-sound", () -> this.y(false)).N(var1 -> {
         this.j();
         return ((class11535)this.L_1).U() && ((class11507)this.L_0).i();
      });
      this.L_5 = (class11532)class11524.N(this, "select-disable-sound", () -> this.y(true)).N(var1 -> {
         this.j();
         return ((class11535)this.L_1).U() && ((class11507)this.L_0).i();
      });
      this.L_6 = class11524.N(this, "volume", 100.0F, 50.0F, 100.0F, 1.0F);
   }

   static {
      s();
   }

   private static void s() {
      u_0 = null;
   }

   public class11504 m() {
      this.j();
      return (class11504)this.L_6;
   }

   private void j() {
   }

   private void y(boolean var1) {
      try {
         MemoryStack memorystack = MemoryStack.stackPush();

         label116: {
            label124: {
               try {
                  Path path = Paths.get(System.getProperty("user.home"), "Downloads");
                  Buffer buffer = NFDFilterItem.malloc(1, memorystack);
                  ((NFDFilterItem)buffer.get(0)).name(memorystack.UTF8("WAV files")).spec(memorystack.UTF8("wav"));
                  PointerBuffer pointerbuffer = memorystack.mallocPointer(1);
                  if (1 == NativeFileDialog.NFD_OpenDialog(pointerbuffer, buffer, path.toAbsolutePath().toString())) {
                     long i = pointerbuffer.get(0);
                     if (i == 0L) {
                        break label124;
                     }

                     try {
                        Path path1 = Paths.get(MemoryUtil.memUTF8(i));
                        if (!N(path1)) {
                           break label116;
                        }

                        Path path2 = ((Path)class11518.N_0).resolve("sounds");
                        Files.createDirectories(path2);
                        String s = var1 ? "custom-disable-sound.wav" : "custom-enable-sound.wav";
                        Path path3 = path2.resolve(s);
                        Files.copy(path1, path3, StandardCopyOption.REPLACE_EXISTING);
                        class11886.N(path3);
                     } finally {
                        NativeFileDialog.NFD_FreePath(i);
                     }
                  }
               } catch (Throwable throwable1) {
                  if (memorystack != null) {
                     try {
                        memorystack.close();
                     } catch (Throwable throwable) {
                        throwable1.addSuppressed(throwable);
                     }
                  }

                  throw throwable1;
               }

               if (memorystack != null) {
                  memorystack.close();
               }

               return;
            }

            if (memorystack != null) {
               memorystack.close();
            }

            return;
         }

         if (memorystack != null) {
            memorystack.close();
         }
      } catch (Exception exception) {
         class11303.N(new class11288(this), (class00392)class11921.N("error-please-report").N(class06541.field_1061));
         ((Logger)u_0).error(exception, exception);
      }
   }

   private static boolean N(Path var0) {
      String s = var0.getFileName().toString();
      int i = s.lastIndexOf(46);
      return i >= 0 && s.substring(i + 1).equalsIgnoreCase("wav");
   }

   @class11782
   public void N(class11403 var1) {
      this.j();
      if (((class11507)this.L_0).i() && (class03448)((class06202)super.y_0).T_3 != null) {
         class11067 class11067 = var1.N();
         if (class11067.R().N()) {
            boolean flag = class11067.U();
            if (((class11535)this.L_2).U()) {
               class11886.N(
                  flag
                     ? (class11901)class11901.staticFields_0ec612a2dc0263a258b66e8d510834aaf[0]
                     : (class11901)class11901.staticFields_0ec612a2dc0263a258b66e8d510834aaf[1]
               );
            } else {
               Path path = ((Path)class11518.N_0).resolve("sounds").resolve(flag ? "custom-enable-sound.wav" : "custom-disable-sound.wav");
               if (!Files.exists(path)) {
                  class11303.N(new class11288(this), (class00392)class11921.N("sound-does-not-exist").N(class06541.field_1061));
               } else {
                  class11886.y(path);
               }
            }
         }
      }
   }
}
