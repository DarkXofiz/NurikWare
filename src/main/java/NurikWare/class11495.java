package NurikWare;

import java.io.IOException;
import java.util.List;
import java.util.UUID;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.value.ArrayValue;

public class class11495 extends class11490<class09250> {
   public static Object N_0;
   public static Object N_1;

   public Object L(class09250 var1) {
      return var1.R();
   }

   public class11495(String var1, int var2) {
      super(var1, var2, null);
   }

   static {
      B();
   }

   private static void B() {
      N_0 = 0;
      N_1 = 1;
   }

   public class09250 N(int var1, ArrayValue var2) {
      if (var2.get(0).asIntegerValue().asInt() == 0) {
         String s1 = var2.get(1).asStringValue().asString();
         long j = var2.get(2).asIntegerValue().asLong();
         boolean flag2 = var2.get(3).asBooleanValue().getBoolean();
         boolean flag3 = var2.get(4).asBooleanValue().getBoolean();
         UUID uuid1 = flag3 ? new UUID(var2.get(5).asIntegerValue().asLong(), var2.get(6).asIntegerValue().asLong()) : null;
         boolean flag4 = var2.get(7).asBooleanValue().getBoolean();
         return new class09250(new class11991(s1, uuid1, flag2), flag4, j);
      } else {
         String s = var2.get(1).asStringValue().asString();
         long i = var2.get(2).asIntegerValue().asLong();
         UUID uuid = new UUID(var2.get(3).asIntegerValue().asLong(), var2.get(4).asIntegerValue().asLong());
         boolean flag = var2.get(5).asBooleanValue().getBoolean();
         byte[] abyte = var2.get(6).asBinaryValue().asByteArray();
         boolean flag1 = var2.get(7).asBooleanValue().getBoolean();
         return new class09250(new class11166(flag, uuid, s, abyte), flag1, i);
      }
   }

   public void y(class09250 var1) {
      class11938.s().y(var1);
   }

   public void N(MessageBufferPacker var1, class09250 var2) throws IOException {
      class11776 class11776 = var2.i();
      if (class11776 instanceof class11991 class11991) {
         UUID uuid = class11991.i();
         var1.packArrayHeader(8);
         var1.packInt(0);
         var1.packString(class11991.u());
         var1.packLong(var2.M());
         var1.packBoolean(class11991.R());
         var1.packBoolean(uuid != null);
         var1.packLong(uuid != null ? uuid.getMostSignificantBits() : 0L);
         var1.packLong(uuid != null ? uuid.getLeastSignificantBits() : 0L);
         var1.packBoolean(var2.y());
      } else {
         class11166 class11166 = (class11166)class11776;
         byte[] abyte = class11166.R();
         var1.packArrayHeader(8);
         var1.packInt(1);
         var1.packString(class11166.u());
         var1.packLong(var2.M());
         var1.packLong(class11166.y().getMostSignificantBits());
         var1.packLong(class11166.y().getLeastSignificantBits());
         var1.packBoolean(class11166.i());
         var1.packBinaryHeader(abyte.length);
         var1.writePayload(abyte);
         var1.packBoolean(var2.y());
      }
   }

   public void N(class09250 var1) {
      class11938.s().N(var1);
   }

   public boolean N(class09250 var1, class09250 var2) {
      return var1.L() == var2.L() && var1.u().equals(var2.u()) && var1.M() == var2.M() && var1.y() == var2.y();
   }

   @Override
   public List<class09250> N() {
      return class11938.s().u();
   }
}
