package NurikWare;

import java.time.Duration;
import java.util.Arrays;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07438;
import org.joml.Matrix4fStack;

public class class11441 extends class11807<TargetEsp> {
   public static Object y_0 = Duration.ofMillis(300L);
   public static Object y_1 = Duration.ofMillis(100L);
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;

   private static void M() {
      y_0 = null;
      y_1 = null;
   }

   public class11441(TargetEsp var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.R();
      this.L_0 = new class11934[4];
      this.L_1 = class11174.N()
         .N(class11204.L().N((class12036)class12019.N_1).N((class09322)class11185.Z_1).N(4).N())
         .N(class11213.N((class09087)class09063.N_2, 4096, 1024))
         .N();
      this.L_2 = ((class09322)class11185.Z_1).z("u_projection");
      this.L_3 = ((class09322)class11185.Z_1).z("u_view");
      this.L_4 = ((class09322)class11185.Z_1).M("texture_in");

      for (int i = 0; i < ((class11934[])this.L_0).length; i++) {
         ((class11934[])this.L_0)[i] = new class11934(class11903.FORWARDS);
      }
   }

   static {
      N();
      M();
   }

   @Override
   public void y(Object var1) {
      this.R();
      if (var1 instanceof class09321 class09321) {
         boolean flag = ((TargetEsp)super.N_1).m();
         Duration duration = flag ? (Duration)y_0 : (Duration)y_1;

         for (int i = 1; i < ((class11934[])this.L_0).length; i++) {
            class11934 class11934x = ((class11934[])this.L_0)[i - 1];
            int j = flag ? 1 : 0;
            if (flag ? !(class11934x.E() > 0.4F) : !(class11934x.E() <= 0.6F)) {
               class11934x.N(j, duration, flag ? (class11887)class11905.y_0 : (class11887)class11905.N_5);
               break;
            }

            ((class11934[])this.L_0)[i].N(j, duration, flag ? (class11887)class11905.y_0 : (class11887)class11905.N_5);
         }

         for (class11934 class11934 : (class11934[])this.L_0) {
            class11934.N();
         }

         if (Arrays.<class11934>stream((class11934[])this.L_0).allMatch(var0 -> var0.N(class11903.BACKWARDS))) {
            return;
         }

         Matrix4fStack matrix4fstack = class09321.R();
         class07438 class07438 = ((TargetEsp)super.N_1).T();
         class06889 class06889 = class09321.y().y();
         class11184 class11184 = ((class11174)this.L_1).R();
         float f = (float)(class11925.i(class07438) - class06889.M);
         float f1 = (float)(class11925.u(class07438) - class06889.B) + class07438.method_17682() / 2.0F;
         float f2 = (float)(class11925.L(class07438) - class06889.Z);
         float f3 = (float)(
            (
                     1.0
                        - Math.sin(
                           Math.max(
                              (class07438.fields_2212a028292fd3c078969e3ee4c71d9e8_0.intValue() - ((class06202)super.N_0).NK().N(false))
                                 / 10.0F
                                 * (float) Math.PI,
                              0.0F
                           )
                        )
                  )
                  * 0.3F
               + 0.7F
         );
         int k = ((class11515)((TargetEsp)super.N_1).L_5).i();
         byte b0 = 4;
         float f4 = 0.2F;
         float f5 = f4 * 2.0F * f3;
         float f6 = (float)(
            Math.sin((((class04453)((class06202)super.N_0).T_4).field_6012 + ((class06202)super.N_0).NK().N(false)) % 40.0 / 40.0 * (float) (Math.PI * 2))
               * 2.0
         );

         for (int l = 0; l < b0; l++) {
            matrix4fstack.pushMatrix();
            matrix4fstack.translate(f, f1, f2);
            float f7 = ((class11934[])this.L_0)[l].E().floatValue() * 0.5F;
            matrix4fstack.scale(1.0F + (0.5F - f7));
            matrix4fstack.rotate(class09321.y().M());
            float f8 = l * ((float) (Math.PI * 2) / b0);
            matrix4fstack.rotate(f8 + f6, 0.0F, 0.0F, 1.0F);
            matrix4fstack.translate(0.0F, f5, 0.0F);
            matrix4fstack.rotate((float) Math.PI, 0.0F, 0.0F, 1.0F);
            int i1 = class11184.i();
            int j1 = class11300.N(k, (int)(class11300.y(k) * f7 * 2.0F));
            class11184.N(matrix4fstack, -f4, f4, 0.0F).N(0.0F, 0.0F).y(j1).y();
            class11184.N(matrix4fstack, f4, f4, 0.0F).N(1.0F, 0.0F).y(j1).y();
            class11184.N(matrix4fstack, f4, -f4, 0.0F).N(1.0F, 1.0F).y(j1).y();
            class11184.N(matrix4fstack, -f4, -f4, 0.0F).N(0.0F, 1.0F).y(j1).y();
            ((class11174)this.L_1).L().y(i1);
            matrix4fstack.popMatrix();
         }

         class11925.N(((class06202)super.N_0).e(), true);
         ((class11174)this.L_1).N(var2x -> {
            this.R();
            ((class12038)this.L_2).N(class09321.i());
            ((class12038)this.L_3).N(class09321.N());
            ((class12026)this.L_4).N(((class12031)class11998.N_1).N());
         });
      }
   }

   private static void N() {
   }

   private void R() {
   }
}
