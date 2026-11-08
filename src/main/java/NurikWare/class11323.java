package NurikWare;

import java.util.UUID;

public record class11323(class11298 kind, UUID clientId) {

   public static class11323 L(UUID var0) {
      return new class11323(class11298.UPDATE, var0);
   }

   public class11323(class11298 kind, UUID clientId) {
      super();
      this.kind = kind;
      this.clientId = clientId;
   }

   public static class11323 i(UUID var0) {
      return new class11323(class11298.RENAME, var0);
   }

   public static class11323 u(UUID var0) {
      return new class11323(class11298.LOAD, var0);
   }

   public class11298 y() {
      return this.kind;
   }

   public static class11323 y(UUID var0) {
      return new class11323(class11298.CREATE, var0);
   }

   public static class11323 N(UUID var0) {
      return new class11323(class11298.DELETE, var0);
   }

   public UUID N() {
      return this.clientId;
   }
}
