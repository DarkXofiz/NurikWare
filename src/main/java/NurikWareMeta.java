import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import net.fabricmc.loader.api.SemanticVersion;
import net.fabricmc.loader.api.Version;
import net.fabricmc.loader.api.VersionParsingException;
import net.fabricmc.loader.api.metadata.ContactInformation;
import net.fabricmc.loader.api.metadata.CustomValue;
import net.fabricmc.loader.api.metadata.ModDependency;
import net.fabricmc.loader.api.metadata.ModEnvironment;
import net.fabricmc.loader.api.metadata.ModMetadata;
import net.fabricmc.loader.api.metadata.Person;

final class NurikWareMeta implements ModMetadata {
   final String id;
   final String name;
   final String description;
   final Version version;
   final ModEnvironment env;
   final Map<String, CustomValue> custom;
   final Map<String, String> contact;
   final List<String> license;
   final List<String> provides;
   final List<String> authorNames;
   final String iconPath;

   NurikWareMeta(
      String var1,
      String var2,
      String var3,
      String var4,
      String var5,
      Map<String, CustomValue> var6,
      Map<String, String> var7,
      List<String> var8,
      List<String> var9,
      List<String> var10,
      String var11
   ) {
      super();
      this.id = var1;
      this.name = var2;
      this.description = var3;
      this.version = parseVersion(var4);
      this.env = "client".equals(var5) ? ModEnvironment.CLIENT : ("server".equals(var5) ? ModEnvironment.SERVER : ModEnvironment.UNIVERSAL);
      this.custom = var6;
      this.contact = var7;
      this.license = var8;
      this.provides = var9;
      this.authorNames = var10;
      this.iconPath = var11;
   }

   private static Version parseVersion(String var0) {
      try {
         return SemanticVersion.parse(var0);
      } catch (VersionParsingException versionparsingexception) {
         return new NurikWareVersion(var0);
      }
   }

   public String getType() {
      return "fabric";
   }

   public String getId() {
      return this.id;
   }

   public Collection<String> getProvides() {
      return this.provides;
   }

   public Version getVersion() {
      return this.version;
   }

   public ModEnvironment getEnvironment() {
      return this.env;
   }

   public Collection<ModDependency> getDependencies() {
      return Collections.emptyList();
   }

   public String getName() {
      return this.name;
   }

   public String getDescription() {
      return this.description;
   }

   public Collection<Person> getAuthors() {
      ArrayList arraylist = new ArrayList();

      for (String s : this.authorNames) {
         arraylist.add(new NurikWarePerson(s));
      }

      return arraylist;
   }

   public Collection<Person> getContributors() {
      return Collections.emptyList();
   }

   public ContactInformation getContact() {
      return new NurikWareContact(this.contact);
   }

   public Collection<String> getLicense() {
      return this.license;
   }

   public Optional<String> getIconPath(int var1) {
      return Optional.ofNullable(this.iconPath);
   }

   public boolean containsCustomValue(String var1) {
      return this.custom.containsKey(var1);
   }

   public CustomValue getCustomValue(String var1) {
      return this.custom.get(var1);
   }

   public Map<String, CustomValue> getCustomValues() {
      return this.custom;
   }

   public boolean containsCustomElement(String var1) {
      return this.custom.containsKey(var1);
   }
}
