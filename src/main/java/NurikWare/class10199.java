package NurikWare;

import com.viaversion.viafabricplus.base.bedrock.NetherNetInetSocketAddress;
import dev.kastle.netty.channel.nethernet.config.NetherNetAddress;
import java.net.InetSocketAddress;
import minecraft.class03437;
import minecraft.class03459;

public class class10199 implements class03437 {
   public int L() {
      return 0;
   }

   public class10199(class03459 var1, NetherNetAddress var2) {
      super();
      this.N = var2;
   }

   public InetSocketAddress u() {
      return new NetherNetInetSocketAddress(this.N);
   }

   public String y() {
      return this.N.getNetworkId();
   }

   public String N() {
      return this.N.getNetworkId();
   }
}
