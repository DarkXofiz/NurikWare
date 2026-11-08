package NurikWare;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import org.joml.Vector3d;

public class class09345 {
   public Object N_0;
   public Object N_1;

   public void L() {
      if (!((Map)this.N_0).isEmpty() || !((Set)this.N_1).isEmpty()) {
         ((Map)this.N_0).clear();
         ((Set)this.N_1).clear();
         class11938.L().L(class11372.N());
      }
   }

   public class09345() {
      super();
      this.B();
      this.N_0 = new LinkedHashMap();
      this.N_1 = new LinkedHashSet();
   }

   private void B() {
   }

   public Collection<class09295> i() {
      return Collections.unmodifiableCollection(((Map)this.N_0).values());
   }

   public boolean u() {
      return ((Map)this.N_0).isEmpty();
   }

   public boolean y(String var1) {
      class09295 class09295 = (class09295)((Map)this.N_0).get(var1);
      return class09295 != null && !class09295.y().equals(((class11472)class11938.L_2).Z());
   }

   public Stream<String> y() {
      return ((Map)this.N_0).keySet().stream();
   }

   public void N(String var1, String var2, double var3, double var5, double var7) {
      for (class09309 class09309 : (Set)this.N_1) {
         if (((String)class09309.N_0).equals(var1)) {
            ((Vector3d)class09309.N_3).set((Vector3d)class09309.N_4);
            ((Vector3d)class09309.N_4).set(var3, var5, var7);
            class09309.N(System.currentTimeMillis());
            return;
         }
      }

      ((Set)this.N_1).add(new class09309(var1, var2, new Vector3d(var3, var5, var7)));
   }

   public void N(long var1, long var3) {
      ((Set)this.N_1).removeIf(var4 -> var3 - (Long)var4.N_2 > var1);
   }

   public void N(class09295[] var1) {
      if (var1.length == 0) {
         this.L();
      } else {
         ((Map)this.N_0).clear();
         ((Set)this.N_1).clear();

         for (class09295 class09295 : var1) {
            ((Map)this.N_0).put(class09295.N(), class09295);
         }

         class11938.L().L(class11372.N(var1));
      }
   }

   public Collection<class09309> N() {
      return Collections.unmodifiableCollection((Set)this.N_1);
   }

   public boolean N(String var1) {
      return ((Map)this.N_0).containsKey(var1);
   }
}
