package NurikWare;

import java.util.Map;
import java.util.stream.Stream;
import minecraft.class06889;

public class class11460 {
   public Object N_0;
   public Object N_1;

   public void L() {
      if (!((class11289)this.N_0).isEmpty()) {
         ((class11289)this.N_0).forEach(class11481::P);
         ((class11289)this.N_0).clear();
         class11938.L().L(class11364.N(class09378.WAYPOINTS));
      }
   }

   private void M() {
   }

   public class11460() {
      super();
      this.M();
      this.N_0 = new class11289();
      this.N_1 = new class11477(this);
   }

   public Stream<String> y() {
      return ((class11289)this.N_0).stream().map(class11481::m);
   }

   private void y(class11481 var1) {
      if (var1 instanceof class11483 class11483 && class11483.R()) {
         ((class11289)this.N_0).removeIf(var1x -> {
            if (var1x instanceof class11483 class11483x && class11483x.R() && class11483x.y() == class11483.y()) {
               var1x.P();
               return true;
            } else {
               return false;
            }
         });
      }
   }

   public void N(String var1, class06889 var2, String var3) {
      this.N(new class11481(var1, var2, var3));
   }

   public boolean N(String var1) {
      boolean flag = ((class11289)this.N_0).removeIf(var1x -> {
         if (var1x.m().equals(var1)) {
            var1x.N(true);
            return true;
         } else {
            return false;
         }
      });
      if (flag) {
         class11938.L().L(class11364.N(class09378.WAYPOINTS));
      }

      return flag;
   }

   public class11289 N() {
      class11289 class11289 = new class11289();
      class11289.addAll((class11289)this.N_0);
      return class11289;
   }

   public void N(class11481 var1) {
      this.y(var1);
      ((class11473)((Map)this.N_1).get(var1.N())).N(var1);
      if (((class11289)this.N_0).add(var1)) {
         class11938.L().L(class11364.N(class09378.WAYPOINTS));
      }
   }
}
