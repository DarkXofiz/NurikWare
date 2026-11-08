package NurikWare;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap.Entry;
import java.util.ArrayList;
import java.util.Iterator;

public class class09085 {
   public Object N_0;
   public Object N_1;
   public Object N_2;

   public class09086 L() {
      this.i();
      return ((class09083)this.N_2).y();
   }

   public boolean L(class09083 var1) {
      return var1 != null
         && (Integer)var1.N_0 == ((class09064)this.N_0).m()
         && (Integer)var1.N_1 == ((class09064)this.N_0).B()
         && ((class09096)var1.N_2).equals(((class09064)this.N_0).i((Integer)var1.N_0, (Integer)var1.N_1))
         && (class09057)var1.N_3 != null
         && ((class09057)var1.N_3).y()
         && !(Boolean)var1.N_6;
   }

   private class09083 L(int var1, int var2) {
      class09096 class09096 = ((class09064)this.N_0).i(var1, var2);
      class09060 class09060 = class09060.N();
      class09057 class09057x = class09060.N(class09096.y());
      class09057 class09057x = class09096.L() == null ? null : class09060.N(class09096.L());
      return new class09083(var1, var2, class09096, class09057x, class09057x);
   }

   public void M(class09083 var1) {
      if (var1 != null) {
         var1.N_6 = false;
         var1.N_7 = System.currentTimeMillis();
      }
   }

   public class09057 M() {
      if (!((class09064)this.N_0).v()) {
         return null;
      } else {
         this.i();
         this.u();
         return (class09057)((class09083)this.N_2).N_4;
      }
   }

   public class09085(class09064 var1) {
      super();
      this.U();
      this.N_1 = new Object2ObjectOpenHashMap();
      this.N_0 = var1;
   }

   public void B() {
      ObjectIterator objectiterator = ((Object2ObjectOpenHashMap)this.N_1).values().iterator();

      while (objectiterator.hasNext()) {
         Iterator iterator = ((ArrayList)objectiterator.next()).iterator();

         while (iterator.hasNext()) {
            ((class09083)iterator.next()).N();
         }
      }

      ((Object2ObjectOpenHashMap)this.N_1).clear();
      this.N_2 = null;
   }

   public class09086 B(class09083 var1) {
      return var1 == null ? null : var1.y();
   }

   private class09083 Z(class09083 var1) {
      class09062 class09062 = new class09062((Integer)var1.N_0, (Integer)var1.N_1);
      ((ArrayList)((Object2ObjectOpenHashMap)this.N_1).computeIfAbsent(class09062, var0 -> new ArrayList(1))).add(var1);
      return var1;
   }

   public boolean Z() {
      ObjectIterator objectiterator = ((Object2ObjectOpenHashMap)this.N_1).values().iterator();

      while (objectiterator.hasNext()) {
         for (class09083 class09083 : (ArrayList)objectiterator.next()) {
            if ((class09057)class09083.N_3 != null && ((class09057)class09083.N_3).y()) {
               return true;
            }
         }
      }

      return false;
   }

   public void i() {
      int i = ((class09064)this.N_0).m();
      int j = ((class09064)this.N_0).B();
      if ((class09083)this.N_2 != null
         && (Integer)((class09083)this.N_2).N_0 == i
         && (Integer)((class09083)this.N_2).N_1 == j
         && (class09057)((class09083)this.N_2).N_3 != null
         && ((class09057)((class09083)this.N_2).N_3).y()) {
         ((class09064)this.N_0).L(i, j);
      } else {
         this.N_2 = this.N(i, j, false);
         ((class09064)this.N_0).L((Integer)((class09083)this.N_2).N_0, (Integer)((class09083)this.N_2).N_1);
         this.u();
      }
   }

   public class09057 i(class09083 var1) {
      return var1 == null ? null : (class09057)var1.N_3;
   }

   private void U() {
   }

   public class09057 u(class09083 var1) {
      return var1 == null ? null : (class09057)var1.N_4;
   }

   public void u() {
      if ((class09083)this.N_2 != null) {
         ((class09083)this.N_2).N_7 = System.currentTimeMillis();
      }
   }

