package NurikWare;

import io.netty.channel.Channel;

public class class11880 {
   public Object N_0;

   public boolean L() {
      return (Channel)this.N_0 != null && ((Channel)this.N_0).isActive();
   }

   public class11880() {
      super();
      this.i();
   }

   private void i() {
   }

   public synchronized void y() {
      this.N_0 = null;
   }

   public synchronized void N(Channel var1) {
      this.N_0 = var1;
   }

   public Channel N() {
      return (Channel)this.N_0;
   }
}
