package NurikWare;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00623;
import minecraft.class01311;
import minecraft.class05096;
import minecraft.class06202;
import minecraft.class06220;
import minecraft.class08844;
import org.joml.Vector2i;

public class class11753 {
   public static Object N_0;
   public static Object N_1;
   public static Object N_2;
   public static Object N_3;
   public static Object N_4 = class09991.N().N(class09962.N(100.0F)).y(class09962.N(100.0F));
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public Object y_6;
   public boolean y_init;

   public boolean L() {
      return y();
   }

   public class11753() {
      super();
      this.E();
      this.y_0 = class06202.Nq();
      class11742 class11742 = class11938.O();
      class11742.N("hud", "icons/atlases/hud");
      this.y_1 = new class11749(class11742);
      ((class11749)this.y_1).N(true);
      class11725 class11725 = new class11725();
      this.y_3 = new class09781(new class11594(), class11725, new class11736(class11725));
      class11725.N(((class09781)this.y_3).u());
      this.y_4 = new class09832((class09781)this.y_3);
      ((class09832)this.y_4).N(((class09832)this.y_4).y().N(240.0F).N(new class09833(true, 1100.0F, 16.0F, 4.0F)));
      this.y_2 = class09843.N((class09832)this.y_4, "hud", (var0, var1x) -> {
         int i = var1x.L("accent", class09181::N);
         return var1x.N((class09804<class09211>)class09211.N_6, class09211.N(i), () -> class09778.N((class09991)N_4, var1xx -> {
            ((List)class11730.N_7).forEach(var2x -> var1xx.y(var1x.N(var2x.E(), var2x.Z(), null)));
            var1xx.y(var1x.N("snapGuides", class11738::N, null));
         }));
      }, null);
      ((class09781)this.y_3).i().N(((class09843)this.y_2).N().y());
      ((class09843)this.y_2).y();
      class11938.L().y(this);
   }

   static {
      R();
   }

   private void Z() {
      boolean flag = !((class09832)this.y_4).y().i();
      ((class09832)this.y_4).N(((class09832)this.y_4).y().N(flag).N(flag ? class09770.L() : class09770.N));
   }

   public class09841 i() {
      return ((class09843)this.y_2).N();
   }

   private void U() {
      Vector2i vector2i = class11307.N(((class06220)((class06202)this.y_0).L_2).i(), ((class06220)((class06202)this.y_0).L_2).R());
      ((class09781)this.y_3).i().N(vector2i.x(), vector2i.y());
   }

   public float u() {
      return ((class09781)this.y_3).u().N();
   }

   public static boolean y() {
      return (class05096)class06202.Nq().v_3 instanceof class01311;
   }

   private void y(class11389 var1) {
      class09869 class09869 = ((class09781)this.y_3).i();
      switch (((int[])class11772.N_0)[var1.Z().ordinal()]) {
         case 1:
            this.U();
            if (var1.B()) {
               class09869.N(var1.z(), true);
            } else if (var1.M()) {
               class09869.N(var1.z(), false);
            }
            break;
         case 2:
            boolean flag = var1.L();
            class09869.N(var1.z(), var1.B() || flag, class11307.N(var1.R()), flag);
      }
   }

   private void E() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_5 = 0L;
         this.y_6 = false;
      }
   }

   @class11782(
      y = class11777.AFTER_ALL
   )
   public void N(class11389 var1) {
      if (!var1.y()) {
         if ((Boolean)class11938.L_3 && var1.Z().N(class11381.KEYBOARD) && var1.L(301)) {
            this.Z();
         } else if ((Boolean)class11938.L_3 && var1.Z().N(class11381.KEYBOARD) && var1.L(295)) {
            try {
               String s = class09820.y(((class09843)this.y_2).N().y(class09791.N().N(true)));
               Path path = Path.of("ui_dump_" + System.currentTimeMillis() + ".json");
               Files.writeString(path, s, StandardCharsets.UTF_8);
               class11303.N(
                  class00392.y("Hud dumped ")
                     .y(class00392.y(path.getFileName().toString()).N(var1x -> var1x.N(new class00623(path.toAbsolutePath().toString()))))
               );
            } catch (Exception exception) {
            }
         } else if (this.L()) {
            this.y(var1);
         }
      }
   }

   public float N(float var1, class09079 var2) {
      return ((class09781)this.y_3).y().N(var1, class09221.N(var2));
   }

   @class11782
   public void N(class10983 var1) {
      ((class09843)this.y_2).y();
   }

   @class11782
   public void N(class11376 var1) {
      if (this.L()) {
         ((class09781)this.y_3).i().N((float)var1.L());
      }
   }

   public void N() {
      ((class09843)this.y_2).y();
   }

   @class11782
   public void N(class10982 var1) {
      boolean flag = this.L();
      if (!flag && (Boolean)this.y_6) {
         ((class09781)this.y_3).i().N(0, false);
      }

      this.y_6 = flag;
      if (flag) {
         this.U();
      }

      class08844 class08844 = ((class06202)this.y_0).Nt();
      int i = Math.max(1, class08844.U());
      int j = Math.max(1, class08844.E());
      long k = System.nanoTime();
      float f = (Long)this.y_5 == 0L ? 0.0F : Math.max(0.0F, (float)(k - (Long)this.y_5) / 1.0E9F);
      this.y_5 = k;
      class09936 class09936 = ((class09843)this.y_2).N(i, j, f);
      if (!class09936.y().isEmpty()) {
         class11938.k().N(var1.N());
         class11925.N(((class06202)this.y_0).e(), false);
         ((class11749)this.y_1).N(var1.N(), class09936, ((class09781)this.y_3).u().N());
         if ((Boolean)class11938.L_3) {
            class09080.i().N(300.0F, 340.0F).N(32.0F).y(1677721600).u(4.0F).N(class09079.REGULAR).i(-6305237).y("hud " + ((class11749)this.y_1).L()).L();
         }
      }
   }

   public static void N(float var0) {
      class11753 class11753 = class11938.i();
      ((class09781)class11753.y_3).u().N(var0);
      ((class09843)class11753.y_2).y();
   }

   @class11782
   public void N(class11391 var1) {
      if (this.L()) {
         ((class09781)this.y_3).i().N(var1.L());
      }
   }

   public float N(String var1, float var2, class09079 var3) {
      return ((class09781)this.y_3).y().N(var1, var2, class09221.N(var3));
   }

   private static void R() {
      N_0 = 240;
      N_1 = 1100;
      N_2 = 16;
      N_3 = 4;
      N_4 = null;
   }
}
