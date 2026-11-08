package NurikWare;

import com.google.common.collect.Iterators;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMaps;
import java.util.Iterator;
import java.util.Set;
import minecraft.class02477;
import minecraft.class02480;
import minecraft.class02695;
import org.jspecify.annotations.Nullable;

public record class09825(Reference2ObjectMap<class02477<?>, Object> map) implements class02695 {
   @Nullable
   public <T> T method_58694(class02477<? extends T> var1) {
      return (T)this.map.get(var1);
   }


   @Override
   public String toString() {
      return this.map.toString();
   }

   public Iterator<class02480<?>> iterator() {
      return Iterators.transform(Reference2ObjectMaps.fastIterator(this.map), class02480::N);
   }

   public int u() {
      return this.map.size();
   }

   public Set<class02477<?>> y() {
      return this.map.keySet();
   }

   public boolean N(class02477<?> var1) {
      return this.map.containsKey(var1);
   }

   public Reference2ObjectMap<class02477<?>, Object> R() {
      return this.map;
   }
}
