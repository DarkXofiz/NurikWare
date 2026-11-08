package NurikWare;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import minecraft.class06541;
import minecraft.class07689;

public class class10874 extends class10742 {
   public Object N_0;
   public static Object u_0;

   private int L(int var1) {
      if (!this.N()) {
         return 1;
      } else {
         ((class11472)class11938.L_2).L(var1);
         this.N(class11847.N());
         class11303.y(class11921.N("irc.prefix.installed").N(class06541.field_1080));
         return 1;
      }
   }

   private void L() {
   }

   private static void M() {
   }

   private static void T() {
      u_0 = 3000;
   }

   public class10874() {
      super();
      this.L();
      this.N_0 = new class11467();
   }

   static {
      y();
      M();
      B();
      T();
   }

   private static void B() {
   }

   private boolean i() {
      this.L();
      return ((class11467)this.N_0).N(3000L) || class11828.HELPER.N(((class11472)class11938.L_2).i());
   }

   private RequiredArgumentBuilder<class07689, String> s() {
      return (RequiredArgumentBuilder<class07689, String>)this.N("text", new class10843()).executes(var1 -> this.v(class10742.N(var1, "text")));
   }

   private LiteralArgumentBuilder<class07689> m() {
      return (LiteralArgumentBuilder<class07689>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N("prefix")
               .then(
                  ((LiteralArgumentBuilder)this.N("list").executes(var1 -> this.N(0)))
                     .then(this.N("page", IntegerArgumentType.integer(0)).executes(var1 -> this.N(IntegerArgumentType.getInteger(var1, "page"))))
               ))
            .then(this.N("reset").executes(var1 -> this.u())))
         .then(this.N("set").then(this.N("index", IntegerArgumentType.integer(0)).executes(var1 -> this.L(IntegerArgumentType.getInteger(var1, "index")))));
   }

   private int v(String var1) {
      this.L();
      if (!this.N()) {
         return 1;
      } else if (this.i()) {
         String s = var1.trim();
         this.N(new class11958(class11966.staticFields_0090476987a34349fa0f33a04d59e77da_0, s));
         ((class11467)this.N_0).N();
         return 1;
      } else {
         this.E();
         return 1;
      }
   }

   private LiteralArgumentBuilder<class07689> z() {
      return (LiteralArgumentBuilder<class07689>)((LiteralArgumentBuilder)this.N("unmute")
            .requires(var0 -> class11828.HELPER.N(((class11472)class11938.L_2).i())))
         .then(this.N("login", StringArgumentType.word()).executes(var1 -> this.O(StringArgumentType.getString(var1, "login"))));
   }

   private int u() {
      if (!this.N()) {
         return 1;
      } else {
         if (((class11472)class11938.L_2).L() != -1) {
            ((class11472)class11938.L_2).L(-1);
            this.N(class11847.N());
            class11303.y(class11921.N("irc.prefix.cleared").N(class06541.field_1080));
         } else {
            class11303.y(class11921.N("irc.prefix.already").N(class06541.field_1080));
         }

         return 1;
      }
   }

   private static void y() {
   }

   private void E() {
      this.L();
      long i = 3000L - ((class11467)this.N_0).y();
      if (i < 0L) {
         i = 0L;
      }

      float f = class11908.N((float)i / 1000.0F, 0.1F);
      f = Math.max(0.0F, f);
      class11303.y(class11921.N("irc.wait-before-send", f).N(class06541.field_1080));
   }

   private int N(int var1) {
      if (!this.N()) {
         return 1;
      } else {
         this.N(new class11983(var1));
         return 1;
      }
   }

   @Override
   public void N(CommandDispatcher<class07689> var1) {
      LiteralArgumentBuilder<class07689> literalargumentbuilder = (LiteralArgumentBuilder<class07689>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N(
                     "irc"
                  )
                  .requires(var0 -> class11938.u().K().U()))
               .then(this.s()))
            .then(this.R()))
         .then(this.m());
      if (class11828.HELPER.N(((class11472)class11938.L_2).i())) {
         ((LiteralArgumentBuilder)literalargumentbuilder.then(this.W())).then(this.z());
      }

      var1.register(literalargumentbuilder);
   }

   private void N(class11951<class09276> var1) {
      class11938.z().N(var1);
   }

   private int N(String var1, int var2, String var3) {
      if (!this.N()) {
         return 1;
      } else {
         this.N(new class11984(var1, var3, var2));
         return 1;
      }
   }

   private int N(String var1, String var2) {
      this.L();
      if (!this.N()) {
         return 1;
      } else if (var1.equalsIgnoreCase(((class11472)class11938.L_2).Z())) {
         class11303.y(class11921.N("irc.self").N(class06541.field_1080));
         return 1;
      } else if (this.i()) {
         this.N(new class11974(var1, var2));
         ((class11467)this.N_0).N();
         return 1;
      } else {
         this.E();
         return 1;
      }
   }

   private LiteralArgumentBuilder<class07689> W() {
      return (LiteralArgumentBuilder<class07689>)((LiteralArgumentBuilder)this.N("mute")
            .requires(var0 -> class11828.HELPER.N(((class11472)class11938.L_2).i())))
         .then(
            this.N("login", new class10863())
               .then(
                  this.N("time", new class10674())
                     .then(
                        this.N("reason", new class09406())
                           .executes(var1 -> this.N(class10742.N(var1, "login"), IntegerArgumentType.getInteger(var1, "time"), class10742.N(var1, "reason")))
                     )
               )
         );
   }

   private LiteralArgumentBuilder<class07689> R() {
      return (LiteralArgumentBuilder<class07689>)this.N("dm")
         .then(
            this.N("login", new class10863())
               .then(
                  this.N("message", StringArgumentType.greedyString())
                     .executes(var1 -> this.N(class10742.N(var1, "login"), StringArgumentType.getString(var1, "message")))
               )
         );
   }

   private int O(String var1) {
      if (!this.N()) {
         return 1;
      } else {
         this.N(new class11971(var1));
         return 1;
      }
   }
}
