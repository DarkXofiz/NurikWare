package NurikWare;

import minecraft.class01421;
import minecraft.class03049;
import minecraft.class04453;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class07050;
import org.joml.Matrix4f;

@class11080(
   L = "Hands",
   y = class11072.VISUAL,
   N = class11106.WORLD
)
public class Hands extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;

   public Hands() {
      super();
      this.n();
      this.L_0 = class11524.N(this, "color-right", -7694081);
      this.L_1 = class11524.N(this, "color-left", -7694081);
      this.L_2 = class11524.N(this, "blur", 10.0F, 0.0F, 30.0F, 1.0F);
      this.L_3 = class11524.N(this, "texture-mix", 0.5F, 0.0F, 0.5F, 0.1F);
      this.L_4 = new class11247();
   }

   private void n() {
   }

   public boolean m() {
      this.n();
      return this.U() && ((class11247)this.L_4).y();
   }

   @Override
   public void y() {
      this.n();
      ((class11247)this.L_4).N();
   }

   public void N(class03049 var1, float var2, class01421 var3, class04453 var4, int var5, Matrix4f var6) {
      this.n();
      ((class11247)this.L_4).N(var1, var2, var3, var4, var5, var6, ((class11515)this.L_0).i(), ((class11515)this.L_1).i(), ((class11504)this.L_3).i());
   }

   @class11782
   public void N(class09321 var1) {
      this.n();
      if (((class05630)((class06202)super.y_0).i_7).NS().N() && !((class05630)((class06202)super.y_0).i_7).NG) {
         ((class11247)this.L_4).N(((class11504)this.L_2).i().intValue());
      } else {
         ((class11247)this.L_4).N();
      }
   }

   public boolean N(class07050 var1) {
      this.n();
      return ((class11247)this.L_4).N(var1);
   }
}
