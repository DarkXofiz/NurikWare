package NurikWare;

import java.util.List;
import minecraft.class01463;
import minecraft.class06202;
import minecraft.class06928;
import minecraft.class06930;
import minecraft.class06937;
import minecraft.class07481;
import minecraft.class07510;

public class class09669 implements class09670 {
   class06202 N = class06202.Nq();
   private final class01463 y;
   private final class09665 L;

   @Override
   public List<class06937> L() {
      return this.y.E().T;
   }

   public class09669(class01463 var1) {
      super();
      this.y = var1;
      this.L = (class09665)var1;
   }

   @Override
   public boolean u() {
      this.L.y(true);
      if (this.L.z() && this.L.U() == 1) {
         this.L.N(false);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean y(class06937 var1) {
      return false;
   }

   @Override
   public boolean y() {
      return this.y.getClass().isAnnotationPresent(class09691.class);
   }

   @Override
   public class06937 N(double var1, double var3) {
      return this.L.N(var1, var3);
   }

   @Override
   public boolean N(class06937 var1) {
      return var1 instanceof class06930 || var1 instanceof class07481 || var1 instanceof class06928;
   }

   @Override
   public void N(class06937 var1, class09690 var2, boolean var3) {
      this.L.y(var1, var1.u, var2.N(), var3 ? class07510.field_7794 : class07510.field_7790);
   }

   @Override
   public boolean N() {
      return this.y.getClass().isAnnotationPresent(class09683.class);
   }
}
