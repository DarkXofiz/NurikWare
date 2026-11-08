package NurikWare;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import minecraft.class07689;
import org.joml.Vector3d;

public class class10675 extends class10742 {
   private int w(String var1) {
      if (!this.N()) {
         return 1;
      } else {
         this.N(new class11945(class11976.staticFields_1cd5d92a0fca835abb2e9f33e73c81193_2, var1));
         return 1;
      }
   }

   private int L() {
      if (!this.N()) {
         return 1;
      } else {
         this.N(new class11945(class11976.staticFields_0cd5d92a0fca835abb2e9f33e73c81193_3, ((class11472)class11938.L_2).Z()));
         class11938.N().L();
         return 1;
      }
   }

   private LiteralArgumentBuilder<class07689> M() {
      return (LiteralArgumentBuilder<class07689>)this.N("join").then(this.N("code", class10761.N(4, 4)).executes(var1 -> this.M(class10742.N(var1, "code"))));
   }

   private int M(String var1) {
      if (!this.N()) {
         return 1;
      } else {
         this.N(new class11945(class11976.staticFields_1cd5d92a0fca835abb2e9f33e73c81193_1, var1));
         return 1;
      }
   }

   private int T() {
      if (!this.N()) {
         return 1;
      } else {
         this.N(new class11945(class11976.staticFields_1cd5d92a0fca835abb2e9f33e73c81193_3, ""));
         return 1;
      }
   }

   public class10675() {
      super();
   }

   static {
      E();
      i();
   }

   private LiteralArgumentBuilder<class07689> B() {
      return (LiteralArgumentBuilder<class07689>)this.N("invite").then(this.N("user", new class10863()).executes(var1 -> this.t(class10742.N(var1, "user"))));
   }

   private LiteralArgumentBuilder<class07689> Z() {
      return (LiteralArgumentBuilder<class07689>)((LiteralArgumentBuilder)this.N("accept").executes(var1 -> this.w("")))
         .then(this.N("code", class10761.N(4, 4)).executes(var1 -> this.w(class10742.N(var1, "code"))));
   }

   private int Z(String var1) {
      if (!this.N()) {
         return 1;
      } else {
         var1 = var1.trim();
         this.N(new class11958(class11966.staticFields_0090476987a34349fa0f33a04d59e77da_1, var1));
         return 1;
      }
   }

   private static void i() {
   }

   private LiteralArgumentBuilder<class07689> s() {
      return (LiteralArgumentBuilder<class07689>)this.N("kick").then(this.N("user", new class10863()).executes(var1 -> this.G(class10742.N(var1, "user"))));
   }

   private RequiredArgumentBuilder<class07689, String> m() {
      return (RequiredArgumentBuilder<class07689, String>)this.N("text", new class10843()).executes(var1 -> this.Z(class10742.N(var1, "text")));
   }

   private int t(String var1) {
      if (!this.N()) {
         return 1;
      } else {
         this.N(new class11945(class11976.staticFields_0cd5d92a0fca835abb2e9f33e73c81193_1, var1));
         return 1;
      }
   }

   private LiteralArgumentBuilder<class07689> j() {
      return (LiteralArgumentBuilder<class07689>)this.N("info").executes(var1 -> this.y());
   }

   private LiteralArgumentBuilder<class07689> U() {
      return (LiteralArgumentBuilder<class07689>)this.N("leave").executes(var1 -> this.L());
   }

   private LiteralArgumentBuilder<class07689> z() {
      return (LiteralArgumentBuilder<class07689>)this.N("decline").executes(var1 -> this.T());
   }

   private int u() {
      if (!this.N()) {
         return 1;
      } else {
         this.N(new class11945(class11976.staticFields_0cd5d92a0fca835abb2e9f33e73c81193_0, ((class11472)class11938.L_2).Z()));
         return 1;
      }
   }

   private int y() {
      if (!this.N()) {
         return 1;
      } else {
         this.N(new class11945(class11976.staticFields_1cd5d92a0fca835abb2e9f33e73c81193_4, ((class11472)class11938.L_2).Z()));
         return 1;
      }
   }

   private static void E() {
   }

   private void N(class11951<class09276> var1) {
      class11938.z().N(var1);
   }

   @Override
   public void N(CommandDispatcher<class07689> var1) {
      var1.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N(
                                             "party"
                                          )
                                          .then(this.N("create").executes(var1x -> this.u())))
                                       .then(this.B()))
                                    .then(this.U()))
                                 .then(this.m()))
                              .then(((RequiredArgumentBuilder)this.N("pos", new class09387()).executes(var1x -> {
                                 Vector3d vector3d = class09387.N(var1x, "pos");
                                 return this.Z("%s %s %s ".formatted(vector3d.x(), vector3d.y(), vector3d.z()));
                              })).then(this.m().executes(var1x -> {
                                 Vector3d vector3d = class09387.N(var1x, "pos");
                                 return this.Z("%s %s %s ".formatted(vector3d.x(), vector3d.y(), vector3d.z()) + class10742.N(var1x, "text"));
                              }))))
                           .then(this.M()))
                        .then(this.Z()))
                     .then(this.z()))
                  .then(this.s()))
               .then(this.R()))
            .then(this.j())
      );
   }

   private int W() {
      if (!this.N()) {
         return 1;
      } else {
         this.N(new class11945(class11976.staticFields_1cd5d92a0fca835abb2e9f33e73c81193_0, ((class11472)class11938.L_2).Z()));
         class11938.N().L();
         return 1;
      }
   }

   private LiteralArgumentBuilder<class07689> R() {
      return (LiteralArgumentBuilder<class07689>)this.N("disband").executes(var1 -> this.W());
   }

   private int G(String var1) {
      if (!this.N()) {
         return 1;
      } else {
         this.N(new class11945(class11976.staticFields_0cd5d92a0fca835abb2e9f33e73c81193_2, var1));
         return 1;
      }
   }
}
