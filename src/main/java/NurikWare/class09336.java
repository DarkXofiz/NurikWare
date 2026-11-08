package NurikWare;

import com.mojang.blaze3d.systems.RenderSystem;
import minecraft.class06202;
import org.joml.Matrix4f;

public class class09336 implements class11826<class10967> {
   public class09336() {
      super();
   }

   static {
      N();
   }

   public void listen(class10967 var1) {
      class06202 class06202 = class06202.Nq();
      class11836 class11836 = class11938.k();
      class11836.N(var1.N());
      class11925.N(class06202.e(), true);
      ((class11216)class11925.L_6).N(class11925.L(), (Matrix4f)class11925.y_3);
      ((class11174)class11190.y_3).M();
      ((class11174)class11190.y_1).N(var1x -> {
         var1x.z("u_projection").N(class11925.L());
         var1x.z("u_view").N(RenderSystem.getModelViewMatrix());
         var1x.M("texture_in").N(class11836.N());
      });
      ((class11174)class11190.N_0).M();
      class09080.L();
   }

   private static void N() {
   }
}
