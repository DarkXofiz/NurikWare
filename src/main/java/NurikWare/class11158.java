package NurikWare;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.regex.Pattern;
import minecraft.class00176;
import minecraft.class00486;
import minecraft.class00524;
import minecraft.class00539;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class05873;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07050;
import minecraft.class07510;
import minecraft.class07843;
import minecraft.class08082;

public class class11158 extends class11127 implements class11801<AutoJoin> {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public boolean L_init;

   private boolean L(String var1) {
      this.B();
      String s = "#" + ((class11533)this.L_0).i();
      int i = var1.indexOf(s);

      while (i != -1) {
         int j = i + s.length();
         if (j >= var1.length() || !Character.isDigit(var1.charAt(j))) {
            return true;
         }

         i = var1.indexOf(s, j);
      }

      return false;
   }

   private void M() {
      int i = class11281.R(class06570.jJ);
      if (!class11281.y(i)) {
         class11322.i(i);
         class11499 class11499 = class11505.N();
         ((class03443)((class06202)super.N_0).T_2)
            .N((class03448)((class06202)super.N_0).T_3, var1x -> new class07843(class07050.field_5808, var1x, class11499.y(), class11499.R()));
      }
   }

   public class11158(AutoJoin var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.B();
   }

   private void B() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_1 = (short)0;
         this.L_2 = 0;
         this.L_3 = 0;
         this.L_4 = 0;
      }
   }

   private void m() {
      this.B();
      this.L_4 = 0;
      this.L_1 = Short.valueOf((short)-1);
      this.L_2 = -1;
      this.L_3 = -1;
      this.L_5 = null;
   }

   @Override
   public void y(Object var1) {
      this.B();
      if (var1 instanceof class10996) {
         this.L_4 = (Integer)this.L_4 - 1;
         if ((class00176)this.L_5 != null) {
            if ((Integer)this.L_4 < 0) {
               Int2ObjectOpenHashMap var3 = new Int2ObjectOpenHashMap();
               var3.put((Short)this.L_1, (class00176)this.L_5);
               class11910.N(new class00539((Integer)this.L_2, (Integer)this.L_3, (Short)this.L_1, (byte)0, class07510.field_7790, var3, (class00176)this.L_5));
               this.L_4 = 40;
            }
         } else {
            this.M();
         }
      } else if (var1 instanceof class10990 class10990) {
         switch (class10990.u()) {
            case class00524 class00524:
               ((class06202)super.N_0).execute(() -> {
                  this.B();
                  if ((class04453)((class06202)super.N_0).T_4 != null && ((class06202)super.N_0).NE() != null) {
                     List<class06584> list = class00524.L();

                     for (int i = 0; i < list.size(); i++) {
                        String s = list.get(i).d().getString();
                        int j = class00524.N();
                        int k = class00524.y();
                        if (s.contains("ГРИФЕРСКОЕ ВЫЖИВАНИЕ")) {
                           class00176 class00176 = class00176.y(list.get(i), ((class06202)super.N_0).NE().Q());
                           Int2ObjectOpenHashMap int2objectopenhashmap1 = new Int2ObjectOpenHashMap();
                           int2objectopenhashmap1.put(i, class00176);
                           class11910.N(new class00539(j, k, (short)i, (byte)0, class07510.field_7790, int2objectopenhashmap1, class00176));
                           break;
                        }

                        if (this.L(s)) {
                           this.L_2 = j;
                           this.L_3 = k;
                           this.L_1 = (short)i;
                           this.L_5 = class00176.y(list.get(i), ((class06202)super.N_0).NE().Q());
                           break;
                        }
                     }
                  }
               });
               break;
            case class05873 class05873:
               class10990.N();
               break;
            case class00486 class00486:
               this.m();
               class10990.N();
               break;
            case class08082 class08082:
               ((class06202)super.N_0).execute(() -> ((AutoJoin)super.y_0).N(false));
               break;
            case null:
            default:
         }
      }
   }

   @Override
   public void N() {
      this.m();
   }

   public void N(AutoJoin var1) {
      this.B();
      this.L_0 = (class11533)class11524.N(var1, "grief", "1", Pattern.compile("^[1-9]\\d{0,18}$")).N(var1x -> this.U());
   }

   @Override
   public void b_() {
      this.m();
      super.b_();
   }
}
