package NurikWare;

import java.util.ArrayDeque;
import java.util.Base64;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Base64.Encoder;
import minecraft.class06197;
import minecraft.class06202;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11324 {
   public static Object N_0 = LogManager.getLogger(String.class);
   public static Object N_1;
   public static Object N_2;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public boolean y_init;

   private static boolean L(class11789 var0) {
      return var0 == null ? false : var0.i() == 0 || var0.L() < var0.i();
   }

   public synchronized void L(long var1) {
      ((Map)this.y_1).remove(var1);
   }

   public synchronized void L() {
      byte[] abyte = i(((class06197)class06202.Nq().L_3).N());
      if (abyte == null) {
         class11938.g().i().u().N(new class11857(class12020.N("share.import.invalid"))).N();
      } else {
         class11405 class11405 = class11938.z();
         if (!class11405.R()) {
            class11938.g().i().u().N(new class11857(class12020.N("share.import.offline"))).N();
         } else if (!(Boolean)this.y_5) {
            this.y_5 = true;
            class11405.N(class11957.N(abyte));
         }
      }
   }

   public class11324() {
      super();
      this.B();
      this.y_0 = new ArrayDeque();
      this.y_1 = new HashMap();
      this.y_2 = Base64.getUrlEncoder().withoutPadding();
      this.y_3 = class11316.L();
   }

   static {
      i();
   }

   private void B() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_4 = 0L;
         this.y_5 = false;
      }
   }

   private static void i() {
      N_0 = null;
      N_1 = "https://nurikware.fun/config?id=";
      N_2 = "nurikware.fun/config?id=";
   }

   private void i(class11789 var1) {
      ((Map)this.y_1).put(var1.B(), var1);
      this.N(var1);
      this.N(class11308.CREATED, var1.B());
   }

   private static byte[] i(String var0) {
      if (var0 == null) {
         return null;
      } else {
         int i = var0.toLowerCase(Locale.ROOT).indexOf("nurikware.fun/config?id=");
         if (i < 0) {
            return null;
         } else {
            int j = i + "nurikware.fun/config?id=".length();
            int k = j;

            while (k < var0.length() && N(var0.charAt(k))) {
               k++;
            }

            if (k == j) {
               return null;
            } else {
               try {
                  byte[] abyte = Base64.getUrlDecoder().decode(var0.substring(j, k));
                  return abyte.length == 16 ? abyte : null;
               } catch (IllegalArgumentException illegalargumentexception) {
                  return null;
               }
            }
         }
      }
   }

   public synchronized class11789 i(long var1) {
      class11789 class11789 = (class11789)((Map)this.y_1).get(var1);
      return L(class11789) ? class11789 : null;
   }

   public synchronized void u() {
      ((Deque)this.y_0).add(class11326.y());
      this.R();
   }

   public synchronized void u(long var1) {
      ((Deque)this.y_0).add(class11326.y(var1));
      this.R();
   }

   private String u(class11789 var1) {
      return "https://nurikware.fun/config?id=" + ((Encoder)this.y_2).encodeToString(var1.u());
   }

   public synchronized void y() {
      ((Deque)this.y_0).clear();
      ((Map)this.y_1).clear();
      this.y_3 = class11316.L();
      this.y_5 = false;
      this.u();
   }

   public synchronized void y(long var1) {
      ((Deque)this.y_0).add(class11326.N(var1));
      this.R();
   }

   private void y(class11789 var1) {
      ((Map)this.y_1).put(var1.B(), var1);
      class11938.g().i().B().N(new class11857(class12020.N("share.notify.refreshed"))).N();
      this.N(class11308.REFRESHED, var1.B());
   }

   private void N(class09284 var1) {
      boolean flag = (Boolean)this.y_5 && var1.y() == 0L;
      if (flag) {
         this.y_5 = false;
      }

      class11790 class11790 = class11790.N(var1.N());
      if (class11790 == null) {
         ((Logger)N_0).warn("share NACK with unknown error code {}", var1.N());
         this.N(class11308.ERROR, var1.y());
      } else {
         if (flag) {
            class11938.g().i().u().N(new class11857(class12020.N(class11790.y()))).N();
         } else {
            class11303.y(class12020.N(class11790.y()));
         }

         this.N(class11308.ERROR, var1.y());
      }
   }

   private void N(class09253 var1) {
      this.y_5 = false;
      class11794 class11794 = class11794.N(var1.L());
      if (class11794 == null) {
         ((Logger)N_0).warn("share activate response with unknown outcome {}", var1.L());
      } else {
         switch (((int[])class11285.N_1)[class11794.ordinal()]) {
            case 1:
               class11938.g().i().B().N(new class11857(class12020.N("share.import.created").formatted(var1.N()))).N();
               break;
            case 2:
               class11938.g().i().B().N(new class11857(class12020.N("share.import.updated").formatted(var1.N()))).N();
               break;
            case 3:
               class11938.g().i().L().N(new class11857(class12020.N("share.import.already-activated"))).N();
               break;
            case 4:
               class11938.g().i().L().N(new class11857(class12020.N("share.import.own-link"))).N();
         }
      }
   }

   private void N(class11308 var1, long var2) {
      long i = (Long)this.y_4 + 1L;
      this.y_4 = i;
      this.y_3 = new class11316(var1, var2, i);
   }

   public synchronized void N(class09256 var1) {
      switch (((int[])class11285.N_0)[var1.N().ordinal()]) {
         case 1:
            this.N(((class09254)var1.y()).N());
            break;
         case 2:
            this.i(((class09269)var1.y()).N());
            break;
         case 3:
            this.R(((class09300)var1.y()).N());
            break;
         case 4:
            this.N((class09284)var1.y());
            break;
         case 5:
            this.N((class09253)var1.y());
            break;
         case 6:
            this.y(((class09294)var1.y()).N());
      }

      this.R();
   }

   private static boolean N(char var0) {
      return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z' || var0 >= '0' && var0 <= '9' || var0 == '-' || var0 == '_' || var0 == '=';
   }

   public synchronized boolean N(long var1) {
      return var1 > 0L && L((class11789)((Map)this.y_1).get(var1));
   }

   public void N(class11789 var1) {
      ((class06197)class06202.Nq().L_3).N(this.u(var1));
      class11938.g().i().B().N(new class11857(class12020.N("share.notify.copied"))).N();
   }

   public class11316 N() {
      return (class11316)this.y_3;
   }

   public synchronized void N(long var1, long var3, int var5) {
      ((Deque)this.y_0).add(class11326.N(var1, var3, var5));
      this.R();
   }

   private void N(List<class11789> var1) {
      ((Map)this.y_1).clear();

      for (class11789 class11789 : var1) {
         ((Map)this.y_1).put(class11789.B(), class11789);
      }
   }

   private void R(long var1) {
      ((Map)this.y_1).remove(var1);
      this.N(class11308.DELETED, var1);
   }

   private void R() {
      class11405 class11405 = class11938.z();
      if (class11405.R()) {
         while (!((Deque)this.y_0).isEmpty()) {
            class11326 class11326 = (class11326)((Deque)this.y_0).poll();
            switch (((int[])class11285.N_2)[class11326.N().ordinal()]) {
               case 1:
                  class11405.N(class11957.y());
                  break;
               case 2:
                  class11405.N(class11957.N(class11326.i(), class11326.u(), class11326.L()));
                  break;
               case 3:
                  class11405.N(class11957.N(class11326.i()));
                  break;
               case 4:
                  class11405.N(class11957.y(class11326.i()));
            }
         }
      }
   }
}
