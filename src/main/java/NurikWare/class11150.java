package NurikWare;

import com.google.gson.JsonObject;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import minecraft.class00496;
import minecraft.class03443;
import minecraft.class04453;
import minecraft.class05096;
import minecraft.class05873;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class06937;
import minecraft.class07482;
import minecraft.class07510;

public class class11150 extends class11807<AutoBuy> {
   public static Object y_0;
   public static Object y_1 = Pattern.compile("\\$\\s*.*?(\\d{1,3}(?:,\\d{3})*).*?\\?\\s*.*?:\\s*([A-Za-z0-9_]{3,16})");
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public boolean L_init;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public boolean u_init;

   private void L() {
      this.s();
      if ((String)this.u_2 != null) {
         class11910.N("/" + (String)this.u_2);
      } else {
         class11910.N("/ah");
      }
   }

   private boolean T() {
      this.s();
      if ((Integer)this.u_3 <= 0) {
         return false;
      } else {
         this.u_3 = (Integer)this.u_3 - 1;
         if ((Integer)this.u_3 == 0) {
            this.L();
         }

         return true;
      }
   }

   public class11150(class11331 var1, AutoBuy var2, String var3, boolean var4, Consumer<class11535> var5) {
      super(var2, var3, var4, var5);
      this.s();
      this.u_0 = new class11278();
      this.L_1 = -1L;
      this.u_1 = var1;
   }

   static {
      i();
      R();
   }

   private void B() {
      this.s();
      if ((Boolean)this.L_4 && (Integer)this.L_3 > 0) {
         this.L_4 = false;
         this.L_5 = true;
         this.L_3 = 0;
      }
   }

   private boolean Z(String var1) {
      return Arrays.<String>stream((String[])AuctionHelper.L_1).noneMatch(var1::contains);
   }

   private static void i() {
   }

   private void s() {
      if (!this.u_init) {
         this.u_init = true;
         this.u_3 = 0;
      }

      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0;
         this.L_1 = 0L;
         this.L_2 = 0L;
         this.L_3 = 0;
         this.L_4 = false;
         this.L_5 = false;
         this.L_6 = false;
      }
   }

   private void m() {
      this.s();
      this.L_5 = false;
      this.L_4 = false;
      this.L_3 = 0;
   }

   @Override
   public void y(Object var1) {
      this.s();
      if (((class11331)this.u_1).N().get()) {
         switch (var1) {
            case class10961 class10961:
               this.N(class10961);
               break;
            case class10992 class10992:
               this.N(class10992);
               break;
            case class10963 class10963:
               this.N(class10963);
               break;
            case class11363 class11363:
               this.N(class11363);
               break;
            case null:
            default:
         }
      }
   }

   private void y(class06584 var1, String var2, long var3) {
      this.s();
      if (!(Boolean)this.L_5) {
         JsonObject jsonobject = new JsonObject();
         jsonobject.addProperty("seller", var2);
         jsonobject.addProperty("price", var3);
         jsonobject.addProperty("hash", AutoBuy.N(var1, var3));
         ((class11331)this.u_1).N(jsonobject.toString());
         this.L_3 = 5;
         this.L_4 = true;
         this.L_1 = -1L;
      }
   }

   private void N(class11363 var1) {
      String s = var1.N();
      if (s != null && !s.isEmpty()) {
         switch (s) {
            case "busy":
               this.B();
               break;
            case "resume":
               this.m();
         }
      }
   }

   private void N(class10961 var1) {
      switch (var1.N()) {
         case class00496 class00496:
            this.N(class00496);
            break;
         case class05873 class05873:
            this.N(class05873);
            break;
         case null:
         default:
      }
   }

   private void N(class10963 var1) {
      this.s();
      if (var1.N().startsWith("ah")) {
         this.u_2 = var1.N();
      }
   }

   private void N(class05873 var1) {
      String s = var1.L().getString().toLowerCase();
      ((class06202)super.N_0).execute(() -> {
         this.s();
         if (!this.Z(s)) {
            if ((Long)this.L_1 != -1L) {
               if (System.currentTimeMillis() - (Long)this.L_1 > 400L) {
                  this.L_0 = (Integer)this.L_0 + 1;
               }

               this.L_1 = -1L;
            }
         }
      });
   }

   @Override
   public void N() {
      this.s();
      this.L_5 = false;
   }

   private void N(class10992 var1) {
      this.s();
      if ((Boolean)this.L_6) {
         ((class07482)((class04453)((class06202)super.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3)
            .T
            .stream()
            .limit(45L)
            .<class06584>map(class06937::i)
            .filter(var0 -> !var0.R())
            .map(var1x -> {
               this.s();
               Matcher matcher = ((Pattern)y_1).matcher(String.join(", ", class11929.E(var1x)));
               Optional optional = matcher.find() ? Optional.of(matcher) : Optional.empty();
               if (optional.isPresent()) {
                  Matcher matcher1 = (Matcher)optional.get();
                  String sx = matcher1.group(2);
                  long i = Long.parseLong(matcher1.group(1).replaceAll(",", ""));
                  if (this.N(var1x, sx, i)) {
                     return new class11114(var1x, sx, i);
                  }

                  if (((class11278)this.u_0).N(var1x, sx, i).isPresent()) {
                     return new class11114(var1x, sx, i);
                  }
               }

               return null;
            })
            .filter(Objects::nonNull)
            .min(Comparator.comparingLong(class11114::N))
            .ifPresent(var1x -> this.y(var1x.y(), var1x.L(), var1x.N()));
         this.L_6 = false;
      }

      if ((Integer)this.L_3 > 0) {
         this.L_3 = (Integer)this.L_3 - 1;
         if ((Integer)this.L_3 == 0 && (Boolean)this.L_4) {
            this.L_4 = false;
         }
      }

      if (!(Boolean)this.L_5) {
         if (!this.T()) {
            if ((Integer)this.L_0 >= 5) {
               ((AutoBuy)super.N_1).m();
               this.u_3 = class11464.u(11);
               this.L_0 = 0;
            } else if ((Integer)this.L_3 <= 0 && !((class11331)this.u_1).y()) {
               class05096 class05096 = (class05096)((class06202)super.N_0).v_3;
               class07482 class07482 = (class07482)((class04453)((class06202)super.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3;
               if (class05096 != null && class07482 != null) {
                  String s = class05096.method_25440().getString().toLowerCase();
                  if (!this.Z(s)) {
                     if (System.currentTimeMillis() - (Long)this.L_2 > 500L) {
                        this.R(class07482.b);
                        this.L_2 = System.currentTimeMillis();
                        if ((Long)this.L_1 == -1L) {
                           this.L_1 = (Long)this.L_2;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private boolean N(class06584 var1, String var2, long var3) {
      this.s();
      if (class11929.y(var1)) {
         for (class06584 class06584 : class11929.i(var1)) {
            if (((class11278)this.u_0).N(class06584, var2, var3).isPresent()) {
               return true;
            }
         }
      }

      return false;
   }

   private void N(class00496 var1) {
      this.s();
      if (!(Boolean)this.L_5) {
         if ((Integer)this.L_3 <= 0 && !((class11331)this.u_1).y()) {
            this.L_6 = true;
         }
      }
   }

   private void R(int var1) {
      ((class03443)((class06202)super.N_0).T_2).N(var1, 49, 0, class07510.field_7790, (class04453)((class06202)super.N_0).T_4);
   }

   private static void R() {
      y_0 = 49;
      y_1 = null;
   }
}
