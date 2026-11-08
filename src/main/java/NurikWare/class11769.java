package NurikWare;

import java.util.Objects;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class08844;
import org.joml.Vector2f;
import org.joml.Vector4f;

public abstract class class11769 {
   public Object B_0;
   public Object B_1;
   public Object B_2;
   public Object Z_0;
   public Object Z_1;
   public Object Z_2;
   public Object Z_3;
   public Object Z_4;
   public Object Z_5;
   public Object Z_6;
   public Object Z_7;
   public boolean Z_init;
   public static Object z_0 = class09991.N().N(class09962.N()).y(class09962.N());
   public static Object z_1;
   public static Object z_2;
   public static Object z_3 = class09991.N().N(false);
   public static Object z_4;

   public class11763 L() {
      return (class11763)this.Z_7 != null ? (class11763)this.Z_7 : class11763.LEFT;
   }

   public void M() {
      Vector2f vector2f = this.U();
      this.Z_7 = (Boolean)this.Z_1 ? class11763.N(vector2f.x, B()) : null;
      this.N(vector2f.x, vector2f.y);
   }

   public void P() {
      if ((class09785)this.Z_6 != null) {
         int j = (Integer)z_4 + 1;
         z_4 = j;
         int i = j;
         if (((class09785)this.Z_6).L() == null || (Integer)((class09785)this.Z_6).L() != i) {
            ((class09785)this.Z_6).N(i);
         }
      }
   }

   public class11769(class09788<Void> var1) {
      super();
      this.t();
      this.Z_2 = new class09793();
      this.Z_3 = new class09793();
      class11761 class11761 = Objects.requireNonNull(this.getClass().getAnnotation(class11761.class), "The hud component should be annotated @HudComponentTag");
      this.B_1 = class11761.u();
      this.B_2 = new Vector2f(class11761.i(), class11761.N());
      this.Z_0 = class11761.y();
      this.Z_1 = class11761.L();
      this.B_0 = var1;
      this.Z_4 = new class11760(class11761.u());
      class11938.L().y(this);
   }

   static {
      j();
      class09991 class09991x = class09991.N().l(1.0F);
      z_1 = class09991.N((class09991)z_0, class09991x.N(class09994.s((class09743)class11644.N_0)));
      class09991 class09991x = class09991.N().l(0.0F);
      z_2 = class09991.N((class09991)z_0, class09991x.N(class09994.s((class09743)class11644.N_0)));
   }

   public static float B() {
      class11753 class11753 = class11938.i();
      float f = class11753 != null ? class11753.u() : 1.0F;
      return Math.max(1, class06202.Nq().Nt().U()) / f;
   }

   public class09788<Void> Z() {
      return this::N;
   }

   public class09793<class09904> i() {
      return (class09793<class09904>)this.Z_3;
   }

   public boolean s() {
      return (class11616)this.Z_0 != class11616.NONE && class11753.y() && this.N();
   }

   public Vector2f m() {
      if ((class09785)this.Z_5 == null) {
         return null;
      } else {
         Vector4f vector4f = (Vector4f)((class09785)this.Z_5).L();
         return new Vector2f(vector4f.x(), vector4f.y());
      }
   }

   private void t() {
      if (!this.Z_init) {
         this.Z_init = true;
         this.Z_1 = false;
      }
   }

   private static void j() {
      z_0 = null;
      z_1 = null;
      z_2 = null;
      z_3 = null;
      z_4 = 0;
   }

   public Vector2f U() {
      return (Vector2f)this.B_2;
   }

   public class09991 z() {
      return class09991.N;
   }

   public static float u() {
      class11753 class11753 = class11938.i();
      float f = class11753 != null ? class11753.u() : 1.0F;
      return Math.max(1, class06202.Nq().Nt().E()) / f;
   }

   public boolean y() {
      return true;
   }

   private void y(boolean var1) {
      if ((Boolean)this.Z_1 && (class09785)this.Z_5 != null) {
         Vector4f vector4f = (Vector4f)((class09785)this.Z_5).L();
         if (vector4f != null) {
            if ((class11763)this.Z_7 == null) {
               class11763 class11763 = class11938.M().N(class11292.class).N((String)this.B_1);
               this.Z_7 = class11763 != null ? class11763 : class11763.N(vector4f.x, B());
            } else if (var1 && ((class11616)this.Z_0).y()) {
               class09904 class09904 = (class09904)((class09793)this.Z_2).N();
               if (class09904 != null && class09904.K() != null) {
                  float f = class09904.c().u();
                  if (!(f <= 0.0F)) {
                     class11763 class11763x = class11763.N(vector4f.x + (0.5F - ((class11763)this.Z_7).N()) * f, B());
                     if (class11763x != (class11763)this.Z_7) {
                        float f1 = (class11763x.N() - ((class11763)this.Z_7).N()) * f;
                        this.Z_7 = class11763x;
                        vector4f.x += f1;
                        vector4f.z += f1;
                        ((class09785)this.Z_5).N(vector4f);
                     }
                  }
               }
            }
         }
      }
   }

