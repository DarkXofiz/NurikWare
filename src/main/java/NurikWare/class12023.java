package NurikWare;

public class class12023 extends class11512 {
   public Object N_0;
   public Object N_1;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public static Object L_0;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public Object i_3;

   public void L() {
      this.R();
      class11535 class11535 = class11938.P().N() == class11999.RU ? (class11535)this.i_0 : (class11535)this.i_1;
      if (((class11517)this.y_3).i() != class11535) {
         ((class11517)this.y_3).y(class11535);
      }
   }

   public class12023() {
      super();
      this.R();
      this.i_0 = new class11535("ru", false);
      this.i_1 = new class11535("en", true);
      this.i_2 = new class11994("scale_100", true, 1.0F);
      this.i_3 = new class11994("scale_150", false, 1.5F);
      this.N_0 = new class11994("scale_200", false, 2.0F);
      this.N_1 = new class11994("scale_100", true, 1.0F);
      this.y_0 = new class11994("scale_150", false, 1.5F);
      this.y_1 = new class11994("scale_200", false, 2.0F);
      this.y_2 = (class11527)class11524.N(this, "bind", class12002.RIGHT_SHIFT).N_6(this::N);
      this.y_3 = (class11517)class11524.N(this, "language", (class11535)this.i_0, (class11535)this.i_1).N_6(this::N);
      this.u_0 = (class11517)class11524.N(this, "menu-scale", (class11994)this.i_2, (class11994)this.i_3, (class11994)this.N_0).N_6(this::y);
      this.u_1 = (class11517)class11524.N(this, "hud-scale", (class11994)this.N_1, (class11994)this.y_0, (class11994)this.y_1).N_6(this::N);
      this.u_2 = (class11515)class11524.N(this, "accent", -7623425).y(true).N(false).N_6(this::N);
      this.u_3 = (class11507)class11524.N(this, "descriptions", true).N_6((var1, var2) -> this.B());
      this.u_4 = (class11507)class11524.N(this, "auto-save-preset", true).N_6((var1, var2) -> this.B());
      class11938.L().y(this);
   }

   static {
      i();
   }

   private void B() {
      class11938.L().L(class11364.N(class09378.CLIENT_SETTINGS));
   }

   private static void i() {
      L_0 = "menu.setting";
   }

   private void y(class11536<class11994> var1, class11994 var2) {
      class09222.N(var2.N());
      this.B();
   }

   public boolean y() {
      this.R();
      return ((class11507)this.u_3).i();
   }

   private void N(class11536<class11994> var1, class11994 var2) {
      class11753.N(var2.N());
      this.B();
   }

   public boolean N() {
      this.R();
      return ((class11507)this.u_4).i();
   }

   private void N(class11536<class11535> var1, class11535 var2) {
      this.R();
      if (((class11535)this.i_0).U()) {
         class11938.P().N(class11999.RU);
      } else {
         class11938.P().N(class11999.EN);
      }

      this.B();
   }

   private void N(class11536<Integer> var1, Integer var2) {
      class09181.N(var2);
      this.B();
   }

   @Override
   public class12018 N_7(String var1) {
      return new class12018("menu.setting").N(var1);
   }

   private void N(class11536<class12002> var1, class12002 var2) {
      this.R();
      if (!var2.y() && var2 != class12002.MOUSE_1) {
         this.B();
      } else {
         ((class11527)this.y_2).N(class12002.RIGHT_SHIFT);
      }
   }

   @class11782(
      y = class11777.BEFORE,
      L = {class09222.class},
      u = true
   )
   public void N(class11389 var1) {
      this.R();
      if (((class11527)this.y_2).N(var1)) {
         class09222.N();
         var1.N();
      }
   }

   private void R() {
   }
}
