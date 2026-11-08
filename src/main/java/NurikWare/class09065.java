package NurikWare;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import minecraft.class08066;
import minecraft.class08879;
import minecraft.class08893;
import org.lwjgl.opengl.GL11;

public class class09065 {
   public Object N_0;
   public static Object y_0 = new class09065();
   public static Object y_1;

   public class09086 L(class09064 var1) {
      this.N(var1);
      return var1.z();
   }

   public class09065() {
      super();
      this.R();
      this.N_0 = new ObjectOpenHashSet();
   }

   static {
      Z();
   }

   private static void Z() {
      y_0 = null;
      y_1 = 10000L;
   }

   public void i(class09064 var1) {
      var1.w();
      ((ObjectOpenHashSet)this.N_0).remove(var1);
   }

   public void u(class09064 var1) {
      this.N(var1);
      var1.z().N(true, var1.v());
   }

   private void y(long var1) {
      ObjectIterator objectiterator = ((ObjectOpenHashSet)this.N_0).iterator();

      while (objectiterator.hasNext()) {
         class09064 class09064 = (class09064)objectiterator.next();
         class09064.N(var1, 10000L);
         if (!class09064.L()) {
            objectiterator.remove();
         }
      }
   }

   public void y() {
      this.N(System.currentTimeMillis());
   }

   public class09083 y(class09064 var1) {
      this.R(var1);
      class09083 class09083 = var1.j();
      ((ObjectOpenHashSet)this.N_0).add(var1);
      return class09083;
   }

   public void N(class09064 var1, boolean var2) {
      this.N(var1);
      var1.z().N(var2);
   }

   public void N(class08066 var1) {
      this.N(var1, true);
      GL11.glClear(16640);
   }

   public void N(class08066 var1, boolean var2) {
      N(((class08893)var1.L()).N(((class08879)RenderSystem.getDevice()).y(), var1.i()), var1.N, var1.y, var2);
   }

   public class09064 N(class09064 var1) {
      this.R(var1);
      var1.T();
      var1.N();
      ((ObjectOpenHashSet)this.N_0).add(var1);
      return var1;
   }

   public void N(long var1) {
      this.y(var1);
   }

   public static void N(int var0, int var1, int var2, boolean var3) {
      GlStateManager._glBindFramebuffer(36160, var0);
      if (var3) {
         GL11.glViewport(0, 0, var1, var2);
      }
   }

   public class09076 N() {
      return new class09076(this);
   }

   void R(class09064 var1) {
      if (var1.y()) {
         var1.M();
      }
   }

   private void R() {
   }
}
