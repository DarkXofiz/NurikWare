package NurikWare;

import java.net.URI;

public record class11436(String host, int port, String path, boolean sslEnabled, long reconnectAfterMs) {

   public URI L() {
      return URI.create((this.sslEnabled ? "wss" : "ws") + "://" + this.host + ":" + this.port + this.path);
   }

   public String M() {
      return this.host;
   }


   public boolean i() {
      return this.sslEnabled;
   }

   public long u() {
      return this.reconnectAfterMs;
   }

   public int y() {
      return this.port;
   }

   public String N() {
      return this.path;
   }

   public static class11436 R() {
      return new class11436("socket.nursultan.fun", 443, "/ws", true, 5000L);
   }
}
