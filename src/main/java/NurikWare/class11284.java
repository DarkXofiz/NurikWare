package NurikWare;

import java.util.function.Consumer;
import minecraft.class01054;
import minecraft.class01065;
import minecraft.class05216;
import minecraft.class05341;
import minecraft.class05361;
import minecraft.class05362;
import minecraft.class06611;
import minecraft.class06613;

public class class11284 extends class05362 {
   public Object N_0;
   public Object N_1;
   public Object N_2;

   public int L() {
      this.U();
      return (Integer)this.N_2;
   }

   public class11284(
      int var1, int var2, int var3, int var4, class05216 var5, class05361 var6, class05341 var7, Consumer<class05362> var8, Consumer<class05362> var9
   ) {
      super(var1, var2, var3, var4, var5, var6, var7);
      this.U();
      this.N_0 = var8;
      this.N_1 = var9;
      this.N_2 = 0;
   }

   public Consumer<class05362> i() {
      this.U();
      return (Consumer<class05362>)this.N_1;
   }

   private void U() {
      this.N_2 = 0;
   }

   public Consumer<class05362> y() {
      this.U();
      return (Consumer<class05362>)this.N_0;
   }

   public void N() {
      this.U();
      if (this.field_22763) {
         if ((Integer)this.N_2 != 0 && (Integer)this.N_2 + 2 < class11938.j().y()) {
            ((Consumer)this.N_0).accept(this);
         }
      }
   }

   public void method_25306(class06611 var1) {
      this.U();
      super.method_25306(var1);
      this.N_2 = class11938.j().y();
   }

   public void method_75752(class01054 var1, int var2, int var3, float var4) {
      this.method_75794(var1);
      this.method_75793(var1.N(this, class01065.field_63850));
   }

   public void method_25357(class06613 var1) {
      this.U();
      super.method_25357(var1);
      if ((Integer)this.N_2 + 2 >= class11938.j().y()) {
         ((Consumer)this.N_1).accept(this);
      }

      this.N_2 = 0;
   }
}
