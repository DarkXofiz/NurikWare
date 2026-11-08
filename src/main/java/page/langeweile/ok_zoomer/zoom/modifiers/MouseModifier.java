package page.langeweile.ok_zoomer.zoom.modifiers;

public interface MouseModifier {
   void tick(boolean var1);

   boolean getActive();

   double applyYModifier(double var1, double var3, double var5, double var7);

   double applyXModifier(double var1, double var3, double var5, double var7);
}
