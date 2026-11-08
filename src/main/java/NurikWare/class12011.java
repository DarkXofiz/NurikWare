package NurikWare;

public class class12011 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public Object N_7;
   public boolean N_init;

   public class12011() {
      super();
      this.i();
   }

   @Override
   public String toString() {
      return "RenderState.RenderStateBuilder(blend$value="
         + (class12012)this.N_1
         + ", depthMask$value="
         + (class12014)this.N_3
         + ", depthTest$value="
         + (class12030)this.N_5
         + ", cull$value="
         + (class11996)this.N_7
         + ")";
   }

   private void i() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = false;
         this.N_2 = false;
         this.N_4 = false;
         this.N_6 = false;
      }
   }

   public class12011 N(class12014 var1) {
      this.N_3 = var1;
      this.N_2 = true;
      return this;
   }

   public class12036 N() {
      class12012 class12012 = (class12012)this.N_1;
      if (!(Boolean)this.N_0) {
         class12012 = class12036.E();
      }

      class12014 class12014 = (class12014)this.N_3;
      if (!(Boolean)this.N_2) {
         class12014 = class12036.W();
      }

      class12030 class12030 = (class12030)this.N_5;
      if (!(Boolean)this.N_4) {
         class12030 = class12036.U();
      }

      class11996 class11996 = (class11996)this.N_7;
      if (!(Boolean)this.N_6) {
         class11996 = class12036.m();
      }

      return new class12036(class12012, class12014, class12030, class11996);
   }

   public class12011 N(class12030 var1) {
      this.N_5 = var1;
      this.N_4 = true;
      return this;
   }

   public class12011 N(class11996 var1) {
      this.N_7 = var1;
      this.N_6 = true;
      return this;
   }

   public class12011 N(class12012 var1) {
      this.N_1 = var1;
      this.N_0 = true;
      return this;
   }
}
