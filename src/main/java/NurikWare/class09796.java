package NurikWare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public abstract class class09796<T extends class09796<T>> extends class09807<T> {
   private final List<class09798> N = new ArrayList<>();

   public T L(Consumer<class09777> var1) {
      class09777 class09777 = class09778.u();
      if (var1 != null) {
         var1.accept(class09777);
      }

      return this.y(class09777);
   }

   public T L(String var1) {
      return this.y(class09778.N(var1));
   }

   class09796() {
      super();
   }

   protected final List<class09798> B() {
      return List.copyOf(this.N);
   }

   public T i(Consumer<class09813> var1) {
      class09813 class09813 = class09778.R();
      if (var1 != null) {
         var1.accept(class09813);
      }

      return this.y(class09813);
   }

   public T i(String var1) {
      return this.y(class09778.L(var1));
   }

   public T u(String var1) {
      return this.y(class09778.y(var1));
   }

   public T u(Consumer<class09814> var1) {
      class09814 class09814 = class09778.i();
      if (var1 != null) {
         var1.accept(class09814);
      }

      return this.y(class09814);
   }

   public T y(Consumer<class09801> var1) {
      class09801 class09801 = class09778.L();
      if (var1 != null) {
         var1.accept(class09801);
      }

      return this.y(class09801);
   }

   public T y(class09991 var1) {
      return this.N_3(var1, null);
   }

   public T y(class09798 var1) {
      if (var1 != null) {
         this.N.add(var1);
      }

      return this.R();
   }

   public T y(class09806 var1) {
      if (var1 != null) {
         this.N.add(var1.i());
      }

      return this.R();
   }

   public T N_2(class09938 var1) {
      return this.y(class09778.N_1(var1));
   }

   public T N(Collection<? extends class09798> var1) {
      if (var1 != null) {
         for (class09798 class09798 : var1) {
            this.y(class09798);
         }
      }

      return this.R();
   }

   public T N(class09806 var1) {
      return this.y(var1);
   }

   public T N(class09798 var1) {
      return this.y(var1);
   }

   private void N(Object var1) {
      if (var1 instanceof class09798 class09798) {
         this.N.add(class09798);
      } else {
         if (var1 instanceof class09806 class09806) {
            this.N.add(class09806.i());
         }
      }
   }

   public T N_3(class09991 var1, Consumer<class09784> var2) {
      return this.y(class09778.N(var1, var2));
   }

   public T N(Consumer<class09784> var1) {
      return this.y(class09778.N(var1));
   }

   public class09798 N(Object... var1) {
      if (var1 != null) {
         for (Object object : var1) {
            this.N(object);
         }
      }

      return this.i();
   }

   public <I> T N(List<I> var1, class09808<I> var2) {
      if (var1 != null && var2 != null) {
         for (int i = 0; i < var1.size(); i++) {
            this.y(var2.N(var1.get(i), i));
         }

         return this.R();
      } else {
         return this.R();
      }
   }

   public T N(String var1, class09991 var2) {
      return this.y(class09778.N(var1, var2));
   }

   public T N(boolean var1, Supplier<class09798> var2) {
      if (var1 && var2 != null) {
         this.y((class09798)var2.get());
      }

      return this.R();
   }
}
