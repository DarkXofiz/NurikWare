package NurikWare;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import minecraft.class04459;
import minecraft.class05216;
import minecraft.class06541;

public class class11545 extends class11888 {
   public Object N_0;
   public Object N_1;
   public Object N_2;

   private String M(String var1) {
      return Character.toUpperCase(var1.charAt(0)) + var1.substring(1);
   }

   public class11545(AnarchyHelper var1) {
      super();
      this.N();
      this.N_0 = Pattern.compile("\\[([^]]+)][.\\s]*?(-?\\d+)\\s+(-?\\d+)\\s+(-?\\d+)");
      this.N_1 = class11524.N(var1, "event-notification", true);
      this.N_2 = (class11507)class11524.N(var1, "automatic-add-waypoint", true).N(var1x -> {
         this.N();
         return ((class11507)this.N_1).i();
      });
   }

   private void N() {
   }

   private String N(class05216 var1) {
      return class06541.N(var1.getString()).toLowerCase().replace(";", "").replace("\n", "");
   }

   @Override
   public void N(class10990 var1) {
      this.N();
      if (var1.u() instanceof class04459 class04459 && ((class11507)this.N_1).i()) {
         String s1 = this.N(class04459.N().L());
         if (s1.contains("╔") && s1.contains("появился на координатах")) {
            Matcher matcher = ((Pattern)this.N_0).matcher(s1);
            if (matcher.find()) {
               String s = matcher.group(1);
               if (!s.contains("загадочный маяк")) {
                  this.N(
                     this.M(s),
                     Integer.parseInt(matcher.group(2)),
                     Integer.parseInt(matcher.group(3)),
                     Integer.parseInt(matcher.group(4)),
                     ((class11507)this.N_2).i()
                  );
               }
            }
         }
      }
   }
}
