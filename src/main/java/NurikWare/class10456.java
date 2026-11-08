package NurikWare;

import java.util.Date;
import minecraft.class01603;
import minecraft.class01829;
import minecraft.class04551;
import minecraft.class04580;
import minecraft.class08735;

public record class10456(
   String id,
   String name,
   class01829 dataVersion,
   int protocolVersion,
   class08735 resourcePackVersion,
   class08735 datapackVersion,
   Date buildTime,
   boolean stable
) implements class04551 {

   public class08735 y() {
      return this.datapackVersion;
   }

   public class08735 N() {
      return this.resourcePackVersion;
   }

   public boolean comp_4031() {
      return this.stable;
   }

   public Date comp_4030() {
      return this.buildTime;
   }

   public int comp_4027() {
      return this.protocolVersion;
   }

   public String comp_4024() {
      return this.id;
   }

   public class01829 comp_4026() {
      return this.dataVersion;
   }

   public String comp_4025() {
      return this.name;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public class08735 method_70592(class01603 var1) {
      return switch (class04580.N[var1.ordinal()]) {
         case 1 -> this.resourcePackVersion;
         case 2 -> this.datapackVersion;
         default -> throw new MatchException(null, null);
      };
   }
}
