package NurikWare;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class class11222 implements Closeable {
   private static String[] L;
   private static String[] u;
   private static String[] R;
   private static String[] B;
   private static String[] j;
   private static String[] d;
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public boolean N_init;
   public static Object y_0;
   public static Object y_1;
   public static Object y_2;
   public static Object y_3;
   public static Object y_4 = Pattern.compile(u[3]);
   public static Object y_5;

   public CompletableFuture<String> L() {
      return (CompletableFuture<String>)this.N_2;
   }

   public class11222() {
      super();
      this.E();
      this.N_2 = new CompletableFuture();

      try {
         this.N_0 = HttpServer.create();
         SecureRandom securerandom = SecureRandom.getInstanceStrong();
         int i = securerandom.nextInt(96, 128);
         StringBuilder stringbuilder = new StringBuilder(i);

         for (int jx = 0; jx < i; jx++) {
            stringbuilder.append(L[0].charAt(securerandom.nextInt(L[1].length())));
         }

         this.N_1 = stringbuilder.toString();
      } catch (Throwable throwable) {
         throw new class11001(L[2], L[3], throwable);
      }
   }

   static {
      i();
      B();
      int[] aint = new int[]{
         59125,
         59126,
         59127,
         59128,
         59129,
         59130,
         59131,
         59132,
         59133,
         59134,
         59135,
         1234,
         1235,
         1236,
         1237,
         80,
         8080,
         19364,
         19365,
         19366,
         27930,
         27931,
         27932,
         27933,
         27934,
         42069
      };
      y_0 = aint;
   }

   private static void B() {
      y_1 = u[4];
      y_2 = u[5];
      y_3 = u[6];
      y_5 = u[7];
   }

   private static void i() {
      L = new String[4];
      L[0] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789.-_";
      L[1] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789.-_";
      L[2] = "account.modal.microsoft.error.generic";
      L[3] = "Unable to create auth server.";
      B = new String[7];
      B[0] = "/";
      B[1] = "account.modal.microsoft.error.generic";
      B[2] = "Empty redirect query.";
      B[3] = "access_denied";
      B[4] = "account.modal.microsoft.error.cancelled";
      B[5] = "User cancelled.";
      B[6] = "account.modal.microsoft.error.generic";
      R = new String[2];
      R[0] = "Malformed redirect.";
      R[1] = "account.modal.microsoft.error.generic";
      d = new String[2];
      d[0] = "State mismatch.";
      d[1] = "localhost";
      j = new String[2];
      j[0] = "account.modal.microsoft.error.generic";
      j[1] = "Unable to bind any port.";
      u = new String[8];
      u[0] = "<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <title>NurikWare</title>\n</head>\n<body style=\"margin:0;height:100vh;display:flex;flex-direction:column;align-items:center;justify-content:center;text-align:center;background:#111;color:#eee;font-family:sans-serif\">\n    <h1 style=\"margin:0 0 12px;font-size:28px\">&#10003; Signed in to Microsoft</h1>\n    <p style=\"margin:0;color:#aaa;font-size:16px\">Your account is now signed in.<br>\n    You can close this tab and return to Minecraft.</p>\n</body>\n</html>\n";
      u[1] = "Content-Type";
      u[2] = "text/html; charset=UTF-8";
      u[3] = "code=([^&]*)&state=([^&]*)";
      u[4] = "/in_game_account_switcher_long_enough_uri_to_prevent_accidental_leaks_on_screensharing_even_if_you_have_like_extremely_big_screen_though_it_might_not_mork_but_we_will_try_it_anyway_to_prevent_funny_things_from_happening_or_something";
      u[5] = "https://login.live.com/oauth20_authorize.srf?client_id=54fd49e4-2103-4044-9603-2b028c814ec3&response_type=code&scope=XboxLive.signin%20XboxLive.offline_access&prompt=select_account";
      u[6] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789.-_";
      u[7] = "<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <title>NurikWare</title>\n</head>\n<body style=\"margin:0;height:100vh;display:flex;flex-direction:column;align-items:center;justify-content:center;text-align:center;background:#111;color:#eee;font-family:sans-serif\">\n    <h1 style=\"margin:0 0 12px;font-size:28px\">&#10003; Signed in to Microsoft</h1>\n    <p style=\"margin:0;color:#aaa;font-size:16px\">Your account is now signed in.<br>\n    You can close this tab and return to Minecraft.</p>\n</body>\n</html>\n";
   }

   @Override
   public void close() {
      ((HttpServer)this.N_0).stop(0);
   }

   private void z() {
      IOException ioexception = null;

      for (int i : (int[])y_0) {
         try {
            ((HttpServer)this.N_0).bind(new InetSocketAddress(d[1], i), 0);
            this.N_3 = i;
            return;
         } catch (IOException ioexception1) {
            ioexception = ioexception1;
         }
      }

      throw new class11001(j[0], j[1], ioexception);
   }

   public void u() {
      this.z();
      ((HttpServer)this.N_0).createContext(B[0], var1 -> {
         try {
            if ((Boolean)this.N_4 || !var1.getRemoteAddress().getAddress().isLoopbackAddress()) {
               var1.close();
               return;
            }

            this.N_4 = true;
            String s = var1.getRequestURI().getQuery();
            byte[] abyte = u[0].getBytes(StandardCharsets.UTF_8);
            var1.getResponseHeaders().add(u[1], u[2]);
            var1.sendResponseHeaders(200, abyte.length);

            try (OutputStream outputstream = var1.getResponseBody()) {
               outputstream.write(abyte);
            }

            var1.close();
            this.R(s);
         } catch (Throwable throwable1) {
            var1.close();
            ((CompletableFuture)this.N_2).completeExceptionally(throwable1);
         }
      });
      ((HttpServer)this.N_0).start();
   }

   public String y() {
      return "http://localhost:"
         + (Integer)this.N_3
         + "/in_game_account_switcher_long_enough_uri_to_prevent_accidental_leaks_on_screensharing_even_if_you_have_like_extremely_big_screen_though_it_might_not_mork_but_we_will_try_it_anyway_to_prevent_funny_things_from_happening_or_something";
   }

   private void E() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_3 = 0;
         this.N_4 = false;
      }
   }

   public String N() {
      return "https://login.live.com/oauth20_authorize.srf?client_id=54fd49e4-2103-4044-9603-2b028c814ec3&response_type=code&scope=XboxLive.signin%20XboxLive.offline_access&prompt=select_account&redirect_uri="
         + URI.create(this.y())
         + "&state="
         + (String)this.N_1;
   }

   private void R(String var1) {
      if (var1 == null) {
         ((CompletableFuture)this.N_2).completeExceptionally(new class11001(B[1], B[2]));
      } else if (var1.toLowerCase(Locale.ROOT).contains(B[3])) {
         ((CompletableFuture)this.N_2).completeExceptionally(new class11001(B[4], B[5]));
      } else {
         Matcher matcher = ((Pattern)y_4).matcher(var1);
         if (!matcher.find()) {
            ((CompletableFuture)this.N_2).completeExceptionally(new class11001(B[6], R[0]));
         } else if (!((String)this.N_1).equals(matcher.group(2))) {
            ((CompletableFuture)this.N_2).completeExceptionally(new class11001(R[1], d[0]));
         } else {
            ((CompletableFuture)this.N_2).complete(matcher.group(1));
         }
      }
   }
}
