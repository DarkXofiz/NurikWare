package NurikWare;

import minecraft.class03773;
import net.fabricmc.fabric.api.transfer.v1.transaction.base.SnapshotParticipant;

public class class10236 extends SnapshotParticipant<Integer> {
   public class10236(class03773 var1) {
      super();
      this.N = var1;
   }

   protected void readSnapshot(Integer var1) {
      this.N.R = var1;
   }

   protected Integer createSnapshot() {
      return this.N.R;
   }

   public void onFinalCommit() {
      this.N.N(this.N.R);
   }
}
