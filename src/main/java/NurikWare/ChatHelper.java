package NurikWare;

import java.util.List;

@class11080(
   L = "ChatHelper",
   y = class11072.MISC,
   N = class11106.HELPER
)
public class ChatHelper extends class11067 {
   public Object L_0;
   public Object L_1;

   public ChatHelper() {
      super();
      this.s();
      this.L_0 = new class11582(this, "better-commands", true);
      this.L_1 = class11524.y(this, "chat-addons", (class11546)this.L_0);
   }

   private void s() {
   }

   @class11782
   public void N(class10963 var1) {
      this.s();
      ((List)((class11523)this.L_1).i()).forEach(var1x -> var1x.y(var1));
   }

   @class11782
   public void N(class10958 var1) {
      this.s();
      ((List)((class11523)this.L_1).i()).forEach(var1x -> var1x.y(var1));
   }

   @class11782
   public void N(class10990 var1) {
      this.s();
      ((List)((class11523)this.L_1).i()).forEach(var1x -> var1x.y(var1));
   }
}
