package NurikWare;

import java.util.function.Consumer;

public record class11861(boolean checked, Consumer<Boolean> onChange) {

   public class11861(boolean checked, Consumer<Boolean> onChange) {
      super();
      this.checked = checked;
      this.onChange = onChange;
   }

   public Consumer<Boolean> y() {
      return this.onChange;
   }

   public boolean N() {
      return this.checked;
   }
}
