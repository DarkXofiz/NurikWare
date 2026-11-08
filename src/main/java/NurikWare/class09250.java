package NurikWare;

import java.util.Objects;
import java.util.UUID;

public class class09250 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public boolean N_init;

   public class09054 L() {
      return ((class11776)this.N_0).N();
   }

   public long M() {
      return (Long)this.N_1;
   }

   public class09250(class11776 var1, boolean var2, long var3) {
      super();
      this.z();
      this.N_0 = var1;
      this.N_2 = var2;
      this.N_1 = var3;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class09250 class09250 && ((class11776)this.N_0).equals((class11776)class09250.N_0);
   }

   @Override
   public int hashCode() {
      return Objects.hashCode((class11776)this.N_0);
   }

   public class11776 i() {
      return (class11776)this.N_0;
   }

   private void z() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = 0L;
         this.N_2 = false;
      }
   }

   public String u() {
      return ((class11776)this.N_0).u();
   }

   public boolean y() {
      return (Boolean)this.N_2;
   }

   public UUID N() {
      return ((class11776)this.N_0).L();
   }

   public class09250 N(boolean var1) {
      this.N_2 = var1;
      return this;
   }

   public UUID R() {
      return ((class11776)this.N_0).y();
   }
}
