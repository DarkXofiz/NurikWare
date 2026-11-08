package NurikWare;

import java.time.Duration;
import minecraft.class00401;
import minecraft.class00405;
import minecraft.class00625;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class06889;

public abstract class class11888 {
   public class11888() {
      super();
   }

   static {
      N();
   }

   private String i(String var1) {
      String s = var1;
      long i = class11938.E().y().filter(var1x -> var1x.equals(var1)).count();
      if (i > 0L) {
         s = var1 + " (" + i + ")";
      }

      return s;
   }

   private String N(double var1) {
      return "" + class06541.field_1068 + (int)var1 + class06541.field_1080;
   }

   public void N(String var1, double var2, double var4, double var6, boolean var8) {
      Object object = this.i(var1);
      if (var8) {
         this.N((String)object, var2, var4, var6);
      }

      class05216 class05216 = class11921.N("event-waypoint", class06541.field_1068 + object + class06541.field_1080, this.N(var2), this.N(var4), this.N(var6))
         .N(class06541.field_1080);
      if (!var8) {
         class00401 class00401 = new class00401(class11921.N("click-to-way"));
         class00625 class00625 = new class00625((Character)class10626.N_1 + "gps " + var2 + " " + var6);
         class05216.y(class00405.N.N(class00401).N(class00625));
      }

      class11303.y(class05216);
   }

   public void N(String var1) {
      Object object = this.i(var1);
      class11303.y(class11921.N("event-notify", class06541.field_1068 + object + class06541.field_1080).N(class06541.field_1080));
   }

   private void N(String var1, double var2, double var4, double var6) {
      String s = class11910.L();
      Duration duration = Duration.ofSeconds(500L);
      class06889 class06889 = new class06889(var2, var4, var6);
      class11475 class11475 = new class11475(var1, class06889, duration, s);
      class11938.E().N(class11475);
   }

   public abstract void N(class10990 var1);

   private static void N() {
   }
}
