package NurikWare;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import minecraft.class01231;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07113;
import minecraft.class07209;
import org.joml.Vector3d;

public class class11228 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;

   public void L() {
      ((Vector3d)this.N_2).add(0.0, -((class11225)this.N_3).L(), 0.0);
   }

   private void M() {
   }

   public class11228(class11225 var1, class11264 var2) {
      super();
      this.M();
      this.N_0 = class06202.Nq();
      this.N_1 = new Vector3d();
      this.N_2 = new Vector3d();
      this.N_3 = var1;
      this.N_4 = var2;
   }

   public class11228(class11225 var1) {
      this(var1, null);
   }

   public void u() {
      float f = ((class11225)this.N_3).N();
      if (((class03448)((class06202)this.N_0).T_3).method_31601((int)((Vector3d)this.N_1).y)
         && ((class03448)((class06202)this.N_0).T_3)
            .method_8316(class07209.method_49637(((Vector3d)this.N_1).x, ((Vector3d)this.N_1).y, ((Vector3d)this.N_1).z))
            .N(class01231.N)) {
         f = ((class11225)this.N_3).y();
      }

      ((Vector3d)this.N_2).mul(f);
   }

   public void y() {
   }

   public class11241 N(class07049 var1, class06889 var2, class06889 var3) {
      ArrayList arraylist = new ArrayList();
      ((Vector3d)this.N_1).set(var2.M, var2.B, var2.Z);
      ((Vector3d)this.N_2).set(var3.M, var3.B, var3.Z);

      for (int i = 0; i < 300; i++) {
         this.N();
         class11241 class11241 = this.N(var1, arraylist, i);
         if (class11241 != null) {
            return class11241;
         }

         ((Vector3d)this.N_1).add((Vector3d)this.N_2);
         if (((class03448)((class06202)this.N_0).T_3).method_31607() > ((Vector3d)this.N_1).y) {
            break;
         }

         this.y();
         arraylist.add(new class06889(((Vector3d)this.N_1).x, ((Vector3d)this.N_1).y, ((Vector3d)this.N_1).z));
      }

      return new class11241(arraylist, Optional.empty());
   }

   public void N() {
      this.L();
      this.u();
   }

   public class11241 N(class07049 var1, List<class06889> var2, int var3) {
      class06889 class06889xx = new class06889(((Vector3d)this.N_1).x, ((Vector3d)this.N_1).y, ((Vector3d)this.N_1).z);
      class06889 class06889x = new class06889(
         ((Vector3d)this.N_1).x + ((Vector3d)this.N_2).x, ((Vector3d)this.N_1).y + ((Vector3d)this.N_2).y, ((Vector3d)this.N_1).z + ((Vector3d)this.N_2).z
      );
      class06183 class06183 = ((class03448)((class06202)this.N_0).T_3)
         .y(new class05862(class06889xx, class06889x, class05849.field_17558, class05835.field_1348, (class04453)((class06202)this.N_0).T_4));
      class11241 class11241 = null;
      if (class06183.N() != class07113.field_1333) {
         var2.add(class06183.y());
         class11241 = new class11241(var2, Optional.of(new class11223(class06183.y(), class06183, var3, var1)));
      }

      if ((class11264)this.N_4 != null) {
         class06889 class06889xx = new class06889(((Vector3d)this.N_2).x, ((Vector3d)this.N_2).y, ((Vector3d)this.N_2).z);
         return ((class11264)this.N_4).predict(this, class11241, var1, class06889xx, class06889xx, var2, var3);
      } else {
         return class11241;
      }
   }
}
