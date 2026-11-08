package NurikWare;

import java.util.List;
import java.util.function.Consumer;

public record class11840(List<? extends class11535> entries, class09785<Boolean> opened, Consumer<class11535> onToggle, Float width, float anchorOffsetX) {

   public class09785<Boolean> L() {
      return this.opened;
   }

   public class11840(List<? extends class11535> var1, class09785<Boolean> var2, Consumer<class11535> var3) {
      this(var1, var2, var3, null, -8.0F);
   }


   public Consumer<class11535> i() {
      return this.onToggle;
   }

   public List<? extends class11535> u() {
      return this.entries;
   }

   public float y() {
      return this.anchorOffsetX;
   }

   public Float N() {
      return this.width;
   }
}
