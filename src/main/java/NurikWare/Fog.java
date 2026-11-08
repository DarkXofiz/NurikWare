package NurikWare;

import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;

@class11080(
   L = "Fog",
   y = class11072.VISUAL,
   N = class11106.WORLD
)
public class Fog extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public Object L_7;

   private void T() {
   }

   public Fog() {
      super();
      this.T();
      this.L_0 = new class11535("color", true);
      this.L_1 = new class11535("blur", true);
      this.L_2 = class11524.y(this, "details", (class11535)this.L_0, (class11535)this.L_1);
      this.L_3 = (class11515)class11524.N(this, "color", 1297584127).N(var1 -> {
         this.T();
         return ((class11535)this.L_0).U() || ((class11535)this.L_1).U();
      });
      this.L_4 = (class11504)class11524.N(this, "distance", 50.0F, 10.0F, 150.0F, 1.0F).N(var1 -> {
         this.T();
         return ((class11535)this.L_1).U();
      });
      this.L_5 = new class11238();
      this.L_7 = BufferUtils.createFloatBuffer(20);
      this.L_6 = (class11504)class11524.N(this, "radius", 12.0F, 8.0F, 20.0F, 1.0F).N(var1 -> {
         this.T();
         return ((class11535)this.L_1).U();
      }).N_6((var1, var2) -> {
         this.T();
         class11925.N((FloatBuffer)this.L_7, Math.max(0, var2.intValue() - 1));
      });
      class11925.N((FloatBuffer)this.L_7, Math.max(0, ((class11504)this.L_6).i().intValue() - 1));
   }

   @class11782(
      y = class11777.BEFORE,
      N = {Tracers.class}
   )
   public void N(class09321 var1) {
      this.T();
      if (((class11535)this.L_1).U()) {
         ((class11238)this.L_5).N(var1, ((class11515)this.L_3).i(), ((class11504)this.L_4).i(), ((class11504)this.L_6).i().intValue(), (FloatBuffer)this.L_7);
      }
   }

   @class11782
   public void N(class09324 var1) {
      this.T();
      if (((class11535)this.L_0).U()) {
         int i = ((class11515)this.L_3).i();
         var1.y(class11300.u(i) / 255.0F);
         var1.N(class11300.N(i) / 255.0F);
         var1.L(class11300.i(i) / 255.0F);
         var1.u(class11300.y(i) / 255.0F);
      }
   }
}
