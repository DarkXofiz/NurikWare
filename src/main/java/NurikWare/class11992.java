package NurikWare;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class class11992 {
   public Object N_0;

   public List<class11997> L() {
      return List.copyOf(((Map)this.N_0).values());
   }

   public Optional<class11997> L(String var1) {
      return Optional.ofNullable((class11997)((Map)this.N_0).get(var1));
   }

   public class11992() {
      super();
      this.R();
      this.N_0 = new LinkedHashMap();
   }

   public boolean y(String var1) {
      return ((Map)this.N_0).containsKey(var1);
   }

   public void y() {
      if (!((Map)this.N_0).isEmpty()) {
         ((Map)this.N_0).clear();
         class11938.L().L(class11364.N(class09378.MACROS));
      }
   }

   public boolean N(String var1, String var2, int var3) {
      if (((Map)this.N_0).containsKey(var1)) {
         return false;
      } else {
         ((Map)this.N_0).put(var1, new class11997(var1, var2, var3));
         class11938.L().L(class11364.N(class09378.MACROS));
         return true;
      }
   }

   public Stream<String> N() {
      return ((Map)this.N_0).keySet().stream();
   }

   public List<class11997> N(int var1) {
      return ((Map)this.N_0).values().stream().filter(var1x -> var1x.N() == var1).toList();
   }

   public boolean N(String var1) {
      boolean flag = ((Map)this.N_0).remove(var1) != null;
      if (flag) {
         class11938.L().L(class11364.N(class09378.MACROS));
      }

      return flag;
   }

   private void R() {
   }
}
