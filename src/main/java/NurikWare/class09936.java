package NurikWare;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class class09936 {
   private static final class09936 N = new class09936(List.of(), 0, List.of());
   private final List<class09935> y;
   private final int L;
   private final List<String> u;

   public int L() {
      return this.L;
   }

   private class09936(List<class09935> var1, int var2, List<String> var3) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3 == null ? List.of() : List.copyOf(var3);
   }

   public List<String> i() {
      return this.u;
   }

   public List<class09924> u() {
      if (this.y.isEmpty()) {
         return List.of();
      } else {
         ArrayList arraylist = new ArrayList(this.L);
         N(this.y, arraylist);
         return arraylist;
      }
   }

   public List<class09935> y() {
      return this.y;
   }

   public static class09936 N(List<class09935> var0, int var1, List<String> var2) {
      return var0 != null && !var0.isEmpty() && var1 > 0 ? new class09936(var0, var1, var2) : new class09936(List.of(), 0, var2);
   }

   private static void N(List<class09935> var0, List<class09924> var1) {
      for (class09935 class09935 : var0) {
         Objects.requireNonNull(class09935);
         Object object = class09935;
         switch (object) {
            case class09909 class09909:
               var1.add(class09909.N());
               break;
            case class09919 class09919:
               N(((class09919)object).M(), var1);
               break;
            case class09903 class09903:
               N(((class09903)object).i(), var1);
               break;
            case class09934 class09934:
               N(((class09934)object).y(), var1);
               break;
            case class09922 class09922:
               N(((class09922)object).L(), var1);
               break;
            case class09899 class09899:
               N(((class09899)object).y(), var1);
               break;
            default:
               throw new MatchException(null, null);
         }
      }
   }

   public static class09936 N() {
      return N;
   }
}
