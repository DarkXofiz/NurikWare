package NurikWare;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import org.lwjgl.opengl.GL11;

public class class11194<C> implements class11171<C> {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public boolean N_init;

   class11194(class11192<C> var1) {
      super();
      this.i();
      this.N_1 = new ArrayList();
      this.N_2 = new ArrayList();
      this.N_3 = new ArrayList();
      this.N_6 = (int[])class11218.N_0;
      this.N_0 = Objects.requireNonNull(var1, "pass");
   }

   private void i() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_5 = false;
      }
   }

   void y(class11173<C> var1) {
      ((ArrayList)this.N_1).add(Objects.requireNonNull(var1, "setup"));
   }

   void y(boolean var1) {
      this.N_5 = var1;
   }

   @Override
   public int[] y() {
      return (int[])this.N_6;
   }

   private static void N(boolean var0) {
      GL11.glColorMask(true, true, true, true);
      GL11.glClear(16384 | (var0 ? 256 : 0));
   }

   void N(class11212 var1) {
      this.N_4 = Objects.requireNonNull(var1, "target");
   }

   @Override
   public void N(class11202 var1) {
      ((class11212)this.N_4).N(var1);
      int i = 0;

      for (class11211 class11211 : (ArrayList)this.N_3) {
         class11211.N(var1);
         if (class11211.a_() >= 0) {
            i++;
         }
      }

      if (i == 0) {
         this.N_6 = (int[])class11218.N_0;
      } else {
         int[] aint = new int[i];
         int k = 0;
         Iterator iterator = ((ArrayList)this.N_3).iterator();

         while (iterator.hasNext()) {
            int j = ((class11211)iterator.next()).a_();
            if (j >= 0) {
               aint[k++] = j;
            }
         }

         this.N_6 = aint;
      }
   }

   void N(class11173<C> var1) {
      ((ArrayList)this.N_2).add(Objects.requireNonNull(var1, "beforePass"));
   }

   @Override
   public void N() {
      if ((class11212)this.N_4 == null) {
         throw new IllegalStateException("Pass step has no target: " + ((class11192)this.N_0).getClass().getName());
      } else {
         class09064 class09064 = ((class11212)this.N_4).N();

         for (int i = 0; i < ((ArrayList)this.N_3).size(); i++) {
            class11211 class11211 = (class11211)((ArrayList)this.N_3).get(i);
            if (class09064 != null && class09064 == class11211.L()) {
               throw new IllegalStateException("Pass reads and writes the same framebuffer: " + class09064.d());
            }

            for (int j = i + 1; j < ((ArrayList)this.N_3).size(); j++) {
               if (class11211.y() == ((class11211)((ArrayList)this.N_3).get(j)).y()) {
                  throw new IllegalStateException("Texture unit is bound twice in one pass: " + class11211.y());
               }
            }
         }
      }
   }

   void N(class11211 var1) {
      ((ArrayList)this.N_3).add(Objects.requireNonNull(var1, "input"));
   }

   @Override
   public void N(C var1, class09076 var2, class09065 var3) {
      for (int i = 0; i < ((ArrayList)this.N_1).size(); i++) {
         ((class11173)((ArrayList)this.N_1).get(i)).execute(var1);
      }

      ((class11212)this.N_4).N(var2, var3);
      if ((Boolean)this.N_5) {
         N(((class11212)this.N_4).N(var2));
      }

      for (class11173 class11173 : (ArrayList)this.N_2) {
         class11173.execute(var1);
      }

      for (class11211 class11211 : (ArrayList)this.N_3) {
         class11211.N(var2);
      }

      ((class11192)this.N_0).execute(var1);
   }
}
