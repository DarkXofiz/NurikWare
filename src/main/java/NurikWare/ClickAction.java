package NurikWare;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@class11080(
   L = "ClickAction",
   y = class11072.MISC,
   N = class11106.BASE
)
public class ClickAction extends class11067 {
   public Object L_0;

   public ClickAction() {
      super();
      this.s();
      this.L_0 = new ArrayList();
      this.N(new class11554(this));
      this.N(new class11591(this));
      this.N(new class11552(this));
   }

   private void s() {
   }

   private void N(class11142 var1) {
      this.s();
      ((List)this.L_0).add(var1);
   }

   @class11782(
      u = true
   )
   public void N(class11400 var1) {
      this.s();
      Iterator iterator = ((List)this.L_0).iterator();

      while (iterator.hasNext()) {
         ((class11142)iterator.next()).N(var1);
      }
   }
}
