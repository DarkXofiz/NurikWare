package NurikWare;

import minecraft.class06889;

public record class11266(class06889 origin, class06889 velocity, class11228 entityPrediction, float landingRadius) {

   public class06889 L() {
      return this.velocity;
   }

   public class11266(class06889 var1, class06889 var2, class11228 var3) {
      this(var1, var2, var3, 0.0F);
   }

   public class11266(class06889 origin, class06889 velocity, class11228 entityPrediction, float landingRadius) {
      super();
      this.origin = origin;
      this.velocity = velocity;
      this.entityPrediction = entityPrediction;
      this.landingRadius = landingRadius;
   }

   public class06889 i() {
      return this.origin;
   }

   public float u() {
      return this.landingRadius;
   }

   public class11241 y() {
      return this.N().N(null, this.origin, this.velocity);
   }

   public class11228 N() {
      return this.entityPrediction;
   }
}
