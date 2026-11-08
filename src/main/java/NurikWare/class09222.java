package NurikWare;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00623;
import minecraft.class05096;
import minecraft.class06202;
import minecraft.class06220;
import minecraft.class06428;
import minecraft.class07533;
import minecraft.class07536;
import minecraft.class08844;
import org.joml.Vector2i;

public class class09222 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public Object N_7;
   public static Object y_0 = Duration.ofMillis(250L);
   public static Object y_1;
   public static Object y_2;
   public static Object y_3;
   public static Object y_4 = new class09079[]{class09079.REGULAR, class09079.MEDIUM, class09079.SEMI_BOLD, class09079.BOLD};
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public boolean L_init;
   public static Object u_0;
   public static Object u_1;
   public static Object u_2;
   public static Object u_3;

   public static float L() {
      return ((class09781)class11938.w().N_6).u().N();
   }

   private boolean L(class11389 var1) {
      class09904 class09904 = ((class09781)this.N_6).i().L();
      if (class09904 != null && class09904.y() == class10049.INPUT) {
         int i = var1.z();
         if (i != 256 && i != 257 && i != 335) {
            return false;
         } else {
            boolean flag = var1.L();
            ((class09781)this.N_6).i().N(var1.z(), var1.B() || flag, class11307.N(var1.R()), flag);
            ((class09781)this.N_6).i().R();
            return true;
         }
      } else {
         return false;
      }
   }

   private void T() {
      Vector2i vector2i = class11307.N(((class06220)((class06202)this.N_0).L_2).i(), ((class06220)((class06202)this.N_0).L_2).R());
      ((class09781)this.N_6).i().N(vector2i.x(), vector2i.y());
   }

   public class09222() {
      super();
      this.s();
      this.N_0 = class06202.Nq();
      this.N_1 = class09097.i(() -> Math.max(1, ((class06202)this.N_0).Nt().U()), () -> Math.max(1, ((class06202)this.N_0).Nt().E()));
      this.N_2 = new class11934(class11903.FORWARDS);
      this.N_3 = new class09205();
      class11742 class11742 = class11938.O();
      class11742.N("menu", "icons/atlases/menu");
      this.N_4 = new class11749(class11742);
      class11725 class11725 = new class11725();
      this.N_6 = new class09781(new class11594(), class11725, new class11736(class11725));
      class11725.N(((class09781)this.N_6).u());
      this.N_7 = new class09832((class09781)this.N_6);
      this.N_5 = class09843.N(
         (class09832)this.N_7,
         "root",
         (var0, var1x) -> {
            int i = var1x.L("accent", class09181::N);
            return var1x.N(
               (class09804<class09211>)class09211.N_6,
               class09211.N(i),
               () -> class09778.y().N((class09991)class09180.N_1).N(new Object[]{var1x.N("menu", (class09788)class09193.N_2, null)})
            );
         },
         null
      );
      ((class09781)this.N_6).i().N(((class09843)this.N_5).N().y());
      class11938.L().y(this);
      this.u();
   }

   static {
      E();
   }

   private void B() {
      boolean flag = this.U();
      if ((Boolean)this.L_1 != flag) {
         this.L_1 = flag;
         if (flag) {
            class06428.y();
         } else {
            class06428.N();
         }
      }
   }

   private boolean i(class11389 var1) {
      class09857 class09857 = class11307.N(var1.R());
      if (class07536.m() == class07533.field_1137 ? !class09857.u() : !class09857.N()) {
         return false;
      } else {
         int i = var1.z();
         if (i >= 49 && i <= 57) {
            class09193.N(i - 49);
            return true;
         } else {
            if ((Boolean)class11938.L_3 && i == 295) {
               try {
                  class09773 class09773 = ((class09843)this.N_5).N().y(class09791.N().N(true));
                  String s = class09820.y(class09773);
                  Path path = Path.of("ui_dump_" + System.currentTimeMillis() + ".json");
                  Files.writeString(path, s, StandardCharsets.UTF_8);
                  class00405 class00405 = class00405.N.N(new class00623(path.toAbsolutePath().toString()));
                  class11303.N(class00392.y("Menu dumped ").y(class00392.y(path.getFileName().toString()).L(class00405)));
               } catch (Exception exception) {
               }
            }

            if (i == 70) {
               class09904 class09904 = class09216.N();
               if (class09904 != null) {
                  class09869 class09869 = ((class09781)this.N_6).i();
                  if (class09869.L() == class09904) {
                     class09869.R();
                  } else {
                     class09869.L(class09904);
                  }
               }

               return true;
            } else if (i == 44) {
               class09193.L();
               return true;
            } else {
               return false;
            }
         }
      }
   }

   public static boolean i() {
      class09222 class09222 = class11938.w();
      return class09222 != null && (Boolean)class09222.L_0;
   }

   private void s() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = false;
         this.L_1 = false;
         this.L_2 = 0L;
      }
   }

   private void t() {
      ((class09781)this.N_6).i().N(0, false);
      this.L_0 = false;
      this.L_2 = 0L;
      ((class11934)this.N_2).N(0.0, (Duration)y_0, (class11887)class11905.u_4);
      if ((class05096)((class06202)this.N_0).v_3 == null) {
         ((class06220)((class06202)this.N_0).L_2).Z();
      }
   }

   private boolean U() {
      if (!(Boolean)this.L_0) {
         return false;
      } else {
         class09904 class09904 = ((class09781)this.N_6).i().L();
         return class09904 != null && class09904.y() == class10049.INPUT;
      }
   }

   private void z() {
      ((class09832)this.N_7).N(((class09832)this.N_7).y().N(240.0F).N(new class09833(true, 1100.0F, 16.0F, 4.0F)));
      this.L_2 = 0L;
      this.L_0 = true;
      ((class11934)this.N_2).N(1.0, (Duration)y_0, (class11887)class11905.u_4);
      ((class09843)this.N_5).y();
   }

   private boolean z(int var1) {
      return switch (var1) {
         case 256 -> {
            this.t();
            yield true;
         }
         case 301 -> {
            if (!(Boolean)class11938.L_3) {
               yield false;
            } else {
               this.W();
               yield true;
            }
         }
         default -> false;
      };
   }

   public void u() {
      class09093 class09093 = class09080.u();

      for (class09079 class09079 : (class09079[])y_4) {
         class09093.N(1.0F, class09079, false);
      }

      class09093.u();
   }

   private void u(class11389 var1) {
      class09869 class09869 = ((class09781)this.N_6).i();
      switch (((int[])class09197.N_0)[var1.Z().ordinal()]) {
         case 1:
            this.T();
            if (var1.B()) {
               class09869.N(var1.z(), true);
            } else if (var1.M()) {
               class09869.N(var1.z(), false);
            }

            var1.N();
            break;
         case 2:
            boolean flag = var1.L();
            class09869.N(var1.z(), var1.B() || flag, class11307.N(var1.R()), flag);
            if (y()) {
               var1.N();
            }
      }
   }

   public static boolean y() {
      class09222 class09222 = class11938.w();
      return class09222 == null ? false : class09222.U();
   }

   private boolean y(class11389 var1) {
      if (!(Boolean)this.L_0) {
         return false;
      } else if (!var1.B()) {
         return false;
      } else if (this.L(var1)) {
         var1.N();
         return true;
      } else if (this.i(var1)) {
         var1.N();
         return true;
      } else if (this.z(var1.z())) {
         var1.N();
         return true;
      } else {
         return false;
      }
   }

   private static void E() {
      u_0 = 240;
      u_1 = 1100;
      u_2 = 16;
      u_3 = 4;
      y_0 = null;
      y_1 = 0.85F;
      y_2 = 0.95F;
      y_3 = 0.9F;
      y_4 = null;
   }

   @class11782(
      y = class11777.BEFORE
   )
   public void N(class11389 var1) {
      if (!var1.y()) {
         if (!var1.Z().N(class11381.KEYBOARD) || !this.y(var1)) {
            if ((Boolean)this.L_0) {
               this.u(var1);
            }
         }
      }
   }

   @class11782
   public void N(class11391 var1) {
      if ((Boolean)this.L_0) {
         ((class09781)this.N_6).i().N(var1.L());
         var1.N();
      }
   }

   @class11782
   public void N(class10983 var1) {
      ((class09843)this.N_5).y();
   }

   public static void N() {
      class09222 class09222 = class11938.w();
      if (class09222 != null) {
         if ((Boolean)class09222.L_0) {
            class09222.t();
         } else {
            ((class06220)((class06202)class09222.N_0).L_2).z();
            class09222.z();
         }
      }
   }

   @class11782
   public void N(class11376 var1) {
      if ((Boolean)this.L_0) {
         ((class09781)this.N_6).i().N((float)var1.L());
         var1.N();
      }
   }

   public static void N(float var0) {
      class09222 class09222 = class11938.w();
      ((class09781)class09222.N_6).u().N(var0);
      ((class09843)class09222.N_5).y();
   }

   public static float N(String var0, float var1, class09079 var2) {
      return ((class09781)class11938.w().N_6).y().N(var0, var1, class09221.N(var2));
   }

   @class11782
   public void N(class11403 var1) {
      if ((Boolean)this.L_0) {
         ((class09843)this.N_5).y();
      }
   }

   @class11782
   public void N(class11388 var1) {
      if ((Boolean)this.L_0) {
         var1.N();
      }
   }

   @class11782(
      y = class11777.AFTER_ALL
   )
   public void N(class10989 var1) {
      this.B();
      ((class11934)this.N_2).N();
      float f = ((class11934)this.N_2).E().floatValue();
      if ((Boolean)this.L_0 || ((class11934)this.N_2).M()) {
         class08844 class08844 = ((class06202)this.N_0).Nt();
         int i = Math.max(1, class08844.U());
         int j = Math.max(1, class08844.E());
         this.T();
         long k = System.nanoTime();
         float f1 = (Long)this.L_2 == 0L ? 0.0F : Math.max(0.0F, (float)(k - (Long)this.L_2) / 1.0E9F);
         this.L_2 = k;
         class09936 class09936 = ((class09843)this.N_5).N(i, j, f1);
         class11938.k().N(var1.y());
         float f2 = ((class09781)this.N_6).u().N();
         if (f < 0.999F) {
            class09086 class09086 = ((class09065)class09065.y_0).L((class09064)this.N_1);
            ((class11749)this.N_4).N(var1.y(), class09936, f2, class09086);
            if ((Boolean)class11938.L_3) {
               class09080.i().N(300.0F, 300.0F).N(32.0F).y(1677721600).u(4.0F).N(class09079.REGULAR).i(-6305237).y("menu " + ((class11749)this.N_4).L()).L();
            }

            class11925.N(((class06202)this.N_0).e(), true);
            float f3 = i * 0.5F;
            float f4 = j * 0.5F;
            class09904 class09904x = ((class09843)this.N_5).N().y();
            class09904 class09904x = class09193.u();
            if (class09904x != null && class09904x.c().u() > 0.0F && class09904x.c().i() > 0.0F) {
               class09898 class09898 = class09904x.c();
               f3 = (class09898.y() + class09898.u() * 0.5F) / class09904x.c().u() * i;
               f4 = (class09898.L() + class09898.i() * 0.5F) / class09904x.c().i() * j;
            }

            ((class09205)this.N_3).N(((class09064)this.N_1).U(), i, j, f3, f4, f, 0.85F, 0.95F, 0.9F);
         } else {
            class11925.N(((class06202)this.N_0).e(), false);
            ((class11749)this.N_4).N(var1.y(), class09936, f2);
            if ((Boolean)class11938.L_3) {
               class09080.i().N(300.0F, 300.0F).N(32.0F).y(1677721600).u(4.0F).N(class09079.REGULAR).i(-6305237).y("menu " + ((class11749)this.N_4).L()).L();
            }
         }
      }
   }

   private void W() {
      boolean flag = !((class09832)this.N_7).y().i();
      ((class09832)this.N_7).N(((class09832)this.N_7).y().N(flag).N(flag ? class09770.L() : class09770.N));
   }
}
