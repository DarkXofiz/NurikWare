package NurikWare;

import java.util.Arrays;
import java.util.Objects;
import minecraft.class06202;

public class class11067 extends class11512 {
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

   public String L() {
      this.m();
      return (String)this.N_2;
   }

   public class11072 M() {
      this.m();
      return (class11072)this.y_2;
   }

   public class11067() {
      super();
      this.m();
      this.y_0 = class06202.Nq();
      class11080 class11080 = Objects.requireNonNull(this.getClass().getAnnotation(class11080.class), "The module should be annotated @ModuleTag");
      this.y_2 = class11080.y();
      this.y_3 = class11080.N();
      if (Arrays.stream(((class11072)this.y_2).y()).noneMatch(var1x -> {
         this.m();
         return var1x == (class11106)this.y_3;
      })) {
         throw new IllegalArgumentException(
            String.format("Subcategory '%s' does not belong to category '%s'", ((class11106)this.y_3).N(), ((class11072)this.y_2).N())
         );
      } else {
         this.y_1 = class11080.L();
         this.N_1 = class11080.u();
         this.N_0 = new class12018(class12033.N((String)this.y_1));
         this.N_2 = class11089.N((String)this.y_1);
         this.N_3 = class09113.N(this, class12002.UNKNOWN);
         class11938.W().y((class09173)this.N_3);
         class11938.b().N((class09173)this.N_3);
      }
   }

   public class12018 B() {
      this.m();
      return (class12018)this.N_0;
   }

   public boolean Z() {
      return true;
   }

   public boolean i() {
      return true;
   }

   private void n() {
      class11938.L().L(class11403.N(this));
   }

   private void m() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_4 = false;
      }
   }

   private void v() {
      this.m();
      if (this.Z()) {
         this.N_4 = true;
         class11938.L().y(this);
         this.y();
         this.n();
      }
   }

   private void j() {
      this.m();
      if (this.i()) {
         this.N_4 = false;
         class11938.L().N(this);
         this.y();
         this.n();
      }
   }

   public boolean U() {
      this.m();
      return (Boolean)this.N_4;
   }

   public class11106 z() {
      this.m();
      return (class11106)this.y_3;
   }

   public class11101 u() {
      this.m();
      return (class11101)this.N_1;
   }

   public void y() {
   }

   public void E() {
      this.m();
      this.N(!(Boolean)this.N_4);
   }

   public String N() {
      this.m();
      return (String)this.y_1;
   }

   @Override
   public class12018 N_7(String var1) {
      this.m();
      return new class12018("module").N(((String)this.y_1).toLowerCase()).N("setting").N(var1);
   }

   @Override
   public class11536<?> N(class11536<?> var1) {
      return super.N(var1);
   }

   public void N(class12002 var1, int var2, class09045 var3, boolean var4) {
      this.m();
      ((class09173)this.N_3).N(var1, var2, var3, var4);
   }

   public void N(boolean var1) {
      this.m();
      if ((Boolean)this.N_4 != var1) {
         if (var1) {
            this.v();
         } else {
            this.j();
         }
      }
   }

   public class06202 W() {
      this.m();
      return (class06202)this.y_0;
   }

   public class09173 R() {
      this.m();
      return (class09173)this.N_3;
   }
}
