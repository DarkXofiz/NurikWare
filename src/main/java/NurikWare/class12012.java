package NurikWare;

import com.mojang.blaze3d.opengl.GlStateManager;

public record class12012(boolean enabled, int srcRGB, int dstRGB, int srcA, int dstA) implements class12007 {
   public static Object R_0 = new class12012(true, 770, 771, 1, 0);
   public static Object R_1 = new class12012(true, 770, 1, 770, 1);
   public static Object R_2 = new class12012(true, 1, 771, 1, 771);
   public static Object R_3 = new class12012(false, 0, 0, 0, 0);

   public int L() {
      return this.dstA;
   }

   private static void M() {
      R_0 = null;
      R_1 = null;
      R_2 = null;
      R_3 = null;
   }

   public class12012(boolean enabled, int srcRGB, int dstRGB, int srcA, int dstA) {
      super();
      this.enabled = enabled;
      this.srcRGB = srcRGB;
      this.dstRGB = dstRGB;
      this.srcA = srcA;
      this.dstA = dstA;
   }

   static {
      M();
   }

   public int i() {
      return this.srcA;
   }

   public int u() {
      return this.dstRGB;
   }

   public boolean y() {
      return this.enabled;
   }

   @Override
   public void N() {
      if (this.enabled) {
         GlStateManager._enableBlend();
         GlStateManager._blendFuncSeparate(this.srcRGB, this.dstRGB, this.srcA, this.dstA);
      } else {
         GlStateManager._disableBlend();
      }
   }

   public int R() {
      return this.srcRGB;
   }
}
