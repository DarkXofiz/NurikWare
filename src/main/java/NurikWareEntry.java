import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.entrypoint.EntrypointContainer;

final class NurikWareEntry<T> implements EntrypointContainer<T> {
   private final T value;
   private final ModContainer provider;
   private final String definition;

   NurikWareEntry(T var1, ModContainer var2, String var3) {
      super();
      this.value = (T)var1;
      this.provider = var2;
      this.definition = var3;
   }

   public T getEntrypoint() {
      return this.value;
   }

   public ModContainer getProvider() {
      return this.provider;
   }

   public String getDefinition() {
      return this.definition;
   }
}
