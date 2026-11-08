package NurikWare;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.tree.LiteralCommandNode;
import minecraft.class00891;
import minecraft.class00903;
import minecraft.class04105;
import minecraft.class06541;
import minecraft.class07686;
import minecraft.class07689;

public class class09373 extends class10742 {
   public Object N_0;

   private static void L() {
   }

   private LiteralArgumentBuilder<class07689> M() {
      return (LiteralArgumentBuilder<class07689>)this.N("remove").then(this.N("block", new class09404()).executes(var1 -> this.N(class09404.N(var1, "block"))));
   }

   public class09373() {
      super();
      this.B();
      this.N_0 = class11938.u().b();
   }

   static {
      u();
      L();
   }

   private void B() {
   }

   private int i() {
      this.B();
      String s;
      if (((Nuker)this.N_0).m().isEmpty()) {
         s = "nuker.empty-list";
      } else {
         ((Nuker)this.N_0).P();
         s = "nuker.cleared";
      }

      class11303.y(class11921.N(s).N(class06541.field_1080));
      return 1;
   }

   private LiteralArgumentBuilder<class07689> U() {
      return (LiteralArgumentBuilder<class07689>)this.N("add")
         .then(this.N("block", new class10747(class07686.N(class04105.N()))).executes(var1 -> this.N(class10747.N(var1, "block"))));
   }

   private int z() {
      this.B();
      if (((Nuker)this.N_0).m().isEmpty()) {
         class11303.y(class11921.N("nuker.empty-list").N(class06541.field_1080));
         return 0;
      } else {
         class11303.y(class11921.N("nuker.list-header").N(class06541.field_1080));

         for (class00891 class00891 : ((Nuker)this.N_0).m()) {
            class11303.y(
               class11921.N("nuker.list-entry", class06541.field_1068 + class00891.M().getString() + class06541.field_1080).N(class06541.field_1061).i(" ")
            );
         }

         class11303.y(class11921.N("total", ((Nuker)this.N_0).m().size()).N(class06541.field_1080));
         return 1;
      }
   }

   private static void u() {
   }

   private LiteralArgumentBuilder<class07689> y() {
      return (LiteralArgumentBuilder<class07689>)this.N("list").executes(var1 -> this.z());
   }

   private int N(class00891 var1) {
      this.B();
      Object object = var1.M().getString();
      if (!((Nuker)this.N_0).y(var1)) {
         class11303.y(class11921.N("nuker.not-found", class06541.field_1068 + object + class06541.field_1080).N(class06541.field_1080));
         return 0;
      } else {
         class11303.y(class11921.N("nuker.removed", class06541.field_1068 + object + class06541.field_1080).N(class06541.field_1080));
         return 1;
      }
   }

   private int N(class00903 var1) {
      this.B();
      class00891 class00891 = var1.N().i();
      Object object = class00891.M().getString();
      class11303.y(
         class11921.N(((Nuker)this.N_0).N(class00891) ? "nuker.added" : "nuker.exists", class06541.field_1068 + object + class06541.field_1080)
            .N(class06541.field_1080)
      );
      return 1;
   }

   @Override
   public void N(CommandDispatcher<class07689> var1) {
      LiteralCommandNode literalcommandnode = var1.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N("nuker").then(this.U())).then(this.M()))
               .then(this.R()))
            .then(this.y())
      );
      var1.register((LiteralArgumentBuilder)this.N("nuk").redirect(literalcommandnode));
   }

   private LiteralArgumentBuilder<class07689> R() {
      return (LiteralArgumentBuilder<class07689>)this.N("clear").executes(var1 -> this.i());
   }
}
