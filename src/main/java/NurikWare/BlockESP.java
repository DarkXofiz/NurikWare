package NurikWare;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;
import minecraft.class00481;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00514;
import minecraft.class00549;
import minecraft.class00554;
import minecraft.class00570;
import minecraft.class00891;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07259;
import minecraft.class07261;
import minecraft.class07321;
import org.joml.Matrix4f;

@class11080(
   L = "BlockESP",
   y = class11072.VISUAL,
   N = class11106.WORLD
)
public class BlockESP extends class11067 {
   public static Object L_0;
   public static Object L_1 = new class09087(class09069.N(3).R(), class09069.y().R());
   public static Object L_2;
   public static Object L_3;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object u_5;
   public Object u_6;
   public Object u_7;
   public boolean u_init;
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public Object i_3;
   public Object i_4;

   private void L(long var1) {
      this.k();
      Set set = (Set)((Map)this.u_3).get(var1);
      if (set != null && (class03448)((class06202)super.y_0).T_3 != null) {
         Map map = (Map)this.u_0;
         IntArrayList intarraylist = new IntArrayList();
         IntArrayList intarraylist1 = new IntArrayList();
         int i = class07321.N(var1) << 4;
         int j = class07321.y(var1) << 4;
         Iterator iterator = set.iterator();

         while (iterator.hasNext()) {
            class07209 class07209 = (class07209)iterator.next();
            class00500 class00500 = ((class03448)((class06202)super.y_0).T_3).method_8320(class07209);
            class11025 class11025 = (class11025)map.get(class00500.i());
            if (class11025 == null) {
               iterator.remove();
            } else {
               class00494 class00494 = class00500.R((class03448)((class06202)super.y_0).T_3, class07209);
               if (!class00494.method_1110()) {
                  int k = class07209.method_10263() - i;
                  int l = class07209.method_10260() - j;
                  if (class00891.N(class00494)) {
                     this.N(intarraylist1, k, class07209.method_10264(), l, class11025.y());
                  } else {
                     this.N(intarraylist, class00494, k, class07209.method_10264(), l, class11025.y());
                  }
               }
            }
         }

         if (set.isEmpty()) {
            ((Map)this.u_3).remove(var1);
         }

         class11030 class11030 = new class11030(intarraylist.toIntArray(), intarraylist1.toIntArray());
         if (class11030.u()) {
            ((Map)this.u_2).remove(var1);
         } else {
            ((Map)this.u_2).put(var1, class11030);
         }

         this.u_5 = true;
      }
   }

   public void P() {
      this.k();
      this.u_0 = Map.of();
      this.n();
      this.Y();
   }

   public BlockESP() {
      super();
      this.k();
      this.u_0 = Map.of();
      this.u_1 = (class11507)class11524.N(this, "delta-mode", false).N_6((var1, var2) -> this.l());
      this.u_2 = new HashMap();
      this.u_3 = new HashMap();
      this.u_4 = new LinkedHashSet();
      this.u_7 = class06889.L;
      this.i_0 = class11213.N((class09087)class09063.N_0, 65536, 0);
      this.i_1 = class11213.N((class09087)L_1, 16384);
      this.i_2 = class11204.L().N((class12036)class11215.N_0).N((class09322)class11185.N_4).N(1).N();
      this.i_3 = class11204.L().N((class12036)class11215.N_0).N((class09322)class11185.z_1).N(1).N();
      this.i_4 = new Matrix4f();
   }

   static {
      v();
   }

   @Override
   public boolean Z() {
      this.k();
      this.u_5 = true;
      if (!((class11507)this.u_1).i()) {
         this.j();
      }

      return true;
   }

   @Override
   public boolean i() {
      this.k();
      ((Set)this.u_4).clear();
      ((Map)this.u_2).clear();
      ((Map)this.u_3).clear();
      this.u_5 = true;
      return true;
   }

