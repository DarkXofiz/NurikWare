import net.fabricmc.loader.api.metadata.ContactInformation;
import net.fabricmc.loader.api.metadata.Person;

final class NurikWarePerson implements Person {
   private final String name;

   NurikWarePerson(String var1) {
      super();
      this.name = var1;
   }

   public String getName() {
      return this.name;
   }

   public ContactInformation getContact() {
      return ContactInformation.EMPTY;
   }
}
