package NurikWare;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

final class class09754 {
   final ByteBuffer N;
   int y = 1000;

   int L(int var1) {
      return this.N.getShort(var1);
   }

   class09714 M(int var1) {
      int i = this.y(var1);
      ArrayList arraylist = new ArrayList();
      if (i == 1) {
         int j = this.y(var1 + 2);
         int k = this.y(var1 + 4);

         for (int l = 0; l < k; l++) {
            int i1 = this.y(var1 + 6 + l * 2);
            if (i1 != 0) {
               arraylist.add(new int[]{j + l, j + l, i1});
            }
         }
      } else if (i == 2) {
         int j1 = this.y(var1 + 2);

         for (int k1 = 0; k1 < j1; k1++) {
            int l1 = var1 + 4 + k1 * 6;
            arraylist.add(new int[]{this.y(l1), this.y(l1 + 2), this.y(l1 + 4)});
         }
      }

      arraylist.sort((var0, var1x) -> Integer.compare(var0[0], var1x[0]));
      int[] aint = new int[arraylist.size()];
      int[] aint1 = new int[arraylist.size()];
      int[] aint2 = new int[arraylist.size()];

      for (int i2 = 0; i2 < arraylist.size(); i2++) {
         aint[i2] = ((int[])arraylist.get(i2))[0];
         aint1[i2] = ((int[])arraylist.get(i2))[1];
         aint2[i2] = ((int[])arraylist.get(i2))[2];
      }

      return new class09714(aint, aint1, aint2);
   }

   class09754(byte[] var1) {
      super();
      this.N = ByteBuffer.wrap(var1);
   }

   static int B(int var0) {
      return Integer.bitCount(var0 & 65535) * 2;
   }

   static int Z(int var0) {
      if ((var0 & 4) == 0) {
         return -1;
      } else {
         byte b0 = 0;
         if ((var0 & 1) != 0) {
            b0 += 2;
         }

         if ((var0 & 2) != 0) {
            b0 += 2;
         }

         return b0;
      }
   }

   String i(int var1) {
      return "" + (char)this.N(var1) + (char)this.N(var1 + 1) + (char)this.N(var1 + 2) + (char)this.N(var1 + 3);
   }

   long u(int var1) {
      return this.N.getInt(var1) & 4294967295L;
   }

   class09729 y(int var1, int var2, int var3, int var4) {
      class09732 class09732 = new class09732(this.R(var1 + this.y(var1 + 2)));
      class09714 class09714x = this.M(var1 + this.y(var1 + 8));
      class09714 class09714x = this.M(var1 + this.y(var1 + 10));
      int i = this.y(var1 + 12);
      int j = this.y(var1 + 14);
      int k = B(var2);
      int l = B(var3);
      int i1 = k + l;
      int j1 = var1 + 16;
      int[][] aint = new int[i][j];

      for (int k1 = 0; k1 < i; k1++) {
         for (int l1 = 0; l1 < j; l1++) {
            int i2 = j1 + (k1 * j + l1) * i1;
            aint[k1][l1] = var4 >= 0 ? this.L(i2 + var4) : 0;
         }
      }

      return new class09725(class09732, class09714x, class09714x, aint);
   }

   int y(int var1) {
      return this.N.getShort(var1) & 65535;
   }

   class09730 N() {
      int i = this.y(4);
      int j = -1;
      int k = -1;

      for (int l = 0; l < i; l++) {
         int i1 = 12 + l * 16;
         String s = this.i(i1);
         if (s.equals("GPOS")) {
            j = (int)this.u(i1 + 8);
         } else if (s.equals("head")) {
            k = (int)this.u(i1 + 8);
         }
      }

      if (k >= 0) {
         this.y = this.y(k + 18);
      }

      if (j < 0) {
         return new class09730(this.y, List.of());
      } else {
         int l3 = j + this.y(j + 6);
         int i4 = j + this.y(j + 8);
         LinkedHashSet linkedhashset = new LinkedHashSet();
         int j1 = this.y(l3);

         for (int k1 = 0; k1 < j1; k1++) {
            int l1 = l3 + 2 + k1 * 6;
            if (this.i(l1).equals("kern")) {
               int i2 = l3 + this.y(l1 + 4);
               int j2 = this.y(i2 + 2);

               for (int k2 = 0; k2 < j2; k2++) {
                  linkedhashset.add(this.y(i2 + 4 + k2 * 2));
               }
            }
         }

         if (linkedhashset.isEmpty()) {
            return new class09730(this.y, List.of());
         } else {
            int j4 = this.y(i4);
            ArrayList arraylist1 = new ArrayList();

            for (int k4 : linkedhashset) {
               if (k4 < j4) {
                  int l4 = i4 + this.y(i4 + 2 + k4 * 2);
                  int l2 = this.y(l4);
                  int i3 = this.y(l4 + 4);
                  ArrayList arraylist = new ArrayList();

                  for (int j3 = 0; j3 < i3; j3++) {
                     int k3 = l4 + this.y(l4 + 6 + j3 * 2);
                     if (l2 == 2) {
                        this.N(arraylist, k3);
                     } else if (l2 == 9 && this.y(k3) == 1 && this.y(k3 + 2) == 2) {
                        this.N(arraylist, k3 + (int)this.u(k3 + 4));
                     }
                  }

                  if (!arraylist.isEmpty()) {
                     arraylist1.add(arraylist);
                  }
               }
            }

            return new class09730(this.y, arraylist1);
         }
      }
   }

   int N(int var1) {
      return this.N.get(var1) & 0xFF;
   }

   class09729 N(int var1, int var2, int var3, int var4) {
      int[] aint = this.R(var1 + this.y(var1 + 2));
      int i = B(var2);
      int j = B(var3);
      int k = this.y(var1 + 8);
      HashMap hashmap = new HashMap();

      for (int l = 0; l < k && l < aint.length; l++) {
         int i1 = var1 + this.y(var1 + 10 + l * 2);
         int j1 = this.y(i1);
         int k1 = i1 + 2;

         for (int l1 = 0; l1 < j1; l1++) {
            int i2 = this.y(k1);
            int j2 = var4 >= 0 ? this.L(k1 + 2 + var4) : 0;
            if (j2 != 0) {
               hashmap.put((long)aint[l] << 32 | i2 & 4294967295L, j2);
            }

            k1 += 2 + i + j;
         }
      }

      return new class09748(hashmap);
   }

   void N(List<class09729> var1, int var2) {
      int i = this.y(var2);
      int j = this.y(var2 + 4);
      int k = this.y(var2 + 6);
      int l = Z(j);
      if (i == 1) {
         var1.add(this.N(var2, j, k, l));
      } else if (i == 2) {
         var1.add(this.y(var2, j, k, l));
      }
   }

   int[] R(int var1) {
      if (this.y(var1) == 1) {
         int i1 = this.y(var1 + 2);
         int[] aint = new int[i1];

         for (int j1 = 0; j1 < i1; j1++) {
            aint[j1] = this.y(var1 + 4 + j1 * 2);
         }

         return aint;
      } else {
         int i = this.y(var1 + 2);
         ArrayList arraylist = new ArrayList();

         for (int j = 0; j < i; j++) {
            int k = var1 + 4 + j * 6;

            for (int l = this.y(k); l <= this.y(k + 2); l++) {
               arraylist.add(l);
            }
         }

         int[] aint1 = new int[arraylist.size()];

         for (int k1 = 0; k1 < aint1.length; k1++) {
            aint1[k1] = (Integer)arraylist.get(k1);
         }

         Arrays.sort(aint1);
         return aint1;
      }
   }
}
