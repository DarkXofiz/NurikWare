package NurikWare;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class class11523<T extends class11535> extends class11536<List<T>> {
   public Object N_0;

   public List<T> L() {
      this.M();
      return List.copyOf((List)this.N_0);
   }

   private void M() {
   }

   public class11523(class12018 var1, List<T> var2) {
      super(var1, null);
      this.M();
      this.N_0 = var2;
      this.L(this.R());
      this.y(this.i());
   }

   @Override
   public void u() {
      this.M();
      List list = this.U();

      for (class11535 class11535 : (List)this.N_0) {
         class11535.M(false);
         if (list.contains(class11535)) {
            class11535.M(true);
         }
      }

      this.L(this.R());
   }

   public void N(List<T> var1) {
      throw new UnsupportedOperationException("Use selectEntry instead of setValue");
   }

   public void N(T var1, boolean var2) {
      this.M();
      if (var1 != null && ((List)this.N_0).contains(var1)) {
         var1.M(var2);
         this.L(this.R());
      } else {
         throw new IllegalArgumentException("Entry is null or not found");
      }
   }

   private List<T> R() {
      this.M();
      return ((List)this.N_0).stream().filter(class11535::U).collect(Collectors.toList());
   }

   @Override
   public boolean c_() {
      List list = this.i();
      List list1 = this.U();
      return list.size() != list1.size()
         ? true
         : IntStream.range(0, list.size()).anyMatch(var2x -> !((class11535)list.get(var2x)).E().N().equals(((class11535)list1.get(var2x)).E().N()));
   }
}
