package NurikWare;

import java.util.List;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import org.joml.Matrix4fStack;

@class11080(
   L = "HolyHelper",
   y = class11072.MISC,
   N = class11106.HELPER
)
public class HolyHelper extends class11067 implements class11542 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public Object L_7;
   public boolean L_init;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;

   public HolyHelper() {
      super();
      this.j();
      this.u_0 = new class11550(this, "explosive-stuff");
      this.u_1 = new class11549(this, "exp-bottle");
      this.u_2 = new class11581(this, "explosive-trap");
      this.u_3 = new class11562(this, "snow-ball");
      this.L_0 = new class11571(this, "stun");
      this.L_1 = new class11548(this, "trap");
      this.L_2 = List.of((class11583)this.u_0, (class11583)this.u_1, (class11583)this.u_2, (class11583)this.u_3, (class11583)this.L_0, (class11583)this.L_1);
      this.L_3 = class11524.N(this, "show-stun-zone", false);
      this.L_4 = (class11515)class11524.N(this, "zone-color", -11104513).N(var1 -> {
         this.j();
         return ((class11507)this.L_3).i();
      });
      this.L_5 = new class11900(5, 1);
      this.L_6 = new class11884(-15.0, -15.0, -15.0, 15.0, 15.0, 15.0).i(-0.05);
   }

   private void n() {
      this.j();
      if (((class11507)this.L_3).i()) {
         this.L_7 = ((class11583)this.L_0).L().test(((class04453)((class06202)super.y_0).T_4).method_6047());
      }
   }

   private void j() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_7 = false;
      }
   }

   @class11782
   public void N(class09321 var1) {
      this.j();
      class06889 class06889 = var1.y().y();
      Matrix4fStack matrix4fstack = var1.R();
      if ((Boolean)this.L_7) {
         this.N(var1, matrix4fstack, class06889);
      }
   }

   private void N(class09321 var1, Matrix4fStack var2, class06889 var3) {
      this.j();
      var2.pushMatrix();
      class06889 class06889 = new class06889(
            ((class04453)((class06202)super.y_0).T_4).field_6014,
            ((class04453)((class06202)super.y_0).T_4).field_6036,
            ((class04453)((class06202)super.y_0).T_4).field_5969
         )
         .N(((class04453)((class06202)super.y_0).T_4).method_73189(), var1.u().N(true))
         .u(var3);
      var2.translate((float)class06889.M, (float)class06889.B, (float)class06889.Z);
      class11207.N(
         var2,
         ((class11174)class11190.N_3).u(),
         ((class11174)class11190.N_1).u(),
         class06889.L,
         (class11884)this.L_6,
         class11300.N(((class11515)this.L_4).i(), 120)
      );
      var2.popMatrix();
   }

   @Override
   public void N(class11328 var1) {
      this.j();
      ((class11900)this.L_5).N(var1);
   }

   @class11782
   public void N(class10992 var1) {
      this.j();
      ((class11900)this.L_5).y(var1);
      this.n();
   }

   @class11782(
      u = true
   )
   public void N(class11400 var1) {
      this.j();
      ((List)this.L_2).forEach(var1x -> var1x.y(var1));
   }
}
