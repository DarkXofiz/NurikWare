package NurikWare;

import java.util.Objects;

final class class09812 {
   class09812() {
      super();
   }

   class10021 N(class09798 var1) {
      Objects.requireNonNull(var1, "spec");
      class10049 class10049 = var1.y();
      class10021 class10021 = new class10021(var1.N(), class10049);
      class10018.N(class10021, class09817.N(var1));
      class09793<class09904> class09793 = class09817.y(var1);
      if (class09793 != null) {
         class09793.N(class10021);
      }

      class10021.N(var1.R());
      class10021.N(var1.i());

      for (class09816 class09816 : var1.u()) {
         class10021.N(class09816.N(), class09816.y(), class09816.L());
      }

      if (class10049 == class10049.TEXT) {
         class10021.N(var1.M());
      }

      if (class10049 == class10049.INPUT) {
         class10021.N(var1.M());
         class10021.y(var1.B());
      }

      if (class10049 == class10049.TEXTURE) {
         class10021.L(var1.Z());
      }

      if (class10049 == class10049.CANVAS && var1.z() != null) {
         class10021.N(var1.z());
      }

      for (class09798 class09798 : var1.L()) {
         class10021.N(this.N(class09798));
      }

      return class10021;
   }
}
