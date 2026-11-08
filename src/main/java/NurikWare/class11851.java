package NurikWare;

import java.util.List;
import java.util.function.Consumer;

public record class11851(List<? extends class11535> entries, class09785<Boolean> opened, Consumer<class11535> onSelect, Float width, float anchorOffsetX) {

   public Float L() {
      return this.width;
   }


   public class11851(List<? extends class11535> var1, class09785<Boolean> var2, Consumer<class11535> var3) {
      this(var1, var2, var3, null, -8.0F);
   }

   public List<? extends class11535> i() {
      return this.entries;
   }

   public Consumer<class11535> u() {
      return this.onSelect;
   }

   public float y() {
      return this.anchorOffsetX;
   }

   public class09785<Boolean> N() {
      return this.opened;
   }
}
