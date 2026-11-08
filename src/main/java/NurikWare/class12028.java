package NurikWare;

import minecraft.class03443;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class07510;

public record class12028(int syncId, int slotId, int button, class07510 actionType) implements class12040 {

   public int L() {
      return this.syncId;
   }


   @Override
   public void accept(class06202 var1) {
      ((class03443)var1.T_2).N(this.syncId, this.slotId, this.button, this.actionType, (class04453)var1.T_4);
   }

   public class07510 u() {
      return this.actionType;
   }

   public int y() {
      return this.button;
   }

   public int N() {
      return this.slotId;
   }
}
