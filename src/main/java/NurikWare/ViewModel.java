package NurikWare;

import java.util.List;

@class11080(
   L = "ViewModel",
   y = class11072.VISUAL,
   N = class11106.WORLD
)
public class ViewModel extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public Object L_7;

   public ViewModel() {
      super();
      this.b();
      this.L_0 = class11524.N(this, "right-hand-x", 0.0F, -1.0F, 1.0F, 0.05F);
      this.L_1 = class11524.N(this, "right-hand-y", 0.0F, -1.0F, 1.0F, 0.05F);
      this.L_2 = class11524.N(this, "right-hand-z", 0.0F, -1.0F, 1.0F, 0.05F);
      this.L_3 = class11524.N(this, "right-scale", 1.0F, 0.1F, 2.0F, 0.05F);
      this.L_4 = class11524.N(this, "left-hand-x", 0.0F, -1.0F, 1.0F, 0.05F);
      this.L_5 = class11524.N(this, "left-hand-y", 0.0F, -1.0F, 1.0F, 0.05F);
      this.L_6 = class11524.N(this, "left-hand-z", 0.0F, -1.0F, 1.0F, 0.05F);
      this.L_7 = class11524.N(this, "left-scale", 1.0F, 0.1F, 2.0F, 0.05F);
      class11524.N(
         this,
         "reset",
         () -> {
            this.b();
            List.of(
                  (class11504)this.L_0,
                  (class11504)this.L_1,
                  (class11504)this.L_2,
                  (class11504)this.L_3,
                  (class11504)this.L_4,
                  (class11504)this.L_5,
                  (class11504)this.L_6,
                  (class11504)this.L_7
               )
               .forEach(class11536::s);
         }
      );
   }

   private void b() {
   }

   @class11782
   public void N(class10949 var1) {
      this.b();
      var1.y().set(((class11504)this.L_0).i(), ((class11504)this.L_1).i(), ((class11504)this.L_2).i(), ((class11504)this.L_3).i());
      var1.N().set(((class11504)this.L_4).i(), ((class11504)this.L_5).i(), ((class11504)this.L_6).i(), ((class11504)this.L_7).i());
   }
}
