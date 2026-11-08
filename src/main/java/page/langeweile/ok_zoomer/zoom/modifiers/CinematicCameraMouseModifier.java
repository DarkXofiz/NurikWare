package page.langeweile.ok_zoomer.zoom.modifiers;

import minecraft.class05016;
import minecraft.class05630;
import minecraft.class06202;

public class CinematicCameraMouseModifier implements MouseModifier {
   private final class05016 cursorXZoomSmoother = new class05016();
   private final class05016 cursorYZoomSmoother = new class05016();
   private final float multiplier;
   private boolean active;
   private class06202 minecraft;
   private boolean cinematicCameraEnabled;

   @Override
   public void tick(boolean var1) {
      this.ensureClient();
      if (this.multiplier == 1.0F && ((class05630)this.minecraft.i_7).Nd && !this.cinematicCameraEnabled) {
         this.cursorXZoomSmoother.N();
         this.cursorYZoomSmoother.N();
      }

      if (!var1 && this.active) {
         this.cursorXZoomSmoother.N();
         this.cursorYZoomSmoother.N();
      }

      this.cinematicCameraEnabled = ((class05630)this.minecraft.i_7).Nd;
      this.active = var1;
   }

   public CinematicCameraMouseModifier(float var1) {
      super();
      this.multiplier = var1;
      this.active = false;
      this.ensureClient();
   }

   @Override
   public boolean getActive() {
      return this.active;
   }

   @Override
   public double applyYModifier(double var1, double var3, double var5, double var7) {
      if (this.cinematicCameraEnabled) {
         this.cursorYZoomSmoother.N();
         return var1;
      } else {
         return this.cursorYZoomSmoother.N(var1, var5 * this.multiplier * var3);
      }
   }

   @Override
   public double applyXModifier(double var1, double var3, double var5, double var7) {
      if (this.cinematicCameraEnabled) {
         this.cursorXZoomSmoother.N();
         return var1;
      } else {
         return this.cursorXZoomSmoother.N(var1, var5 * this.multiplier * var3);
      }
   }

   private void ensureClient() {
      if (this.minecraft == null) {
         this.minecraft = class06202.Nq();
      }
   }
}
