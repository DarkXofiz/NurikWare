package NurikWare;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import minecraft.class00392;
import minecraft.class01028;
import minecraft.class01079;

public class class09093 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public boolean N_init;
   public static Object y_0;
   public static Object y_1;
   public static Object y_2;
   public static Object y_3;
   public static Object y_4;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object u_5;
   public boolean u_init;

   public int L(int var1) {
      return ((class09082)this.L_4).L(var1);
   }

   public void L() {
      if ((class00392)this.N_3 != null && !((class00392)this.N_3).getString().isEmpty()) {
         ((class09106)this.L_5)
            .N(
               ((class00392)this.N_3).method_30937(),
               (Float)this.u_1,
               (Float)this.u_2,
               (byte)((Float)this.N_4).floatValue(),
               (class09079)this.N_5,
               (Boolean)this.u_5,
               (Integer)this.N_6,
               (Integer)this.u_0,
               (Integer)this.u_3,
               (byte)((Float)this.u_4).floatValue()
            );
         this.M();
      } else {
         if ((String)this.N_2 != null && !((String)this.N_2).isEmpty()) {
            ((class09106)this.L_5)
               .N(
                  (String)this.N_2,
                  (Float)this.u_1,
                  (Float)this.u_2,
                  (byte)((Float)this.N_4).floatValue(),
                  (class09079)this.N_5,
                  (Boolean)this.u_5,
                  (Integer)this.N_6,
                  (Integer)this.u_0,
                  (Integer)this.u_3,
                  (byte)((Float)this.u_4).floatValue()
               );
         }

         this.M();
      }
   }

   public float L(class00392 var1) {
      return this.y(var1, (Float)this.N_4, (class09079)this.N_5, (Boolean)this.u_5);
   }

   public float L(String var1) {
      return this.N(var1, (Float)this.N_4, (class09079)this.N_5, (Boolean)this.u_5);
   }

   public class09093 L(float var1) {
      this.u_1 = var1;
      return this;
   }

   private void M() {
      this.N_2 = "";
      this.N_3 = null;
      this.N_4 = 12.0F;
      this.N_5 = class09079.REGULAR;
      this.u_5 = false;
      this.N_6 = -1;
      this.u_0 = 0;
      this.u_1 = 0.0F;
      this.u_2 = 0.0F;
      this.u_3 = 0;
      this.u_4 = 0.0F;
   }

   public class09093(String var1, class09082 var2, class01079 var3) {
      super();
      this.R();
      this.L_0 = new class09070();
      this.L_1 = new class09074();
      this.L_2 = new class09090();
      this.L_3 = new class09099();
      this.N_1 = var1;
      this.L_4 = var2;
      this.L_5 = new class09106();
      this.N_0 = new class09100(var2, var1, N(var3));
      this.M();
   }

   static {
      B();
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof class09093 class09093)) {
         return false;
      } else {
         String s = (String)this.N_1;
         String s1 = (String)class09093.N_1;
         return s == null ? s1 == null : s.equals(s1);
      }
   }

   @Override
   public int hashCode() {
      byte b0 = 59;
      byte b1 = 1;
      String s = (String)this.N_1;
      return b1 * 59 + (s == null ? 43 : s.hashCode());
   }

   private static void B() {
      y_0 = 10;
      y_1 = 9;
      y_2 = 13;
      y_3 = 32;
      y_4 = 4;
   }

   public class09093 i(int var1) {
      this.N_6 = var1;
      return this;
   }

   public class09093 u(float var1) {
      this.u_4 = var1;
      return this;
   }

   public int u(int var1) {
      return ((class09082)this.L_4).N(var1);
   }

   public void u() {
      ((class09082)this.L_4).y();
   }

   public class09071 y(class09079 var1) {
      return ((class09100)this.N_0).N(var1 == null ? class09079.REGULAR : var1);
   }

   public class09093 y(int var1) {
      this.u_3 = var1;
      return this;
   }

   public void y() {
      ((class09106)this.L_5).N(this);
   }

   public class09093 y(class00392 var1) {
      this.N_3 = var1;
      return this;
   }

   public float y(String var1, float var2, class09079 var3, boolean var4) {
      return var1 != null && !var1.isEmpty() ? this.N(this.y(var3), var2, var1) : 0.0F;
   }

   public class09093 y(float var1) {
      this.u_2 = var1;
      return this;
   }

   private static float y(float var0, float var1) {
      float f = var1 > 0.0F ? var1 : 1.0F;
      return Math.max(1.0F, (float)Math.round(var0 * f));
   }

   public class09093 y(String var1) {
      this.N_2 = var1;
      return this;
   }

   public float y(class00392 var1, float var2, class09079 var3, boolean var4) {
      if (var1 == null) {
         return 0.0F;
      } else {
         return var1.getString().isEmpty() ? 0.0F : this.N(this.y(var3), var2, var1.method_30937());
      }
   }

   public boolean N(String var1, float var2, float var3, float var4, float var5, class09079 var6, boolean var7, int var8, class09061 var9) {
      if (var1 != null && !var1.isEmpty()) {
         float f = y(var4, var5);
         return ((class09074)this.L_1).N(this.y(var6), f, var5, var1, var2, var3, var8, var9);
      } else {
         return true;
      }
   }

   public float N(float var1, class09079 var2, boolean var3, int var4) {
      return this.y(var2).N(var4, var1);
   }

   private float N(class09071 var1, float var2, String var3) {
      ((class09099)this.L_3).N((class09090)this.L_2);
      ((class09090)this.L_2).N(var1, var2, 1.0F, var3, 0.0F, 0.0F, (class09099)this.L_3);
      return ((class09099)this.L_3).L();
   }

   public float N(float var1, class09079 var2, boolean var3) {
      return this.y(var2).N(var1);
   }

   private static byte[] N(class01079 var0) {
      try {
         byte[] abyte;
         try (InputStream inputstream = var0.method_14482()) {
            abyte = inputstream.readAllBytes();
         }

         return abyte;
      } catch (IOException ioexception) {
         throw new UncheckedIOException("Failed to read font resource", ioexception);
      }
   }

   public float N(class00392 var1) {
      return this.N(var1, (Float)this.N_4, (class09079)this.N_5, (Boolean)this.u_5);
   }

   public class09093 N() {
      this.u_5 = true;
      return this;
   }

   public float N(class00392 var1, float var2, class09079 var3, boolean var4) {
      if (var1 != null && !var1.getString().isEmpty()) {
         ((class09070)this.L_0).N(this.y(var3).N(var2));
         var1.method_30937().accept((class09070)this.L_0);
         return ((class09070)this.L_0).L();
      } else {
         return 0.0F;
      }
   }

   public class09093 N(float var1, float var2) {
      this.u_1 = var1;
      this.u_2 = var2;
      return this;
   }

   public void N(class00392 var1, float var2, float var3, float var4, float var5, class09079 var6, boolean var7, int var8, class09061 var9) {
      if (var1 != null && !var1.getString().isEmpty()) {
         float f = y(var4, var5);
         ((class09074)this.L_1).N(this.y(var6), f, var5, var1.method_30937(), var2, var3, var8, var9);
      }
   }

   public float N(float var1, class09079 var2, boolean var3, int var4, int var5) {
      return this.y(var2).N(var4, var5, var1);
   }

   public float N(String var1, float var2, class09079 var3, boolean var4) {
      if (var1 != null && !var1.isEmpty()) {
         int i = 1;
         int j = 0;

         while (j < var1.length()) {
            int k = var1.codePointAt(j);
            j += Character.charCount(k);
            if (k == 10) {
               i++;
            }
         }

         return i * this.y(var3).N(var2);
      } else {
         return 0.0F;
      }
   }

   public void N(class01028 var1, float var2, float var3, float var4, float var5, class09079 var6, boolean var7, int var8, class09061 var9) {
      if (var1 != null) {
         float f = y(var4, var5);
         ((class09074)this.L_1).N(this.y(var6), f, var5, var1, var2, var3, var8, var9);
      }
   }

   public void N(class09061 var1) {
      if ((class00392)this.N_3 != null && !((class00392)this.N_3).getString().isEmpty()) {
         ((class09074)this.L_1)
            .N(
               this.y((class09079)this.N_5),
               (Float)this.N_4,
               1.0F,
               ((class00392)this.N_3).method_30937(),
               (Float)this.u_1,
               (Float)this.u_2,
               (Integer)this.N_6,
               var1
            );
         this.M();
      } else {
         if ((String)this.N_2 != null && !((String)this.N_2).isEmpty()) {
            ((class09074)this.L_1)
               .N(this.y((class09079)this.N_5), (Float)this.N_4, 1.0F, (String)this.N_2, (Float)this.u_1, (Float)this.u_2, (Integer)this.N_6, var1);
         }

         this.M();
      }
   }

   public class09093 N(class09079 var1) {
      this.N_5 = var1;
      return this;
   }

   private float N(class09071 var1, float var2, class01028 var3) {
      ((class09099)this.L_3).N((class09090)this.L_2);
      ((class09090)this.L_2).N(var1, var2, 1.0F, var3, 0.0F, 0.0F, (class09099)this.L_3);
      return ((class09099)this.L_3).L();
   }

   public class09093 N(float var1) {
      this.N_4 = var1;
      return this;
   }

   public float N(String var1) {
      return this.y(var1, (Float)this.N_4, (class09079)this.N_5, (Boolean)this.u_5);
   }

   public class09093 N(int var1) {
      this.u_0 = var1;
      return this;
   }

   public int R(int var1) {
      return ((class09082)this.L_4).y(var1);
   }

   private void R() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_4 = 0.0F;
         this.N_6 = 0;
      }

      if (!this.u_init) {
         this.u_init = true;
         this.u_0 = 0;
         this.u_1 = 0.0F;
         this.u_2 = 0.0F;
         this.u_3 = 0;
         this.u_4 = 0.0F;
         this.u_5 = false;
      }
   }
}
