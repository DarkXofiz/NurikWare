package NurikWare;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;
import org.msgpack.value.ArrayValue;
import org.msgpack.value.ImmutableValue;

public abstract class class11490<T> extends class11488 {
   public static Object y_0 = LogManager.getLogger(String.class);

   public abstract void L(T var1);

   private static void L() {
   }

   private static void M() {
      y_0 = null;
   }

   public class11490(String var1, int var2, class09378 var3) {
      super(var1, var2, var3);
   }

   static {
      L();
      y();
      M();
   }

   public void y(T var1, T var2) {
      this.y((T)var1);
      this.L((T)var2);
   }

   public abstract void y(T var1);

   private static void y() {
   }

   @Override
   public void N(int var1, MessageUnpacker var2) throws IOException {
      int i = var2.unpackArrayHeader();
      HashMap hashmap = new HashMap(i);

      for (int j = 0; j < i; j++) {
         try {
            ImmutableValue immutablevalue = var2.unpackValue();
            Object object = this.N(var1, immutablevalue.asArrayValue());
            if (object != null) {
               hashmap.put(this.N((T)object), object);
            }
         } catch (Exception exception) {
            ((Logger)y_0).warn("Skipped corrupt record #{} in {}: {}", j, this.u(), exception.getMessage());
         }
      }

      List list = this.N();
      Map map = list.stream().collect(Collectors.toMap(this::N, var0 -> var0, (var0, var1x) -> var1x, () -> new HashMap(list.size())));
      list.stream().filter(var2x -> !hashmap.containsKey(this.N((T)var2x))).forEach(this::y);
      hashmap.forEach((var2x, var3x) -> {
         Object object1 = map.get(var2x);
         if (object1 == null) {
            this.L((T)var3x);
         } else if (!this.N((T)object1, (T)var3x)) {
            this.y((T)object1, (T)var3x);
         }
      });
   }

   public abstract void N(MessageBufferPacker var1, T var2) throws IOException;

   @Override
   public void N(MessageBufferPacker var1) throws IOException {
      List list = this.N();
      var1.packArrayHeader(list.size());

      for (Object object : list) {
         this.N(var1, (T)object);
      }
   }

   public abstract T N(int var1, ArrayValue var2) throws Exception;

   public abstract Object N(T var1);

   public abstract boolean N(T var1, T var2);

   public abstract List<T> N();

   @Override
   public boolean d_() {
      return this.N().isEmpty();
   }
}
