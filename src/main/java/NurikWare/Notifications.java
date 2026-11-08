package NurikWare;

import java.util.List;

@class11080(
   L = "Notifications",
   y = class11072.VISUAL,
   N = class11106.INTERFACE
)
public class Notifications extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;

   public Notifications() {
      super();
      this.s();
      this.L_0 = new class11446(this, "module-toggle", true);
      this.L_1 = new class11428(this, "armor-durability", false);
      this.L_2 = new class11431(this, "irc-ping", false);
      this.L_3 = class11524.y(this, "notifications", (class11807)this.L_0, (class11807)this.L_1, (class11807)this.L_2);
   }

   private void s() {
   }

   @class11782
   public void N(class10996 var1) {
      this.s();
      ((List)((class11523)this.L_3).i()).forEach(var1x -> var1x.y(var1));
   }

   @class11782
   public void N(class11369 var1) {
      this.s();
      if (var1.N() == (class11901)class11901.staticFields_0ec612a2dc0263a258b66e8d510834aaf[2]) {
         ((List)((class11523)this.L_3).i()).forEach(var1x -> var1x.y(var1));
      }
   }

   @class11782
   public void N(class10990 var1) {
      this.s();
      ((List)((class11523)this.L_3).i()).forEach(var1x -> var1x.y(var1));
   }

   @class11782
   public void N(class11403 var1) {
      this.s();
      ((List)((class11523)this.L_3).i()).forEach(var1x -> var1x.y(var1));
   }
}
