package NurikWare;

import java.util.concurrent.Executors;
import minecraft.class09044;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11938 {
   public Object N_0;
   public Object N_1;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public Object y_6;
   public Object y_7;
   public static Object L_0 = LogManager.getLogger(String.class);
   public static Object L_1 = Executors.newVirtualThreadPerTaskExecutor();
   public static Object L_2 = new class11472();
   public static Object L_3;
   public static Object L_4;
   public static Object L_5 = new class11938();
   public static Object L_6 = new class11805(L_5);
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object u_5;
   public Object u_6;
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public Object i_3;
   public Object i_4;
   public Object i_5;
   public Object i_6;
   public Object R_0;
   public Object R_1;
   public Object R_2;
   public Object R_3;
   public Object R_4;
   public Object R_5;
   public Object R_6;

   public static class09222 w() {
      return (class09222)((class11938)L_5).u_2;
   }

   public static class11805 L() {
      return (class11805)L_6;
   }

   public static class11519 M() {
      return (class11519)((class11938)L_5).i_2;
   }

   public static class12020 P() {
      return (class12020)((class11938)L_5).u_6;
   }

   private void K() {
   }

   public static class11327 T() {
      return (class11327)((class11938)L_5).i_4;
   }

   public static class10705 Q() {
      return (class10705)((class11938)L_5).R_5;
   }

   public class11938() {
      super();
      this.K();
      this.u_0 = new class11405();
   }

   static {
      q();
   }

   public static class12023 B() {
      return (class12023)((class11938)L_5).y_4;
   }

   public static class11306 I() {
      return (class11306)((class11938)L_5).i_0;
   }

   public static class11324 J() {
      return (class11324)((class11938)L_5).i_1;
   }

   public static class11466 Z() {
      return (class11466)((class11938)L_5).y_0;
   }

   private void e() {
      ((class11805)L_6).y(this.i_6);
      ((class11805)L_6).y(new class12021());
      ((class11805)L_6).y(new class11497());
      ((class11805)L_6).N(class11389.class, new class09318());
      ((class11805)L_6).N(class10952.class, new class09333());
      ((class11805)L_6).N(class10954.class, new class09320());
      ((class11805)L_6).N(class11353.class, new class09352());
      ((class11805)L_6).N(class11364.class, new class09310());
      ((class11805)L_6).N(class11372.class, new class09312());
      ((class11805)L_6).N(class10990.class, new class09313());
      ((class11805)L_6).N(class11368.class, new class09344());
      ((class11805)L_6).N(class11777.AFTER_ALL, class10967.class, new class09336());
      ((class11805)L_6).N(class11777.LISTENER, class09321.class, new class09314());
      ((class11805)L_6).N(class11777.LISTENER, class11371.class, new class09346());
      ((class11805)L_6).N(class11777.LISTENER, class11380.class, new class09328());
   }

   public static class11753 i() {
      return (class11753)((class11938)L_5).u_3;
   }

   public static class11667 b() {
      return (class11667)((class11938)L_5).y_2;
   }

   public static class10945 s() {
      return (class10945)((class11938)L_5).y_6;
   }

   public static class11457 n() {
      return (class11457)((class11938)L_5).R_3;
   }

   public static void l() {
      System.nanoTime();
      ((class11938)L_5).H();
      ((Logger)L_0).info("NurikWare initialized in {} ms", String.format("%.2f", (double)System.nanoTime()));
   }

   public static class11317 d() {
      return (class11317)((class11938)L_5).i_3;
   }

   public static class12029 m() {
      return (class12029)((class11938)L_5).u_5;
   }

   private void p() {
      Thread thread = new Thread(new class09044(this));
      thread.setPriority(10);
      thread.setDaemon(false);
      thread.setName("NurikWare Shutdown Thread");
      Runtime.getRuntime().addShutdownHook(thread);
   }

   public static class11836 k() {
      return (class11836)((class11938)L_5).i_6;
   }

   public static class09327 t() {
      return (class09327)((class11938)L_5).y_5;
   }

   public static class11845 g() {
      return (class11845)((class11938)L_5).R_2;
   }

   public static class11534 v() {
      return (class11534)((class11938)L_5).u_4;
   }

   public static class11469 j() {
      return (class11469)((class11938)L_5).N_0;
   }

   private static void q() {
      L_0 = null;
      L_1 = null;
      L_2 = null;
      L_3 = false;
      L_4 = false;
      L_5 = null;
      L_6 = null;
   }

   public static class11459 U() {
      return (class11459)((class11938)L_5).N_1;
   }

   public static class11405 z() {
      return (class11405)((class11938)L_5).u_0;
   }

   public static class11056 u() {
      return (class11056)((class11938)L_5).y_3;
   }

   public static class11992 y() {
      return (class11992)((class11938)L_5).R_0;
   }

   public static class11460 E() {
      return (class11460)((class11938)L_5).R_1;
   }

   public static class09345 N() {
      return (class09345)((class11938)L_5).y_7;
   }

   public static class09426 W() {
      return (class09426)((class11938)L_5).y_1;
   }

   public static class11575 R() {
      return (class11575)((class11938)L_5).u_1;
   }

   public static class11742 O() {
      return (class11742)((class11938)L_5).i_5;
   }

   private void H() {
      class09080.y();
      this.u_1 = new class11575();
      this.u_6 = new class12020(class11999.EN, class11999.EN);
      this.y_1 = new class09426();
      this.y_2 = new class11667();
      this.u_4 = new class11534();
      this.u_5 = new class12029();
      this.y_0 = new class11466();
      this.y_3 = new class11056();
      this.y_4 = new class12023();
      this.y_5 = new class09327();
      this.y_6 = new class10945();
      this.y_7 = new class09345();
      this.N_0 = new class11469();
      this.N_1 = new class11459();
      this.R_0 = new class11992();
      this.R_5 = new class10705();
      this.R_1 = new class11460();
      this.R_2 = new class11845();
      this.R_3 = new class11457();
      this.R_4 = new class10626();
      this.R_6 = new class11325();
      ((class11325)this.R_6).u();
      this.i_0 = new class11306((class11325)this.R_6);
      this.i_1 = new class11324();
      this.i_2 = new class11519();
      ((class11519)this.i_2).L(String.class);
      this.i_5 = new class11742();
      this.i_6 = new class11836();
      this.u_2 = new class09222();
      this.u_3 = new class11753();
      ((class11519)this.i_2).y();
      class11313.y();
      this.i_3 = new class11317((class11519)this.i_2);
      this.i_4 = new class11327();
      ((class11405)this.u_0).z();
      this.e();
      this.p();
      class11813.N();
   }

   public static class11325 G() {
      return (class11325)((class11938)L_5).R_6;
   }

   public static class10626 Y() {
      return (class10626)((class11938)L_5).R_4;
   }
}
