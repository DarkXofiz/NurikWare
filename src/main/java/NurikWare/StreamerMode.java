package NurikWare;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import minecraft.class00189;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class02406;
import minecraft.class02565;
import minecraft.class04208;
import minecraft.class04459;
import minecraft.class05216;
import minecraft.class06202;
import minecraft.class06541;

@class11080(
   L = "StreamerMode",
   y = class11072.VISUAL,
   N = class11106.SCREEN
)
public class StreamerMode extends class11067 {
   public static Object L_0 = class06541.field_1051;
   public static Object L_1 = class00392.y("Помойка").N((class06541)L_0);
   public static Object L_2 = class00392.y("Педик").N((class06541)L_0);
   public static Object L_3 = class00392.y("Хуесос").N((class06541)L_0);
   public static Object L_4 = new class11432[]{
      new class11432("dd.funtime.su", (class00392)L_1),
      new class11432("vk.com/funtime", (class00392)L_1),
      new class11432("play.funtime.su", (class00392)L_1),
      new class11432("funtime.su", (class00392)L_1),
      new class11432("t.me/funtime", (class00392)L_1),
      new class11432("funtime", (class00392)L_1),
      new class11432("фантайм", (class00392)L_1),
      new class11432("анархия", (class00392)L_1),
      new class11432("хаб", (class00392)L_1),
      new class11432("/links", (class00392)L_3),
      new class11432("сквид", (class00392)L_2),
      new class11432("князь", (class00392)L_2),
      new class11432("титан", (class00392)L_2),
      new class11432("элита", (class00392)L_2),
      new class11432("герой", (class00392)L_2),
      new class11432("барон", (class00392)L_2),
      new class11432("принц", (class00392)L_2),
      new class11432("страж", (class00392)L_2),
      new class11432("аспид", (class00392)L_2),
      new class11432("герцог", (class00392)L_2),
      new class11432("staff", (class00392)L_2),
      new class11432("глава", (class00392)L_2)
   };
   public static Object L_5 = new class11432[]{
      new class11432("shop.Spookytime.net", (class00392)L_1),
      new class11432("vk.com/spookytimenet", (class00392)L_1),
      new class11432("СпукиТайм!", (class00392)L_1),
      new class11432("СпукиТайм", (class00392)L_1),
      new class11432("Спукитайм", (class00392)L_1),
      new class11432("спукитайм", (class00392)L_1),
      new class11432("discord.gg/spookytime", (class00392)L_1),
      new class11432("spookytime.net", (class00392)L_1),
      new class11432("SpookyTime", (class00392)L_1),
      new class11432("SpookyTime!", (class00392)L_1)
   };
   public static Object L_6 = Stream.concat(Arrays.stream((Object[])L_4), Arrays.stream((Object[])L_5)).toArray(class11432[]::new);
   public static Object L_7 = new String[]{"╔", "ВНИМАНИЕ!", "Начислена фортуна:", "╠", "╚"};
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object u_5;
   public Object u_6;

   public boolean P() {
      return (Boolean)class11938.L_3 || ((class11472)class11938.L_2).Z().equals("NurikWareFree");
   }

   public StreamerMode() {
      super();
      this.b();
      this.u_0 = new class11535("skins", true);
      this.u_1 = new class11535("name", true);
      this.u_2 = new class11535("links", true);
      this.u_3 = new class11535("ft", false);
      this.u_4 = class11524.y(this, "hide-entries", (class11535)this.u_0, (class11535)this.u_1, (class11535)this.u_2, (class11535)this.u_3);
      this.u_5 = (class11533)class11524.N(this, "custom-name", "nurikware.fun", Pattern.compile("^[а-яА-Яa-zA-Z0-9_Ёё]+$")).N(var1 -> {
         this.b();
         return ((class11535)this.u_1).U();
      });
      this.u_6 = new HashSet();
      class11938.L().N(class11353.class, this::N);
      class11938.L().N(class11372.class, this::N);
   }

