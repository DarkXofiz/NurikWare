package NurikWare;

import jdk.jfr.FlightRecorderListener;
import jdk.jfr.Recording;
import minecraft.class03196;
import minecraft.class03223;

public class class10159 implements FlightRecorderListener {
   public class10159(class03223 var1) {
      super();
      this.N = var1;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void recordingStateChanged(Recording var1) {
      switch (class03196.N[var1.getState().ordinal()]) {
         case 1:
            this.N.N();
         case 2:
         case 3:
         case 4:
         case 5:
      }
   }
}
