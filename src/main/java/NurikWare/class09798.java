package NurikWare;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class class09798 {
   private final String N;
   private final String y;
   private final class10049 L;
   private final List<class09798> u;
   private final List<class09816> i;
   private final List<class09992> R;
   private final class09991 M;
   private final String B;
   private final String Z;
   private final String z;
   private final class09938 U;
   private final class09793<class09904> E;

   public List<class09798> L() {
      return this.u;
   }

   public String M() {
      return this.B;
   }

   class09798(
      String var1,
      String var2,
      class10049 var3,
      List<class09798> var4,
      List<class09816> var5,
      List<class09992> var6,
      class09991 var7,
      String var8,
      String var9,
      String var10,
      class09938 var11,
      class09793<class09904> var12
   ) {
      super();
      this.N = var1 != null && !var1.isBlank() ? var1 : null;
      this.y = var2 != null && !var2.isBlank() ? var2 : null;
      this.L = Objects.requireNonNull(var3, "type");
      this.u = var4 == null ? List.of() : List.copyOf(var4);
      this.i = var5 == null ? List.of() : List.copyOf(var5);
      this.M = var7 == null ? class09991.N : var7;
      this.R = N(var6, this.M.W());
      this.B = var8 == null ? "" : var8;
      this.Z = var9 == null ? "" : var9;
      this.z = var10 == null ? "" : var10;
      this.U = var11;
      this.E = var12;
   }

   public String B() {
      return this.Z;
   }

   public String Z() {
      return this.z;
   }

   public List<class09992> i() {
      return this.R;
   }

   String U() {
      return this.y;
   }

   public class09938 z() {
      return this.U;
   }

   public List<class09816> u() {
      return this.i;
   }

   private static void y(List<class09992> var0, List<class09992> var1) {
      if (var1 != null && !var1.isEmpty()) {
         for (class09992 class09992 : var1) {
            if (class09992 != null && !N(var0, class09992)) {
               var0.add(class09992);
            }
         }
      }
   }

   public class10049 y() {
      return this.L;
   }

   class09793<class09904> E() {
      return this.E;
   }

   private static List<class09992> N(List<class09992> var0, List<class09992> var1) {
      if (var0 != null && !var0.isEmpty() || var1 != null && !var1.isEmpty()) {
         ArrayList arraylist = new ArrayList();
         y(arraylist, var0);
         y(arraylist, var1);
         return arraylist.isEmpty() ? List.of() : List.copyOf(arraylist);
      } else {
         return List.of();
      }
   }

   private static boolean N(List<class09992> var0, class09992 var1) {
      Iterator iterator = var0.iterator();

      while (iterator.hasNext()) {
         if ((class09992)iterator.next() == var1) {
            return true;
         }
      }

      return false;
   }

   class09798 N(String var1) {
      return new class09798(this.N, var1, this.L, this.u, this.i, this.R, this.M, this.B, this.Z, this.z, this.U, this.E);
   }

   public String N() {
      return this.N;
   }

   public class09991 R() {
      return this.M;
   }
}
