package NurikWare;

import java.util.Arrays;
import java.util.List;

public class class11218<C> implements class11192<C> {
   public static Object N_0;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;

   class11218(List<class11171<C>> var1, class09065 var2) {
      super();
      this.y();
      this.y_0 = var1;
      this.y_1 = var2;
      class11202 class11202 = new class11202();

      for (int i = 0; i < var1.size(); i++) {
         ((class11171)var1.get(i)).N(class11202);
      }

      this.y_2 = class11202.u();
      this.y_3 = N(var1, ((class09064[])this.y_2).length);
      this.y_4 = var2.N();
   }

   static {
      i();
   }

   private static void i() {
      N_0 = new int[0];
   }

   @Override
   public void execute(C var1) {
      try (class09076 class09076 = ((class09076)this.y_4).N((class09064[])this.y_2)) {
         List list = (List)this.y_0;
         int[][] aint = (int[][])this.y_3;
         class09064[] aclass09064 = (class09064[])this.y_2;

         for (int i = 0; i < list.size(); i++) {
            ((class11171)list.get(i)).N(var1, class09076, (class09065)this.y_1);

            for (int j : aint[i]) {
               if (!aclass09064[j].Z()) {
                  class09076.L(j);
               }
            }
         }
      }
   }

   private void y() {
   }

   private static <C> int[][] N(List<class11171<C>> var0, int var1) {
      int[] aint = new int[var1];
      Arrays.fill(aint, -1);

      for (int i = 0; i < var0.size(); i++) {
         for (int j : ((class11171)var0.get(i)).y()) {
            aint[j] = i;
         }
      }

      int[][] aint1 = new int[var0.size()][];
      boolean[] aboolean = new boolean[var1];
      int[] aint2 = new int[var1];

      for (int l = 0; l < var0.size(); l++) {
         int i1 = 0;

         for (int k : ((class11171)var0.get(l)).y()) {
            if (!aboolean[k] && aint[k] == l) {
               aboolean[k] = true;
               aint2[i1++] = k;
            }
         }

         int[] aint3 = Arrays.copyOf(aint2, i1);

         for (int j1 = 0; j1 < i1; j1++) {
            aboolean[aint3[j1]] = false;
         }

         aint1[l] = aint3.length == 0 ? (int[])N_0 : aint3;
      }

      return aint1;
   }

   public static <C> class11187<C> N() {
      return new class11187<>((class09065)class09065.y_0);
   }

   public static <C> class11187<C> N(class09065 var0) {
      return new class11187<>(var0);
   }
}
