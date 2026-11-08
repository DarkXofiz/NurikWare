package NurikWare;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.FloatBuffer;
import java.util.function.IntSupplier;
import minecraft.class06202;
import minecraft.class08066;

public class class11238 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public Object N_7;
   public static Object y_0 = class06202.Nq();

   public class11238() {
      super();
      this.U();
      this.N_0 = class11213.N((class09087)class09063.N_2, 4096, 1024);
      this.N_1 = new class11270();
      this.N_2 = class09097.y(() -> ((class06202)y_0).Nt().U() / 2, () -> ((class06202)y_0).Nt().E() / 2);
      this.N_3 = class09097.y(() -> ((class06202)y_0).Nt().U() / 2, () -> ((class06202)y_0).Nt().E() / 2);
      this.N_4 = class09097.L(() -> ((class06202)y_0).Nt().U() / 2, () -> ((class06202)y_0).Nt().E() / 2);
      this.N_5 = class09097.L(() -> ((class06202)y_0).Nt().U() / 4, () -> ((class06202)y_0).Nt().E() / 4);
      this.N_6 = (IntSupplier)() -> class11925.y(((class06202)y_0).e());
      this.N_7 = class11218.<class11270>N()
         .N(new class11242((class11213)this.N_0))
         .N((class09064)this.N_2)
         .N(() -> class11925.N(((class06202)y_0).e()))
         .N(33990, (IntSupplier)this.N_6)
         .N(new class11258((class11213)this.N_0))
         .N((class09064)this.N_3)
         .L((class09064)this.N_2)
         .N(new class11250((class11213)this.N_0, 1.0F))
         .N((class09064)this.N_4)
         .L((class09064)this.N_3)
         .N(new class11250((class11213)this.N_0, 2.0F))
         .N((class09064)this.N_5)
         .L((class09064)this.N_4)
         .N(new class11262((class11213)this.N_0, (float[])class11262.L_0, 4.0F))
         .N((class09064)this.N_4)
         .L((class09064)this.N_5)
         .N(new class11262((class11213)this.N_0, (float[])class11262.L_1, 4.0F))
         .N((class09064)this.N_5)
         .L((class09064)this.N_4)
         .N(new class11267((class11213)this.N_0))
         .L(((class06202)y_0)::e)
         .L((class09064)this.N_5)
         .N(33990, (IntSupplier)this.N_6)
         .N();
   }

   static {
      Z();
   }

   private static void Z() {
      y_0 = null;
   }

   private void U() {
   }

   public void N(class09321 var1, int var2, float var3, int var4, FloatBuffer var5) {
      class08066 class08066 = ((class06202)y_0).e();
      int i = ((class06202)y_0).Nt().U();
      int j = ((class06202)y_0).Nt().E();
      ((class11270)this.N_1).R().setOrtho(0.0F, class08066.N, class08066.y, 0.0F, -1.0F, 1.0F);
      ((class11270)this.N_1).L().set(var1.i()).invert();
      ((class11270)this.N_1).E().set(var1.N()).invert();
      ((class11270)this.N_1).M().set(RenderSystem.getModelViewMatrix());
      ((class11270)this.N_1).u(class08066.N).y(class08066.y).N((float)i).L((float)j).y(var3).L(var2).N(var4).N(var5);
      ((class11218)this.N_7).execute((class11270)this.N_1);
   }
}
