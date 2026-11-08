package NurikWare;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.serialization.JsonOps;
import java.util.Arrays;
import minecraft.class00392;
import minecraft.class03748;
import minecraft.class06202;
import minecraft.class06889;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public record class11408(class11405 client, class11410 connection) implements class09263, class09285 {
   public static Object L_0 = LogManager.getLogger(String.class);
   public static Object L_1 = class06202.Nq();
   public static Object L_2 = new class11843();

   public class11405 L() {
      return this.client;
   }


   static {
      Z();
   }

   private static void Z() {
      L_0 = null;
      L_1 = null;
      L_2 = null;
   }

   public class11410 u() {
      return this.connection;
   }

   @Override
   public void y() {
   }

   @Override
   public void N(class09290 var1) {
   }

   @Override
   public boolean N() {
      return this.connection.N();
   }

   @Override
   public void N(class09299 var1) {
      ((class06202)L_1).execute(() -> class11938.T().N(var1.N()));
   }

   @Override
   public void N(class09274 var1) {
      ((class06202)L_1).execute(() -> class11938.I().N(var1));
   }

   @Override
   public void N(class09256 var1) {
      ((class06202)L_1).execute(() -> class11938.J().N(var1));
   }

   @Override
   public void N(class09289 var1) {
      JsonElement jsonelement = JsonParser.parseString(var1.N());
      class11303.N((class11287)class11311.N_0, (class00392)class03748.N.parse(JsonOps.INSTANCE, jsonelement).getOrThrow());
   }

   @Override
   public void N(class09278 var1) {
      ((class06202)L_1).execute(() -> {
         String[] astring = var1.y().split("\\.");
         if (astring.length != 0) {
            class11901.N(astring[0]).ifPresent(class11886::N);
         }
      });
   }

   @Override
   public void N(class09298 var1) {
      ((class06202)L_1).execute(() -> {
         class09345 class09345 = class11938.N();
         if (class09345.y(var1.u())) {
            class09345.N(var1.u(), var1.i(), var1.L(), var1.N(), var1.y());
         }
      });
   }

   @Override
   public void N(class09283 var1) {
      ((class06202)L_1).execute(() -> class11938.d().N(var1));
   }

   @Override
   public void N(class09296 var1) {
   }

   @Override
   public void N(class09286 var1) {
      ((class06202)L_1)
         .execute(() -> class11938.E().N(new class11483(var1.i(), var1.y(), new class06889(var1.u(), var1.N(), var1.L()), class11910.L(), var1.R())));
   }

   @Override
   public void N(class09255 var1) {
      ((class06202)L_1).execute(() -> class11351.N(var1.N()));
   }

   @Override
   public void N(class09257 var1) {
      ((class06202)L_1).execute(() -> class11922.N(var1.N()));
   }

   @Override
   public void N(class09266 var1) {
      ((class06202)L_1).execute(() -> class11938.N().N(var1.N()));
   }

   @Override
   public void N(class09280 var1) {
      ((class06202)L_1).execute(() -> this.client.E().addAll(Arrays.asList(var1.N())));
   }

   @Override
   public void N(class09273 var1) {
      this.connection.N(new class11978(var1.N()));
   }

   @Override
   public void N(class09271 var1) {
      ((Logger)L_0).error(var1.N());
      class11303.N((class11287)class11311.N_0, var1.N());
      class06202.Nq().execute(() -> class11938.N().L());
      this.connection.u();
      class11938.z().m();
   }

   @Override
   public void N(class09270 var1) {
      class11940 class11940 = var1.N();
      byte b0 = var1.y();
      class11448 class11448 = ((class11843)L_2).N(b0);
      if (class11448 != null) {
         if (class11448.y()) {
            class11448.N(class11940);
         } else {
            class11940.W().retain();
            ((class06202)L_1).execute(() -> {
               try {
                  class11448.N(class11940);
               } finally {
                  class11940.s();
               }
            });
         }
      }
   }
}
