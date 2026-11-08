package NurikWare;

import java.util.List;

@class11080(
   L = "UseTracker",
   y = class11072.MISC,
   N = class11106.TRACKERS
)
public class UseTracker extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;

   public UseTracker() {
      super();
      this.m();
      this.L_0 = new class11559(this, "totem-tracker", true);
      this.L_1 = new class11572(this, "food-tracker", true);
      this.L_2 = class11524.y(this, "trackers", (class11590)this.L_0, (class11590)this.L_1);
   }

   private void m() {
   }

   @class11782
   public void N(class11396 var1) {
      this.m();
      ((List)((class11523)this.L_2).i()).forEach(var1x -> var1x.y(var1));
   }

   @class11782
   public void N(class10990 var1) {
      this.m();
      ((List)((class11523)this.L_2).i()).forEach(var1x -> var1x.y(var1));
   }
}
