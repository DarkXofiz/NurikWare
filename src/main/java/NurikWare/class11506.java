package NurikWare;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.value.ArrayValue;

public class class11506 extends class11490<class11997> implements class11531 {
   public Object N_0;
   public boolean N_init;

   public void L(class11997 var1) {
      class11938.y().N(var1.L(), var1.y(), var1.N());
   }

   public class11506(String var1, int var2) {
      super(var1, var2, class09378.MACROS);
      this.B();
   }

   private void B() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = false;
      }
   }

   public class11506 N(boolean var1) {
      this.B();
      this.N_0 = var1;
      return this;
   }

   public void y(class11997 var1) {
      class11938.y().N(var1.L());
   }

   public class11997 N(int var1, ArrayValue var2) {
      return new class11997(var2.get(0).asStringValue().asString(), var2.get(1).asStringValue().asString(), var2.get(2).asIntegerValue().asInt());
   }

   @Override
   public boolean y() {
      this.B();
      return (Boolean)this.N_0;
   }

   public Object N(class11997 var1) {
      return var1.L();
   }

   public void N(MessageBufferPacker var1, class11997 var2) throws IOException {
      var1.packArrayHeader(3);
      var1.packString(var2.L());
      var1.packString(var2.y());
      var1.packInt(var2.N());
   }

   @Override
   public List<class11997> N() {
      return class11938.y().L();
   }

   public boolean N(class11997 var1, class11997 var2) {
      return var1.N() == var2.N() && Objects.equals(var1.y(), var2.y());
   }
}
