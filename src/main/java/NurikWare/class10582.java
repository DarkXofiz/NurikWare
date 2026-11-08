package NurikWare;

import java.util.ArrayList;
import java.util.List;
import minecraft.class03556;
import minecraft.class03767;
import minecraft.class04206;
import minecraft.class06506;
import minecraft.class06510;
import minecraft.class06511;
import minecraft.class06525;
import minecraft.class06581;
import minecraft.class06586;
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder.BuildCallback;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class10582 implements FabricBrewingRecipeRegistryBuilder {
   private final List<class06510> N = new ArrayList<>();
   private final List<class10583<class06525>> y = new ArrayList<>();
   private final List<class10583<class06581>> L = new ArrayList<>();
   private final class03767 u;

   public class10582(class03767 var1) {
      super();
      this.u = var1;
   }

   private static void y(class06581 var0) {
      if (!(var0 instanceof class06586)) {
         throw new IllegalArgumentException("Expected a potion, got: " + class04206.B.y(var0));
      }
   }

   public class06511 N() {
      this.N(null);
      return new class06511(List.copyOf(this.N), List.copyOf(this.y), List.copyOf(this.L));
   }

   public void N(class06581 var1, class03556<class06525> var2) {
      if (((class06525)var2.N()).N(this.u)) {
         this.N(class06506.N, var1, class06506.y);
         this.N(class06506.u, var1, var2);
      }
   }

   private void N(CallbackInfoReturnable var1) {
      ((BuildCallback)FabricBrewingRecipeRegistryBuilder.BUILD.invoker()).build(this);
   }

   public void N(class06581 var1, class06581 var2, class06581 var3) {
      if (var1.N(this.u) && var2.N(this.u) && var3.N(this.u)) {
         y(var1);
         y(var3);
         this.L.add(new class10583<>(var1.i(), class06510.method_8101(var2), var3.i()));
      }
   }

   public void N(class06581 var1) {
      if (var1.N(this.u)) {
         y(var1);
         this.N.add(class06510.method_8101(var1));
      }
   }

   public void N(class03556<class06525> var1, class06581 var2, class03556<class06525> var3) {
      if (((class06525)var1.N()).N(this.u) && var2.N(this.u) && ((class06525)var3.N()).N(this.u)) {
         this.y.add(new class10583<>(var1, class06510.method_8101(var2), var3));
      }
   }

   public void registerPotionRecipe(class03556 var1, class06510 var2, class03556 var3) {
      if (((class06525)var1.N()).N(this.u) && ((class06525)var3.N()).N(this.u)) {
         this.y.add(new class10583<>(var1, var2, var3));
      }
   }

   public void registerItemRecipe(class06581 var1, class06510 var2, class06581 var3) {
      if (var1.N(this.u) && var3.N(this.u)) {
         y(var1);
         y(var3);
         this.L.add(new class10583<>(var1.i(), var2, var3.i()));
      }
   }

   public void registerRecipes(class06510 var1, class03556 var2) {
      if (((class06525)var2.N()).N(this.u)) {
         this.registerPotionRecipe(class06506.N, var1, class06506.y);
         this.registerPotionRecipe(class06506.u, var1, var2);
      }
   }

   public class03767 getEnabledFeatures() {
      return this.u;
   }
}
