package NurikWare;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import minecraft.class00509;
import minecraft.class00681;
import minecraft.class01421;
import minecraft.class01423;
import minecraft.class01686;
import minecraft.class01687;
import minecraft.class01938;
import minecraft.class02294;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04477;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06078;
import minecraft.class06202;
import minecraft.class06658;
import minecraft.class06889;
import minecraft.class07438;
import minecraft.class08476;
import org.joml.Matrix4f;
import org.joml.Vector3f;

@class11080(
   L = "KillEffect",
   y = class11072.VISUAL,
   N = class11106.WORLD
)
public class KillEffect extends class11067 {
   public static Object L_0 = new class09087(class09069.N(3).R(), class09069.N(1).R(), class09069.y().R());
   public static Object L_1 = new class12012(true, 1, 1, 1, 1);
   public static Object L_2 = class12036.u().N((class12012)L_1).N();
   public static Object L_3;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public Object i_3;
   public Object i_4;
   public Object i_5;
   public Object i_6;
   public Object i_7;
   public boolean i_init;

   public KillEffect() {
      super();
      this.b();
      this.u_0 = new HashSet();
      this.u_1 = class09064.N(() -> ((class06202)super.y_0).e().N / 2, () -> ((class06202)super.y_0).e().y / 2)
         .N(class11199.LINEAR, class11199.LINEAR)
         .y(class11175.CLAMP_TO_EDGE)
         .y(true)
         .N()
         .N(() -> !this.U());
      this.u_2 = class11213.N((class09087)L_0, 65536);
      this.u_3 = class11213.N((class09087)class09063.N_2, 256, 64);
      this.u_4 = class11218.<class09321>N()
         .N(new class11231(this, (class11213)this.u_2))
         .y((class09064)this.u_1)
         .N_3(
            var1 -> {
               this.b();
               if (!((class11507)this.i_0).i()) {
                  class11925.N(
                     ((class06202)super.y_0).e(),
                     (class09064)this.u_1,
                     0,
                     0,
                     ((class06202)super.y_0).e().N,
                     ((class06202)super.y_0).e().y,
                     0,
                     0,
                     ((class09064)this.u_1).G(),
                     ((class09064)this.u_1).u(),
                     256,
                     9728
                  );
               }
            }
         )
         .N(new class11255(this, (class11213)this.u_3))
         .L(((class06202)super.y_0)::e)
         .L((class09064)this.u_1)
         .N();
      this.i_0 = class11524.N(this, "behind-walls", false);
      this.i_1 = class11524.N(this, "color", -11104513);
      this.i_2 = class11524.N(this, "count", 30.0F, 5.0F, 50.0F, 1.0F);
      this.i_3 = class11524.N(this, "duration", new class11494(4.0F, 12.0F), new class11494(5.0F, 8.0F), 1.0F);
      this.i_4 = new ArrayList();
   }

   static {
      l();
   }

   private void b() {
      if (!this.i_init) {
         this.i_init = true;
         this.i_6 = 0;
         this.i_7 = false;
      }
   }

   private static void l() {
      L_0 = null;
      L_1 = null;
      L_2 = null;
      L_3 = 100;
   }

   private void t() {
      this.b();
      if ((Boolean)this.i_7 && class11938.j().y() - (Integer)this.i_6 < 3) {
         ((List)this.i_4).add(new class11263((class07438)this.i_5, class11938.j().y()));
         this.i_5 = null;
      }
   }

   @class11782
   public void N(class11382 var1) {
      this.b();
      if (var1.L() instanceof class07438 class07438 && class07438 != (class04453)((class06202)super.y_0).T_4) {
         this.i_5 = class07438;
         this.i_6 = class11938.j().y();
         this.i_7 = false;
      }
   }

   @class11782
   public void N(class10990 var1) {
      switch (var1.u()) {
         case class01938 class01938:
            ((class06202)super.y_0).execute(() -> {
               this.b();
               if ((class07438)this.i_5 != null && ((class07438)this.i_5).method_5628() == class01938.N() && class11938.j().y() - (Integer)this.i_6 < 3) {
                  this.i_7 = true;
               }
            });
            break;
         case class00509 class00509:
            ((class06202)super.y_0)
               .execute(
                  () -> {
                     this.b();
                     if (class00509.N() == 3
                        && (class03448)((class06202)super.y_0).T_3 != null
                        && (class07438)this.i_5 != null
                        && class00509.N((class03448)((class06202)super.y_0).T_3) == (class07438)this.i_5) {
                        this.t();
                     }
                  }
               );
            break;
         case class06658 class06658:
            ((class06202)super.y_0).execute(() -> class06658.N().forEach(var1xx -> {
               this.b();
               if ((class07438)this.i_5 != null && ((class07438)this.i_5).method_5628() == var1xx) {
                  this.t();
               }
            }));
            break;
         default:
      }
   }

