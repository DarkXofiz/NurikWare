package NurikWare;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import minecraft.class00381;
import minecraft.class01056;
import minecraft.class04459;
import minecraft.class06202;
import minecraft.class06541;

@class11080(
   L = "AutoAccept",
   y = class11072.PLAYER,
   N = class11106.AUTO
)
public class AutoAccept extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public Object u_0;
   public Object u_1;

   private void P() {
   }

   private boolean P(String var1) {
      this.P();
      if (((class11535)this.u_1).U() && var1.contains("дуэльную команду")) {
         Matcher matcher = ((Pattern)this.L_4).matcher(var1);
         if (!matcher.find()) {
            return false;
         } else {
            String s = matcher.group(1);
            if (((class11507)this.L_2).i() && !this.n(s)) {
               return false;
            } else {
               class11910.N("/duel team accept " + s);
               return true;
            }
         }
      } else {
         return false;
      }
   }

   public AutoAccept() {
      super();
      this.P();
      this.u_0 = new class11535("teleport-request", true);
      this.u_1 = new class11535("command-duel-request", false);
      this.L_0 = new class11535("clan-invite-request", false);
      this.L_1 = class11524.y(this, "accept", (class11535)this.u_0, (class11535)this.u_1, (class11535)this.L_0);
      this.L_2 = (class11507)class11524.N(this, "friends-accept-only", true).N(var1 -> {
         this.P();
         return !((List)((class11523)this.L_1).i()).isEmpty();
      });
      this.L_3 = new String[]{"просит телепортироваться", "хочет телепортироваться"};
      this.L_4 = Pattern.compile("Игрок\\s+(\\S+)\\s+приглашает вас в свою дуэльную команду");
      this.L_5 = Pattern.compile("\\[⚔]\\s*(\\S+)\\s+приглашает\\s+Вас\\s+в\\s+клан");
      this.L_6 = Pattern.compile(".*(" + String.join("|", (String[])this.L_3) + ").*", 32);
   }

   private void B(String var1) {
      if (!this.P(var1)) {
         if (!this.Z(var1)) {
            this.i(var1);
         }
      }
   }

   @Override
   public boolean Z() {
      ((class01056)((class06202)super.y_0).i_6).i().L().forEach(this::B);
      return super.Z();
   }

   private boolean Z(String var1) {
      this.P();
      if (((class11535)this.L_0).U() && var1.contains("приглашает Вас в клан")) {
         Matcher matcher = ((Pattern)this.L_5).matcher(var1);
         if (!matcher.find()) {
            return false;
         } else {
            String s = matcher.group(1);
            if (((class11507)this.L_2).i() && !this.n(s)) {
               return false;
            } else {
               class11910.N("/clan accept " + s);
               return true;
            }
         }
      } else {
         return false;
      }
   }

   private void i(String var1) {
      this.P();
      if (((class11535)this.u_0).U()) {
         if (((Pattern)this.L_6).matcher(var1).matches()) {
            if (!Arrays.stream(var1.split(" ")).noneMatch(this::n) || !((class11507)this.L_2).i()) {
               class11910.N("/tpaccept");
            }
         }
      }
   }

   private boolean n(String var1) {
      return class11938.t().L(var1) || class11938.N().y(var1);
   }

   @class11782
   public void N(class10990 var1) {
      if (!class11907.u() && var1.u() instanceof class04459 class04459) {
         class00381<?> s = class06541.N(class04459.N().getString());
         ((class06202)super.y_0).execute(() -> this.B(s));
      }
   }
}
