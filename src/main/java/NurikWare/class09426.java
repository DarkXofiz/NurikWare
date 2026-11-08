package NurikWare;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class class09426 {
   public Object N_0;
   public Object N_1;

   private static void L() {
   }

   private void L(class09173 var1) {
      this.u(var1);
      this.N(var1.y().L(), var1);
   }

   public class09426() {
      super();
      this.N();
      this.N_0 = new Int2ObjectOpenHashMap();
      this.N_1 = this::L;
   }

   static {
      u();
      L();
      y();
   }

   private static void u() {
   }

   private void u(class09173 var1) {
      ObjectIterator objectiterator = ((Int2ObjectOpenHashMap)this.N_0).int2ObjectEntrySet().iterator();

      while (objectiterator.hasNext()) {
         List list = (List)((Entry)objectiterator.next()).getValue();
         list.removeIf(var1x -> var1x == var1);
         if (list.isEmpty()) {
            objectiterator.remove();
         }
      }
   }

   private static void y() {
   }

   public void y(class11389 var1) {
      List list = (List)((Int2ObjectOpenHashMap)this.N_0).get(var1.z());
      if (list != null) {
         List list1 = list.stream().filter(var1x -> var1x.u(var1)).toList();
         if (list1.isEmpty()) {
            list1 = list.stream().filter(var1x -> var1x.y(var1)).toList();
         }

         list1.forEach(var1x -> var1x.L(var1));
      }
   }

   public void y(class09173 var1) {
      this.u(var1);
      this.N(var1.y().L(), var1);
      var1.N((Consumer<class09173>)this.N_1);
   }

   private void N(int var1, class09173 var2) {
      if (!var2.B()) {
         List list = (List)((Int2ObjectOpenHashMap)this.N_0).computeIfAbsent(var1, var0 -> new ArrayList());
         if (!list.stream().anyMatch(var1x -> var1x == var2)) {
            list.add(var2);
         }
      }
   }

   private void N() {
   }

   public void N(class11389 var1) {
      List list = (List)((Int2ObjectOpenHashMap)this.N_0).get(var1.z());
      if (list != null) {
         list.stream().filter(var1x -> var1x.N(var1.z())).forEach(var1x -> var1x.N(var1));
      }
   }

   public void N(class09173 var1) {
      this.u(var1);
   }
}
