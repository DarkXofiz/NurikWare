package NurikWare;

import java.util.Objects;
import java.util.function.BooleanSupplier;
import java.util.function.Predicate;

public abstract class class11536<T> extends class11512 {
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public boolean y_init;
   public Object L_0;
   public Object L_1;
   public Object L_2;

   public void L(T var1) {
      this.L();
      this.y_1 = var1;
      ((class11520)this.y_5).valueChanged(this, (T)var1);
      this.m();
   }

   private void L() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_3 = false;
      }
   }

   public class12018 P() {
      this.L();
      return (class12018)this.y_0;
   }

   public class11536(class12018 var1, T var2) {
      super();
      this.L();
      this.y_0 = var1;
      this.y_1 = this.y_2 = var2;
      this.y_3 = true;
      this.y_4 = (Predicate<class11536>)var0 -> true;
      this.y_5 = (class11520<Object>)(var0, var1x) -> {};
      this.L_0 = (class11496)(var0, var1x) -> {};
   }

   public class11496 B() {
      this.L();
      return (class11496)this.L_0;
   }

   public Predicate<class11536<T>> Z() {
      this.L();
      return (Predicate<class11536<T>>)this.y_4;
   }

   public T i() {
      this.L();
      return (T)((BooleanSupplier)this.L_1 != null && ((BooleanSupplier)this.L_1).getAsBoolean() ? this.L_2 : this.y_1);
   }

   public void s() {
      if (this.c_()) {
         this.u();
      }
   }

   public void m() {
      this.L();
      boolean flag = (Boolean)this.y_3;
      this.y_3 = ((Predicate)this.y_4).test(this);
      if (flag != (Boolean)this.y_3) {
         ((class11496)this.L_0).visibilityChanged(this, (Boolean)this.y_3);
      }
   }

   public T U() {
      this.L();
      return (T)this.y_2;
   }

   public class11520<T> z() {
      this.L();
      return (class11520<T>)this.y_5;
   }

   @Override
   public void u() {
      this.L();
      this.L((T)this.y_2);
   }

   public class11536<T> y(T var1) {
      this.L();
      this.y_2 = var1;
      return this;
   }

   public boolean E() {
      this.L();
      return (Boolean)this.y_3;
   }

   public <E extends class11536<T>> E N(Predicate<class11536<T>> var1) {
      this.L();
      this.y_4 = var1;
      return (E)this;
   }

   public <E extends class11536<T>> E N(BooleanSupplier var1, T var2) {
      this.L();
      this.L_1 = var1;
      this.L_2 = var2;
      return (E)this;
   }

   public void N(T var1) {
      this.L((T)var1);
   }

   public boolean N() {
      return false;
   }

   @Override
   public class12018 N_7(String var1) {
      this.L();
      return ((class12018)this.y_0).N(var1);
   }

   public <E extends class11536<T>> E N_6(class11520<T> var1) {
      this.L();
      this.y_5 = var1;
      return (E)this;
   }

   public class11536<T> N(class11496 var1) {
      this.L();
      this.L_0 = var1;
      return this;
   }

   public T W() {
      this.L();
      return (T)this.y_1;
   }

   public boolean c_() {
      this.L();
      return !Objects.equals(this.y_1, this.y_2);
   }
}
