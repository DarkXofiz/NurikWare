package NurikWare;

import minecraft.class06202;
import minecraft.class08066;
import minecraft.class08893;
import org.joml.Matrix4f;

@class11080(
   L = "Saturation",
   y = class11072.VISUAL,
   N = class11106.WORLD
)
public class Saturation extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public Object u_0;
   public Object u_1;
   public Object u_2;

   private void T() {
   }

   public Saturation() {
      super();
      this.T();
      this.u_0 = class11524.N(this, "saturation", 0.0F, -1.0F, 3.0F, 0.1F);
      this.u_1 = new class10203(null, 1, 1, false);
      this.u_2 = class11174.N()
         .N(class11204.L().N((class12036)class12019.N_3).N((class09322)class11185.L_6).N(4).N())
         .N(class11213.N((class09087)class09063.N_2, 256, 16))
         .N();
      this.L_0 = ((class09322)class11185.L_6).z("u_projection");
      this.L_1 = ((class09322)class11185.L_6).z("u_view");
      this.L_2 = ((class09322)class11185.L_6).M("texture_in");
      this.L_3 = ((class09322)class11185.L_6).M("depth_texture_in");
      this.L_4 = ((class09322)class11185.L_6).i("alpha");
      this.L_5 = ((class09322)class11185.L_6).i("sky_protection");
      this.L_6 = new Matrix4f();
   }

   @class11782(
      y = class11777.BEFORE_ALL
   )
   public void N(class09321 var1) {
      this.T();
      class08066 class08066 = ((class06202)super.y_0).e();
      ((Matrix4f)this.L_6).setOrtho(0.0F, class08066.N, class08066.y, 0.0F, -1.0F, 1.0F);
      class11925.N((class08066)this.u_1, class08066.N, class08066.y);
      class11925.N(class08066, (class08066)this.u_1);
      class11925.N(class08066, false);
      class11176.N(((class11174)this.u_2).u(), 0.0F, 0.0F, 1.0F, class08066.N, class08066.y, -1);
      ((class11174)this.u_2).N(var2x -> {
         this.T();
         ((class12038)this.L_0).N((Matrix4f)this.L_6);
         ((class12038)this.L_1).N((Matrix4f)class11925.y_3);
         ((class12026)this.L_2).N(((class08893)((class08066)this.u_1).L()).N());
         ((class12026)this.L_3).N(33985, class11925.y(class08066));
         ((class11200)this.L_4).N(-((class11504)this.u_0).i());
         ((class11200)this.L_5).N(class11938.u().NR().U() ? 1.0F : 0.0F);
      });
   }
}
