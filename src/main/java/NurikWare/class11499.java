package NurikWare;

import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07109;
import org.joml.Vector2f;

public class class11499 {
   private static double[] P;
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public boolean N_init;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public boolean y_init;

   public class11499 L(boolean var1) {
      this.N_3 = var1;
      return this;
   }

   public class07109 L() {
      return new class07109(this.y(), this.R());
   }

   public Vector2f M() {
      return new Vector2f(this.y(), this.R());
   }

   private static void P() {
      P = new double[2];
      P[0] = Double.longBitsToDouble(-4616189618054758400L);
      P[1] = Double.longBitsToDouble(4607182418800017408L);
   }

   public class11499(float var1, float var2) {
      this(var1, var2, false, false, false, class11522.staticFields_05ffa7eec8dd73e94b3c68970de658457_1);
   }

   public class11499(float var1, float var2, boolean var3, boolean var4, boolean var5, class11522 var6) {
      super();
      this.b();
      this.N_2 = class06202.Nq();
      this.N_0 = var1;
      this.N_1 = var2;
      this.N_4 = var4;
      this.N_3 = var3;
      this.y_2 = var6;
      this.y_3 = class11538.staticFields_002f846683278372c86f24838365e6c39_0;
      this.y_0 = var5;
   }

   static {
      P();
   }

   @Override
   public String toString() {
      return "Yaw: " + this.y() + ", Pitch: " + this.R();
   }

   public boolean B() {
      return (Boolean)this.N_3;
   }

   public class06202 Z() {
      return (class06202)this.N_2;
   }

   public boolean i() {
      return (Boolean)this.y_1;
   }

   private void b() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0.0F;
         this.N_1 = 0.0F;
         this.N_3 = false;
         this.N_4 = false;
      }

      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = false;
         this.y_1 = false;
      }
   }

   public class06889 U() {
      return class06889.N(this.R(), this.y());
   }

   public class11522 z() {
      return (class11522)this.y_2;
   }

   public class11499 u(boolean var1) {
      this.y_0 = var1;
      return this;
   }

   public boolean u() {
      return (Boolean)this.N_4;
   }

   public float y() {
      return (Boolean)this.y_1 ? class11302.N(((class04453)((class06202)this.N_2).T_4).field_5982, (Float)this.N_0) : (Float)this.N_0;
   }

   public class11499 y(boolean var1) {
      this.N_4 = var1;
      return this;
   }

   public class11499 y(class11499 var1) {
      return new class11500(class04995.R(this.y() - var1.y()), this.R() - var1.R());
   }

   public boolean E() {
      return (Boolean)this.y_0;
   }

   public float N(class06889 var1) {
      class06889 class06889 = var1.u(((class04453)((class06202)this.N_2).T_4).method_33571()).u();
      double d0 = ((class04453)((class06202)this.N_2).T_4).method_5631(this.R(), this.y()).y(class06889);
      d0 = class04995.N(d0, P[0], P[1]);
      return (float)Math.toDegrees(Math.acos(d0));
   }

   public class11499 N(class11538 var1) {
      this.y_3 = var1;
      return this;
   }

   public class11499 N(boolean var1) {
      this.y_1 = var1;
      return this;
   }

   public class11538 N() {
      return (class11538)this.y_3;
   }

   public class11499 N(class11522 var1) {
      this.y_2 = var1;
      return this;
   }

   public class11499 N(class11499 var1) {
      return new class11499(this.y() + var1.y(), this.R() + var1.R());
   }

   public class11499 N(float var1, float var2) {
      return this.N(new class11500(var1, var2));
   }

   public float R() {
      float f = (Float)this.N_1;
      if ((Boolean)this.y_1) {
         f = class11302.N(((class04453)((class06202)this.N_2).T_4).field_6004, f);
      }

      return Math.clamp(f, -90.0F, 90.0F);
   }
}
