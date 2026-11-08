package NurikWare;

import java.util.Optional;
import minecraft.class02484;
import minecraft.class06517;
import minecraft.class06584;

public class class11592 extends class11561 {
   public static Object y_0;
   public Object L_0;
   public Object L_1;

   public class11592(AnarchyHelper var1, String var2, class11664 var3, String var4) {
      super(var1, var2, var3::N, var3.y(), var4);
      this.Z();
      this.L_0 = var3;
   }

   static {
      i();
   }

   private void Z() {
   }

   private static void i() {
      y_0 = 10;
   }

   private Optional<Integer> z() {
      this.Z();
      if ((Optional)this.L_1 == null) {
         try {
            this.L_1 = ((class06517)((class11664)this.L_0).N().a_(class02484.h, class06517.N)).R();
         } catch (IllegalStateException illegalstateexception) {
            return Optional.empty();
         }
      }

      return (Optional<Integer>)this.L_1;
   }

   @Override
   public boolean N(class06584 var1) {
      Optional<Integer> optional = ((class06517)var1.a_(class02484.h, class06517.N)).R();
      return optional.isEmpty() ? false : this.z().map(var1x -> class11300.N(var1x, optional.get(), 10)).orElse(false);
   }
}
