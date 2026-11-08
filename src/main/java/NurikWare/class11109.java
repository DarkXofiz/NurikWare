package NurikWare;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.LongStream;
import minecraft.class00392;
import minecraft.class00496;
import minecraft.class00524;
import minecraft.class04453;
import minecraft.class04459;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06584;
import minecraft.class06937;
import minecraft.class07482;

public class class11109 implements class11819 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public Object N_7;
   public boolean N_init;
   public static Object y_0 = new Pattern[]{Pattern.compile("\\$\\s*.*?(\\d{1,3}(?:,\\d{3})*)")};

   private void M() {
      Long olong = (Long)((Function)this.N_3)
         .apply(
            ((class07482)((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3)
               .T
               .stream()
               .limit(45L)
               .<class06584>map(class06937::i)
               .filter(var1x -> ((class11882)this.N_4).test(var1x))
               .mapToLong(class11109::y)
               .filter(var0 -> var0 > 0L)
         );
      if (olong > 0L) {
         DecimalFormat decimalformat = new DecimalFormat("$###,###");
         decimalformat.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
         String s = decimalformat.format(olong);
         class11303.y(class00392.y(((class11882)this.N_4).R()).N(class06541.field_1080).i(" ").y(class00392.y(s).N(class06541.field_1054)));
         ((class11882)this.N_4).Z().N(String.valueOf(olong));
      }
   }

   private void M(int var1) {
      if (var1 != 0 && (Integer)this.N_5 <= 0) {
         this.N_7 = true;
         this.N_6 = Integer.MAX_VALUE;
      }
   }

   private static void P() {
      y_0 = null;
   }

   public class11109() {
      super();
      this.m();
      this.N_0 = class06202.Nq();
   }

   static {
      y();
      P();
   }

   private void B() {
      this.N_4 = (class11882)((Queue)this.N_2).poll();
      if ((class11882)this.N_4 != null) {
         class11910.N("/ah search " + ((class11882)this.N_4).R());
         this.N_6 = 60;
         this.N_5 = 1;
      }
   }

   private void i() {
      this.N();
   }

   private void m() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_5 = 0;
         this.N_6 = 0;
         this.N_7 = false;
      }
   }

   private void U() {
      if ((class11882)this.N_4 != null) {
         this.M();
      }

      this.N_5 = 18;
      ((class04453)((class06202)this.N_0).T_4).method_7346();
      this.N_4 = (class11882)((Queue)this.N_2).poll();
      if ((class11882)this.N_4 == null) {
         ((CompletableFuture)this.N_1).complete(null);
      }

      this.N_7 = false;
   }

   private void u() {
      if ((class11882)this.N_4 != null) {
         class11910.N("/ah search " + ((class11882)this.N_4).R());
         this.N_6 = 60;
      }
   }

   @Override
   public void y(Object var1) {
      if ((CompletableFuture)this.N_1 != null && !((CompletableFuture)this.N_1).isDone()) {
         switch (var1) {
            case class10992 class10992:
               this.W();
               break;
            case class09343 class09343:
               this.i();
               break;
            case class00524 class00524:
               this.M(class00524.N());
               break;
            case class00496 class00496:
               this.M(class00496.N());
               break;
            case class04459 class04459:
               this.N(class04459);
               break;
            case null:
            default:
         }
      }
   }

   private static void y() {
   }

   private static long y(class06584 var0) {
      String s = String.join(", ", class11929.E(var0));
      Pattern[] apattern = (Pattern[])y_0;
      int i = apattern.length;

      for (int j = 0; j < i; j++) {
         Matcher matcher = apattern[j].matcher(s);
         if (matcher.find()) {
            return Long.parseLong(matcher.group(1).replaceAll("[,\\s]", "")) / var0.c();
         }
      }

      return -1L;
   }

   private void N(class04459 var1) {
      String s = var1.N().getString().toLowerCase();
      if (s.contains("не существует")) {
         this.N_5 = 18;
         this.N_4 = (class11882)((Queue)this.N_2).poll();
      } else if (s.contains("после входа на режим необходимо") && s.contains("сек.")) {
         ((Queue)this.N_2).add((class11882)this.N_4);
         String s1 = s.replaceAll("\\D+", "");
         int i = 20;

         try {
            int j = Integer.parseInt(s1);
            i += i * (j + 3);
         } catch (NumberFormatException numberformatexception) {
         }

         this.N_5 = i;
      } else if (s.contains("команда недоступна в режиме afk")) {
         ((Queue)this.N_2).add((class11882)this.N_4);
         this.N_5 = 60;
      }
   }

   public CompletableFuture<Void> N(Collection<class11882> var1, Function<LongStream, Long> var2) {
      this.N_2 = new LinkedList(var1);
      this.N_3 = var2;
      this.N();
      this.N_1 = new CompletableFuture();
      this.N_4 = (class11882)((Queue)this.N_2).poll();
      if (((class07482)((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b != 0) {
         ((class04453)((class06202)this.N_0).T_4).method_7346();
         this.N_5 = 60;
      }

      return (CompletableFuture<Void>)this.N_1;
   }

   public void N() {
      if ((CompletableFuture)this.N_1 != null && !((CompletableFuture)this.N_1).isDone()) {
         ((CompletableFuture)this.N_1).cancel(false);
      }

      this.N_7 = false;
      this.N_6 = Integer.MAX_VALUE;
      this.N_5 = 10;
      this.N_4 = null;
   }

   private void W() {
      this.N_5 = (Integer)this.N_5 - 1;
      this.N_6 = (Integer)this.N_6 - 1;
      if ((Boolean)this.N_7) {
         this.U();
      }

      if ((Integer)this.N_5 == 0) {
         this.u();
      }

      if ((Integer)this.N_6 <= 0) {
         this.B();
      }
   }
}
