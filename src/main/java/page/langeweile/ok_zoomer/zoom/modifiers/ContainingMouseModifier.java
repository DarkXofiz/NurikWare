package page.langeweile.ok_zoomer.zoom.modifiers;

public class ContainingMouseModifier implements MouseModifier {
   private final MouseModifier[] modifiers;
   private boolean active;

   @Override
   public void tick(boolean var1) {
      boolean flag = false;

      for (MouseModifier mousemodifier : this.modifiers) {
         mousemodifier.tick(var1);
         if (var1) {
            flag = true;
         }
      }

      this.active = flag;
   }

   public ContainingMouseModifier(MouseModifier... var1) {
      super();
      this.modifiers = var1;
      this.active = false;
   }

   @Override
   public boolean getActive() {
      return this.active;
   }

   @Override
   public double applyYModifier(double var1, double var3, double var5, double var7) {
      double d0 = var1;

      for (MouseModifier mousemodifier : this.modifiers) {
         d0 = mousemodifier.applyYModifier(d0, var3, var5, var7);
      }

      return d0;
   }

   @Override
   public double applyXModifier(double var1, double var3, double var5, double var7) {
      double d0 = var1;

      for (MouseModifier mousemodifier : this.modifiers) {
         d0 = mousemodifier.applyXModifier(d0, var3, var5, var7);
      }

      return d0;
   }
}
