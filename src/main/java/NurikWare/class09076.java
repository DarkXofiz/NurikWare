package NurikWare;

import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;

public class class09076 implements AutoCloseable {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public boolean N_init;

   public void L(int var1) {
      class09083 class09083x = ((class09083[])this.N_2)[var1];
      if (class09083x != null) {
         ((class09083[])this.N_2)[var1] = null;
         class09083 class09083x = ((class09064[])this.N_1)[var1].y(class09083x);
         if (class09083x != null) {
            ((class09083[])this.N_3)[(Integer)this.N_5] = class09083x;
            ((int[])this.N_4)[(Integer)this.N_5] = var1;
            this.N_5 = (Integer)this.N_5 + 1;
         }
      }
   }

   private void L() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_5 = 0;
      }
   }

   class09076(class09065 var1) {
      super();
      this.L();
      this.N_0 = var1;
   }

   public class09057 i(int var1) {
      this.N(var1);
      return ((class09064[])this.N_1)[var1].N(((class09083[])this.N_2)[var1]);
   }

   @Override
   public void close() {
      class09064[] aclass09064 = (class09064[])this.N_1;
      class09083[] aclass09083 = (class09083[])this.N_2;

      for (int i = 0; i < aclass09064.length; i++) {
         class09083 class09083 = aclass09083[i];
         if (class09083 != null) {
            aclass09064[i].B(class09083);
            aclass09083[i] = null;
         }
      }

      for (int j = 0; j < (Integer)this.N_5; j++) {
         aclass09064[((int[])this.N_4)[j]].R(((class09083[])this.N_3)[j]);
         ((class09083[])this.N_3)[j] = null;
      }

      this.N_5 = 0;
      this.N_1 = null;
   }

   public class09057 u(int var1) {
      this.N(var1);
      return ((class09064[])this.N_1)[var1].u(((class09083[])this.N_2)[var1]);
   }

   public class09086 y(int var1) {
      this.N(var1);
      return ((class09064[])this.N_1)[var1].M(((class09083[])this.N_2)[var1]);
   }

   public class09076 N(class09064[] var1) {
      this.N_1 = var1;
      int i = var1.length;
      if ((class09083[])this.N_2 == null || ((class09083[])this.N_2).length < i) {
         this.N_2 = new class09083[i];
         this.N_3 = new class09083[i];
         this.N_4 = new int[i];
      }

      this.N_5 = 0;
      return this;
   }

   public void N(int var1) {
      if (((class09083[])this.N_2)[var1] == null) {
         class09064 class09064 = ((class09064[])this.N_1)[var1];
         ((class09065)this.N_0).R(class09064);
         class09083 class09083x = this.N(class09064, var1);
         class09083 class09083x = class09083x == null ? ((class09065)this.N_0).y(class09064) : class09064.L(class09083x);
         ((ObjectOpenHashSet)((class09065)this.N_0).N_0).add(class09064);
         ((class09083[])this.N_2)[var1] = class09083x;
      }
   }

   private class09083 N(class09064 var1, int var2) {
      for (int i = 0; i < (Integer)this.N_5; i++) {
         if (((int[])this.N_4)[i] == var2) {
            class09083 class09083 = ((class09083[])this.N_3)[i];
            if (var1.i(class09083)) {
               int k = (Integer)this.N_5 - 1;
               this.N_5 = k;
               int j = k;
               ((class09083[])this.N_3)[i] = ((class09083[])this.N_3)[j];
               ((int[])this.N_4)[i] = ((int[])this.N_4)[j];
               ((class09083[])this.N_3)[j] = null;
               return class09083;
            }
         }
      }

      return null;
   }
}
