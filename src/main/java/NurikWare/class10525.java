package NurikWare;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import minecraft.class05589;
import minecraft.class05623;

public class class10525 extends WindowAdapter {
   public class10525(class05589 var1, JFrame var2, class05623 var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      if (!this.N.N.getAndSet(true)) {
         this.y.setTitle("Minecraft server - shutting down!");
         this.L.y(true);
         this.N.L();
      }
   }
}
