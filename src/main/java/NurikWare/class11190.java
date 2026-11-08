package NurikWare;

import java.util.function.Consumer;

public class class11190 {
   private static String[] u;
   public static Object N_0 = class11174.N().N((class11204)class11215.N_2).N(class11213.N((class09087)class09063.N_0, 4096, 1024)).N();
   public static Object N_1 = class11174.N().N((class11204)class11215.N_3).N(class11213.N((class09087)class09063.N_0, 4096, 1024)).N();
   public static Object N_2 = class11174.N().N((class11204)class11215.N_4).N(class11213.N((class09087)class09063.N_1, 65536)).N(6).N();
   public static Object N_3 = class11174.N().N((class11204)class11215.N_5).N(class11213.N((class09087)class09063.N_1, 65536)).N(6).N();
   public static Object N_4 = ((class09322)class11185.z_0).R(u[0]);
   public static Object N_5 = ((class09322)class11185.z_0).i(u[1]);
   public static Object N_6 = ((class09322)class11185.z_0).i(u[2]);
   public static Object N_7 = ((class09322)class11185.z_0).i(u[3]);
   public static Object y_0 = class11174.N()
      .N(class11204.L().N((class12036)class12019.N_0).N((class09322)class11185.Z_1).N(4).N())
      .N(class11213.N((class09087)class09063.N_2, 4096, 1024))
      .N();
   public static Object y_1 = class11174.N()
      .N(class11204.L().N((class12036)class12019.N_0).N((class09322)class11185.Z_1).N(4).N())
      .N(class11213.N((class09087)class09063.N_2, 4096, 1024))
      .N();
   public static Object y_2 = class11174.N()
      .N(class11204.L().N((class12036)class12019.N_2).N((class09322)class11185.E_7).N(4).N())
      .N(class11213.N((class09087)class09063.N_4, 4096))
      .N(6)
      .N();
   public static Object y_3 = class11174.N().N((class11204)class11215.N_2).N(class11213.N((class09087)class09063.N_0, 4096, 1024)).N();

   public class11190() {
      super();
   }

   static {
      R();
      i();
   }

   private static void i() {
   }

   public static void N() {
      Consumer consumer = var1x -> {
         ((class11993)N_4).N(var0.U(), var0.E());
         ((class11200)N_5).N((Float)class11925.y_0);
         ((class11200)N_6).N((Float)class11925.y_1);
         ((class11200)N_7).N((Float)class11925.y_2);
      };
      ((class11174)N_2).y(consumer);
      ((class11174)N_3).y(consumer);
   }

   private static void R() {
      u = new String[4];
      u[0] = "u_viewport";
      u[1] = "u_width";
      u[2] = "u_softness";
      u[3] = "u_gamma";
   }
}
