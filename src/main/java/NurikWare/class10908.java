package NurikWare;

import minecraft.class07050;

public record class10908(int hotbarSlot, int inventorySlot, class07050 hand, int pitch, boolean jump, int delayAfter) {

   public class07050 L() {
      return this.hand;
   }


   public int i() {
      return this.hotbarSlot;
   }

   public int u() {
      return this.inventorySlot;
   }

   public boolean y() {
      return this.jump;
   }

   public int N() {
      return this.pitch;
   }

   public int R() {
      return this.delayAfter;
   }
}
