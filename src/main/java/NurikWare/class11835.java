package NurikWare;

import java.util.List;
import java.util.function.Consumer;

public record class11835(List<? extends class11535> entries, class11535 selected, class09785<Boolean> opened, Consumer<class11535> onSelect) {

   public List<? extends class11535> L() {
      return this.entries;
   }


   public class09785<Boolean> u() {
      return this.opened;
   }

   public Consumer<class11535> y() {
      return this.onSelect;
   }

   public class11535 N() {
      return this.selected;
   }
}
