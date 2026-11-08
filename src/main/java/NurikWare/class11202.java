package NurikWare;

import java.util.ArrayList;
import java.util.IdentityHashMap;

public class class11202 {
   public Object N_0;
   public Object N_1;

   private void L() {
   }

   class11202() {
      super();
      this.L();
      this.N_0 = new IdentityHashMap();
      this.N_1 = new ArrayList();
   }

   class09064[] u() {
      return ((ArrayList)this.N_1).toArray(new class09064[0]);
   }

   int N(class09064 var1) {
      Integer integer = (Integer)((IdentityHashMap)this.N_0).get(var1);
      if (integer != null) {
         return integer;
      } else {
         int i = ((ArrayList)this.N_1).size();
         ((IdentityHashMap)this.N_0).put(var1, i);
         ((ArrayList)this.N_1).add(var1);
         return i;
      }
   }
}
