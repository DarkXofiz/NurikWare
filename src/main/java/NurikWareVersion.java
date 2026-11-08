import net.fabricmc.loader.api.Version;

final class NurikWareVersion implements Version {
   private final String raw;

   NurikWareVersion(String var1) {
      super();
      this.raw = var1;
   }

   public String getFriendlyString() {
      return this.raw;
   }

   public int compareTo(Version var1) {
      return this.raw.compareTo(var1.getFriendlyString());
   }

   @Override
   public String toString() {
      return this.raw;
   }
}
