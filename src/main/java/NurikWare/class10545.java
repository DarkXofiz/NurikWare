package NurikWare;

import com.google.common.collect.Lists;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.Iterator;
import java.util.List;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01285;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class03434;
import minecraft.class04589;
import minecraft.class04654;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05484;
import minecraft.class05731;
import minecraft.class06134;
import minecraft.class06276;
import minecraft.class06366;
import minecraft.class06478;
import minecraft.class06541;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class class10545 extends class05484 {
   private static final int L = 60;
   private final class01894 u;
   protected final List<class06478> N;
   private final class06366<Boolean> i;
   private final class06366<Boolean> R;
   private final class06366<Boolean> M;
   private final String B;
   private final boolean Z;

   public class10545(class04589 var1, class01894 var2) {
      super();
      this.y = var1;
      this.N = Lists.newArrayList();
      this.u = var2;
      class01285 class01285 = class06134.N(var2);
      this.Z = class01285 != null && class01285.method_72753(class04589.y(var1).h());
      Object object = this.N(var2, (Operation)(var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 1, "[net.minecraft.class_2960]");
         return ((class01894)var0[0]).N();
      }));
      if (this.Z) {
         this.B = (String)object;
      } else {
         this.B = class06541.field_1056 + object;
      }

      this.i = class06366.N(class04589.N.L().y(-2142128), class04589.N.L().y(-4539718), false)
         .N()
         .N_57(this::N)
         .N(10, 5, 60, 16, class00392.y((String)object), (var2x, var3x) -> this.N(var2, class06276.field_61593));
      this.R = class06366.N(class04589.y.L().y(-171), class04589.y.L().y(-4539718), false)
         .N()
         .N_57(this::N)
         .N(10, 5, 60, 16, class00392.y((String)object), (var2x, var3x) -> this.N(var2, class06276.field_61594));
      this.M = class06366.N(class04589.L.L().y(-1), class04589.L.L().y(-4539718), false)
         .N()
         .N_57(this::N)
         .N(10, 5, 60, 16, class00392.y((String)object), (var2x, var3x) -> this.N(var2, class06276.field_61595));
      this.N.add(this.M);
      this.N.add(this.R);
      this.N.add(this.i);
      this.N();
   }

   public void N() {
      class06276 class06276 = ((class05731)class04589.R(this.y).L_0).N(this.u);
      this.i.N(class06276 == class06276.field_61593);
      this.R.N(class06276 == class06276.field_61594);
      this.M.N(class06276 == class06276.field_61595);
      this.i.field_22763 = !(Boolean)this.i.y();
      this.R.field_22763 = !(Boolean)this.R.y();
      this.M.field_22763 = !(Boolean)this.M.y();
   }

   private String N(class01894 var1, Operation var2) {
      return !"minecraft".equals(var1.y()) ? var1.toString() : (String)var2.call(new Object[]{var1});
   }

   private class05216 N(class06366<Boolean> var1) {
      return class05220.N(
         class00392.N("debug.entry.currently." + ((class05731)class04589.L(this.y).L_0).N(this.u).method_15434(), new Object[]{this.B}), var1.method_25369()
      );
   }

   private void N(class01894 var1, class06276 var2) {
      ((class05731)class04589.u(this.y).L_0).N(var1, var2);
      Iterator<class05362> iterator = this.y.R.iterator();

      while (iterator.hasNext()) {
         iterator.next().field_22763 = true;
      }

      this.N();
   }

   public List<? extends class04654> method_25396() {
      return this.N;
   }

   public List<? extends class03434> method_37025() {
      return this.N;
   }

   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      int ix = this.method_73380();
      int j = this.method_73382();
      var1.y((class01590)class04589.i(this.y).i_3, this.B, ix, j + 5, this.Z ? -1 : -8355712);
      int k = ix + this.method_73387() - this.M.method_25368() - this.R.method_25368() - this.i.method_25368();
      if (!this.Z && var4 && var2 < k) {
         var1.N(class04589.u, var2, var3);
      }

      this.M.method_46421(k);
      this.R.method_46421(this.M.method_46426() + this.M.method_25368());
      this.i.method_46421(this.R.method_46426() + this.R.method_25368());
      this.i.method_46419(j);
      this.R.method_46419(j);
      this.M.method_46419(j);
      this.i.method_25394(var1, var2, var3, var5);
      this.R.method_25394(var1, var2, var3, var5);
      this.M.method_25394(var1, var2, var3, var5);
   }
}
