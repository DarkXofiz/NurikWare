package NurikWare;

public record class11915(
   boolean sneaking, boolean sprinting, boolean jumping, boolean water, boolean ground, double fallDistance, int jumpingCooldown, class11781 clientEntity
) {

   public boolean L() {
      return this.water;
   }

   public boolean M() {
      return this.sneaking;
   }


   public boolean B() {
      return this.ground;
   }

   public double i() {
      return this.fallDistance;
   }

   public class11781 u() {
      return this.clientEntity;
   }

   public boolean y() {
      return this.sprinting;
   }

   public int N() {
      return this.jumpingCooldown;
   }

   public boolean R() {
      return this.jumping;
   }
}
