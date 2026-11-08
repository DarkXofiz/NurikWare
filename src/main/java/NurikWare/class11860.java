package NurikWare;

import java.util.function.ObjIntConsumer;

public record class11860(class12002 key, int mods, ObjIntConsumer<class12002> onChange, class09785<Boolean> active) {

   public int L() {
      return this.mods;
   }

   public class11860(class12002 key, int mods, ObjIntConsumer<class12002> onChange, class09785<Boolean> active) {
      super();
      this.key = key;
      this.mods = mods;
      this.onChange = onChange;
      this.active = active;
   }

   public class09785<Boolean> u() {
      return this.active;
   }

   public class12002 y() {
      return this.key;
   }

   public ObjIntConsumer<class12002> N() {
      return this.onChange;
   }
}
