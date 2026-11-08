package NurikWare;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class class09173 {
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
   public Object y_4;

   public String L() {
      return (String)this.y_3;
   }

   public void L(class11389 var1) {
      switch ((class09045)this.y_4) {
         case TOGGLE:
            ((class10872)this.y_2).N(var1);
            break;
         case HOLD:
            ((class10872)this.y_2).L(var1);
            this.N_3 = true;
      }

      this.T();
   }

   public boolean M() {
      return (class09045)this.y_4 == class09045.HOLD ? (Boolean)this.N_3 : ((class10872)this.y_2).N();
   }

   private void T() {
      boolean flag = this.M();
      if (flag != (Boolean)this.N_4) {
         this.N_4 = flag;
         this.N(flag ? class11386.ACTIVATED : class11386.DEACTIVATED);
      }
   }

   public class09173(class11333 var1, String var2, class09045 var3, class12002 var4, int var5) {
      super();
      this.m();
      this.y_0 = new ArrayList();
      this.y_1 = var1;
      this.y_3 = var2;
      this.y_4 = var3;
      this.N_0 = var4;
      this.N_1 = var5;
      this.N_2 = true;
      this.U();
   }

   public boolean B() {
      return ((class12002)this.N_0).y();
   }

   public int Z() {
      return (Integer)this.N_1;
   }

   public class09045 i() {
      return (class09045)this.y_4;
   }

   private void b() {
      if ((Boolean)this.N_3) {
         this.N_3 = false;
         ((class10872)this.y_2)
            .y(class11389.N(((class12002)this.N_0).L(), class11286.RELEASE, ((class12002)this.N_0).N() ? class11381.MOUSE : class11381.KEYBOARD));
         this.T();
      }
   }

   private void s() {
      ((List)this.y_0).forEach(var1 -> var1.accept(this));
   }

   private void m() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = 0;
         this.N_2 = false;
         this.N_3 = false;
         this.N_4 = false;
      }
   }

   public void U() {
      this.y_2 = ((class11333)this.y_1).N();
   }

   public String z() {
      return class12013.N((class12002)this.N_0, (Integer)this.N_1);
   }

   public boolean u(class11389 var1) {
      return ((class12002)this.N_0).N(var1.z()) && class12013.y((class12002)this.N_0, var1.R()) == (Integer)this.N_1;
   }

   public void u() {
      this.T();
   }

   public class12002 y() {
      return (class12002)this.N_0;
   }

   public boolean y(class11389 var1) {
      return ((class12002)this.N_0).N(var1.z()) && (Integer)this.N_1 == 0;
   }

   public void N(String var1) {
      this.y_3 = var1;
   }

   private void N(class11386 var1) {
      class11938.L().L(class11398.N(this, var1));
   }

   public void N(class12002 var1) {
      if ((class12002)this.N_0 != var1) {
         this.b();
         this.N_0 = var1;
         this.s();
         this.N(class11386.UPDATED);
      }
   }

   public void N(class12002 var1, int var2, class09045 var3, boolean var4) {
      this.b();
      boolean flag = (class12002)this.N_0 != var1;
      boolean flag1 = flag || (Integer)this.N_1 != var2 || (class09045)this.y_4 != var3 || (Boolean)this.N_2 != var4;
      this.y_4 = var3;
      this.N_2 = var4;
      this.N_0 = var1;
      this.N_1 = var2;
      if (flag) {
         this.s();
      }

      if (flag1) {
         this.N(class11386.UPDATED);
      }
   }

   public boolean N() {
      return (Boolean)this.N_2;
   }

   public void N(Consumer<class09173> var1) {
      if (!((List)this.y_0).stream().anyMatch(var1x -> var1x == var1)) {
         ((List)this.y_0).add(var1);
      }
   }

   public void N(class11389 var1) {
      if ((class09045)this.y_4 == class09045.HOLD && (Boolean)this.N_3) {
         ((class10872)this.y_2).y(var1);
         this.N_3 = false;
         this.T();
      }
   }

   public void N(boolean var1) {
      if ((Boolean)this.N_2 != var1) {
         this.N_2 = var1;
         this.N(class11386.UPDATED);
      }
   }

   public boolean N(int var1) {
      return ((class12002)this.N_0).N(var1) && (Boolean)this.N_3;
   }

   public String R() {
      return ((class11333)this.y_1).y();
   }
}
