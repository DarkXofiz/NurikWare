package NurikWare;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class class11943<T extends class09297> {
   public Object N_0;
   public Object N_1;

   class11943() {
      super();
      this.u();
      this.N_0 = (Object2IntMap)this.N(new Object2IntOpenHashMap(), var0 -> var0.defaultReturnValue(-1));
      this.N_1 = new Int2ObjectOpenHashMap();
   }

   private void u() {
   }

   public <P extends class11951<T>> class11943<T> N(int var1, Class<P> var2, Supplier<P> var3) {
      return this.N(var1, var2, var3, 15);
   }

   public ObjectSet<Class<? extends class11951<T>>> N() {
      return ((Object2IntMap)this.N_0).keySet();
   }

   public boolean N(Class<?> var1, int var2) {
      int i = ((Object2IntMap)this.N_0).getInt(var1);
      return i == -1 ? false : ((class11961)((Int2ObjectMap)this.N_1).get(i)).y(var2);
   }

   public Integer N(Class<?> var1) {
      int i = ((Object2IntMap)this.N_0).getInt(var1);
      return i == -1 ? null : i;
   }

   public class11951<?> N(int var1, int var2) {
      class11961 class11961 = (class11961)((Int2ObjectMap)this.N_1).get(var1);
      return (class11951<?>)(class11961 != null && class11961.y(var2) ? class11961.N().get() : null);
   }

   public <R> R N(R var1, Consumer<R> var2) {
      var2.accept(var1);
      return (R)var1;
   }

   public <P extends class11951<T>> class11943<T> N(int var1, Class<P> var2, Supplier<P> var3, int var4) {
      return this.N(var1, var2, var3, var4, Integer.MAX_VALUE);
   }

   public <P extends class11951<T>> class11943<T> N(int var1, Class<P> var2, Supplier<P> var3, int var4, int var5) {
      if (((Int2ObjectMap)this.N_1).containsKey(var1)) {
         throw new IllegalArgumentException("Packet id " + var1 + " is already registered");
      } else {
         int i = ((Object2IntMap)this.N_0).put(var2, var1);
         if (i != -1) {
            throw new IllegalArgumentException("Packet " + var2 + " is already registered to ID " + i);
         } else {
            ((Int2ObjectMap)this.N_1).put(var1, new class11961(var3, var4, var5));
            return this;
         }
      }
   }
}
