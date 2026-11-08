package NurikWare;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.ArrayList;
import minecraft.class00176;
import minecraft.class00539;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class07482;
import minecraft.class07510;

public class class12029 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public boolean N_init;
   public static Object y_0 = new class12001();

   public void L() {
      ((class12001)this.N_2).u(this);
   }

   public class12029() {
      super();
      this.B();
      this.N_0 = new ArrayList();
      this.N_1 = new ArrayList();
      this.N_2 = (class12001)y_0;
      this.N_3 = -1;
   }

   static {
      z();
   }

   private void B() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_3 = 0;
         this.N_4 = false;
      }
   }

   public class12029 i() {
      ((class12001)this.N_2).y(this);
      return this;
   }

   private static void z() {
      y_0 = null;
   }

   public boolean u() {
      return ((class12001)this.N_2).M(this);
   }

   public class12029 y(class00539 var1) {
      return this.N(new class12006(var1.N(), var1.y(), var1.L(), var1.u(), var1.M(), var1.Z(), var1.B()));
   }

   public void y() {
      ((class12001)this.N_2).N(this);
   }

   public class12029 y(class12040 var1) {
      ((class12001)this.N_2).y(var1, this);
      return this;
   }

   public class12029 N(class12001 var1) {
      this.N_2 = var1;
      return this;
   }

   public class12029 N(class00539 var1) {
      return this.N(new class12028(var1.N(), var1.L(), var1.u(), var1.M()));
   }

   public class12029 N(class12006 var1) {
      ((class12001)this.N_2).N(var1, this);
      return this;
   }

   public class12029 N(class12040 var1) {
      ((class12001)this.N_2).N(var1, this);
      return this;
   }

   public class12029 N() {
      ((class12001)this.N_2).B(this);
      return this;
   }

   public class12029 N(int var1, int var2, int var3, class07510 var4) {
      return this.N(new class12028(var1, var2, var3, var4));
   }

   public class12029 N(int var1, short var2, byte var3, class07510 var4) {
      class07482 class07482 = (class07482)((class04453)class06202.Nq().T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3;
      int i = class07482.z();
      Int2ObjectOpenHashMap int2objectopenhashmap = new Int2ObjectOpenHashMap();
      class00176 class00176 = class00176.y(class07482.L(var2).i(), class06202.Nq().NE().Q());
      int2objectopenhashmap.put(var2, class00176);
      return this.N(new class12006(var1, i, var2, var3, var4, class00176, int2objectopenhashmap));
   }

   public class12029 N(class12028 var1) {
      ((class12001)this.N_2).N(var1, this);
      return this;
   }
}
