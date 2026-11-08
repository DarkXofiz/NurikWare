package NurikWare;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import minecraft.class03448;
import minecraft.class04474;
import minecraft.class04891;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class06889;
import minecraft.class07065;
import minecraft.class07109;
import minecraft.class07282;
import minecraft.class07438;
import minecraft.class08036;

public class class11897 extends class08036 implements class11781 {
   private static String[] W;
   private static double[] m;
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public Object N_7;
   public Object y_0;

   private static class07109 L(class07109 var0) {
      float f = var0.y();
      if (f <= 0.0F) {
         return var0;
      } else {
         class07109 class07109 = var0.N(1.0F / f);
         return class07109.N(Math.min(f * N(class07109), 1.0F));
      }
   }

   @Override
   public boolean L() {
      return this.method_24828();
   }

   @Override
   public double M() {
      return this.method_23318();
   }

   private void P() {
      this.N_1 = false;
      this.y_0 = false;
      this.N_2 = false;
      this.N_3 = false;
      this.N_4 = 0.0F;
      this.N_5 = false;
      this.N_6 = m[3];
   }

   public boolean method_7325() {
      return false;
   }

   public boolean method_66249() {
      return true;
   }

   public class07065 method_33570() {
      return class07065.field_28630;
   }

   public boolean method_5624() {
      this.P();
      return (Boolean)this.N_3;
   }

   public void method_5783(class04891 var1, float var2, float var3) {
   }

   public boolean method_68878() {
      return false;
   }

   public boolean method_5715() {
      this.P();
      return (Boolean)this.N_2;
   }

   public class11897(class03448 var1) {
      super(var1, new GameProfile(UUID.randomUUID(), W[0]));
      this.P();
      this.N_0 = new class04474();
      this.N_4 = 1.0F;
      this.N_7 = new class06889(m[0], m[1], m[2]);
   }

   static {
      z();
      m();
   }

   public void B() {
      this.method_5876();
      this.method_5630();
      this.method_7295();
      this.method_5790();
   }

   @Override
   public class07438 i() {
      return this;
   }

   private static void m() {
      W = new String[1];
      W[0] = "mock-player";
   }

   private static void z() {
      m = new double[4];
      m[0] = Double.longBitsToDouble(0L);
      m[1] = Double.longBitsToDouble(0L);
      m[2] = Double.longBitsToDouble(0L);
      m[3] = Double.longBitsToDouble(0L);
   }

   @Override
   public double u() {
      this.P();
      return (Double)this.N_6;
   }

   private class07109 y(class07109 var1) {
      this.P();
      if (var1.L() == 0.0F) {
         return var1;
      } else {
         class07109 class07109 = var1.N(0.98F).N((Float)this.N_4);
         if (this.method_5715() || this.method_20448()) {
            class07109 = class07109.N((float)this.method_45325(class05298.Y));
         }

         return L(class07109);
      }
   }

   @Override
   public boolean y() {
      this.P();
      return (Boolean)this.N_5;
   }

   @Override
   public class06889 N() {
      this.P();
      return (class06889)this.N_7;
   }

   @Override
   public void N(boolean var1) {
      this.P();
      this.y_0 = var1;
   }

   private static float N(class07109 var0) {
      float f = Math.abs(var0.z);
      float f1 = Math.abs(var0.U);
      float f2 = f1 > f ? f / f1 : f1 / f;
      return class04995.N(1.0F + class04995.z(f2));
   }

   @Override
   public void N(class06889 var1) {
      this.P();
      this.N_7 = var1;
   }

   @Override
   public boolean R() {
      this.P();
      return (Boolean)this.y_0;
   }

   public void method_66282() {
      this.P();
      class07109 class07109 = this.y(((class04474)this.N_0).method_3128());
      super.fields_7212a028292fd3c078969e3ee4c71d9e8_0 = class07109.z;
      super.fields_7212a028292fd3c078969e3ee4c71d9e8_2 = class07109.U;
      super.fields_6212a028292fd3c078969e3ee4c71d9e8_4 = (Boolean)this.N_1;
   }

   public void method_6070() {
   }

   public void method_29242(boolean var1) {
   }

   public class07282 method_68876() {
      return class07282.field_9215;
   }

   public boolean method_7340() {
      return true;
   }
}
