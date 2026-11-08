package NurikWare;

import java.util.Iterator;
import minecraft.class00750;
import minecraft.class00751;
import minecraft.class03529;
import minecraft.class03556;
import org.jspecify.annotations.Nullable;

public class class09389<T> implements class00750<class03556<T>> {
   public int L() {
      return this.y.L();
   }

   @Nullable
   public class03556<T> N(int var1) {
      return (class03556<T>)this.y.L(var1).orElse(null);
   }

   public class09389(class00751 var1) {
      super();
      this.y = var1;
   }

   public Iterator<class03556<T>> iterator() {
      return this.y.z().map(var0 -> (class03556<T>)var0).iterator();
   }

   public int N(class03556<T> var1) {
      return this.y.N(var1.N());
   }
}
