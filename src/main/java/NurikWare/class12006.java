package NurikWare;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import minecraft.class00176;
import minecraft.class00539;
import minecraft.class06202;
import minecraft.class07510;

public record class12006(
   int syncId, int revision, short slot, byte button, class07510 actionType, class00176 itemStackHash, Int2ObjectMap<class00176> modifiedStacks
) implements class12040 {

   public class07510 L() {
      return this.actionType;
   }

   public Int2ObjectMap<class00176> M() {
      return this.modifiedStacks;
   }

   public class12006(
      int syncId, int revision, short slot, byte button, class07510 actionType, class00176 itemStackHash, Int2ObjectMap<class00176> modifiedStacks
   ) {
      super();
      this.syncId = syncId;
      this.revision = revision;
      this.slot = slot;
      this.button = button;
      this.actionType = actionType;
      this.itemStackHash = itemStackHash;
      this.modifiedStacks = modifiedStacks;
   }

   public class00176 i() {
      return this.itemStackHash;
   }

   @Override
   public void accept(class06202 var1) {
      class11910.N(new class00539(this.syncId, this.revision, this.slot, this.button, this.actionType, this.modifiedStacks, this.itemStackHash));
   }

   public int u() {
      return this.revision;
   }

   public int y() {
      return this.syncId;
   }

   public short N() {
      return this.slot;
   }

   public byte R() {
      return this.button;
   }
}
