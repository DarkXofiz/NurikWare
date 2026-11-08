package NurikWare;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import minecraft.class06889;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.value.ArrayValue;

public class class11329 extends class11490<class11481> implements class11531 {
   public Object N_0;
   public boolean N_init;

   public Object L(class11481 var1) {
      return var1.m();
   }

   private void M() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = false;
      }
   }

   public class11329(String var1, int var2) {
      super(var1, var2, class09378.WAYPOINTS);
      this.M();
   }

   public class11329 N(boolean var1) {
      this.M();
      this.N_0 = var1;
      return this;
   }

   public class11481 N(int var1, ArrayValue var2) {
      String s = var2.get(0).asStringValue().asString();
      String s1 = var2.get(1).asStringValue().asString();
      double d0 = var2.get(2).asFloatValue().toDouble();
      double d1 = var2.get(3).asFloatValue().toDouble();
      double d2 = var2.get(4).asFloatValue().toDouble();
      return new class11481(s, new class06889(d0, d1, d2), s1);
   }

   public void y(class11481 var1) {
      class11938.E().N(var1);
   }

   @Override
   public boolean y() {
      this.M();
      return (Boolean)this.N_0;
   }

   public void N(MessageBufferPacker var1, class11481 var2) throws IOException {
      class06889 class06889 = var2.W();
      var1.packArrayHeader(5);
      var1.packString(var2.m());
      var1.packString(var2.s());
      var1.packDouble(class06889.M);
      var1.packDouble(class06889.B);
      var1.packDouble(class06889.Z);
   }

   @Override
   public List<class11481> N() {
      return class11938.E().N().stream().filter(class11481::U).toList();
   }

   public void N(class11481 var1) {
      class11938.E().N(var1.m());
   }

   public boolean N(class11481 var1, class11481 var2) {
      return Objects.equals(var1.s(), var2.s()) && var1.W().equals(var2.W());
   }
}
