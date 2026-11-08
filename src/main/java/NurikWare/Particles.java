package NurikWare;

import java.util.List;
import minecraft.class04995;
import minecraft.class06202;

@class11080(
   L = "Particles",
   y = class11072.VISUAL,
   N = class11106.WORLD
)
public class Particles extends class11067 {
   public static Object L_0;
   public static Object L_1;
   public static Object L_2;
   public static Object L_3;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object u_5;
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public Object i_3;
   public Object i_4;
   public Object i_5;
   public Object i_6;

   public Particles() {
      super();
      this.j();
      this.u_0 = new class11246(this, "totem-popping", true);
      this.u_1 = new class11244(this, "ambience", true);
      this.u_2 = new class11251(this, "thrown-item", false);
      this.u_3 = new class11253(this, "critical-hit", true);
      this.u_4 = class11524.y(this, "emitters", (class11230)this.u_0, (class11230)this.u_1, (class11230)this.u_2, (class11230)this.u_3);
      this.u_5 = (class11504)class11524.N(this, "pinch", 10.0F, 0.0F, 100.0F, 1.0F).N_6((var1, var2) -> this.s());
      this.i_0 = (class11504)class11524.N(this, "size", 100.0F, 0.0F, 100.0F, 1.0F).N_6((var1, var2) -> this.s());
      this.i_1 = new class11535("hsv", true);
      this.i_2 = new class11535("custom", false);
      this.i_3 = class11524.N(this, "color-selectable", (class11535)this.i_1, (class11535)this.i_2);
      this.i_4 = (class11525)class11524.N(this, "color-range", new class11494(0.0F, 1.0F), new class11494(0.5F, 0.85F), 0.01F).N(var1 -> {
         this.j();
         return ((class11535)this.i_1).U();
      });
      this.i_5 = (class11515)class11524.N(this, "color", -11104513).N(var1 -> {
         this.j();
         return ((class11535)this.i_2).U();
      });
      this.i_6 = new class11168(65536, this.b(), this.t());
   }

   static {
      n();
   }

   private float b() {
      this.j();
      return class04995.B(((class11504)this.i_0).i() / ((class11504)this.i_0).R(), 0.1F, 0.44F);
   }

   private void s() {
      this.j();
      ((class11168)this.i_6).N(this.b(), this.t());
   }

   private static void n() {
      L_0 = 0.6F;
      L_1 = 2.5F;
      L_2 = 0.1F;
      L_3 = 0.44F;
   }

   public int m() {
      this.j();
      return ((class11535)this.i_1).U()
         ? class04995.M(class11908.y(((class11525)this.i_4).i().N(), ((class11525)this.i_4).i().L()), 1.0F, 1.0F)
         : ((class11515)this.i_5).i();
   }

   private float t() {
      this.j();
      return class04995.B(((class11504)this.u_5).i() / ((class11504)this.u_5).R(), 0.6F, 2.5F);
   }

   private void j() {
   }

   @class11782
   public void N(class09321 var1) {
      this.j();
      ((class11168)this.i_6).N(var1);
   }

   @class11782
   public void N(class10990 var1) {
      class06202.Nq().execute(() -> {
         this.j();
         ((List)((class11523)this.u_4).i()).forEach(var1xx -> var1xx.y(var1));
      });
   }

   @class11782
   public void N(class10996 var1) {
      this.j();
      ((List)((class11523)this.u_4).i()).forEach(var1x -> var1x.y(var1));
      ((class11168)this.i_6).N();
   }

   public void N(class11179 var1) {
      this.j();
      ((class11168)this.i_6).N(var1);
   }
}
