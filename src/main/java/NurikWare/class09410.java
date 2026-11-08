package NurikWare;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import minecraft.class00405;
import minecraft.class00625;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class07689;

public class class09410 extends class10742 {
   private int L() {
      class11303.y(class11921.N("bind.cleared").N(class06541.field_1080));

      for (class11067 class11067 : class11938.u().NN()) {
         if (!class11067.R().B()) {
            this.N(class11067, false);
         }
      }

      return 1;
   }

   public class09410() {
      super();
   }

   static {
      i();
   }

   private LiteralArgumentBuilder<class07689> B() {
      return (LiteralArgumentBuilder<class07689>)this.N("clear").executes(var1 -> this.L());
   }

   private LiteralArgumentBuilder<class07689> Z() {
      return (LiteralArgumentBuilder<class07689>)this.N("add")
         .then(
            this.N("module", new class10733())
               .then(
                  ((RequiredArgumentBuilder)this.N("key", new class09382())
                        .executes(var1 -> this.N(class10733.N(var1, "module"), class09382.N(var1, "key"), class09045.TOGGLE)))
                     .then(
                        this.N("type", new class10794())
                           .executes(var1 -> this.N(class10733.N(var1, "module"), class09382.N(var1, "key"), class10794.N(var1, "type")))
                     )
               )
         );
   }

   private static void i() {
   }

   private LiteralArgumentBuilder<class07689> u() {
      return (LiteralArgumentBuilder<class07689>)this.N("remove")
         .then(this.N("module", new class10642()).executes(var1 -> this.N(class10733.N(var1, "module"), true)));
   }

   private LiteralArgumentBuilder<class07689> y() {
      return (LiteralArgumentBuilder<class07689>)this.N("list").executes(var1 -> this.R());
   }

   private int N(class11067 var1, boolean var2) {
      var1.N(class12002.UNKNOWN, 0, class09045.TOGGLE, true);
      if (var2) {
         class11303.y(class11921.N("bind.removed", class06541.field_1068 + var1.N() + class06541.field_1080).N(class06541.field_1080));
      }

      return 1;
   }

   @Override
   public void N(CommandDispatcher<class07689> var1) {
      var1.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N("bind").then(this.Z())).then(this.u()))
               .then(this.y()))
            .then(this.B())
      );
   }

   private int N(class11067 var1, class12002 var2, class09045 var3) {
      var1.N(var2, 0, var3, var1.R().N());
      class11303.y(
         class11921.N(
               "bind.added",
               class06541.field_1068 + var2.u() + class06541.field_1080,
               class06541.field_1068 + var1.N() + class06541.field_1080,
               class06541.field_1068 + var3.N().toUpperCase() + class06541.field_1080
            )
            .N(class06541.field_1080)
      );
      return 1;
   }

   private int R() {
      boolean flag = true;

      for (class11067 class11067 : class11938.u().NN()) {
         if (!class11067.R().B()) {
            class00625 class00625 = new class00625((Character)class10626.N_1 + "bind remove " + class11067.N());
            class05216 class05216 = class11921.N("remove").N(class06541.field_1061).L(class00405.N.N(class00625));
            Object object = class11067.R().z();
            class11303.y(
               class11921.N(
                     "bind.list-entry",
                     class06541.field_1068 + class11067.N() + class06541.field_1080,
                     class06541.field_1068 + object + class06541.field_1080,
                     class06541.field_1068 + class11067.R().i().N().toUpperCase() + class06541.field_1080
                  )
                  .N(class06541.field_1080)
                  .i(" ")
                  .y(class05216)
            );
            flag = false;
         }
      }

      if (flag) {
         class11303.y(class11921.N("bind.empty-list").N(class06541.field_1080));
      }

      return 1;
   }
}
