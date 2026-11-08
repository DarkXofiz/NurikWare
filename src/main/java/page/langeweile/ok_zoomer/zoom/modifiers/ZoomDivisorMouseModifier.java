package page.langeweile.ok_zoomer.zoom.modifiers;

public class ZoomDivisorMouseModifier implements MouseModifier {
   private boolean active = false;

   @Override
   public void tick(boolean var1) {
      this.active = var1;
   }

   public ZoomDivisorMouseModifier() {
      super();
   }

   @Override
   public boolean getActive() {
      return this.active;
   }

   @Override
   public double applyYModifier(double var1, double var3, double var5, double var7) {
      return var1 * (this.active ? var7 : 1.0);
   }

   @Override
   public double applyXModifier(double var1, double var3, double var5, double var7) {
      return var1 * (this.active ? var7 : 1.0);
   }
}
