package NurikWare;

import java.nio.file.Path;
import java.util.List;
import java.util.regex.Pattern;
import minecraft.class02511;
import minecraft.class02775;
import minecraft.class04459;
import minecraft.class07536;

@class11080(
   L = "AutoAuth",
   y = class11072.PLAYER,
   N = class11106.AUTO
)
public class AutoAuth extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public boolean L_init;
   public static Object u_0 = ((class11472)class11938.L_2).Z() + ((class11472)class11938.L_2).M();
   public static Object u_1 = ((Path)class11518.N_0).resolve("auth").resolve("AutoAuth.json");
   public static Object u_2;

   private void M(String var1) {
      this.s();
      if (!(Boolean)this.L_4) {
         String s = var1.trim().toLowerCase();

         for (class11686 class11686 : (List)this.L_3) {
            if (class11686.y(s)) {
               this.N(class11686);
               return;
            }
         }
      }
   }

   public AutoAuth() {
      super();
      this.s();
      this.L_0 = new class11693((Path)u_1);
      this.L_1 = class11524.N(this, "password", (String)u_0, Pattern.compile("^[^\\s]{1,16}$"));
      this.L_2 = class11524.N(this, "open-path", () -> {
         this.s();

         try {
            class07536.m().N(((class11693)this.L_0).N());
         } catch (Exception exception) {
         }
      });
      this.L_3 = List.of(new class11698((class11693)this.L_0), new class11706((class11693)this.L_0));
   }

   static {
      n();
   }

   private void s() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_4 = false;
      }
   }

   private static void n() {
      u_0 = null;
      u_1 = null;
      u_2 = 40;
   }

   @class11782
   public void N(class10961 var1) {
      switch (var1.N()) {
         case class04459 class04459:
            this.M(class04459.N().getString());
            break;
         case class02511 class02511:
            this.M(class02511.N().getString());
            break;
         case class02775 class02775:
            this.M(class02775.N().getString());
            break;
         default:
      }
   }

   private void N(class11686 var1) {
      this.s();
      this.L_4 = true;
      class11938.Z().y(40, () -> {
         this.s();
         String s = ((class11533)this.L_1).i().isBlank() ? (String)u_0 : ((class11533)this.L_1).i();
         var1.N(s);
         class11938.Z().y(40, () -> {
            this.s();
            this.L_4 = false;
         });
      });
   }
}
