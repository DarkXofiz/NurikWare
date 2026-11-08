package NurikWare;

import java.util.Iterator;
import java.util.List;
import minecraft.class03386;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06889;
import org.joml.Vector2f;
import org.joml.Vector3d;

@class11080(
   L = "AnarchyHelper",
   y = class11072.MISC,
   N = class11106.HELPER
)
public class AnarchyHelper extends class11067 implements class11542 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public Object L_7;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object u_5;
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public Object i_3;

   public AnarchyHelper() {
      super();
      this.b();
      this.i_0 = new class11561(this, "desorientation", class06570.nG, "Дезориентация", "desorientation");
      this.i_1 = new class11561(this, "trap", class06570.TW, "Трапка", "trap");
      this.i_2 = new class11561(this, "god-aura", class06570.ss, "Божья аура", "godsaura");
      this.i_3 = new class11561(this, "sheer-dust", class06570.vg, "Явная пыль", "sheerdust");
      this.u_0 = new class11561(this, "stratum", class06570.ny, "Пласт", "stratum");
      this.u_1 = new class11561(this, "snowball", class06570.jP, "Снежок заморозка", "freezeball");
      this.u_2 = new class11561(this, "fierytornado", class06570.GZ, "Огненный смерч", "fierytornado");
      this.u_3 = new class11592(this, "holy-water", class11107.W, "potion-holy-water");
      this.u_4 = new class11592(this, "rage", class11107.t, "potion-rage");
      this.u_5 = new class11592(this, "paladin", class11107.N, "potion-paladin");
      this.L_0 = new class11592(this, "assassin", class11107.i, "potion-assassin");
      this.L_1 = new class11592(this, "drowsiness", class11107.X, "potion-drowsiness");
      this.L_2 = new class11592(this, "radiation", class11107.z, "potion-radiation");
      this.L_3 = List.of(
         (class11561)this.i_0,
         (class11561)this.i_1,
         (class11561)this.i_2,
         (class11561)this.i_3,
         (class11561)this.u_0,
         (class11561)this.u_1,
         (class11561)this.u_2,
         (class11561)this.u_3,
         (class11561)this.u_4,
         (class11561)this.u_5,
         (class11561)this.L_0,
         (class11561)this.L_1,
         (class11561)this.L_2
      );
      this.L_4 = new class11568();
      this.L_5 = new class11585(this, (class11568)this.L_4);
      this.L_6 = new class11545(this);
      this.L_7 = new class11900(0);
   }

   private void b() {
   }

   @Override
   public void N(class11328 var1) {
      this.b();
      ((class11900)this.L_7).N(var1);
   }

   @class11782
   public void N(class10992 var1) {
      this.b();
      ((class11900)this.L_7).N(class11910.i() ? 2 : 0);
      ((class11900)this.L_7).y(var1);
   }

   @class11782
   public void N(class10996 var1) {
      this.b();
      ((class11585)this.L_5).N();
   }

   @class11782
   public void N(class10967 var1) {
      this.b();
      List<class11563> list = ((class11568)this.L_4).N();
      if (!list.isEmpty()) {
         Iterator<class11563> iterator = list.iterator();
         class09093 class09093 = class09080.u();

         while (iterator.hasNext()) {
            class11563 class11563 = iterator.next();
            int i = class11563.y();
            int j = class11938.j().y();
            int k = i - j;
            if (k < -10) {
               iterator.remove();
            } else {
               class06889 class06889 = ((class03386)((class06202)super.y_0).i_5).s().y();
               Vector3d vector3d = class11563.N().sub(class06889.M, class06889.B, class06889.Z, new Vector3d());
               Vector2f vector2f = class11925.N((float)vector3d.x, (float)vector3d.y, (float)vector3d.z);
               if (vector2f != null) {
                  vector2f = vector2f.round();
                  int l = class11563.u().y();
                  float f = l <= 0 ? 0.0F : (float)Math.max(k, 0) / l;
                  class11925.N(class09093, ((class11174)class11190.y_3).u(), class11563.u().N(), 16, vector2f.x, vector2f.y, class11563.L(), k, f);
               }
            }
         }
      }
   }

   @class11782
   public void N(class09343 var1) {
      this.b();
      ((class11585)this.L_5).y();
      ((class11568)this.L_4).y();
   }

   @class11782
   public void N(class10990 var1) {
      this.b();
      ((class11545)this.L_6).N(var1);
      ((class11585)this.L_5).N(var1);
   }

   @class11782(
      u = true
   )
   public void N(class11400 var1) {
      this.b();
      ((List)this.L_3).forEach(var1x -> var1x.y(var1));
   }
}
