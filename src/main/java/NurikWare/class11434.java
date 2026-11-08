package NurikWare;

import java.time.Duration;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07438;
import org.joml.Matrix4fStack;

public class class11434 extends class11807<TargetEsp> {
   public Object y_0;
   public static Object L_0 = Duration.ofMillis(300L);

   private static void M() {
      L_0 = null;
   }

   public class11434(TargetEsp var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.B();
      this.y_0 = new class11934(class11903.FORWARDS);
   }

   static {
      M();
   }

   private void B() {
   }

   @Override
   public void y(Object var1) {
      this.B();
      if (var1 instanceof class09321 class09321) {
         ((class11934)this.y_0).N(((TargetEsp)super.N_1).m() ? 1.0 : 0.0, (Duration)L_0, (class11887)class11905.u_4);
         ((class11934)this.y_0).N();
         if (((class11934)this.y_0).N(class11903.BACKWARDS)) {
            return;
         }

         class11174 class11174 = (class11174)class11190.N_3;
         class11174 class11174x = (class11174)class11190.N_1;
         Matrix4fStack matrix4fstack = class09321.R();
         class07438 class07438 = ((TargetEsp)super.N_1).T();
         class06889 class06889 = class09321.y().y();
         float f = (float)(class11925.i(class07438) - class06889.M);
         float f1 = (float)(class11925.u(class07438) - class06889.B);
         float f2 = (float)(class11925.L(class07438) - class06889.Z);
         class11184 class11184 = class11174.R();
         class11184 class11184x = class11174x.R();
         class11178 class11178 = class11174x.L();
         byte b0 = 35;
         float f3 = ((TargetEsp)super.N_1).T().method_17682() / 2.0F;
         double d0 = (((class04453)((class06202)super.N_0).T_4).field_6012 + ((class06202)super.N_0).NK().N(false)) / 4.0;
         float f4 = (float)Math.sin(d0) * f3 + f3;
         float f5 = (float)Math.cos(d0);
         int i = ((class11515)((TargetEsp)super.N_1).L_5).i();
         int j = class11300.N(i, (int)(255.0 * ((class11934)this.y_0).E()));
         int k = class11300.N(i, (int)(120.0 * ((class11934)this.y_0).E()));
         int l = class11300.N(i, 0);
         float f6 = class07438.method_17681();

         for (int i1 = 0; i1 < b0; i1++) {
            int j1 = class11184x.i();
            float f7 = (float)Math.toRadians(360.0F / b0 * i1);
            float f8 = (float)Math.sin(f7) * f6;
            float f9 = (float)Math.cos(f7) * f6;
            float f10 = (float)Math.toRadians(360.0F / b0 * (i1 + 1));
            float f11 = (float)Math.sin(f10) * f6;
            float f12 = (float)Math.cos(f10) * f6;
            class11184.N(matrix4fstack, f + f8, f1 + f4, f2 + f9).N(matrix4fstack, f + f11, f1 + f4, f2 + f12).y(j).y(j).N(0.0F).y();
            class11184x.N(matrix4fstack, f + f11, f1 + f4 - f5 / 2.0F, f2 + f12).y(l).y();
            class11184x.N(matrix4fstack, f + f8, f1 + f4 - f5 / 2.0F, f2 + f9).y(l).y();
            class11184x.N(matrix4fstack, f + f8, f1 + f4, f2 + f9).y(k).y();
            class11184x.N(matrix4fstack, f + f11, f1 + f4, f2 + f12).y(k).y();
            class11178.y(j1);
         }
      }
   }
}
