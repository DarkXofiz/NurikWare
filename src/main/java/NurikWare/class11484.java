package NurikWare;

import java.util.List;
import java.util.Objects;
import minecraft.class03386;
import minecraft.class06202;
import minecraft.class06889;
import org.joml.Vector2f;

public class class11484 extends class11473<class11481> {
   public Object y_0;

   public class11484() {
      super();
      this.u();
      this.y_0 = class06202.Nq();
   }

   private void u() {
   }

   @Override
   public void N(class10996 var1) {
      class06889 class06889 = class11925.y();

      for (class11481 class11481 : this.N()) {
         if (!Objects.equals(class11481.s(), class11910.L())) {
            class11481.y(true);
         } else {
            class11481.N((int)class06889.R(class11481.W()));
            class11481.y(false);
         }
      }
   }

   @Override
   public void N(class10967 var1) {
      this.u();
      List<class11481> list = this.N();
      if (!list.isEmpty()) {
         class09093 class09093 = class09080.u();
         byte b0 = 18;

         for (class11481 class11481 : list) {
            if (!class11481.b()) {
               class06889 class06889 = class11481.W().u(((class03386)((class06202)this.y_0).i_5).s().y());
               Vector2f vector2f = class11925.N((float)class06889.M, (float)class06889.B, (float)class06889.Z);
               if (vector2f != null) {
                  vector2f = vector2f.round();
                  String s = class11481.m() + " " + class11481.E() + "m";
                  class11176.N(class09093, s, 18, vector2f.x, vector2f.y);
               }
            }
         }
      }
   }

   @Override
   public void N(class09321 var1) {
   }
}
