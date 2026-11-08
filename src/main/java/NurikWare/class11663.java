package NurikWare;

import java.util.function.Supplier;
import minecraft.class02255;
import minecraft.class05018;
import minecraft.class08238;
import minecraft.class08523;
import minecraft.class08859;
import minecraft.class08861;
import minecraft.class08893;
import org.lwjgl.opengl.EXTDebugLabel;

public class class11663 extends class08859 {
   public class11663() {
      super();
   }

   public boolean y() {
      return true;
   }

   public void N(class08238 var1) {
      EXTDebugLabel.glLabelObjectEXT(35656, var1.y(), class05018.N(var1.L(), 256, true));
   }

   public void N(class08861 var1) {
      EXTDebugLabel.glLabelObjectEXT(32884, var1.N, class05018.N(var1.y.toString(), 256, true));
   }

   public void N(class02255 var1) {
      EXTDebugLabel.glLabelObjectEXT(35648, var1.method_1270(), class05018.N(var1.method_68404(), 256, true));
   }

   public void N(class08523 var1) {
      Supplier<String> supplier = var1.L;
      if (supplier != null) {
         EXTDebugLabel.glLabelObjectEXT(37201, var1.u, class05018.N(supplier.get(), 256, true));
      }
   }

   public void N(class08893 var1) {
      EXTDebugLabel.glLabelObjectEXT(5890, var1.N, class05018.N(var1.getLabel(), 256, true));
   }
}
