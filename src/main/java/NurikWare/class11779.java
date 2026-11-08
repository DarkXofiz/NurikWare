package NurikWare;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Method;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11779 implements class11808 {
   public static Object[] y;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public boolean L_init;

   @Override
   public class11777 L() {
      return (class11777)this.L_2;
   }

   @Override
   public Class<?> M() {
      return (Class<?>)this.L_1;
   }

   public class11779(class11795 var1, Class<?> var2, Object var3, Method var4) {
      super();
      this.W();
      if (var4.getAnnotation(class11782.class) == null) {
         throw new RuntimeException("Method %s is not annotated with @EventHandler".formatted(var4.getName()));
      } else {
         class11782 class11782 = var4.getAnnotation(class11782.class);
         this.L_0 = var4.getParameters()[0].getType();
         this.L_1 = var3.getClass();
         this.L_2 = class11782.y();
         this.L_3 = class11782.u();
         this.L_4 = class11782.N();
         this.L_5 = class11782.L();

         try {
            String s = var4.getName();
            Lookup lookup = var1.create((Method)y[1], var2);
            MethodType methodtype = MethodType.methodType(void.class, var4.getParameters()[0].getType());
            MethodHandle methodhandle = lookup.findVirtual(var2, s, methodtype);
            MethodType methodtype1 = MethodType.methodType(Consumer.class, var2);
            CallSite callsite = LambdaMetafactory.metafactory(
               lookup, "accept", methodtype1, MethodType.methodType(void.class, Object.class), methodhandle, methodtype
            );
            this.L_6 = (Consumer)callsite.getTarget().invoke((Object)var3);
         } catch (Throwable throwable) {
            ((Logger)y[0]).error(throwable, throwable);
         }
      }
   }

   static {
      Z();
      y[0] = LogManager.getLogger(String.class);

      try {
         y[1] = MethodHandles.class.getDeclaredMethod("privateLookupIn", Class.class, Lookup.class);
      } catch (Throwable throwable) {
         ((Logger)y[0]).error(throwable, throwable);
      }
   }

   private static void Z() {
      y = new Object[]{null, null};
   }

   @Override
   public boolean i() {
      return (Boolean)this.L_3;
   }

   @Override
   public Class<?> u() {
      return (Class<?>)this.L_0;
   }

   @Override
   public Class<?>[] y() {
      return (Class<?>[])this.L_5;
   }

   @Override
   public Consumer<Object> N() {
      return (Consumer<Object>)this.L_6;
   }

   private void W() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_3 = false;
      }
   }

   @Override
   public Class<?>[] R() {
      return (Class<?>[])this.L_4;
   }
}
