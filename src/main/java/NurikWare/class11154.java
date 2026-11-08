package NurikWare;

import java.util.function.Supplier;
import minecraft.class06202;

public class class11154 extends class11535 implements class11801<TapeMouse> {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;

   public class11154(String var1, boolean var2, String var3, Runnable var4) {
      super(var1, var2);
      this.i();
      this.N_0 = class06202.Nq();
      this.N_1 = new class11467();
      this.N_2 = var3;
      this.N_3 = var4;
   }

   static {
      N();
   }

   private void i() {
   }

   private static void N() {
   }

   public void N(class11380 var1) {
      this.i();
      if (((class11467)this.N_1).N((long)(((class11504)this.N_4).i() * 1000.0F))) {
         ((Runnable)this.N_3).run();
         ((class11467)this.N_1).N();
      }
   }

   public void N(TapeMouse var1) {
      this.i();
      this.N_4 = (class11504)class11524.N(var1, (String)this.N_2, 5.0F, 0.1F, 120.0F, 0.1F).N((Supplier<String>)class11502.N_2).N(var1x -> this.U());
   }
}
