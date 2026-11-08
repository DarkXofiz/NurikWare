package NurikWare;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL33;

public class class11213 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public boolean N_init;

   public class09105 L() {
      return (class09105)this.N_0;
   }

   public class11184 M() {
      return (class11184)this.N_3;
   }

   public class11213(class09087 var1, int var2, int var3) {
      super();
      this.E();
      this.N_2 = var1;
      this.N_1 = var3 > 0 ? class11217.N() : class11217.L();
      this.N_0 = new class09105();
      ((class09105)this.N_0).N();
      ((class11217)this.N_1).i().N();
      if (((class11217)this.N_1).u() != null) {
         ((class11217)this.N_1).u().N();
      }

      var1.y();
      this.N_3 = new class11184(var2);
      this.N_4 = var3 > 0 ? new class11178(var3) : null;
   }

   public boolean B() {
      return this.Z().y() ? (Integer)this.N_6 == 0 : (Integer)this.N_5 == 0;
   }

   public class11217 Z() {
      return (class11217)this.N_1;
   }

   public static class11201 i() {
      return new class11201();
   }

   public int u() {
      return (Integer)this.N_6;
   }

   public int y() {
      return (Integer)this.N_5;
   }

   public void y(ByteBuffer var1, int var2) {
      if (((class11217)this.N_1).u() == null) {
         throw new IllegalStateException("Mesh has no EBO");
      } else {
         ((class09105)this.N_0).N();
         ((class11217)this.N_1).u().N(var1, var2);
         this.N_6 = var1.position() / 4;
      }
   }

   public void y(int var1) {
      if (((class11184)this.N_3).i() != 0) {
         this.N((class11184)this.N_3, var1);
         if ((class11178)this.N_4 != null) {
            this.N((class11178)this.N_4, var1);
         }
      }
   }

   private void E() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_5 = 0;
         this.N_6 = 0;
      }
   }

   public void N(class11178 var1, int var2) {
      if (((class11217)this.N_1).u() == null) {
         throw new IllegalStateException("Mesh has no EBO");
      } else {
         ((class09105)this.N_0).N();
         ((class11217)this.N_1).u().N(var1.N(), var2);
         this.N_6 = var1.N().position() / 4;
         var1.y();
      }
   }

   public static class11213 N(class09087 var0, int var1, int var2) {
      return i().N(var0).N(var1).y(var2).N();
   }

   public void N(int var1, int var2, int var3) {
      if (var3 != 0) {
         ((class09105)this.N_0).N();
         if (((class11217)this.N_1).y()) {
            GL33.glDrawElementsInstanced(var1, (Integer)this.N_6, 5125, 0L, var3);
         } else {
            GL33.glDrawArraysInstanced(var1, 0, var2, var3);
         }
      }
   }

   public static class11213 N(class09087 var0, int var1) {
      return i().N(var0).N(var1).y(0).N();
   }

   public void N(ByteBuffer var1, int var2) {
      ((class11217)this.N_1).i().N(var1, var2);
      this.N_5 = var1.position() / ((class09087)this.N_2).L();
   }

   public class11178 N() {
      return (class11178)this.N_4;
   }

   public void N(class11184 var1, int var2) {
      ((class11217)this.N_1).i().N(var1.u(), var2);
      this.N_5 = var1.i();
      var1.N();
   }

   public void N(int var1) {
      if (!this.B()) {
         ((class09105)this.N_0).N();
         if (((class11217)this.N_1).y()) {
            if ((Integer)this.N_6 == 0) {
               return;
            }

            GL33.glDrawElements(var1, (Integer)this.N_6, 5125, 0L);
         } else {
            if ((Integer)this.N_5 == 0) {
               return;
            }

            GL33.glDrawArrays(var1, 0, (Integer)this.N_5);
         }
      }
   }

   public class09087 R() {
      return (class09087)this.N_2;
   }
}
