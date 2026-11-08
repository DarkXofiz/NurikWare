import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.metadata.ModMetadata;
import net.fabricmc.loader.api.metadata.ModOrigin;
import net.fabricmc.loader.api.metadata.ModOrigin.Kind;

final class NurikWareContainer implements ModContainer {
   private final NurikWareMeta meta;
   private final List<Path> roots;
   private final ModOrigin origin;

   NurikWareContainer(NurikWareMeta var1, List<Path> var2) {
      super();
      this.meta = var1;
      this.roots = var2;
      this.origin = new NurikWareContainer.Origin(var2);
   }

   public ModMetadata getMetadata() {
      return this.meta;
   }

   public List<Path> getRootPaths() {
      return this.roots;
   }

   public Path getRootPath() {
      return this.roots.get(0);
   }

   public Path getPath(String var1) {
      Path path = this.getRootPath();
      String s = var1;

      while (s.startsWith("/")) {
         s = s.substring(1);
      }

      return s.isEmpty() ? path : path.resolve(s);
   }

   public Optional<Path> findPath(String var1) {
      Path path = this.getPath(var1);
      return Files.exists(path) ? Optional.of(path) : Optional.empty();
   }

   public ModOrigin getOrigin() {
      return this.origin;
   }

   public Optional<ModContainer> getContainingMod() {
      return Optional.empty();
   }

   public Collection<ModContainer> getContainedMods() {
      return Collections.emptyList();
   }

   @Override
   public String toString() {
      return this.meta.getId() + " " + this.meta.getVersion().getFriendlyString();
   }

   private static final class Origin implements ModOrigin {
      private final List<Path> paths;

      Origin(List<Path> var1) {
         super();
         this.paths = new ArrayList<>(var1);
      }

      public Kind getKind() {
         return Kind.PATH;
      }

      public List<Path> getPaths() {
         return this.paths;
      }

      public String getParentModId() {
         throw new UnsupportedOperationException();
      }

      public String getParentSubLocation() {
         throw new UnsupportedOperationException();
      }
   }
}
