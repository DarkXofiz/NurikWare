package NurikWare;

public record class10927(int slot, class11499 rotation, class10891 entry, int commitTick) {

   public int L() {
      return this.commitTick;
   }

   class10927(int slot, class11499 rotation, class10891 entry, int commitTick) {
      super();
      this.slot = slot;
      this.rotation = rotation;
      this.entry = entry;
      this.commitTick = commitTick;
   }

   public int u() {
      return this.slot;
   }

   public class11499 y() {
      return this.rotation;
   }

   public class10891 N() {
      return this.entry;
   }
}
