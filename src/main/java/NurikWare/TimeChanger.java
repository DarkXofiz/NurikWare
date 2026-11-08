package NurikWare;

import java.util.function.Supplier;

@class11080(
   L = "TimeChanger",
   y = class11072.VISUAL,
   N = class11106.WORLD
)
public class TimeChanger extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;

   public TimeChanger() {
      super();
      this.s();
      this.L_0 = new class11038("select", this::m, false);
      this.L_1 = class11524.N(
         this,
         "time",
         new class11038("dawn", () -> 23100, false),
         new class11038("morning", () -> 100, false),
         new class11038("day", () -> 5000, true),
         new class11038("evening", () -> 12000, false),
         new class11038("sunset", () -> 12500, false),
         new class11038("night", () -> 17000, false),
         (class11038)this.L_0
      );
      this.L_2 = (class11504)class11524.N(this, "select", 120.0F, 0.0F, 240.0F, 1.0F).N(var1 -> {
         this.s();
         return ((class11038)this.L_0).U();
      });
   }

   private void s() {
   }

   private int m() {
      this.s();
      return ((class11504)this.L_2).i().intValue() * 100;
   }

   @class11782
   public void N(class09349 var1) {
      this.s();
      int i = (Integer)((Supplier)((class11038)((class11517)this.L_1).i()).N_0).get();
      if (i != -1) {
         long j = var1.N() - Math.floorMod(var1.N(), 24000L);
         var1.N(j + i);
      }
   }
}
