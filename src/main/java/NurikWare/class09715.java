package NurikWare;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;

public final class class09715 {
   private final class09781 N;
   private final Map<class10021, class09710> y = new IdentityHashMap<>();
   private final Set<class10021> L = Collections.newSetFromMap(new IdentityHashMap<>());

   public boolean L(class10021 var1) {
      class09710 class09710 = this.y.get(var1);
      if (class09710 != null && !class09710.N.isEmpty()) {
         Iterator<class09738> iterator = class09710.N.values().iterator();

         while (iterator.hasNext()) {
            if (iterator.next().i().y()) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private class09715(class09781 var1) {
      super();
      this.N = Objects.requireNonNull(var1, "context");
   }

   public void u(class10021 var1) {
      if (var1 != null) {
         ArrayDeque arraydeque = new ArrayDeque();
         arraydeque.push(var1);

         while (!arraydeque.isEmpty()) {
            class10021 class10021 = (class10021)arraydeque.pop();
            this.y.remove(class10021);
            this.L.remove(class10021);

            for (int i = 0; i < class10021.u(); i++) {
               arraydeque.push(class10021.N(i));
            }
         }
      }
   }

   public class09741 y(float var1) {
      if (!(var1 <= 0.0F) && !this.y.isEmpty()) {
         boolean flag = false;
         boolean flag1 = false;
         Iterator<Entry<class10021, class09710>> iterator = this.y.entrySet().iterator();

         while (iterator.hasNext()) {
            Entry entry = iterator.next();
            class10021 class10021 = (class10021)entry.getKey();
            class09710 class09710 = (class09710)entry.getValue();
            if (class09710.N.isEmpty()) {
               iterator.remove();
            } else if (class09710.y) {
               class09710.y = false;
            } else {
               class09980 class09980x = class10021.o();
               class09996 class09996 = null;
               ArrayList arraylist = null;
               Iterator<class09738> iterator1 = class09710.N.values().iterator();

               while (iterator1.hasNext()) {
                  class09738 class09738 = iterator1.next();
                  boolean flag2 = class09738.N(var1);
                  if (flag2 || class09738.N()) {
                     if (class09996 == null) {
                        class09996 = class09980x.R();
                     }

                     class09738.i().N(class09996, class09738);
                     if (class09738.N()) {
                        iterator1.remove();
                        if (arraylist == null) {
                           arraylist = new ArrayList(2);
                        }

                        arraylist.add(class09738.i());
                     }
                  }
               }

               class09980 class09980x = class09996 == null ? class09980x : class09996.N();
               boolean flag5 = !class09980x.N(class09980x);
               boolean flag3 = !class09980x.y(class09980x);
               boolean flag4 = !class09980x.L(class09980x);
               if (flag5 || flag3 || flag4) {
                  class10021.N(class09980x);
                  if (flag5) {
                     class10021.i(2);
                     flag1 = true;
                  } else if (flag3) {
                     class10021.i(4);
                  } else {
                     class10021.i(1);
                  }

                  flag = true;
               }

               N(class10021, arraylist, class09710.N.isEmpty());
               if (class09710.N.isEmpty()) {
                  iterator.remove();
               }
            }
         }

         return class09741.N(flag, flag1);
      } else {
         return class09741.N;
      }
   }

   public boolean y(class10021 var1) {
      class09710 class09710 = this.y.get(var1);
      return class09710 != null && !class09710.N.isEmpty();
   }

   private static void N(class10021 var0, class09736 var1, boolean var2) {
      class09863.N(new class09842(var0, var1, var2));
   }

   private static void N(class10021 var0, List<class09736> var1, boolean var2) {
      if (var1 != null && !var1.isEmpty()) {
         for (class09736 class09736 : var1) {
            N(var0, class09736, var2);
         }
      }
   }

   public static class09715 N(class09781 var0) {
      return var0.N(class09715.class).orElseGet(() -> {
         class09715 class09715 = new class09715(var0);
         var0.N(class09715.class, class09715);
         return class09715;
      });
   }

   public boolean N(class10021 var1) {
      if (var1 == null) {
         return false;
      } else {
         ArrayDeque arraydeque = new ArrayDeque();
         arraydeque.push(var1);

         while (!arraydeque.isEmpty()) {
            class10021 class10021 = (class10021)arraydeque.pop();
            class09710 class09710 = this.y.get(class10021);
            if (class10021.T() && class09710 != null && !class09710.N.isEmpty()) {
               return true;
            }

            for (int i = 0; i < class10021.u(); i++) {
               arraydeque.push(class10021.N(i));
            }
         }

         return false;
      }
   }

   private class09980 N(class10021 var1, class09980 var2, class10002 var3) {
      if (var3 != null && !var3.N()) {
         class09980 class09980x = var3.N(var2);
         class09713 class09713 = var2.A();
         class09980 class09980x = var2;
         class09710 class09710 = null;

         for (class09736 class09736 : class09736.values()) {
            if (class09736.N(class09980x, var2)) {
               class09743 class09743 = class09713.N(class09736);
               if (class09743.u() && class09736.y(class09980x, var2, class09743)) {
                  if (class09710 == null) {
                     class09710 = new class09710(true);
                  }

                  class09710.N.put(class09736, class09736.N(class09980x, var2, class09743));
                  class09980x = class09736.y(class09980x, class09980x);
               }
            }
         }

         if (class09710 != null && !class09710.N.isEmpty()) {
            this.y.put(var1, class09710);
         }

         return class09980x;
      } else {
         return var2;
      }
   }

   public class09980 N(class10021 var1, class09980 var2, class09980 var3, class10002 var4) {
      if (var1 != null && var2 != null && var3 != null) {
         if (!this.L.contains(var1)) {
            this.L.add(var1);
            this.y.remove(var1);
            return this.N(var1, var3, var4);
         } else {
            class09980 class09980 = var3;
            class09710 class09710 = this.y.computeIfAbsent(var1, var0 -> new class09710(false));
            class09713 class09713 = var3.A();

            for (class09736 class09736 : class09736.values()) {
               if (!class09736.N(var2, var3)) {
                  class09710.N.remove(class09736);
               } else {
                  class09743 class09743 = class09713.N(class09736);
                  if (class09743.u() && class09736.y(var2, var3, class09743)) {
                     class09738 class09738x = class09710.N.get(class09736);
                     if (class09738x != null && class09738x.N(class09743) && class09736.N(class09738x, var3)) {
                        class09980 = class09736.y(var2, class09980);
                     } else if (class09738x != null && class09738x.y(class09743) && class09738x.y(class09736.N(var3))) {
                        class09980 = class09736.N(class09980, class09738x.u());
                     } else {
                        class09738 class09738x = class09736.N(var2, var3, class09743);
                        class09710.N.put(class09736, class09738x);
                        class09980 = class09736.y(var2, class09980);
                     }
                  } else {
                     class09710.N.remove(class09736);
                  }
               }
            }

            if (class09710.N.isEmpty()) {
               this.y.remove(var1);
            }

            return class09980;
         }
      } else {
         return var3;
      }
   }

   public boolean N(float var1) {
      return this.y(var1).N();
   }
}