   private void b() {
      this.k();
      ((Set)this.u_4).removeIf(var1 -> this.N(var1.longValue()) == null);
      ((Map)this.u_3).keySet().removeIf(var1 -> this.N(var1.longValue()) == null);
      if (((Map)this.u_2).keySet().removeIf(var1 -> this.N(var1.longValue()) == null)) {
         this.u_5 = true;
      }
   }

   private void n() {
      this.k();
      ((Map)this.u_2).clear();
      this.u_5 = true;
      if (((class11507)this.u_1).i()) {
         List.copyOf(((Map)this.u_3).keySet()).forEach(this::L);
      } else {
         this.j();
      }
   }

   private void l() {
      this.k();
      ((Set)this.u_4).clear();
      ((Map)this.u_3).clear();
      this.n();
   }

   public Collection<class11025> m() {
      this.k();
      return ((Map)this.u_0).values();
   }

   private void k() {
      if (!this.u_init) {
         this.u_init = true;
         this.u_5 = false;
         this.u_6 = 0;
      }
   }

   private static void v() {
      L_0 = -1;
      L_1 = null;
      L_2 = 24;
      L_3 = 20;
   }

   private void j() {
      this.k();
      if ((class03448)((class06202)super.y_0).T_3 != null && (class04453)((class06202)super.y_0).T_4 != null) {
         class07321 class07321 = ((class04453)((class06202)super.y_0).T_4).method_31476();
         int i = (Integer)((class05630)((class06202)super.y_0).i_7).i().method_41753() + 1;

         for (int j = class07321.B - i; j <= class07321.B + i; j++) {
            for (int k = class07321.Z - i; k <= class07321.Z + i; k++) {
               if (((class03448)((class06202)super.y_0).T_3).method_8398().N(j, k, class00549.m, false) != null) {
                  ((Set)this.u_4).add(class07321.u(j, k));
               }
            }
         }
      }
   }

