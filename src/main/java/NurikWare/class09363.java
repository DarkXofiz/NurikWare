package NurikWare;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.tree.LiteralCommandNode;
import minecraft.class00405;
import minecraft.class00625;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class07689;

public class class09363 extends class10742 {
   public Object N_0;

   private int L() {
      this.R();
      if (((class09327)this.N_0).y().isEmpty()) {
         class11303.y(class11921.N("friend.empty-list").N(class06541.field_1080));
         return 0;
      } else {
         class11303.y(class11921.N("friend.list-header").N(class06541.field_1080));

         for (class09332 class09332 : ((class09327)this.N_0).y()) {
            class00625 class00625 = new class00625((Character)class10626.N_1 + "friend remove " + class09332.y());
            class05216 class05216 = class11921.N("remove").N(class06541.field_1061).L(class00405.N.N(class00625));
            class11303.y(
               class11921.N(
                     "friend.list-entry",
                     class06541.field_1068 + class09332.y() + class06541.field_1080,
                     class06541.field_1068 + class11480.N(class09332.N()) + class06541.field_1080
                  )
                  .N(class06541.field_1061)
                  .i(" ")
                  .y(class05216)
            );
         }

         class11303.y(class11921.N("total", ((class09327)this.N_0).y().size()).N(class06541.field_1080));
         return 1;
      }
   }

   public class09363() {
      super();
      this.R();
      this.N_0 = class11938.t();
   }

   static {
      u();
      y();
   }

   private LiteralArgumentBuilder<class07689> B() {
      return (LiteralArgumentBuilder<class07689>)this.N("remove").then(this.N("name", new class10773()).executes(var1 -> this.N(class10773.N(var1, "name"))));
   }

   private LiteralArgumentBuilder<class07689> Z() {
      return (LiteralArgumentBuilder<class07689>)this.N("list").executes(var1 -> this.L());
   }

   private int i() {
      this.R();
      String s;
      if (((class09327)this.N_0).y().isEmpty()) {
         s = "friend.empty-list";
      } else {
         ((class09327)this.N_0).N();
         s = "friend.cleared";
      }

      class11303.y(class11921.N(s).N(class06541.field_1080));
      return 1;
   }

   private LiteralArgumentBuilder<class07689> U() {
      return (LiteralArgumentBuilder<class07689>)this.N("clear").executes(var1 -> this.i());
   }

   private LiteralArgumentBuilder<class07689> z() {
      return (LiteralArgumentBuilder<class07689>)this.N("add").then(this.N("name", new class09401()).executes(var1 -> this.G(class10742.N(var1, "name"))));
   }

   private static void u() {
   }

   private static void y() {
   }

   private int N(class09332 var1) {
      this.R();
      Object object = var1.y();
      ((class09327)this.N_0).y((String)object);
      class11303.y(class11921.N("friend.removed", class06541.field_1068 + object + class06541.field_1080).N(class06541.field_1080));
      return 1;
   }

   @Override
   public void N(CommandDispatcher<class07689> var1) {
      LiteralCommandNode literalcommandnode = var1.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N("friend").then(this.z())).then(this.B()))
               .then(this.Z()))
            .then(this.U())
      );
      var1.register((LiteralArgumentBuilder)this.N("fr").redirect(literalcommandnode));
   }

   private void R() {
   }

   private int G(String var1) {
      this.R();
      String s;
      if (((class09327)this.N_0).N((String)var1, System.currentTimeMillis())) {
         s = "friend.added";
      } else {
         s = "friend.exists";
      }

      class11303.y(class11921.N(s, class06541.field_1068 + var1 + class06541.field_1080).N(class06541.field_1080));
      return 1;
   }
}
