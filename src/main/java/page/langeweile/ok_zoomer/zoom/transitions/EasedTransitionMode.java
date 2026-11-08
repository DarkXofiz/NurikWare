package page.langeweile.ok_zoomer.zoom.transitions;

import it.unimi.dsi.fastutil.floats.FloatUnaryOperator;
import minecraft.class04995;

public class EasedTransitionMode {
   private final FloatUnaryOperator startTransition;
   private final FloatUnaryOperator endTransition;
   private final FloatUnaryOperator scrollTransition;
   private final int targetStartTicks;
   private final int targetEndTicks;
   private final int targetScrollTicks;
   private final boolean invertStartTransition;
   private final boolean invertEndTransition;
   private boolean active;
   private int ticks;
   private float startZoomMultiplier;
   private float startFadeMultiplier;
   private float lastZoomMultiplier;
   private float internalMultiplier;
   private float lastInternalMultiplier;
   private float internalFade;
   private float lastInternalFade;
   private boolean scrollMode;

   public void tick(boolean var1, double var2) {
      float f = (float)(1.0 / var2);
      float f1 = var1 ? 1.0F : 0.0F;
      boolean flag = var1 && this.targetStartTicks == 0 || !var1 && this.targetEndTicks == 0;
      if (flag) {
         this.internalMultiplier = var1 ? f : 1.0F;
         this.internalFade = var1 ? f1 : 1.0F;
         this.lastInternalMultiplier = this.internalMultiplier;
         this.lastInternalFade = this.internalFade;
      } else {
         int i = var1 ? (this.scrollMode ? this.targetScrollTicks : this.targetStartTicks) : this.targetEndTicks;
         int j = var1 ? this.targetEndTicks : this.targetStartTicks;
         boolean flag1 = var1 ? !this.scrollMode && this.invertStartTransition : this.invertEndTransition;
         if (this.ticks <= i) {
            this.ticks++;
         }

         this.lastInternalMultiplier = this.internalMultiplier;
         this.lastInternalFade = this.internalFade;
         if (this.active != var1) {
            if (var1 && this.ticks >= j) {
               this.internalMultiplier = 1.0F;
               this.internalFade = 0.0F;
            }

            this.ticks = 1;
            this.startZoomMultiplier = this.internalMultiplier;
            this.startFadeMultiplier = this.internalFade;
            this.scrollMode = false;
         }

         if (var1 && this.ticks != 1 && f != this.lastZoomMultiplier) {
            this.scrollMode = true;
            this.ticks = this.targetScrollTicks / 2;
            this.lastZoomMultiplier = this.internalMultiplier;
         }

         if (this.scrollMode) {
            if (this.targetScrollTicks == 0) {
               this.internalMultiplier = var1 ? f : 1.0F;
               this.lastInternalMultiplier = this.internalMultiplier;
            }

            if (f != this.lastZoomMultiplier) {
               this.ticks = 1;
               this.startZoomMultiplier = this.lastZoomMultiplier;
               this.startFadeMultiplier = f1;
            }
         }

         float f2 = (float)Math.min(this.ticks, i) / i;
         if (flag1) {
            f2 = 1.0F - f2;
         }

         float f3 = this.ticks <= i
            ? (var1 ? (this.scrollMode ? this.scrollTransition.apply(f2) : this.startTransition.apply(f2)) : this.endTransition.apply(f2))
            : 1.0F;
         f3 = Math.min(flag1 ? 1.0F - f3 : f3, 1.2F);
         if (this.ticks <= i) {
            this.internalMultiplier = class04995.B(f3, this.startZoomMultiplier, var1 ? f : 1.0F);
            this.internalFade = class04995.B(f3, this.startFadeMultiplier, var1 ? f1 : 0.0F);
         }
      }

      this.active = var1;
      this.lastZoomMultiplier = f;
   }

   public EasedTransitionMode(
      FloatUnaryOperator var1, FloatUnaryOperator var2, FloatUnaryOperator var3, int var4, int var5, int var6, boolean var7, boolean var8
   ) {
      super();
      this.startTransition = var1;
      this.endTransition = var2;
      this.scrollTransition = var3;
      this.targetStartTicks = var4;
      this.targetEndTicks = var5;
      this.targetScrollTicks = var6;
      this.invertStartTransition = var7;
      this.invertEndTransition = var8;
      this.active = false;
      this.ticks = 1;
      this.startZoomMultiplier = 1.0F;
      this.startFadeMultiplier = 0.0F;
      this.lastZoomMultiplier = 1.0F;
      this.internalMultiplier = 1.0F;
      this.lastInternalMultiplier = 1.0F;
      this.internalFade = 0.0F;
      this.lastInternalFade = 0.0F;
      this.scrollMode = false;
   }

   public double getInternalMultiplier() {
      return this.internalMultiplier;
   }

   public boolean getActive() {
      return this.active || this.ticks <= this.targetEndTicks;
   }

   public float applyZoom(float var1, float var2) {
      return var1 * class04995.B(var2, this.lastInternalMultiplier, this.internalMultiplier);
   }

   public float getFade(float var1) {
      return class04995.B(var1, this.lastInternalFade, this.internalFade);
   }
}
