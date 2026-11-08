package NurikWare;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.value.ArrayValue;
import org.msgpack.value.Value;

public class class11530 {
   private static String[] L;

   private class11530() {
      super();
      throw new UnsupportedOperationException(L[0]);
   }

   static {
      N();
   }

   public static void N(MessageBufferPacker var0, class11536<?> var1) throws IOException {
      switch (var1) {
         case class11507 class11507:
            var0.packBoolean(class11507.W());
            break;
         case class11504 class11504:
            var0.packFloat(class11504.W());
            break;
         case class11533 class11533:
            var0.packString(class11533.W());
            break;
         case class11527 class11527:
            var0.packArrayHeader(2);
            var0.packInt(class11527.W().L());
            var0.packInt(class11527.L());
            break;
         case class11515 class11515:
            var0.packInt(class11515.W());
            break;
         case class11525 class11525:
            class11494 class11494 = ((class11525)var1).W();
            var0.packArrayHeader(2);
            var0.packFloat(class11494.N());
            var0.packFloat(class11494.L());
            break;
         case class11517 class11517:
            var0.packString(((class11535)class11517.W()).E().N());
            break;
         case class11523 class11523:
            List list = (List)((class11523)var1).W();
            var0.packArrayHeader(list.size());

            for (class11535 class11535 : list) {
               var0.packString(class11535.E().N());
            }
            break;
         default:
            var0.packNil();
      }
   }

   private static void N() {
      L = new String[1];
      L[0] = "This is a utility class and cannot be instantiated";
   }

   public static void N(class11536<?> var0, Value var1) {
      switch (var0) {
         case class11507 class11507:
            ((class11507)var0).N(var1.asBooleanValue().getBoolean());
            break;
         case class11504 class11504:
            ((class11504)var0).N(var1.asFloatValue().toFloat());
            break;
         case class11533 class11533:
            ((class11533)var0).N(var1.asStringValue().asString());
            break;
         case class11527 class11527:
            if (var1.isArrayValue()) {
               ArrayValue arrayvalue = var1.asArrayValue();
               class11527.N(class12002.y(arrayvalue.get(0).asIntegerValue().asInt()), arrayvalue.get(1).asIntegerValue().asInt());
            } else {
               class11527.N(class12002.y(var1.asIntegerValue().asInt()), 0);
            }
            break;
         case class11515 class11515:
            class11515.N(var1.asIntegerValue().asInt());
            break;
         case class11525 class11525:
            ArrayValue arrayvalue1 = var1.asArrayValue();
            float f = arrayvalue1.get(0).asFloatValue().toFloat();
            float f1 = arrayvalue1.get(1).asFloatValue().toFloat();
            class11525.N(new class11494(f, f1));
            break;
         case class11517 class11517:
            String s = var1.asStringValue().asString();
            class11517.L().stream().filter(var1x -> var1x.E().N().equals(s)).findFirst().ifPresent(var1x -> class11517.y(var1x));
            break;
         case class11523 class11523:
            HashSet hashset = new HashSet();

            for (Value value : var1.asArrayValue()) {
               hashset.add(value.asStringValue().asString());
            }

            class11523.L().forEach(var2 -> class11523.N(var2, hashset.contains(var2.E().N())));
            return;
         default:
      }
   }
}
