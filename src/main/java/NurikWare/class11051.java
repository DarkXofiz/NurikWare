package NurikWare;

import minecraft.class01054;
import minecraft.class05216;
import minecraft.class07049;
import org.joml.Vector4f;

public abstract class class11051<T extends class07049> extends class11817 {
   public Object N_0;

   public class05216 L(T var1) {
      return var1.method_5476().L();
   }

   private void L() {
   }

   public void L(class01054 var1, class09093 var2, Vector4f var3, T var4) {
   }

   public class11051(EntityESP var1, String var2, boolean var3) {
      super(var2, var3);
      this.L();
      this.N_0 = var1;
   }

   public int u(T var1) {
      return -1442182646;
   }

   public int y(T var1) {
      return -1;
   }

   public void y(class01054 var1, class09093 var2, Vector4f var3, T var4) {
   }

   public void N(class01054 var1, class09093 var2, Vector4f var3, T var4) {
      this.N(var1, var2, var3, (T)var4, this.L((T)var4), this.y((T)var4), this.u((T)var4));
   }

   public void N(class01054 var1, class09093 var2, Vector4f var3, T var4, int var5) {
      this.L();
      float f = var3.x;
      float f1 = var3.y;
      float f2 = var3.z - f;
      float f3 = var3.w - f1;
      int i = -1291187702;
      float f4 = 1.0F;
      class11174 class11174 = (class11174)class11190.y_3;
      class11176.N(class11174.u(), f - 1.0F, f1 - 1.0F, 3.0F, f3 + 2.0F, i);
      class11176.N(class11174.u(), f - 1.0F + f2, f1 - 1.0F, 3.0F, f3 + 2.0F, i);
      class11176.N(class11174.u(), f + 2.0F, f1 - 1.0F, f2 - 3.0F, 3.0F, i);
      class11176.N(class11174.u(), f + 2.0F, f1 - 2.0F + f3, f2 - 3.0F, 3.0F, i);
      class11176.N(class11174.u(), f, f1, 1.0F, f3, var5);
      class11176.N(class11174.u(), f + f2, f1, 1.0F, f3, var5);
      class11176.N(class11174.u(), f + 1.0F, f1, f2 - 1.0F, 1.0F, var5);
      class11176.N(class11174.u(), f + 1.0F, f1 + f3 - 1.0F, f2 - 1.0F, 1.0F, var5);
      float f5 = (((EntityESP)this.N_0).m().i() - 4.0F) / 4.0F;
      var3.y = Math.round(var3.y - f5);
   }

   public void N(class01054 var1, class09093 var2, Vector4f var3, T var4, int var5, int var6) {
   }

   public void N(class01054 var1, class09093 var2, Vector4f var3, T var4, class05216 var5, int var6, int var7) {
      this.L();
      float f = ((EntityESP)this.N_0).m().i();
      float f1 = (f - 4.0F) / 4.0F;
      float f2 = var2.N(f, class09079.REGULAR, false) + f1;
      var3.y -= f2;
      float f3 = var3.x();
      float f4 = var3.y();
      float f5 = var3.z();
      float f6 = f3 + (f5 - f3) * 0.5F;
      float f7 = var2.y(var5, f, class09079.REGULAR, false);
      float f8 = f6 - f7 / 2.0F;
      var2.y(var5).N(f8, f4).N(f).y(var7).u(f1).N(class09079.REGULAR).i(var6).L();
   }
}
