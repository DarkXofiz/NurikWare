package NurikWare;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.UUID;

public record class11991(String name, UUID skinUuid, boolean generated) implements class11776 {

   public static UUID L(String var0) {
      return UUID.nameUUIDFromBytes(("OfflinePlayer:" + var0).getBytes(StandardCharsets.UTF_8));
   }

   @Override
   public UUID L() {
      return this.skinUuid != null ? this.skinUuid : this.y();
   }


   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class11991 class11991 && Objects.equals(this.name, class11991.name);
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(this.name);
   }

   public UUID i() {
      return this.skinUuid;
   }

   @Override
   public String u() {
      return this.name;
   }

   public static class11991 y(String var0) {
      return new class11991(var0, null, false);
   }

   @Override
   public UUID y() {
      return L(this.name);
   }

   public static class11991 N(String var0) {
      return new class11991(var0, null, true);
   }

   @Override
   public class09054 N() {
      return this.generated ? class09054.OFFLINE_GENERATED : class09054.OFFLINE;
   }

   public boolean R() {
      return this.generated;
   }
}
