package NurikWare;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Consumer;

public class class11973 {
   public Object N_0;
   public Object N_1;

   public class11973() {
      super();
      this.i();
      this.N_0 = new Object[0];
      this.N_1 = new ConcurrentLinkedQueue();
   }

   private void i() {
   }

   public void y() {
      ((Queue)this.N_1).clear();
   }

   public void N(class11959 var1, Consumer<class11989> var2) {
      synchronized ((Object)this.N_0) {
         if (var1 != null && !((Queue)this.N_1).isEmpty()) {
            ArrayList arraylist = null;

            class11989 class11989;
            while ((class11989 = (class11989)((Queue)this.N_1).poll()) != null) {
               if (class11989.y() == var1) {
                  var2.accept(class11989);
               } else {
                  if (arraylist == null) {
                     arraylist = new ArrayList();
                  }

                  arraylist.add(class11989);
               }
            }

            if (arraylist != null) {
               ((Queue)this.N_1).addAll(arraylist);
            }
         }
      }
   }

   public boolean N() {
      return ((Queue)this.N_1).isEmpty();
   }

   public void N(class11989 var1) {
      ((Queue)this.N_1).add(var1);
   }
}