   @class11782
   public void N(class10996 var1) {
      this.b();
      int i = class11938.j().y();
      if (!((List)this.i_4).isEmpty()) {
         ((List)this.i_4).removeIf(var2x -> {
            class07438 class07438 = var2x.y();
            if (class07438.fields_2212a028292fd3c078969e3ee4c71d9e8_2 <= 0 && !class07438.method_31481()) {
               return i - var2x.N() > 100;
            } else {
               this.N(class07438);
               return true;
            }
         });
      }

      if (!((Set)this.u_0).isEmpty()) {
         Iterator iterator = ((Set)this.u_0).iterator();

         while (iterator.hasNext()) {
            List<class11232> list = ((class11265)iterator.next()).N();
            list.removeIf(var0 -> {
               var0.y();
               return var0.N();
            });
            if (list.isEmpty()) {
               iterator.remove();
            }
         }
      }
   }

   private void N(class07438 var1, class11265 var2, int var3) {
      if (((class06202)super.y_0).Ng().N(var1) instanceof class02294 class02294) {
         class08476 class08476 = (class08476)class02294.method_55269();
         class02294.method_62354(var1, class08476, 0.0F);
         class06078<?> class06078 = ((class12041)class02294).N();
         class06078.method_2819(class08476);
         class01421 class01421 = new class01421();
         float f = class08476.NL;
         class01421.y(f, f, f);
         ((class12041)class02294).N(class08476, class01421, class08476.x, f);
         class01421.y(-1.0F, -1.0F, 1.0F);
         ((class12041)class02294).N(class08476, class01421);
         if (var1 instanceof class04477) {
            class01421.y(0.9375F, 0.9375F, 0.9375F);
         }

         class01421.N(0.0F, -1.501F, 0.0F);
         class01686 class01686 = class06078.method_63512();
         ArrayList arraylist = new ArrayList();
         AtomicReference atomicreference = new AtomicReference<>(0.0F);
         class01686.N(class01421, (var2x, var3x, var4, var5x) -> {
            float f3 = (var5x.i - var5x.y) / 16.0F;
            float f4 = (var5x.R - var5x.L) / 16.0F;
            float f5 = (var5x.M - var5x.u) / 16.0F;
            float f6 = f3 * f4 * f5;
            if (!(f6 <= 0.0F)) {
               arraylist.add(new class11237(new Matrix4f(var2x.N()), var5x, f6));
               atomicreference.set((Float)atomicreference.get() + f6);
            }
         });
         if (!arraylist.isEmpty() && !((Float)atomicreference.get() <= 0.0F)) {
            float f1 = (Float)atomicreference.get();
            AtomicInteger atomicinteger = new AtomicInteger(var3);
            class06069 class06069 = var1.method_59922();

            for (int i = 0; i < arraylist.size(); i++) {
               class11237 class11237 = (class11237)arraylist.get(i);
               int j;
               if (i == arraylist.size() - 1) {
                  j = atomicinteger.get();
               } else {
                  float f2 = class11237.N() / f1;
                  j = Math.max(1, Math.round(var3 * f2));
                  j = Math.min(j, atomicinteger.get());
               }

               if (j > 0) {
                  atomicinteger.addAndGet(-j);
                  this.N(var1, var2, class11237.y(), class11237.L(), j, class06069);
               }
            }
         }
      }
   }

   private void N(class07438 var1) {
      this.b();
      if (!(var1 instanceof class00681)) {
         class11265 class11265 = new class11265(var1);
         if (((Set)this.u_0).add(class11265)) {
            this.N(var1, class11265, ((class11504)this.i_2).i().intValue() * 10);
         }
      }
   }

   private void N(class07438 var1, class11265 var2, Matrix4f var3, class01687 var4, int var5, class06069 var6) {
      this.b();
      double d0 = var1.method_23317();
      double d1 = var1.method_23318();
      double d2 = var1.method_23321();

      for (int i = 0; i < var5; i++) {
         float f = class04995.N(var6, var4.y, var4.i) / 16.0F;
         float f1 = class04995.N(var6, var4.L, var4.R) / 16.0F;
         float f2 = class04995.N(var6, var4.u, var4.M) / 16.0F;
         Vector3f vector3f = new Vector3f(f, f1, f2);
         Vector3f vector3f1 = var3.transformPosition(vector3f, new Vector3f());
         double d3 = d0 + vector3f1.x();
         double d4 = d1 + vector3f1.y();
         double d5 = d2 + vector3f1.z();
         class06889 class06889 = new class06889(d3, d4, d5);
         var2.N()
            .add(
               new class11232(
                  class06889,
                  class06889,
                  class11908.y(0.1F, 1.0F),
                  class11908.N((int)(20.0F * ((class11525)this.i_3).i().N()), (int)(20.0F * ((class11525)this.i_3).i().L()))
               )
            );
      }
   }

   @class11782
   public void N(class09321 var1) {
      this.b();
      if (!((Set)this.u_0).isEmpty()) {
         ((class11218)this.u_4).execute(var1);
      }
   }
}
