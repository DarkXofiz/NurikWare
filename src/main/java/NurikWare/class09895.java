package NurikWare;

import java.util.List;

record class09895(List<class09935> nodes, int drawCommandCount) {
   static final class09895 N = new class09895(List.of(), 0);

   class09895(List<class09935> nodes, int drawCommandCount) {
      super();
      this.nodes = nodes;
      this.drawCommandCount = drawCommandCount;
   }

   public int y() {
      return this.drawCommandCount;
   }

   public List<class09935> N() {
      return this.nodes;
   }
}