   public String E() {
      return (String)this.B_1;
   }

   public boolean N() {
      return true;
   }

   public void N(float var1, float var2) {
      if ((class09785)this.Z_5 != null) {
         ((class09785)this.Z_5).N(((Vector4f)((class09785)this.Z_5).L()).set(var1, var2, var1, var2));
      }
   }

   private class09798 N(Void var1, class09809 var2) {
      this.Z_5 = var2.N((String)this.B_1 + "Position", () -> {
         Vector2f vector2f = class11938.M().N(class11292.class).L((String)this.B_1);
         Vector2f vector2f1 = this.U();
         float f = vector2f != null && ((class11616)this.Z_0).y() ? vector2f.x : vector2f1.x;
         float f1 = vector2f != null && ((class11616)this.Z_0).N() ? vector2f.y : vector2f1.y;
         return new Vector4f(f, f1, f, f1);
      });
      this.Z_6 = var2.N((String)this.B_1 + "ZIndex", 0);
      class09785 class09785x = var2.N((String)this.B_1 + "Dragging", false);
      class09785 class09785x = var2.N((String)this.B_1 + "DragOffset", new Vector2f());
      this.y((Boolean)class09785x.L());
      this.N((Boolean)class09785x.L());
      if (!this.y()) {
         return class09778.N(var1x -> var1x.N((String)this.B_1 + "Draggable").N((class09991)z_3));
      } else {
         var2.L("chatOpened", class11753::y);
         return var2.N(
            (String)this.B_1 + "Draggable",
            (class09788<class11613>)class11609.N_0,
            new class11613(
               (String)this.B_1,
               (class09793<class09904>)this.Z_2,
               N((Integer)((class09785)this.Z_6).L(), this.N(), this.z(), this.L().y()),
               class11609.N((class09785<Vector4f>)this.Z_5),
               class09785x,
               class09785x,
               class11633.N((class11616)this.Z_0),
               (var2x, var3x) -> {
                  var2x.y(((class11760)this.Z_4).N(var3x, this, class09785x, var3x.N((String)this.B_1 + "Content", (class09788)this.B_0, null)));
                  var2x.y(class11748.N(var3x, this));
               }
            )
         );
      }
   }

   private static class09991 N(int var0, boolean var1, class09991 var2, class09991 var3) {
      class09991 class09991 = var1 ? (class09991)z_1 : (class09991)z_2;
      return class09991.N(class09991, var2, var3, class09991.N().N(var0));
   }

   private void N(boolean var1) {
      if (!var1 && (class09785)this.Z_5 != null) {
         Vector4f vector4f = (Vector4f)((class09785)this.Z_5).L();
         if (vector4f != null) {
            class11753 class11753 = class11938.i();
            if (class11753 != null) {
               class09904 class09904 = (class09904)((class09793)this.Z_2).N();
               if (class09904 != null && class09904.K() != null) {
                  float f = class09904.c().u();
                  float f1 = class09904.c().i();
                  if (!(f <= 0.0F) && !(f1 <= 0.0F)) {
                     class08844 class08844 = class06202.Nq().Nt();
                     float f2 = class11753.u();
                     float f3 = Math.max(0.0F, Math.max(1, class08844.U()) / f2 - f);
                     float f4 = Math.max(0.0F, Math.max(1, class08844.E()) / f2 - f1);
                     float f5 = this.L().N() * f;
                     float f6 = class04995.N(vector4f.x, f5, f3 + f5);
                     float f7 = class04995.N(vector4f.y, 0.0F, f4);
                     if (f6 != vector4f.z || f7 != vector4f.w) {
                        vector4f.z = f6;
                        vector4f.w = f7;
                        ((class09785)this.Z_5).N(vector4f);
                     }
                  }
               }
            }
         }
      }
   }

   public boolean W() {
      if (!this.s()) {
         return false;
      } else {
         class09904 class09904 = (class09904)((class09793)this.Z_2).N();
         return class09904 != null && class09904.E();
      }
   }

   public Vector4f R() {
      if (this.y() && this.N()) {
         class09904 class09904 = (class09904)((class09793)this.Z_2).N();
         if (class09904 != null && class09904.K() != null) {
            float f = class09904.c().u();
            float f1 = class09904.c().i();
            return !(f <= 0.0F) && !(f1 <= 0.0F) ? new Vector4f(class09904.c().y(), class09904.c().L(), f, f1) : null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }
}
