package NurikWare;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import minecraft.class00500;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class07209;
import minecraft.class07261;
import org.joml.Vector3i;

public class class11585 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;

   public class11585(AnarchyHelper var1, class11576 var2) {
      super();
      this.Z();
      this.N_0 = class06202.Nq();
      this.N_1 = new ArrayList();
      this.N_4 = class11524.N(var1, "structure-detector", true);
      this.N_2 = new class11577(var2);
      this.N_3 = new class11586(var2);
   }

   private void Z() {
   }

   public void y() {
      ((List)this.N_1).clear();
   }

   public void N() {
      if (((class11507)this.N_4).i() && !((List)this.N_1).isEmpty()) {
         class11560 class11560 = this.R();
         ((class11577)this.N_2).N((List<class11556>)this.N_1, class11560.N(), class11560.y());
         ((class11586)this.N_3).N((List<class11556>)this.N_1, class11560.N(), class11560.y());
         ((List)this.N_1).clear();
      }
   }

   public void N(class10990 var1) {
      if (((class11507)this.N_4).i()) {
         if (var1.u() instanceof class07261 class07261) {
            ((class06202)this.N_0)
               .execute(
                  () -> class07261.N(
                     (var1xx, var2x) -> {
                        if (!var2x.P()
                           && ((class04453)((class06202)this.N_0).T_4).method_5649(var1xx.method_10263(), var1xx.method_10264(), var1xx.method_10260())
                              < 25600.0) {
                           ((List)this.N_1).add(new class11556(new class07209(var1xx), var2x));
                        }
                     }
                  )
               );
         }
      }
   }

   private class11560 R() {
      Vector3i vector3i = new Vector3i(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
      Vector3i vector3i1 = new Vector3i(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
      Iterator iterator = ((List)this.N_1).iterator();

      while (iterator.hasNext()) {
         class07209 class07209 = ((class11556)iterator.next()).N();
         vector3i.x = Math.min(vector3i.x, class07209.method_10263());
         vector3i.y = Math.min(vector3i.y, class07209.method_10264());
         vector3i.z = Math.min(vector3i.z, class07209.method_10260());
         vector3i1.x = Math.max(vector3i1.x, class07209.method_10263());
         vector3i1.y = Math.max(vector3i1.y, class07209.method_10264());
         vector3i1.z = Math.max(vector3i1.z, class07209.method_10260());
      }

      return new class11560(vector3i, vector3i1);
   }
}
