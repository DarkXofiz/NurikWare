package NurikWare;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.List;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00625;
import minecraft.class00891;
import minecraft.class00903;
import minecraft.class04105;
import minecraft.class04206;
import minecraft.class05194;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class07027;
import minecraft.class07686;
import minecraft.class07689;

public class class10854 extends class10742 {
   public Object N_0;

   private static void L() {
   }

   private int M() {
      this.Z();
      if (((BlockESP)this.N_0).m().isEmpty()) {
         class11303.y(class11921.N("blockesp.empty-list").N(class06541.field_1080));
         return 0;
      } else {
         class11303.y(class11921.N("blockesp.list-header").N(class06541.field_1080));

         for (class11025 class11025 : ((BlockESP)this.N_0).m()) {
            class00625 class00625 = new class00625((Character)class10626.N_1 + "blockesp remove " + class10710.N(class11025.N()));
            class05216 class05216 = class00392.y("[").y(class11921.N("remove")).i("]").N(class06541.field_1061).L(class00405.N.N(class00625));
            class11303.y(class11921.N("blockesp.list-entry").N(class06541.field_1080).i(" (").y(this.N(class11025.N(), class11025.y())).i(") ").y(class05216));
         }

         class11303.y(class11921.N("total", ((BlockESP)this.N_0).m().size()).N(class06541.field_1080));
         return 1;
      }
   }

   public class10854() {
      super();
      this.Z();
      this.N_0 = class11938.u().N();
   }

   static {
      R();
      L();
      i();
      u();
   }

   private void Z() {
   }

   private static void i() {
   }

   private LiteralArgumentBuilder<class07689> U() {
      return (LiteralArgumentBuilder<class07689>)this.N("list").executes(var1 -> this.M());
   }

   private int z() {
      this.Z();
      String s;
      if (((BlockESP)this.N_0).m().isEmpty()) {
         s = "blockesp.empty-list";
      } else {
         ((BlockESP)this.N_0).P();
         s = "blockesp.cleared";
      }

      class11303.y(class11921.N(s).N(class06541.field_1080));
      return 1;
   }

   private static void u() {
   }

   private int u(int var1) {
      this.Z();
      List list = class04206.i.j().filter(var0 -> var0 instanceof class07027).map(var1x -> new class11025(var1x, var1)).toList();
      ((BlockESP)this.N_0).N(list);
      class11303.y(class11921.N("blockesp.added-shulkers", list.size()).N(class06541.field_1080));
      return 1;
   }

   private LiteralArgumentBuilder<class07689> y() {
      return (LiteralArgumentBuilder<class07689>)this.N("clear").executes(var1 -> this.z());
   }

   private LiteralArgumentBuilder<class07689> E() {
      return (LiteralArgumentBuilder<class07689>)this.N("remove").then(this.N("block", new class10710()).executes(var1 -> this.N(class10710.N(var1, "block"))));
   }

   private int N(class00891 var1) {
      this.Z();
      class11025 class11025 = ((BlockESP)this.N_0).y(var1);
      if (class11025 != null && ((BlockESP)this.N_0).N(var1)) {
         class11303.y(class11921.N("blockesp.removed").N(class06541.field_1080).i(" (").y(this.N(var1, class11025.y())).i(")"));
         return 1;
      } else {
         class11303.y(class11921.N("blockesp.not-found", class10710.N(var1)).N(class06541.field_1080));
         return 0;
      }
   }

   private class05216 N(class00891 var1, int var2) {
      return class00392.y(var1.M().getString()).y(class00405.N.N(class05194.N(var2 & 16777215)));
   }

   private int N(class00903 var1, int var2) {
      this.Z();
      class00891 class00891 = var1.N().i();
      ((BlockESP)this.N_0).N(new class11025(class00891, var2));
      class11303.y(class11921.N("blockesp.added").N(class06541.field_1080).i(" (").y(this.N(class00891, var2)).i(")"));
      return 1;
   }

   @Override
   public void N(CommandDispatcher<class07689> var1) {
      var1.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N("blockesp").then(this.W())).then(this.E()))
               .then(this.y()))
            .then(this.U())
      );
   }

   private LiteralArgumentBuilder<class07689> W() {
      return (LiteralArgumentBuilder<class07689>)((LiteralArgumentBuilder)this.N("add")
            .then(
               ((LiteralArgumentBuilder)this.N("shulker").executes(var1 -> this.u(-1)))
                  .then(this.N("color", new class10860()).executes(var1 -> this.u(class10860.N(var1, "color"))))
            ))
         .then(
            ((RequiredArgumentBuilder)this.N("block", new class10747(class07686.N(class04105.N()))).executes(var1 -> this.N(class10747.N(var1, "block"), -1)))
               .then(this.N("color", new class10860()).executes(var1 -> this.N(class10747.N(var1, "block"), class10860.N(var1, "color"))))
         );
   }

   private static void R() {
   }
}