   public void y(class09083 var1) {
      if (var1 != null) {
         this.Z(var1);
         this.M(var1);
      }
   }

   public void y(int var1, int var2) {
      if ((class09083)this.N_2 == null || (Integer)((class09083)this.N_2).N_0 != var1 || (Integer)((class09083)this.N_2).N_1 != var2) {
         this.N_2 = this.N(new class09062(var1, var2));
      }
   }

   public boolean y() {
      return (class09083)this.N_2 != null && (class09057)((class09083)this.N_2).N_4 != null && ((class09057)((class09083)this.N_2).N_4).y();
   }

   public class09083 N(int var1, int var2) {
      return this.L(var1, var2);
   }

   private class09083 N(class09062 var1) {
      ArrayList arraylist = (ArrayList)((Object2ObjectOpenHashMap)this.N_1).get(var1);
      return arraylist != null && !arraylist.isEmpty() ? (class09083)arraylist.getFirst() : null;
   }

   public class09083 N() {
      class09083 class09083 = this.N(((class09064)this.N_0).m(), ((class09064)this.N_0).B(), true);
      class09083.N_6 = true;
      this.N_2 = class09083;
      ((class09064)this.N_0).L((Integer)class09083.N_0, (Integer)class09083.N_1);
      class09083.N_7 = System.currentTimeMillis();
      return class09083;
   }

   private class09083 N(int var1, int var2, boolean var3) {
      class09062 class09062 = new class09062(var1, var2);
      ArrayList arraylist = (ArrayList)((Object2ObjectOpenHashMap)this.N_1).get(class09062);
      if (arraylist != null) {
         for (class09083 class09083x : arraylist) {
            if (!var3 || !(Boolean)class09083x.N_6) {
               return class09083x;
            }
         }
      } else {
         arraylist = new ArrayList(1);
         ((Object2ObjectOpenHashMap)this.N_1).put(class09062, arraylist);
      }

      class09083 class09083x = this.L(var1, var2);
      arraylist.add(class09083x);
      return class09083x;
   }

   public class09083 N(class09083 var1) {
      class09083 class09083 = var1 == null ? this.N() : this.Z(var1);
      class09083.N_6 = true;
      this.N_2 = class09083;
      ((class09064)this.N_0).L((Integer)class09083.N_0, (Integer)class09083.N_1);
      class09083.N_7 = System.currentTimeMillis();
      return class09083;
   }

   public void N(long var1, long var3) {
      ArrayList arraylist = new ArrayList();
      ObjectIterator objectiterator = ((Object2ObjectOpenHashMap)this.N_1).object2ObjectEntrySet().iterator();

      while (objectiterator.hasNext()) {
         Entry entry = (Entry)objectiterator.next();
         ArrayList arraylist1 = (ArrayList)entry.getValue();
         arraylist1.removeIf(var5x -> {
            if (!var5x.N(var1, var3, ((class09064)this.N_0).Z())) {
               return false;
            } else {
               if (var5x == (class09083)this.N_2) {
                  this.N_2 = null;
               }

               var5x.N();
               return true;
            }
         });
         if (arraylist1.isEmpty()) {
            arraylist.add((class09062)entry.getKey());
         }
      }

      for (class09062 class09062 : arraylist) {
         ((Object2ObjectOpenHashMap)this.N_1).remove(class09062);
      }
   }

   public class09057 R() {
      this.i();
      this.u();
      return (class09057)((class09083)this.N_2).N_3;
   }

   public class09083 R(class09083 var1) {
      if (var1 == null) {
         return null;
      } else {
         class09062 class09062 = new class09062((Integer)var1.N_0, (Integer)var1.N_1);
         ArrayList arraylist = (ArrayList)((Object2ObjectOpenHashMap)this.N_1).get(class09062);
         if (arraylist != null) {
            arraylist.remove(var1);
            if (arraylist.isEmpty()) {
               ((Object2ObjectOpenHashMap)this.N_1).remove(class09062);
            }
         }

         if ((class09083)this.N_2 == var1) {
            this.N_2 = this.N(class09062);
         }

         var1.N_6 = false;
         var1.N_7 = System.currentTimeMillis();
         return var1;
      }
   }
}
