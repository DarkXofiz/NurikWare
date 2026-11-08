package NurikWare;

public class class11955 implements class11951<class09276> {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public boolean N_init;

   public char L() {
      return (Character)this.N_0;
   }

   public class11955() {
      super();
      this.Z();
   }

   public class11955(char var1, int var2, String var3, String var4, boolean var5, boolean var6) {
      super();
      this.Z();
      this.N_0 = var1;
      this.N_1 = var2;
      this.N_2 = var3;
      this.N_3 = var4;
      this.N_4 = var5;
      this.N_5 = var6;
   }

   private void Z() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = '\u0000';
         this.N_1 = 0;
         this.N_4 = false;
         this.N_5 = false;
      }
   }

   public String i() {
      return (String)this.N_3;
   }

   public int u() {
      return (Integer)this.N_1;
   }

   @Override
   public void y(class11940 var1) {
      this.N_0 = var1.u();
      this.N_1 = Integer.valueOf(var1.E());
      this.N_2 = var1.P();
      this.N_3 = var1.P();
      this.N_4 = var1.B();
      this.N_5 = var1.B();
   }

   public boolean y() {
      return (Boolean)this.N_4;
   }

   public String N() {
      return (String)this.N_2;
   }

   public void N(class09276 var1) {
      var1.N(this);
   }

   @Override
   public void N(class11940 var1) {
      var1.N((Character)this.N_0);
      var1.L((Integer)this.N_1);
      var1.N((String)this.N_2);
      var1.N((String)this.N_3);
      var1.N((Boolean)this.N_4);
      var1.N((Boolean)this.N_5);
   }

   public boolean R() {
      return (Boolean)this.N_5;
   }
}
