package NurikWare;

import java.util.Set;
import minecraft.class00042;
import minecraft.class00690;
import minecraft.class00695;
import minecraft.class01109;
import minecraft.class01178;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07536;
import minecraft.class07623;
import net.caffeinemc.mods.lithium.common.entity.NavigatingEntity;
import net.caffeinemc.mods.lithium.common.world.ServerWorldExtended;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents.Load;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents.Unload;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public final class class10465 implements class01109<class07049> {
   private class04782 y;

   public void L(class07049 var1) {
      this.N.field_26934.N(var1);
   }

   public void M(class07049 var1) {
      var1.method_42147(class01178::L);
   }

   public class10465(class04782 var1) {
      super();
      this.N = var1;
      this.N(var1, null);
   }

   public void i(class07049 var1) {
      this.N.method_14178().y(var1);
      if (var1 instanceof class04770 class04770) {
         this.N.field_18261.add(class04770);
         if (class04770.method_70637()) {
            this.N.method_70636().N(class04770);
         }

         this.N.method_8448();
      }

      if (var1 instanceof class00042 class00042 && class00042.method_70674()) {
         this.N.method_70636().N(class00042);
      }

      if (var1 instanceof class07079 class07079) {
         if (this.N.field_36317) {
            String s = "onTrackingStart called during navigation iteration";
            class07536.N("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
         }

         Set<class07079> set = this.N.field_26932;
         this.N(set, class07079);
      }

      if (var1 instanceof class00690 class00690) {
         for (class00695 class00695 : class00690.E()) {
            this.N.field_26933.put(class00695.method_5628(), class00695);
         }
      }

      var1.method_42147(class01178::N);
      this.N(var1, null);
   }

   public void u(class07049 var1) {
      this.N.field_26934.y(var1);
   }

   private boolean y(Set var1, Object var2) {
      class07079 class07079 = (class07079)var2;
      NavigatingEntity navigatingentity = (NavigatingEntity)class07079;
      if (navigatingentity.lithium$isRegisteredToWorld()) {
         if (navigatingentity.lithium$getRegisteredNavigation().Z() != null) {
            ((ServerWorldExtended)this.y).lithium$setNavigationInactive(class07079);
         }

         navigatingentity.lithium$setRegisteredToWorld(null);
      }

      return var1.remove(class07079);
   }

   private void y(class07049 var1, CallbackInfo var2) {
      ((Unload)ServerEntityEvents.ENTITY_UNLOAD.invoker()).onUnload(var1, this.N);
   }

   public void y(class07049 var1) {
      if (var1 instanceof class00042 class00042) {
         this.N.method_70636().L(class00042);
      }

      this.N.method_14170().N(var1);
   }

   private void N(class04782 var1, CallbackInfo var2) {
      this.y = var1;
   }

   private boolean N(Set var1, Object var2) {
      class07079 class07079 = (class07079)var2;
      class07623 class07623 = class07079.f();
      ((NavigatingEntity)class07079).lithium$setRegisteredToWorld(class07623);
      if (class07623.Z() != null) {
         ((ServerWorldExtended)this.y).lithium$setNavigationActive(class07079);
      }

      return var1.add(class07079);
   }

   private void N(class07049 var1, CallbackInfo var2) {
      ((Load)ServerEntityEvents.ENTITY_LOAD.invoker()).onLoad(var1, this.N);
   }

   public void N(class07049 var1) {
      if (var1 instanceof class00042 class00042 && class00042.method_70674()) {
         this.N.method_70636().N(class00042);
      }
   }

   public void R(class07049 var1) {
      this.y(var1, null);
      this.N.method_14178().N(var1);
      if (var1 instanceof class04770 class04770) {
         this.N.field_18261.remove(class04770);
         this.N.method_70636().L(class04770);
         this.N.method_8448();
      }

      if (var1 instanceof class07079 class07079) {
         if (this.N.field_36317) {
            String s = "onTrackingStart called during navigation iteration";
            class07536.N("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
         }

         Set<class07079> set = this.N.field_26932;
         this.y(set, class07079);
      }

      if (var1 instanceof class00690 class00690) {
         for (class00695 class00695 : class00690.E()) {
            this.N.field_26933.remove(class00695.method_5628());
         }
      }

      var1.method_42147(class01178::y);
      this.N.field_62841.y(var1);
   }
}
