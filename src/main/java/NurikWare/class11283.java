package NurikWare;

public record class11283(class11301 kind, class09378 configKind) {

   public class09378 L() {
      return this.configKind;
   }

   public class11283(class11301 kind, class09378 configKind) {
      super();
      this.kind = kind;
      this.configKind = configKind;
   }

   public class11301 y() {
      return this.kind;
   }

   public static class11283 y(class09378 var0) {
      return new class11283(class11301.PUSH, var0);
   }

   public static class11283 N(class09378 var0) {
      return new class11283(class11301.PULL, var0);
   }

   public static class11283 N() {
      return new class11283(class11301.LIST, null);
   }
}
