package NurikWare;

import java.util.Objects;
import java.util.UUID;

public record class11166(boolean insecure, UUID uuid, String name, byte[] data) implements class11776 {

   @Override
   public UUID L() {
      return this.uuid;
   }

   public class11166(boolean insecure, UUID uuid, String name, byte[] data) {
      super();
      this.insecure = insecure;
      this.uuid = uuid;
      this.name = name;
      this.data = (byte[])data.clone();
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1
         ? true
         : var1 instanceof class11166 class11166 && Objects.equals(this.uuid, class11166.uuid) && Objects.equals(this.name, class11166.name);
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.uuid, this.name);
   }

   public boolean i() {
      return this.insecure;
   }

   @Override
   public String u() {
      return this.name;
   }

   @Override
   public UUID y() {
      return this.uuid;
   }

   @Override
   public class09054 N() {
      return class09054.MICROSOFT;
   }

   public byte[] R() {
      return (byte[])this.data.clone();
   }
}
