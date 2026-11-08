package NurikWare;

import minecraft.class01054;
import minecraft.class07049;
import minecraft.class07079;
import org.joml.Vector4f;

public class class11236 extends class11045<class07079> {
   public class11236(EntityESP var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   public void N(class01054 var1, class09093 var2, Vector4f var3, class07079 var4) {
      super.N(var1, var2, var3, var4);
      if (var4.method_16914()) {
         var3.y = Math.round(var3.y - 4.0F);
         this.N(var1, var2, var3, var4, var4.method_5797().L(), this.y(var4), this.u(var4));
      }
   }

   @Override
   public boolean test(class07049 var1) {
      return class11791.U().and(class11791.N()).test(var1);
   }
}
