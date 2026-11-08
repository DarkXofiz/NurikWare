package NurikWare;

import minecraft.class04995;

public class class11459 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;

   public void L() {
      long i = System.currentTimeMillis();
      float f = (float)(i - (Long)this.N_3) / 1000.0F;
      if (f > 0.0F) {
         long j = (long)class04995.N((Float)this.N_2 / f, 0.0F, (Float)this.N_2);
         ((class11319)this.N_1).add(j);
      }

      this.N_3 = i;
      this.u();
   }

   public class11459() {
      super();
      this.z();
      this.N_0 = 20;
      this.N_1 = new class11319((Integer)this.N_0);
      this.N_2 = 20.0F;
      this.N_5 = (Float)this.N_2;
   }

   private void z() {
      this.N_0 = 0;
      this.N_2 = 0.0F;
      this.N_3 = 0L;
      this.N_4 = 0L;
      this.N_5 = 0.0F;
   }

   public void u() {
      long i = System.currentTimeMillis();
      if (i - (Long)this.N_4 >= 4000L) {
         double d0 = ((class11319)this.N_1)
            .stream()
            .filter(var0 -> var0 != null && var0 > 0L)
            .mapToLong(Long::longValue)
            .average()
            .orElse(((Float)this.N_2).floatValue());
         this.N_5 = class11908.N((float)d0, 0.1F);
         this.N_4 = i;
      }
   }

   public float y() {
      return (Float)this.N_5;
   }

   public void N(float var1) {
      this.N_0 = (int)Math.ceil(var1);
      this.N_2 = var1;
      this.N_1 = new class11319((Integer)this.N_0);
   }

   public void N() {
      ((class11319)this.N_1).clear();

      for (int i = 0; i < (Integer)this.N_0; i++) {
         ((class11319)this.N_1).add(0L);
      }

      long j = System.currentTimeMillis();
      this.N_3 = j;
      this.N_4 = j;
      this.u();
   }
}
