package NurikWare;

import java.util.UUID;

public class class11290 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public boolean N_init;
   public Object y_0;
   public Object y_1;
   public boolean y_init;
   public Object L_0;
   public Object L_1;
   public boolean L_init;

   public int L() {
      return (Integer)this.N_6;
   }

   public class11290 L(long var1) {
      this.N_3 = var1;
      return this;
   }

   public class11296 M() {
      return (class11296)this.N_5;
   }

   public class11290(UUID var1, long var2, String var4, String var5, long var6, long var8, long var10, class11296 var12, int var13, boolean var14, byte[] var15) {
      super();
      this.s();
      this.L_0 = var1;
      this.L_1 = var2;
      this.N_0 = var4;
      this.N_1 = var5;
      this.N_2 = var6;
      this.N_3 = var8;
      this.N_4 = var10;
      this.N_5 = var12;
      this.N_6 = var13;
      this.y_0 = var14;
      this.y_1 = var15;
   }

   public long B() {
      return (Long)this.N_2;
   }

   public long Z() {
      return (Long)this.L_1;
   }

   public String i() {
      return (String)this.N_0;
   }

   private void s() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_1 = 0L;
      }

      if (!this.N_init) {
         this.N_init = true;
         this.N_2 = 0L;
         this.N_3 = 0L;
         this.N_4 = 0L;
         this.N_6 = 0;
      }

      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = false;
      }
   }

   public byte[] U() {
      return (byte[])this.y_1;
   }

   public String z() {
      return (String)this.N_1;
   }

   public UUID u() {
      return (UUID)this.L_0;
   }

   public class11290 u(long var1) {
      this.N_4 = var1;
      return this;
   }

   public class11290 y(String var1) {
      this.N_1 = var1;
      return this;
   }

   public class11290 y(long var1) {
      this.L_1 = var1;
      return this;
   }

   public long y() {
      return (Long)this.N_3;
   }

   public boolean E() {
      return (Long)this.L_1 <= 0L;
   }

   public class11290 N(class11296 var1) {
      this.N_5 = var1;
      return this;
   }

   public boolean N() {
      return (Boolean)this.y_0;
   }

   public class11290 N(boolean var1) {
      this.y_0 = var1;
      return this;
   }

   public class11290 N(int var1) {
      this.N_6 = var1;
      return this;
   }

   public class11290 N(String var1) {
      this.N_0 = var1;
      return this;
   }

   public class11290 N(long var1) {
      this.N_2 = var1;
      return this;
   }

   public class11290 N(byte[] var1) {
      this.y_1 = var1;
      return this;
   }

   public long R() {
      return (Long)this.N_4;
   }
}
