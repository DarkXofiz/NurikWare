package NurikWare;

import minecraft.class06202;
import org.joml.Matrix4f;

public class class09314 implements class11826<class09321> {
   public class09314() {
      super();
   }

   public void listen(class09321 var1) {
      ((Matrix4f)class11925.y_4).set(new Matrix4f(var1.i()));
      ((Matrix4f)class11925.y_4).mul(var1.N());
      class11925.N(class06202.Nq().e(), true);
      ((class11216)class11925.L_6).N(var1.i(), var1.N());
      ((class11174)class11190.y_3).M();
      ((class11174)class11190.N_1).M();
      class11190.N();
   }
}
