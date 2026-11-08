package NurikWare;

import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry;
import java.util.Optional;
import minecraft.class02362;
import minecraft.class02477;
import minecraft.class02678;
import minecraft.class02704;
import minecraft.class04247;

public class class09821 implements class02362<class04247, class02678> {
   public class09821(class02704 var1) {
      super();
      this.N = var1;
   }

   private <T> void N(class04247 var1, class02477<T> var2, Object var3) {
      this.N.N(var2).encode(var1, var3);
   }

   public void encode(class04247 var1, class02678 var2) {
      if (var2.u()) {
         var1.L(0);
         var1.L(0);
      } else {
         int i = 0;
         int j = 0;
         ObjectIterator<Entry<class02477<?>, Optional<?>>> objectiterator = Reference2ObjectMaps.fastIterable(var2.i).iterator();

         while (objectiterator.hasNext()) {
            Entry entry = (Entry)objectiterator.next();
            if (((Optional)entry.getValue()).isPresent()) {
               i++;
            } else {
               j++;
            }
         }

         var1.L(i);
         var1.L(j);
         objectiterator = Reference2ObjectMaps.fastIterable(var2.i).iterator();

         while (objectiterator.hasNext()) {
            Entry entry1 = (Entry)objectiterator.next();
            Optional optional = (Optional)entry1.getValue();
            if (optional.isPresent()) {
               class02477<?> class02477 = (class02477<?>)entry1.getKey();
               class02477.y.encode(var1, class02477);
               this.N(var1, class02477, optional.get());
            }
         }

         objectiterator = Reference2ObjectMaps.fastIterable(var2.i).iterator();

         while (objectiterator.hasNext()) {
            Entry entry2 = (Entry)objectiterator.next();
            if (((Optional)entry2.getValue()).isEmpty()) {
               class02477 class02477 = (class02477)entry2.getKey();
               class02477.y.encode(var1, class02477);
            }
         }
      }
   }

   public class02678 decode(class04247 var1) {
      int i = var1.E();
      int j = var1.E();
      if (i == 0 && j == 0) {
         return class02678.N;
      } else {
         int k = i + j;
         Reference2ObjectArrayMap reference2objectarraymap = new Reference2ObjectArrayMap(Math.min(k, 65536));

         for (int l = 0; l < i; l++) {
            class02477<?> class02477 = (class02477<?>)class02477.y.decode(var1);
            Object object = this.N.N(class02477).decode(var1);
            reference2objectarraymap.put(class02477, Optional.of(object));
         }

         for (int i1 = 0; i1 < j; i1++) {
            class02477 class02477 = (class02477)class02477.y.decode(var1);
            reference2objectarraymap.put(class02477, Optional.empty());
         }

         return new class02678(reference2objectarraymap);
      }
   }
}
