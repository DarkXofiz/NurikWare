package NurikWare;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import minecraft.class00743;
import minecraft.class03443;
import minecraft.class04453;
import minecraft.class05873;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class06937;
import minecraft.class07482;
import minecraft.class07510;

public class class11116 extends class11807<AutoBuy> {
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public boolean L_init;

   private void P() {
      this.s();
      this.L_2 = (Integer)this.L_2 - 1;
      if ((Integer)this.L_2 == 0) {
         ((class04453)((class06202)super.N_0).T_4).method_7346();
      } else if ((Integer)this.L_2 < -55) {
         this.N();
      }
   }

   public class11116(class11275 var1, AutoBuy var2, String var3, boolean var4, Consumer<class11535> var5) {
      super(var2, var3, var4, var5);
      this.s();
      this.y_1 = class11135.IDLE;
      this.L_4 = -1L;
      this.y_0 = var1;
   }

   private void i() {
      this.s();
      if ((Integer)this.L_3 > 0) {
         this.L_3 = (Integer)this.L_3 - 1;
      }

      if ((Integer)this.L_3 == 0 && (class11135)this.y_1 == class11135.WAITING_FOR_ITEM) {
         this.y_1 = class11135.WAITING_FOR_CLOSE;
         this.L_2 = 5;
         this.L_4 = -1L;
      }
   }

   private void s() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_1 = 0;
         this.L_2 = 0;
         this.L_3 = 0;
         this.L_4 = 0L;
         this.L_5 = 0;
         this.L_6 = false;
      }
   }

   @Override
   public void y(Object var1) {
      this.s();
      if (((class11275)this.y_0).L()) {
         switch (var1) {
            case class11402 class11402:
               this.N(class11402);
               break;
            case class10961 class10961:
               this.N(class10961);
               break;
            case class10992 class10992:
               this.N(class10992);
               break;
            case null:
            default:
         }
      }
   }

   private void N(class10961 var1) {
      switch (var1.N()) {
         case class05873 class05873:
            this.N(class05873);
         case null:
         default:
      }
   }

   @Override
   public void N() {
      this.s();
      this.y_2 = null;
      this.L_0 = null;
      this.L_1 = 0;
      this.L_2 = 0;
      this.L_3 = 0;
      this.L_4 = -1L;
      this.y_1 = class11135.IDLE;
      if ((Boolean)this.L_6) {
         ((class11275)this.y_0).N("resume");
      }

      this.L_6 = false;
   }

   private void N(class10992 var1) {
      this.s();
      if ((Integer)this.L_5 >= 5) {
         ((AutoBuy)super.N_1).m();
         ((class11275)this.y_0).N("busy");
         class11938.Z().y(class11464.u(11), () -> {
            this.s();
            ((class11275)this.y_0).N("resume");
         });
         this.L_5 = 0;
      } else {
         switch ((class11135)this.y_1) {
            case WAITING_FOR_ITEM:
               this.i();
               break;
            case WAITING_FOR_CLICK:
               this.W();
               break;
            case WAITING_FOR_CLOSE:
               this.P();
         }
      }
   }

   private boolean N(Matcher var1, class06584 var2, class07482 var3, class06937 var4) {
      this.s();
      String s = var1.group(2);
      long i = Long.parseLong(var1.group(1).replaceAll(",", ""));
      if (((class11132)this.y_2).N().equals(s) && ((class11132)this.y_2).y() == AutoBuy.N(var2, i)) {
         this.L_0 = new class11137(var3.b, var4.u);
         this.L_1 = 25;
         this.L_3 = 0;
         return true;
      } else {
         return false;
      }
   }

   private void N(class11402 var1) {
      this.s();
      if ((class11135)this.y_1 == class11135.IDLE && (class11132)this.y_2 == null) {
         JsonElement jsonelement = JsonParser.parseString(var1.N());
         if (jsonelement.isJsonObject()) {
            JsonObject jsonobject = jsonelement.getAsJsonObject();
            int i = jsonobject.get("hash").getAsInt();
            long j = jsonobject.get("price").getAsInt();
            long k = class11910.y().orElse(0L);
            if (j <= k) {
               this.y_2 = new class11132(jsonobject.get("seller").getAsString(), i);
               this.y_1 = class11135.WAITING_FOR_ITEM;
               this.L_3 = 40;
               class11910.N("/ah " + ((class11132)this.y_2).N());
               if (!(Boolean)this.L_6) {
                  ((class11275)this.y_0).N("busy");
                  this.L_6 = true;
               }

               if ((Long)this.L_4 == -1L) {
                  this.L_4 = System.currentTimeMillis();
               }
            }
         }
      }
   }

   private void N(class05873 var1) {
      this.s();
      if ((Long)this.L_4 != -1L) {
         if (System.currentTimeMillis() - (Long)this.L_4 > 300L) {
            this.L_5 = (Integer)this.L_5 + 1;
         }

         this.L_4 = -1L;
      }

      this.L_3 = 0;
      if (var1.L().getString().toLowerCase().contains("подозрительная цена")) {
         this.y_1 = class11135.WAITING_FOR_CLICK;
         this.L_1 = 5;
         this.L_0 = new class11137(var1.N(), 0);
      } else if ((class11135)this.y_1 == class11135.WAITING_FOR_CLOSE) {
         class11938.Z().N(((class04453)((class06202)super.N_0).T_4)::method_7346);
         this.L_2 = 5;
      } else {
         if ((class11132)this.y_2 != null) {
            this.y_1 = class11135.WAITING_FOR_CLICK;
         }
      }
   }

   private void W() {
      this.s();
      if ((class11137)this.L_0 == null) {
         class07482 class07482 = (class07482)((class04453)((class06202)super.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3;
         class00743<class06937> class00743 = class07482.T;

         for (int i = 0; i <= 45; i++) {
            class06937 class06937 = (class06937)class00743.get(i);
            class06584 class06584 = class06937.i();
            Matcher matcher = ((Pattern)class11150.y_1).matcher(String.join(", ", class11929.E(class06584)));
            if (matcher.find() && this.N(matcher, class06584, class07482, class06937)) {
               break;
            }
         }
      }

      if ((class11137)this.L_0 == null) {
         this.L_2 = 5;
         this.y_1 = class11135.WAITING_FOR_CLOSE;
      } else if ((Integer)this.L_1 > 0) {
         this.L_1 = (Integer)this.L_1 - 1;
      } else {
         ((class03443)((class06202)super.N_0).T_2)
            .N(((class11137)this.L_0).y(), ((class11137)this.L_0).N(), 0, class07510.field_7794, (class04453)((class06202)super.N_0).T_4);
         this.L_2 = 5;
         this.y_1 = class11135.WAITING_FOR_CLOSE;
      }
   }
}
