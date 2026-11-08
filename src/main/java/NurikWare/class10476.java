package NurikWare;

import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import minecraft.class03556;
import minecraft.class03927;
import minecraft.class04782;
import minecraft.class04882;
import minecraft.class05368;
import minecraft.class05372;
import minecraft.class05475;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07430;
import minecraft.class07473;
import net.caffeinemc.mods.lithium.common.util.POIRegistryEntries;
import net.caffeinemc.mods.lithium.common.world.interests.iterator.SinglePointOfInterestTypeFilter;

public class class10476 extends class07473 {
   private final class04882 N;
   private final double y;
   private class07209 L;
   private final List<class07209> u = Lists.newArrayList();
   private final int i;
   private boolean R;

   public void L() {
      super.L();
      this.N.method_16826(0);
      this.N.f().N(this.L.method_10263(), this.L.method_10264(), this.L.method_10260(), this.y);
      this.R = false;
   }

   private boolean M() {
      return this.N.NQ() && !this.N.K().N();
   }

   public class10476(class04882 var1, double var2, int var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.i = var4;
      this.N_71(EnumSet.of(class07430.field_18405));
   }

   private boolean Z() {
      class04782 class04782 = (class04782)this.N.method_73183();
      class07209 class07209 = this.N.method_24515();
      class05368 class05368 = class04782.method_19494();
      Predicate predicate2 = var0 -> var0.N(class03927.m);
      Predicate predicate3 = this::N;
      class05372 class05372 = class05372.field_18489;
      class06069 class06069 = class04882.i(this.N);
      byte b0 = 48;
      class05372 class05372x = class05372;
      Predicate predicate1 = predicate3;
      Predicate predicate = predicate2;
      class05368 class05368x = class05368;
      Optional optional = this.N(class05368x, predicate, predicate1, class05372x, class07209, b0, class06069);
      if (optional.isEmpty()) {
         return false;
      } else {
         this.L = ((class07209)optional.get()).method_10062();
         return true;
      }
   }

   public void i() {
      if (this.N.f().U()) {
         class06889 class06889x = class06889.L(this.L);
         class06889 class06889x = class05475.N(this.N, 16, 7, class06889x, (float) (Math.PI / 10));
         if (class06889x == null) {
            class06889x = class05475.N(this.N, 8, 7, class06889x, (float) (Math.PI / 2));
         }

         if (class06889x == null) {
            this.R = true;
            return;
         }

         this.N.f().N(class06889x.M, class06889x.B, class06889x.Z, this.y);
      }
   }

   private void U() {
      if (this.u.size() > 2) {
         this.u.remove(0);
      }
   }

   public void u() {
      if (this.L.method_19769(this.N.method_73189(), this.i)) {
         this.u.add(this.L);
      }
   }

   public boolean y() {
      return this.N.f().U() ? false : this.N.T() == null && !this.L.method_19769(this.N.method_73189(), this.N.method_17681() + this.i) && !this.R;
   }

   private Optional N(class05368 var1, Predicate var2, Predicate var3, class05372 var4, class07209 var5, int var6, class06069 var7) {
      return var1.N(new SinglePointOfInterestTypeFilter(POIRegistryEntries.HOME_ENTRY), var3, var4, var5, var6, var7);
   }

   private boolean N(class07209 var1) {
      for (class07209 class07209 : this.u) {
         if (Objects.equals(var1, class07209)) {
            return false;
         }
      }

      return true;
   }

   public boolean N() {
      this.U();
      return this.M() && this.Z() && this.N.T() == null;
   }
}
