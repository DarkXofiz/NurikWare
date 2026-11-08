package NurikWare;

import com.mojang.authlib.GameProfile;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class03448;
import minecraft.class04477;
import minecraft.class06889;
import minecraft.class07072;
import minecraft.class07276;
import minecraft.class08694;
import minecraft.class08700;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class10401 extends class04477 implements class11814 {
   private static double[] M;
   private static String[] W;
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public boolean N_init;

   private static void M() {
      W = new String[1];
      W[0] = "push";
   }

   public void method_31471(class07276 var1) {
      super.method_31471(var1);
      this.method_22862();
   }

   public void method_5773() {
      super.method_5773();
      this.method_29242(false);
   }

   public boolean method_5640(double var1) {
      double d0 = this.method_5829().N() * M[0];
      if (Double.isNaN(d0)) {
         d0 = M[1];
      }

      d0 *= M[2] * method_5824();
      return var1 < d0 * d0;
   }

   public boolean method_5643(class07072 var1) {
      return true;
   }

   public void method_5750(class06889 var1) {
      this.R();
      this.N_0 = var1;
      this.N_1 = this.method_5864().m() + 1;
   }

   public class10401(class03448 var1, GameProfile var2) {
      super(var1, var2);
      this.R();
      this.N_2 = new class11824();
      this.N_0 = class06889.L;
      this.field_5960 = true;
   }

   static {
      i();
      M();
   }

   private static void i() {
      M = new double[3];
      M[0] = Double.longBitsToDouble(4621819117588971520L);
      M[1] = Double.longBitsToDouble(4607182418800017408L);
      M[2] = Double.longBitsToDouble(4634204016564240384L);
   }

   private void N(CallbackInfo var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2)) {
         super.method_7318();
      }
   }

   public class11824 dataManager() {
      this.R();
      return (class11824)this.N_2;
   }

   private void R() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = 0;
      }
   }

   public void method_6007() {
      this.R();
      if (this.method_66245()) {
         this.method_66233().method_66271();
      }

      if (super.fields_7212a028292fd3c078969e3ee4c71d9e8_5 > 0) {
         this.method_52539(super.fields_7212a028292fd3c078969e3ee4c71d9e8_5, super.fields_7212a028292fd3c078969e3ee4c71d9e8_4);
         super.fields_7212a028292fd3c078969e3ee4c71d9e8_5 = super.fields_7212a028292fd3c078969e3ee4c71d9e8_5 - 1;
      }

      if ((Integer)this.N_1 > 0) {
         this.method_45319(
            new class06889(
               (((class06889)this.N_0).M - this.method_18798().M) / ((Integer)this.N_1).intValue(),
               (((class06889)this.N_0).B - this.method_18798().B) / ((Integer)this.N_1).intValue(),
               (((class06889)this.N_0).Z - this.method_18798().Z) / ((Integer)this.N_1).intValue()
            )
         );
         this.N_1 = (Integer)this.N_1 - 1;
      }

      this.method_6119();
      this.W();
      class08694 class08694 = class08700.N().i(W[0]);

      try {
         this.method_6070();
      } catch (Throwable throwable1) {
         if (class08694 != null) {
            try {
               class08694.close();
            } catch (Throwable throwable) {
               throwable1.addSuppressed(throwable);
            }
         }

         throw throwable1;
      }

      if (class08694 != null) {
         class08694.close();
      }
   }

   public void method_7318() {
      this.N(null);
   }
}
