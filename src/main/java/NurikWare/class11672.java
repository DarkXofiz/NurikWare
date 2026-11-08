package NurikWare;

import java.util.List;

public class class11672 extends class11807<AntiAFK> implements class11801<AntiAFK> {
   public Object y_0;
   public Object y_1;
   public Object y_2;

   public class11672(AntiAFK var1, class11688 var2, class11705 var3, String var4, boolean var5) {
      super(var1, var4, var5);
      this.N();
      this.y_1 = var2;
      this.y_2 = var3;
   }

   @Override
   public void y(Object var1) {
      this.N();
      ((List)((class11523)this.y_0).i()).forEach(var1x -> var1x.y(var1));
   }

   public void N(AntiAFK var1) {
      this.N();
      this.y_0 = (class11523)class11524.y(
            (class11512)super.N_1,
            "action",
            new class11722("jump", false),
            new class11683("command", true),
            new class11691("swing", false),
            (class11688)this.y_1,
            (class11705)this.y_2
         )
         .N(var1x -> this.U());
   }

   private void N() {
   }
}
