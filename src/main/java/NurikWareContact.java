import java.util.Map;
import java.util.Optional;
import net.fabricmc.loader.api.metadata.ContactInformation;

final class NurikWareContact implements ContactInformation {
   private final Map<String, String> map;

   NurikWareContact(Map<String, String> var1) {
      super();
      this.map = var1;
   }

   public Optional<String> get(String var1) {
      return Optional.ofNullable(this.map.get(var1));
   }

   public Map<String, String> asMap() {
      return this.map;
   }
}
