package NurikWare;

import java.util.regex.Pattern;

public class class11533 extends class11536<String> {
   public Object N_0;
   public Object N_1;

   public String L() {
      this.T();
      return (String)this.N_0;
   }

   public String i() {
      this.T();
      String s = (String)super.i();
      return s != null && ((Pattern)this.N_1 == null || ((Pattern)this.N_1).matcher(s).matches()) ? s : this.U();
   }

   private void T() {
   }

   public class11533(class12018 var1, String var2, String var3, Pattern var4) {
      super(var1, var2);
      this.T();
      this.N_0 = var3;
      this.N_1 = var4;
   }

   public void N(String var1) {
      this.T();
      if (var1 != null && ((Pattern)this.N_1 == null || ((Pattern)this.N_1).matcher(var1).matches())) {
         super.N(var1);
      } else {
         super.N(this.U());
      }
   }

   public Pattern R() {
      this.T();
      return (Pattern)this.N_1;
   }
}
