package NurikWare;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.Map.Entry;
import minecraft.class00427;
import minecraft.class00437;
import minecraft.class00442;
import minecraft.class00449;
import minecraft.class00455;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class06968;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07321;

public class class10701<T> extends class06968<T> {
   private final Map<class07321, class10692<T>> y = new HashMap<>();
   private final Map<class07209, class10692<T>> L = new HashMap<>();
   private final Map<UUID, class10692<T>> u = new HashMap<>();

   public class10701(class00455<T> var1) {
      super(var1);
   }

   protected void y(class04770 var1, class07321 var2) {
      class10692 class10692 = this.y.get(var2);
      if (class10692 != null && class10692.N != null) {
         var1.field_13987.method_14364(new class00427(var2, this.N.N(class10692.N)));
      }

      for (Entry entry : this.L.entrySet()) {
         Object object = ((class10692)entry.getValue()).N;
         if (object != null) {
            class07209 class07209 = (class07209)entry.getKey();
            if (var2.y(class07209)) {
               var1.field_13987.method_14364(new class00437(class07209, this.N.N(object)));
            }
         }
      }
   }

   protected void y(class04770 var1, class07049 var2) {
      class10692 class10692 = this.u.get(var2.method_5667());
      if (class10692 != null && class10692.N != null) {
         var1.field_13987.method_14364(new class00449(var2.method_5628(), this.N.N(class10692.N)));
      }
   }

   protected void y(class04782 var1) {
      for (Entry entry : this.y.entrySet()) {
         class00442 class00442xx = ((class10692)entry.getValue()).N(this.N);
         if (class00442xx != null) {
            class07321 class07321x = (class07321)entry.getKey();
            this.N(var1, class07321x, new class00427(class07321x, class00442xx));
         }
      }

      for (Entry entry1 : this.L.entrySet()) {
         class00442 class00442x = ((class10692)entry1.getValue()).N(this.N);
         if (class00442x != null) {
            class07209 class07209 = (class07209)entry1.getKey();
            class07321 class07321 = new class07321(class07209);
            this.N(var1, class07321, new class00437(class07209, class00442x));
         }
      }

      for (Entry entry2 : this.u.entrySet()) {
         class00442 class00442 = ((class10692)entry2.getValue()).N(this.N);
         if (class00442 != null) {
            class07049 class07049 = Objects.requireNonNull(var1.method_66347((UUID)entry2.getKey()));
            this.N(var1, class07049, new class00449(class07049.method_5628(), class00442));
         }
      }
   }

   public void N(class04782 var1, class07209 var2) {
      if ((class10692)this.L.remove(var2) != null) {
         class07321 class07321 = new class07321(var2);
         this.N(var1, class07321, new class00437(var2, this.N.N()));
      }
   }

   public void N(class07049 var1) {
      this.u.remove(var1.method_5667());
   }

   public void N(UUID var1, class10696<T> var2) {
      this.u.put(var1, new class10692<>(var2));
   }

   protected void N() {
      this.y.clear();
      this.L.clear();
      this.u.clear();
   }

   public void N(class07321 var1) {
      this.y.remove(var1);
      this.L.keySet().removeIf(var1::y);
   }

   public void N(class07209 var1, class10696<T> var2) {
      this.L.put(var1, new class10692<>(var2));
   }

   public void N(class07321 var1, class10696<T> var2) {
      this.y.put(var1, new class10692<>(var2));
   }
}
