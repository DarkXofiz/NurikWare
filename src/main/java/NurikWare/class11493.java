package NurikWare;

import java.io.IOException;
import java.util.List;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.value.ArrayValue;

public class class11493 extends class11490<class09332> implements class11531 {
   public Object N_0;
   public boolean N_init;

   private void L() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = false;
      }
   }

   public Object L(class09332 var1) {
      return var1.y();
   }

   public class11493(String var1, int var2) {
      super(var1, var2, class09378.FRIENDS);
      this.L();
   }

   public class11493 N(boolean var1) {
      this.L();
      this.N_0 = var1;
      return this;
   }

   public void y(class09332 var1) {
      class11938.t().N(var1.y(), var1.N());
   }

   public class09332 N(int var1, ArrayValue var2) {
      return new class09332(var2.get(0).asStringValue().asString(), var2.get(1).asIntegerValue().asLong());
   }

   @Override
   public boolean y() {
      this.L();
      return (Boolean)this.N_0;
   }

   @Override
   public List<class09332> N() {
      return class11938.t().y();
   }

   public void N(MessageBufferPacker var1, class09332 var2) throws IOException {
      var1.packArrayHeader(2);
      var1.packString(var2.y());
      var1.packLong(var2.N());
   }

   public void N(class09332 var1) {
      class11938.t().y(var1.y());
   }

   public boolean N(class09332 var1, class09332 var2) {
      return var1.N() == var2.N();
   }
}
