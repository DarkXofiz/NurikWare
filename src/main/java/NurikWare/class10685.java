package NurikWare;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.viaversion.viafabricplus.features.item.filter_creative_tabs.VersionedRegistries;
import com.viaversion.viafabricplus.settings.impl.GeneralSettings;
import java.util.Collection;
import java.util.Set;
import minecraft.class03767;
import minecraft.class03778;
import minecraft.class04206;
import minecraft.class06202;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06908;
import minecraft.class06911;
import minecraft.class06934;

public class class10685 implements class06934 {
   public final Collection<class06584> N = class03778.N();
   public final Set<class06584> y = class03778.N();
   private final class06911 L;
   private final class03767 u;

   public class10685(class06911 var1, class03767 var2) {
      super();
      this.L = var1;
      this.u = var2;
   }

   private boolean N(class06581 var1, class03767 var2, Operation var3, LocalRef var4) {
      return this.N(var1, var2, var3, (class06584)var4.get());
   }

   private boolean N(class06581 var1, class03767 var2, Operation var3, class06584 var4) {
      boolean flag = (Boolean)var3.call(new Object[]{var1, var2});
      int i = GeneralSettings.INSTANCE.removeNotAvailableItemsFromCreativeTab.getIndex();
      if (i != 2 && !class06202.Nq().q()) {
         return i == 1 && !class04206.Nz.y(this.L).y().equals("minecraft") ? flag : VersionedRegistries.keepItem(var4) && flag;
      } else {
         return flag;
      }
   }

   // $VF: Unable to simplify switch-on-enum, as the enum class was not able to be found.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void method_45417(class06584 var1, class06908 var2) {
      if (var1.c() != 1) {
         throw new IllegalArgumentException("Stack size must be exactly 1");
      } else if (this.N.contains(var1) && var2 != class06908.field_40193) {
         throw new IllegalStateException(
            "Accidentally adding the same item stack twice " + var1.V().getString() + " to a Creative Mode Tab: " + this.L.N().getString()
         );
      } else {
         class06581 class06581 = var1.B();
         class03767 class03767 = this.u;
         class06581 class06581x = class06581;
         Operation operation = var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_1792, net.minecraft.class_7699]");
            return ((class06581)var0[0]).N((class03767)var0[1]);
         };
         LocalRefImpl localrefimpl = new LocalRefImpl();
         localrefimpl.init(var1);
         boolean flag = this.N(class06581x, class03767, operation, localrefimpl);
         var1 = (class06584)localrefimpl.dispose();
         if (flag) {
            switch (var2.ordinal()) {
               case 0:
                  this.N.add(var1);
                  this.y.add(var1);
                  break;
               case 1:
                  this.N.add(var1);
                  break;
               case 2:
                  this.y.add(var1);
            }
         }
      }
   }
}
