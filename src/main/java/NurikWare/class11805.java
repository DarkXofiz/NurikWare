package NurikWare;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11805 {
   public static Object N_0 = LogManager.getLogger(String.class);
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;

   private static void L() {
   }

   private String L(class11808 var1) {
      Class<?> oclass = var1.M();
      return oclass == null ? "" : oclass.getName();
   }

   private List<class11808> L(List<class11808> var1) {
      int i = var1.size();
      if (i < 2) {
         return var1;
      } else {
         HashMap hashmap = new HashMap();

         for (int j = 0; j < i; j++) {
            Class<?> oclass = ((class11808)var1.get(j)).M();
            if (oclass != null) {
               hashmap.computeIfAbsent(oclass, var0 -> new ArrayList<>()).add(j);
            }
         }

         ArrayList arraylist = new ArrayList(i);

         for (int i1 = 0; i1 < i; i1++) {
            arraylist.add(new HashSet());
         }

         int[] aint = new int[i];

         for (int k = 0; k < i; k++) {
            class11808 class11808 = (class11808)var1.get(k);

            for (Class<?> oclass1 : class11808.y()) {
               for (int l : hashmap.getOrDefault(oclass1, List.of())) {
                  if (l != k && ((Set)arraylist.get(l)).add(k)) {
                     aint[k]++;
                  }
               }
            }

            for (Class oclass2 : class11808.R()) {
               for (int j2 : hashmap.getOrDefault(oclass2, List.of())) {
                  if (j2 != k && ((Set)arraylist.get(k)).add(j2)) {
                     aint[j2]++;
                  }
               }
            }
         }

         Comparator comparator = Comparator.comparing(var2x -> this.L((class11808)var1.get(var2x))).thenComparingInt(var0 -> var0);
         PriorityQueue priorityqueue = new PriorityQueue(comparator);

         for (int j1 = 0; j1 < i; j1++) {
            if (aint[j1] == 0) {
               priorityqueue.add(j1);
            }
         }

         ArrayList arraylist1 = new ArrayList(i);
         boolean[] aboolean = new boolean[i];

         while (!priorityqueue.isEmpty()) {
            int k1 = (Integer)priorityqueue.poll();
            arraylist1.add((class11808)var1.get(k1));
            aboolean[k1] = true;

            for (int i2 : (Set)arraylist.get(k1)) {
               if (--aint[i2] == 0) {
                  priorityqueue.add(i2);
               }
            }
         }

         if (arraylist1.size() < i) {
            ArrayList arraylist2 = new ArrayList();

            for (int l1 = 0; l1 < i; l1++) {
               if (!aboolean[l1]) {
                  arraylist2.add((class11808)var1.get(l1));
               }
            }

            String s = ((class11808)var1.get(0)).u().getName();
            List list = arraylist2.stream().map(this::L).toList();
            if ((Boolean)class11938.L_3) {
               throw new IllegalStateException("Cyclic before/after for event " + s + ": " + list);
            }

            ((Logger)N_0).warn("Cyclic before/after for event {}; ignoring ordering for: {}", s, list);
            arraylist2.sort(Comparator.comparing(this::L));
            arraylist1.addAll(arraylist2);
         }

         return arraylist1;
      }
   }

   public <T> void L(T var1) {
      class11784 class11784x = var1 instanceof class11784 class11784x ? class11784x : null;
      if (class11784x != null) {
         class11784x.N(false);
      }

      class11818 class11818 = (class11818)((ClassValue)this.y_2).get(var1.getClass());
      if (class11818 != null) {
         class11808[] aclass11808 = class11818.y();
         Consumer<Object>[] consumer = class11818.N();

         for (int i = 0; i < consumer.length; i++) {
            if (class11784x == null || !class11784x.y() || !aclass11808[i].i()) {
               try {
                  consumer[i].accept(var1);
               } catch (Exception exception) {
                  ((Logger)N_0).error("Event handler failed: {}", var1.getClass().getName(), exception);
               }
            }
         }
      }
   }

   public class11805(Object var1) {
      super();
      this.i();
      this.y_0 = new ConcurrentHashMap();
      this.y_1 = new ConcurrentHashMap();
      this.y_2 = new class11800(this);
      this.y_3 = new ArrayList();
      ((List)this.y_3).add(new class11803(var1.getClass().getPackageName(), (var0, var1x) -> (Lookup)var0.invoke(null, var1x, MethodHandles.lookup())));
      this.y(var1);
   }

   static {
      L();
      N();
      y();
      u();
   }

   private void i() {
   }

   private static void u() {
      N_0 = null;
   }

   private void y(class11808 var1) {
      Class<?> oclass = var1.u();
      ((Map)this.y_1).compute(oclass, (var2x, var3) -> {
         ArrayList arraylist = var3 == null ? new ArrayList() : new ArrayList<>(Arrays.asList(var3.y()));
         arraylist.add(var1);
         return this.N(arraylist);
      });
      ((ClassValue)this.y_2).remove(oclass);
   }

   private static void y() {
   }

   public void y(Object var1) {
      this.N(var1.getClass(), var1).forEach(this::y);
   }

   private class11795 y(Class<?> var1) {
      synchronized ((List)this.y_3) {
         for (class11803 class11803 : (List)this.y_3) {
            if (var1.getName().startsWith(class11803.y())) {
               return class11803.N();
            }
         }
      }

      throw new RuntimeException("No registered lambda factory for '" + var1.getName() + "'.");
   }

   private List<class11808> y(List<class11808> var1) {
      EnumMap enummap = new EnumMap<>(class11777.class);

      for (class11808 class11808 : var1) {
         enummap.computeIfAbsent(class11808.L(), var0 -> new ArrayList<>()).add(class11808);
      }

      ArrayList arraylist = new ArrayList(var1.size());

      for (class11777 class11777 : class11777.values()) {
         List list = (List)enummap.get(class11777);
         if (list != null) {
            arraylist.addAll(this.L(list));
         }
      }

      return arraylist;
   }

   public <T> void N(class11777 var1, boolean var2, Class<T> var3, class11826<T> var4) {
      this.y((class11808)(new class11780(var3, var1, var2, var4)));
   }

   private void N(class11808 var1) {
      Class<?> oclass = var1.u();
      ((Map)this.y_1).computeIfPresent(oclass, (var2x, var3) -> {
         ArrayList arraylist = new ArrayList<>(Arrays.asList(var3.y()));
         arraylist.remove(var1);
         return arraylist.isEmpty() ? null : this.N(arraylist);
      });
      ((ClassValue)this.y_2).remove(oclass);
   }

   private void N(List<class11808> var1, Class<?> var2, Object var3) {
      for (Method method : var2.getDeclaredMethods()) {
         if (this.N(method)) {
            var1.add(new class11779(this.y(var2), var2, var3, method));
         }
      }

      if (var2.getSuperclass() != null) {
         this.N(var1, var2.getSuperclass(), var3);
      }
   }

   private List<class11808> N(Class<?> var1, Object var2) {
      return ((Map)this.y_0).computeIfAbsent(var2, var2x -> {
         ArrayList arraylist = new ArrayList();
         this.N(arraylist, var1, var2x);
         return arraylist;
      });
   }

   public <T> void N(Class<T> var1, class11826<T> var2) {
      this.N(class11777.NOW, false, var1, var2);
   }

   private boolean N(Method var1) {
      return var1.isAnnotationPresent(class11782.class)
         && var1.getReturnType() == void.class
         && var1.getParameterCount() == 1
         && !var1.getParameters()[0].getType().isPrimitive();
   }

   private class11818 N(List<class11808> var1) {
      class11808[] aclass11808 = this.y(var1).toArray(var0 -> new class11808[var0]);
      Consumer[] aconsumer = new Consumer[aclass11808.length];

      for (int i = 0; i < aclass11808.length; i++) {
         aconsumer[i] = aclass11808[i].N();
      }

      return new class11818(aclass11808, aconsumer);
   }

   public void N(Object var1) {
      this.N(var1.getClass(), var1).forEach(this::N);
   }

   private static void N() {
   }

   public <T> void N(class11777 var1, Class<T> var2, class11826<T> var3) {
      this.N(var1, false, var2, var3);
   }
}
