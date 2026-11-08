package NurikWare;

import java.nio.FloatBuffer;
import minecraft.class04453;
import minecraft.class06202;
import org.joml.Matrix4f;

public class class11465 implements class11192<class09321> {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public static Object y_0;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;

   private static void L() {
      y_0 = 6;
   }

   class11465(class11476 var1, class11213 var2) {
      super();
      this.N();
      this.N_6 = var1;
      this.L_2 = new Matrix4f();
      this.L_3 = new Matrix4f();
      this.N_0 = ((class09322)class11185.N_1).z("u_projection");
      this.N_1 = ((class09322)class11185.N_1).z("u_view");
      this.N_2 = ((class09322)class11185.N_1).L("depth_texture_in");
      this.N_3 = ((class09322)class11185.N_1).z("inv_mvp");
      this.N_4 = ((class09322)class11185.N_1).i("u_time");
      this.N_5 = ((class09322)class11185.N_1).y("waves");
      this.L_0 = var2;
      this.L_1 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N((class09322)class11185.N_1).N(4).N()).N(var2).N();
   }

   static {
      L();
   }

   private void N() {
   }

   public void execute(class09321 var1) {
      int i = ((class09064)((class11476)this.N_6).L_3).G();
      int j = ((class09064)((class11476)this.N_6).L_3).u();
      ((Matrix4f)this.L_2).setOrtho(0.0F, i, j, 0.0F, -1.0F, 1000.0F);
      class11176.N((class11213)this.L_0, 0.0F, 0.0F, 0.0F, i, j, -1);
      ((Matrix4f)this.L_3).set(var1.i()).mul(var1.N()).invert();
      class11925.N(((class06202)((class11476)this.N_6).L_0).e().i());
      ((class11174)this.L_1).N(var1x -> {
         ((class12038)this.N_0).N((Matrix4f)this.L_2);
         ((class12038)this.N_1).N((Matrix4f)class11925.y_3);
         ((class12003)this.N_2).N(6);
         ((class12038)this.N_3).N((Matrix4f)this.L_3);
         double d0 = (((class04453)((class06202)((class11476)this.N_6).L_0).T_4).field_6012 + ((class06202)((class11476)this.N_6).L_0).NK().N(false)) / 20.0;
         ((class11200)this.N_4).N((float)(d0 % (Math.PI * 10)));
         ((class11170)this.N_5).N((FloatBuffer)((class11476)this.N_6).L_1);
      });
   }
}
