package NurikWare;

public enum class09664 {
   NORMAL(0),
   INVERTED(1),
   INVENTORY_POSITION_AWARE(2),
   INVENTORY_POSITION_AWARE_INVERTED(3);

   private final int id;

   public boolean L() {
      return this == INVENTORY_POSITION_AWARE || this == INVENTORY_POSITION_AWARE_INVERTED;
   }

   private class09664(int var3) {
      this.id = var3;
   }

   public boolean y() {
      return this == INVERTED || this == INVENTORY_POSITION_AWARE_INVERTED;
   }

   public static class09664 N(int var0) {
      if (var0 == NORMAL.id) {
         return NORMAL;
      } else if (var0 == INVERTED.id) {
         return INVERTED;
      } else {
         return var0 == INVENTORY_POSITION_AWARE.id ? INVENTORY_POSITION_AWARE : INVENTORY_POSITION_AWARE_INVERTED;
      }
   }

   public int N() {
      return this.id;
   }
}
