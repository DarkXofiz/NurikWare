package NurikWare;

public class class11954 implements class11951<class09252> {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public Object N_7;
   public boolean N_init;
   public static Object y_0;
   public static Object y_1;

   public String L() {
      return (String)this.N_7;
   }

   public short M() {
      return (Short)this.N_0;
   }

   public class11954(short var1, byte var2, String var3, String var4, int var5, String var6, String var7, String var8) {
      super();
      this.U();
      this.N_0 = var1;
      this.N_1 = var2;
      this.N_2 = var3;
      this.N_3 = var4;
      this.N_4 = var5;
      this.N_5 = var6;
      this.N_6 = var7;
      this.N_7 = var8;
   }

   public class11954() {
      super();
      this.U();
   }

   static {
      Z();
   }

   public String B() {
      return (String)this.N_6;
   }

   private static void Z() {
      y_0 = (byte)1;
      y_1 = (byte)2;
   }

   public int i() {
      return (Integer)this.N_4;
   }

   private void U() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = (short)0;
         this.N_1 = (byte)0;
         this.N_4 = 0;
      }
   }

   public String u() {
      return (String)this.N_3;
   }

   public String y() {
      return (String)this.N_2;
   }

   @Override
   public void y(class11940 var1) {
      this.N_0 = var1.L();
      this.N_1 = var1.E();
      this.N_2 = var1.P();
      this.N_3 = var1.P();
      this.N_4 = var1.R();
      this.N_5 = var1.P();
      this.N_6 = var1.P();
      this.N_7 = var1.P();
   }

   @Override
   public void N(class11940 var1) {
      var1.N((Short)this.N_0);
      var1.L((Byte)this.N_1);
      var1.N((String)this.N_2);
      var1.N((String)this.N_3);
      var1.y((Integer)this.N_4);
      var1.N((String)this.N_5);
      var1.N((String)this.N_6);
      var1.N((String)this.N_7);
   }

   public void N(class09252 var1) {
      var1.N(this);
   }

   public String N() {
      return (String)this.N_5;
   }

   public byte R() {
      return (Byte)this.N_1;
   }
}