   static {
      s();
      Arrays.sort((Object[])L_4, (var0, var1) -> Integer.compare(var1.N().length(), var0.N().length()));
   }

   private void b() {
   }

   private static void s() {
      L_0 = null;
      L_1 = null;
      L_2 = null;
      L_3 = null;
      L_4 = null;
      L_5 = null;
      L_6 = null;
      L_7 = null;
   }

   public boolean m() {
      this.b();
      return this.U() && ((class11535)this.u_0).U();
   }

   private String N(class02565 var1) {
      return var1.M().map(var0 -> var0.N().getString() + var0.R().getString() + var0.M().getString()).orElse("");
   }

   @class11782
   public void N(class10973 var1) {
      this.b();
      class05216 class05216 = var1.N().L();
      String s = class05216.getString().toLowerCase(Locale.US);
      if (((class11535)this.u_3).U()) {
         boolean flag = false;

         for (class11432 class11432 : this.P() ? (class11432[])L_6 : (class11432[])L_4) {
            if (s.contains(class11432.N())) {
               class05216 = class11458.L(class05216, class11432.N(), class11432.y());
               flag = true;
               break;
            }
         }

         if (flag) {
            var1.N(class05216);
         }
      }

      if (((class11535)this.u_2).U()) {
         boolean flag1 = false;
         Matcher matcher = Pattern.compile("vk.\\S+|t.me/\\S+|https?://\\S+").matcher(s);
         if (matcher.matches()) {
            class05216 = class11458.L(class05216, matcher.group(), (class05216)L_1);
            flag1 = true;
         }

         if (flag1) {
            var1.N(class05216);
         }
      }

      if (((class11535)this.u_1).U()) {
         class00392 class00392 = class00392.N(((class11533)this.u_5).i());

         for (String s1 : (Set)this.u_6) {
            class05216 = class11458.L(class05216, s1, class00392);
         }

         class05216 = class11458.L(class05216, ((class06202)super.y_0).NH().name(), class00392);
         var1.N(class05216);
      }
   }

   private void N(class11372 var1) {
      this.b();
      switch (((int[])class11424.N_1)[var1.u().ordinal()]) {
         case 1:
            Arrays.stream(var1.L()).map(class09295::N).forEach(((Set)this.u_6)::add);
            break;
         case 2:
            class11938.N().y().toList().forEach(((Set)this.u_6)::remove);
      }
   }

   @class11782
   public void N(class10953 var1) {
      this.b();
      if (((class11535)this.u_0).U()) {
         if (var1.N().N.u() == class04208.field_41122) {
            var1.N(class00189.N[0].N().y());
         } else {
            var1.N(class00189.N[15].N().y());
         }
      }
   }

   @class11782
   public void N(class10990 var1) {
      if (this.P()) {
         class00381 class00381 = var1.u();
         Objects.requireNonNull(class00381);
         class00381<?> class00381x = class00381;
         switch (class00381x) {
            case class04459 class04459:
               String s1 = ((class04459)class00381x).N().getString().toLowerCase(Locale.US);

               for (String s : (String[])L_7) {
                  if (s1.contains(s)) {
                     var1.N();
                     return;
                  }
               }
               break;
            case class02565 class02565:
               if (this.N(class02565).contains("Фортуны:")) {
                  var1.N();
               }
               break;
            default:
         }
      }
   }

   private void N(class11353 var1) {
      this.b();
      class09332 class09332 = var1.y();
      switch (((int[])class11424.N_0)[var1.u().ordinal()]) {
         case 1:
            ((Set)this.u_6).add(class09332.y());
            break;
         case 2:
            ((Set)this.u_6).remove(class09332.y());
            break;
         case 3:
            class11938.t().y().forEach(var1x -> {
               this.b();
               ((Set)this.u_6).remove(var1x.y());
            });
      }
   }
}
