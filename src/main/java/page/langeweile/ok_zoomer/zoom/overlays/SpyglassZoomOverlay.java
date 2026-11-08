package page.langeweile.ok_zoomer.zoom.overlays;

import minecraft.class01054;
import minecraft.class01894;
import minecraft.class02233;
import minecraft.class04995;
import minecraft.class08394;
import page.langeweile.ok_zoomer.zoom.transitions.EasedTransitionMode;

public class SpyglassZoomOverlay implements ZoomOverlay {
   private final class01894 textureId;
   private float scale;
   private boolean active;

   @Override
   public void tick(boolean var1, double var2, EasedTransitionMode var4) {
      this.active = var1;
   }

   public SpyglassZoomOverlay(class01894 var1) {
      super();
      this.textureId = var1;
      this.scale = 0.5F;
      this.active = false;
   }

   @Override
   public boolean getActive() {
      return this.active;
   }

   @Override
   public boolean cancelOverlayRendering() {
      return true;
   }

   @Override
   public void renderOverlay(class01054 var1, class02233 var2, EasedTransitionMode var3) {
      int i = var1.N();
      int j = var1.y();
      float f = Math.min(i, j);
      float f1 = Math.min(i / f, j / f) * this.scale;
      int k = class04995.y(f * f1);
      int l = class04995.y(f * f1);
      int i1 = (i - k) / 2;
      int j1 = (j - l) / 2;
      int k1 = i1 + k;
      int l1 = j1 + l;
      var1.N(class08394.Na, this.textureId, i1, j1, 0.0F, 0.0F, k, l, k, l);
      var1.N(class08394.NH, 0, l1, i, j, -16777216);
      var1.N(class08394.NH, 0, 0, i, j1, -16777216);
      var1.N(class08394.NH, 0, j1, i1, l1, -16777216);
      var1.N(class08394.NH, k1, j1, i, l1, -16777216);
   }

   @Override
   public void tickBeforeRender(class02233 var1) {
      if (!this.active) {
         this.scale = 0.5F;
      } else {
         this.scale = class04995.B(0.5F * var1.N(), this.scale, 1.125F);
      }
   }
}
