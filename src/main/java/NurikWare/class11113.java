package NurikWare;

import java.util.ArrayList;
import java.util.function.Function;
import minecraft.class02484;
import minecraft.class02820;
import minecraft.class03443;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class06593;
import minecraft.class06889;
import minecraft.class07050;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class class11113 extends class11131 {
   public Object y_0;

   private void L() {
   }

   public class11113(ItemRelease var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.L();
      this.y_0 = new class11249((class11225)class11225.L_0, class11264.N);
   }

   @Override
   public void y(class06202 var1, class07050 var2) {
      if (((class04453)var1.T_4).method_6115()) {
         ((class03443)var1.T_2).y((class04453)var1.T_4);
      } else {
         class11907.N(var2);
      }
   }

   public boolean test(class06202 var1, class07050 var2) {
      return class06593.u(((class04453)var1.T_4).method_5998(var2));
   }

   @Override
   public boolean N(class06202 var1, class07050 var2, Function<class11223, Boolean> var3) {
      this.L();
      class06584 class06584 = ((class04453)var1.T_4).method_5998(var2);
      class06889 class06889xx = new class06889(
         (Double)((class04453)var1.T_4).M_1,
         (Double)((class04453)var1.T_4).M_2 + ((class04453)var1.T_4).method_18381(((class04453)var1.T_4).method_18376()),
         (Double)((class04453)var1.T_4).R_0
      );
      float f = (Float)((class04453)var1.T_4).R_2;
      float f1 = (Float)((class04453)var1.T_4).R_1;
      int[] aint;
      if (((class02820)class06584.a_(class02484.x, class02820.N)).N().size() == 1) {
         aint = new int[]{0};
      } else {
         aint = new int[]{-10, 0, 10};
      }

      ArrayList arraylist = new ArrayList();

      for (int i : aint) {
         class06889 class06889x = ((class04453)var1.T_4).method_18864(1.0F);
         Quaternionf quaternionf = new Quaternionf().setAngleAxis(i * (float) (Math.PI / 180.0), class06889x.M, class06889x.B, class06889x.Z);
         Vector3f vector3f = ((class04453)var1.T_4).method_5631(f, f1).W().rotate(quaternionf);
         class06889 class06889xx = Trajectory.N(vector3f.x, vector3f.y, vector3f.z, 3.15F);
         arraylist.add(new class11266(class06889xx, class06889xx, (class11249)this.y_0));
      }

      for (class11266 class11266 : arraylist) {
         if (class11266.y().N().<Boolean>map(var3).orElse(false)) {
            return true;
         }
      }

      return false;
   }
}
