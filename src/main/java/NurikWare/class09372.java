package NurikWare;

import com.mojang.logging.LogUtils;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00570;
import minecraft.class01099;
import minecraft.class01118;
import minecraft.class04643;
import minecraft.class04763;
import minecraft.class04782;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class07878;
import minecraft.class08057;
import minecraft.class08072;
import minecraft.class08700;
import net.caffeinemc.mods.lithium.common.world.blockentity.SupportCache;
import net.caffeinemc.mods.lithium.common.world.listeners.WorldBorderListenerOnce;

public class class09372<T extends class00394> implements class01099, WorldBorderListenerOnce {
   private final T y;
   private final class01118<T> L;
   private boolean u;
   private byte i;

   public class09372(T var1, class01118<T> var2, class01118 var3) {
      super();
      this.N = var1;
      this.i = 0;
      this.y = (T)var2;
      this.L = var3;
   }

   @Override
   public String toString() {
      return "Level ticker for " + this.method_31706() + "@" + this.method_31705();
   }

   private boolean y(class00570 var1, class07209 var2) {
      if (this.N()) {
         return !(this.N.J() instanceof class04782 class04782) ? true : this.N.g().N(class04763.field_44856) && class04782.method_37116(class07321.N(var2));
      } else {
         return false;
      }
   }

   private void y() {
      this.i = 1;
      class08057 class08057 = this.N.J().method_8621();
      class08057.N(this);
      boolean flag = class08057.y() == class08072.field_12753;
      if (class08057.N(this.method_31705())) {
         if (flag || class08057.y() == class08072.field_12754) {
            this.i = (byte)(this.i | 6);
         }
      } else if (flag || class08057.y() == class08072.field_12756) {
         this.i = (byte)(this.i | 2);
      }
   }

   private class00500 N(class00570 var1, class07209 var2) {
      return this.y.w();
   }

   private boolean N() {
      if (this.i == 0) {
         this.y();
      }

      byte b0 = this.i;
      return (b0 & 3) == 3 ? (b0 & 4) != 0 : this.N.J().method_8621().N(this.method_31705());
   }

   private boolean N(class00404 var1, class00500 var2) {
      return ((SupportCache)this.y).lithium$isSupported();
   }

   public String method_31706() {
      return class00404.method_11033(this.y.O()).toString();
   }

   public class07209 method_31705() {
      return this.y.d();
   }

   public boolean method_31704() {
      return this.y.k();
   }

   public void method_31703() {
      if (!this.y.k() && this.y.l()) {
         class07209 class07209 = this.y.d();
         class00570 var5 = this.N;
         if (this.y(var5, class07209)) {
            try {
               class04643 class04643 = class08700.N();
               class04643.N(this::method_31706);
               var5 = this.N;
               class00500 class00500 = this.N(var5, class07209);
               class00404<?> class00404 = this.y.O();
               if (this.N(class00404, class00500)) {
                  this.L.tick(this.N.m, this.y.d(), class00500, this.y);
                  this.u = false;
               } else if (!this.u) {
                  this.u = true;
                  class00570.W
                     .warn(
                        "Block entity {} @ {} state {} invalid for ticking:",
                        new Object[]{LogUtils.defer(this::method_31706), LogUtils.defer(this::method_31705), class00500}
                     );
               }

               class04643.L();
            } catch (Throwable throwable) {
               class07080 class07080 = class07080.N(throwable, "Ticking block entity");
               class07074 class07074 = class07080.N("Block entity being ticked");
               this.y.N(class07074);
               throw new class07878(class07080);
            }
         }
      }
   }

   public void lithium$onWorldBorderShapeChange(class08057 var1) {
      this.i = 0;
   }
}
