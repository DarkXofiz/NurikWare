package NurikWare;

import minecraft.class01101;
import minecraft.class01102;
import minecraft.class01104;
import minecraft.class01113;
import minecraft.class01135;
import minecraft.class01296;
import minecraft.class07049;
import minecraft.class07062;
import net.caffeinemc.mods.lithium.common.tracking.entity.EntityMovementTrackerSection;
import net.caffeinemc.mods.lithium.common.tracking.entity.MovementTrackerHelper;
import net.caffeinemc.mods.lithium.common.tracking.entity.ToggleableMovementTracker;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class09441<T> implements class01113, ToggleableMovementTracker {
   private final T L;
   private long u;
   private class01101<T> i;
   private int R;

   public class09441(T var1, long var2, class01101<T> param4, class01101 var5) {
      super();
      this.y = var1;
      this.L = (T)var2;
      this.u = var3;
      this.i = var5;
      this.N(var1, var2, var3, var5, null);
   }

   private void y(CallbackInfo var1) {
      this.y();
   }

   private void y() {
      if (this.R != 0) {
         ((EntityMovementTrackerSection)this.i).lithium$trackEntityMovement(this.R, ((class07049)this.L).method_73183().N());
      }
   }

   private void N(CallbackInfo var1) {
      this.y();
   }

   private void N(class07062 var1, CallbackInfo var2) {
      this.y();
   }

   public void N() {
      long ix = class01296.L(this.L.method_24515());
      if (ix != this.u) {
         class01102 class01102 = this.i.L();
         if (!this.i.y(this.L)) {
            class01104.N.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.L, class01296.N(this.u), ix});
         }

         this.y.N(this.u, this.i);
         class01101 class01101 = this.y.u.L(ix);
         class01101.N(this.L);
         this.y(null);
         this.i = class01101;
         this.u = ix;
         this.N(class01102, class01101.L());
      }

      this.N(null);
   }

   private void N(class01102 var1, class01102 var2) {
      class01102 class01102x = class01104.N(this.L, var1);
      class01102 class01102x = class01104.N(this.L, var2);
      if (class01102x == class01102x) {
         if (class01102x.y()) {
            this.y.L.N(this.L);
         }
      } else {
         boolean flag = class01102x.y();
         boolean flag1 = class01102x.y();
         if (flag && !flag1) {
            this.y.i(this.L);
         } else if (!flag && flag1) {
            this.y.u(this.L);
         }

         boolean flag2 = class01102x.N();
         boolean flag3 = class01102x.N();
         if (flag2 && !flag3) {
            this.y.L(this.L);
         } else if (!flag2 && flag3) {
            this.y.y(this.L);
         }

         if (flag1) {
            this.y.L.N(this.L);
         }
      }
   }

   public void N(class07062 var1) {
      this.N(var1, null);
      if (!this.i.y(this.L)) {
         class01104.N.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.L, class01296.N(this.u), var1});
      }

      class01102 class01102 = class01104.N(this.L, this.i.L());
      if (class01102.N()) {
         this.y.L(this.L);
      }

      if (class01102.y()) {
         this.y.i(this.L);
      }

      if (var1.N()) {
         this.y.L.R(this.L);
      }

      this.y.y.remove(this.L.method_5667());
      this.L.method_31744(N);
      this.y.N(this.u, this.i);
   }

   private void N(class01104 var1, class01135 var2, long var3, class01101 var5, CallbackInfo var6) {
      this.R = MovementTrackerHelper.getNotificationMask((class07049)this.L);
      this.y();
   }

   public int lithium$setNotificationMask(int var1) {
      int ix = this.R;
      this.R = var1;
      return ix;
   }
}