   private void y(class00570 var1) {
      this.k();
      Map map = (Map)this.u_0;
      IntArrayList intarraylist = new IntArrayList();
      IntArrayList intarraylist1 = new IntArrayList();
      class07321 class07321 = var1.R();
      class00554[] aclass00554 = var1.u();
      class07218 class07218 = new class07218();

      for (int i = 0; i < aclass00554.length; i++) {
         class00554 class00554 = aclass00554[i];
         if (!class00554.L() && class00554.N(var1x -> map.containsKey(var1x.i()))) {
            int j = var1.method_31604(i) << 4;

            for (int k = 0; k < 16; k++) {
               for (int l = 0; l < 16; l++) {
                  for (int i1 = 0; i1 < 16; i1++) {
                     class00500 class00500 = class00554.N(i1, k, l);
                     class11025 class11025 = (class11025)map.get(class00500.i());
                     if (class11025 != null) {
                        class07218.N(class07321.i() + i1, j + k, class07321.R() + l);
                        class00494 class00494 = class00500.R(var1, class07218);
                        if (!class00494.method_1110()) {
                           if (class00891.N(class00494)) {
                              this.N(intarraylist1, i1, j + k, l, class11025.y());
                           } else {
                              this.N(intarraylist, class00494, i1, j + k, l, class11025.y());
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      long j1 = class07321.y();
      class11030 class11030 = new class11030(intarraylist.toIntArray(), intarraylist1.toIntArray());
      ((class06202)super.y_0).execute(() -> this.N(j1, class11030));
   }

   private void y(class07261 var1) {
      this.k();
      if (!((class11507)this.u_1).i()) {
         var1.N((var1x, var2x) -> {
            this.k();
            ((Set)this.u_4).add(class07321.N(var1x));
         });
      } else if ((class03448)((class06202)super.y_0).T_3 != null) {
         Map map = (Map)this.u_0;
         LinkedHashSet linkedhashset = new LinkedHashSet();
         var1.N((var3x, var4) -> {
            this.k();
            long i = class07321.N(var3x);
            if (map.containsKey(var4.i())) {
               ((Map)this.u_3).computeIfAbsent(i, var0 -> new HashSet<>()).add(var3x.method_10062());
               linkedhashset.add(i);
            } else {
               Set set = (Set)((Map)this.u_3).get(i);
               if (set != null && set.remove(var3x)) {
                  linkedhashset.add(i);
               }
            }
         });
         linkedhashset.forEach(this::L);
      }
   }

   public class11025 y(class00891 var1) {
      this.k();
      return (class11025)((Map)this.u_0).get(var1);
   }

   private void y(long var1) {
      ((class06202)super.y_0).execute(() -> {
         this.k();
         if (!((class11507)this.u_1).i()) {
            ((Set)this.u_4).add(var1);
         }
      });
   }

   public void y(Collection<class11025> var1) {
      this.k();
      LinkedHashMap linkedhashmap = new LinkedHashMap();
      var1.forEach(var1x -> linkedhashmap.put(var1x.N(), var1x));
      this.u_0 = Collections.unmodifiableMap(linkedhashmap);
      this.n();
   }

   public boolean N(class00891 var1) {
      this.k();
      if (!((Map)this.u_0).containsKey(var1)) {
         return false;
      } else {
         LinkedHashMap linkedhashmap = new LinkedHashMap((Map)this.u_0);
         linkedhashmap.remove(var1);
         this.u_0 = Collections.unmodifiableMap(linkedhashmap);
         this.n();
         this.Y();
         return true;
      }
   }

   private void N(class06889 var1) {
      this.k();
      this.u_5 = false;
      this.u_7 = var1;
      class11184 class11184x = ((class11213)this.i_0).M();
      class11184 class11184x = ((class11213)this.i_1).M();
      class11184x.N();
      class11184x.N();

      for (Entry entry : ((Map)this.u_2).entrySet()) {
         long i = (Long)entry.getKey();
         float f = (float)((class07321.N(i) << 4) - ((class06889)this.u_7).M);
         float f1 = (float)(-((class06889)this.u_7).B);
         float f2 = (float)((class07321.y(i) << 4) - ((class06889)this.u_7).Z);
         this.N(class11184x, ((class11030)entry.getValue()).y(), f, f1, f2);
         this.N(class11184x, ((class11030)entry.getValue()).N(), f, f1, f2);
      }

      ((class11213)this.i_0).N(class11184x, 35048);
      ((class11213)this.i_1).N(class11184x, 35048);
   }

   private void N(class11184 var1, int[] var2, float var3, float var4, float var5) {
      for (byte b0 = 0; b0 < var2.length; b0 += 4) {
         var1.N(Float.intBitsToFloat(var2[b0]) + var3)
            .N(Float.intBitsToFloat(var2[b0 + 1]) + var4)
            .N(Float.intBitsToFloat(var2[b0 + 2]) + var5)
            .N(var2[b0 + 3]);
         var1.y();
      }
   }

   private class00570 N(long var1) {
      return ((class03448)((class06202)super.y_0).T_3).method_8398().N(class07321.N(var1), class07321.y(var1), class00549.m, false);
   }

   private void N(IntArrayList var1, class00494 var2, int var3, int var4, int var5, int var6) {
      var2.method_1104((var6x, var8, var10, var12, var14, var16) -> {
         this.N(var1, var3 + var6x, var4 + var8, var5 + var10, var6);
         this.N(var1, var3 + var12, var4 + var14, var5 + var16, var6);
      });
   }

   public void N(Collection<class11025> var1) {
      this.k();
      LinkedHashMap linkedhashmap = new LinkedHashMap((Map)this.u_0);
      var1.forEach(var1x -> linkedhashmap.put(var1x.N(), var1x));
      this.u_0 = Collections.unmodifiableMap(linkedhashmap);
      this.n();
      this.Y();
   }

   @class11782
   public void N(class09343 var1) {
      this.k();
      ((Set)this.u_4).clear();
      ((Map)this.u_2).clear();
      ((Map)this.u_3).clear();
      this.u_5 = true;
   }

   private void N(long var1, class11030 var3) {
      this.k();
      if (this.U() && (class03448)((class06202)super.y_0).T_3 != null && !((class11507)this.u_1).i()) {
         if (var3.u()) {
            if (((Map)this.u_2).remove(var1) != null) {
               this.u_5 = true;
            }
         } else {
            ((Map)this.u_2).put(var1, var3);
            this.u_5 = true;
         }
      }
   }

   public void N(class11025 var1) {
      this.k();
      LinkedHashMap linkedhashmap = new LinkedHashMap((Map)this.u_0);
      linkedhashmap.put(var1.N(), var1);
      this.u_0 = Collections.unmodifiableMap(linkedhashmap);
      this.n();
      this.Y();
   }

   @class11782
   public void N(class10961 var1) {
      switch (var1.N()) {
         case class00514 class00514:
            this.y(class07321.u(class00514.N(), class00514.y()));
            break;
         case class07259 class07259:
            this.y(class07321.N(class07259.y()));
            break;
         case class07261 class07261:
            ((class06202)super.y_0).execute(() -> this.y(class07261));
            break;
         case class00481 class00481:
            ((class06202)super.y_0).execute(() -> {
               this.k();
               long i = class00481.N().y();
               ((Set)this.u_4).remove(i);
               ((Map)this.u_3).remove(i);
               if (((Map)this.u_2).remove(i) != null) {
                  this.u_5 = true;
               }
            });
            break;
         default:
      }
   }

   @class11782
   public void N(class09321 var1) {
      this.k();
      class06889 class06889 = var1.y().y();
      if ((Boolean)this.u_5) {
         this.N(class06889);
      }

      if (!((class11213)this.i_0).B() || !((class11213)this.i_1).B()) {
         class11925.N(((class06202)super.y_0).e(), true);
         ((Matrix4f)this.i_4)
            .set(var1.N())
            .translate(
               (float)(((class06889)this.u_7).M - class06889.M),
               (float)(((class06889)this.u_7).B - class06889.B),
               (float)(((class06889)this.u_7).Z - class06889.Z)
            );
         ((class11216)class11925.L_6).N(var1.i(), (Matrix4f)this.i_4);
         if (!((class11213)this.i_0).B()) {
            ((class11204)this.i_2).y();
            ((class11213)this.i_0).N(((class11204)this.i_2).i());
         }

         if (!((class11213)this.i_1).B()) {
            ((class11204)this.i_3).y();
            ((class11213)this.i_1).N(((class11204)this.i_3).i(), 24, ((class11213)this.i_1).y());
         }
      }
   }

   private void N(IntArrayList var1, double var2, double var4, double var6, int var8) {
      var1.add(Float.floatToRawIntBits((float)var2));
      var1.add(Float.floatToRawIntBits((float)var4));
      var1.add(Float.floatToRawIntBits((float)var6));
      var1.add(var8);
   }

   @class11782
   public void N(class11380 var1) {
      this.k();
      if ((class03448)((class06202)super.y_0).T_3 != null) {
         if (!((class11507)this.u_1).i()) {
            Iterator iterator = ((Set)this.u_4).iterator();

            while (iterator.hasNext()) {
               long i = (Long)iterator.next();
               class00570 class00570 = this.N(i);
               if (class00570 != null) {
                  iterator.remove();
                  ((ExecutorService)class11938.L_1).execute(() -> this.y(class00570));
               }
            }
         }

         int j = (Integer)this.u_6 + 1;
         this.u_6 = j;
         if (j >= 20) {
            this.u_6 = 0;
            this.b();
         }
      }
   }

   private void Y() {
      class11519.y(class11511.class);
   }
}
