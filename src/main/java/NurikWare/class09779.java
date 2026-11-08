package NurikWare;

import java.util.List;

record class09779(List<class09799> desiredChildren, List<class10021> immediateDetachChildren, List<class10021> exitingChildren) {
   private static final class09779 u = new class09779(null, null, null);

   public List<class10021> L() {
      return this.immediateDetachChildren;
   }

   class09779(List<class09799> desiredChildren, List<class10021> immediateDetachChildren, List<class10021> exitingChildren) {
      super();
      this.desiredChildren = desiredChildren == null ? List.of() : List.copyOf(desiredChildren);
      this.immediateDetachChildren = immediateDetachChildren == null ? List.of() : List.copyOf(immediateDetachChildren);
      this.exitingChildren = exitingChildren == null ? List.of() : List.copyOf(exitingChildren);
   }

   public List<class10021> u() {
      return this.exitingChildren;
   }

   public List<class09799> y() {
      return this.desiredChildren;
   }

   static class09779 N() {
      return u;
   }
}
