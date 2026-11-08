package NurikWare;

import minecraft.class00949;
import minecraft.class02689;

public record class09415(class02689 profile, boolean hat) implements class00949 {
   public class09415(class02689 profile, boolean hat) {
      super();
      this.profile = profile;
      this.hat = hat;
   }

   public boolean y() {
      return this.hat;
   }

   public class02689 N() {
      return this.profile;
   }
}
