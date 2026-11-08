package NurikWare;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11317 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public boolean N_init;
   public static Object y_0 = LogManager.getLogger(String.class);
   public static Object y_1;
   public static Object y_2;

   private synchronized void L(class09378 var1) {
      if (((Set)this.N_2).remove(var1)) {
         ((Deque)this.N_0).add(class11283.y(var1));
         this.B();
      }
   }

   private synchronized void M() {
      this.N_4 = false;
      if (class11938.z().R()) {
         ((Deque)this.N_0).add(class11283.N());
         this.B();
      }
   }

   public class11317(class11519 var1) {
      super();
      this.z();
      this.N_0 = new ArrayDeque();
      this.N_1 = new EnumMap<>(class09378.class);
      this.N_2 = EnumSet.noneOf(class09378.class);
      this.N_3 = var1;
   }

   static {
      y();
   }

   private void B() {
      class11405 class11405 = class11938.z();
      if (class11405.R()) {
         while (!((Deque)this.N_0).isEmpty()) {
            class11283 class11283 = (class11283)((Deque)this.N_0).poll();
            switch (((int[])class11294.N_1)[class11283.y().ordinal()]) {
               case 1:
                  class11405.N(class11948.N());
                  break;
               case 2:
                  class11405.N(class11948.N(class11283.L().N()));
                  break;
               case 3:
                  if (!(Boolean)this.N_4) {
                     class11531 class11531 = ((class11519)this.N_3).N(class11283.L()).orElse(null);
                     if (class11531 != null && !((Map)this.N_1).containsKey(class11283.L())) {
                        try {
                           byte[] abyte = class11529.N((class11488)class11531);
                           ((Map)this.N_1).put(class11283.L(), abyte);
                           class11405.N(class11948.N(class11283.L().N(), abyte));
                        } catch (IOException ioexception) {
                           ((Logger)y_0).error("Failed to serialize {} for push", class11283.L(), ioexception);
                        }
                     }
                  }
            }
         }
      }
   }

   private void Z() {
      if (!(Boolean)this.N_4) {
         this.N_4 = true;
         ((Logger)y_0).warn("user-config operations rate-limited, retrying in {} ticks", 1500);
         class11938.Z().y(1500, this::M);
      }
   }

   private void z() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_4 = false;
      }
   }

   private static void y() {
      y_0 = null;
      y_1 = 1500;
      y_2 = 120;
   }

   private void N(class09267 var1) {
      HashSet hashset = new HashSet();

      for (class10732 class10732 : var1.N()) {
         class09378 class09378 = class10732.N();
         if (class09378 != null) {
            hashset.add(class09378);
            class11531 class11531x = ((class11519)this.N_3).N(class09378).orElse(null);
            if (class11531x != null) {
               if (class11531x.y()) {
                  ((Deque)this.N_0).add(class11283.y(class09378));
               } else {
                  ((Deque)this.N_0).add(class11283.N(class09378));
               }
            }
         }
      }

      for (class11531 class11531 : ((class11519)this.N_3).N()) {
         if (!hashset.contains(class11531.i()) && !((class11488)class11531).d_()) {
            ((Deque)this.N_0).add(class11283.y(class11531.i()));
         }
      }
   }

   public synchronized void N(class09283 var1) {
      switch (((int[])class11294.N_0)[var1.y().ordinal()]) {
         case 1:
            this.N((class09267)var1.N());
            break;
         case 2:
            this.N((class09275)var1.N());
            break;
         case 3:
            this.N((class09287)var1.N());
            break;
         case 4:
            this.N((class09265)var1.N());
      }

      this.B();
   }

   private void N(class09275 var1) {
      class09378 class09378 = class09378.N(var1.y());
      if (class09378 != null) {
         class11531 class11531 = ((class11519)this.N_3).N(class09378).orElse(null);
         if (class11531 != null) {
            if (class11531.y()) {
               ((Deque)this.N_0).add(class11283.y(class09378));
            } else {
               try (class11299 class11299 = class11299.N()) {
                  class11529.N((class11488)class11531, var1.N());
                  class11531.N(false);
                  ((class11519)this.N_3).N(class11531);
               } catch (IOException ioexception) {
                  ((Logger)y_0).error("Failed to deserialize blob for {}", class09378, ioexception);
               }
            }
         }
      }
   }

   public synchronized void N(class09378 var1) {
      if (((Set)this.N_2).add(var1)) {
         class11938.Z().y(120, () -> this.L(var1));
      }
   }

   private void N(class09265 var1) {
      class09378 class09378 = class09378.N(var1.y());
      if (class09378 != null) {
         ((Map)this.N_1).remove(class09378);
         if (class11790.N(var1.N()) == class11790.staticFields_1e32a81813f643834bbda8f07cef7f07f_0) {
            this.Z();
         } else {
            class11531 class11531 = ((class11519)this.N_3).N(class09378).orElse(null);
            if (class11531 != null) {
               class11531.N(false);
               ((class11519)this.N_3).N(class11531);
            }
         }
      }
   }

   private void N(class09287 var1) {
      class09378 class09378 = class09378.N(var1.y());
      if (class09378 != null) {
         class11531 class11531 = ((class11519)this.N_3).N(class09378).orElse(null);
         if (class11531 != null) {
            byte[] abyte = (byte[])((Map)this.N_1).remove(class09378);
            if (abyte != null) {
               try {
                  byte[] abyte1 = class11529.N((class11488)class11531);
                  if (Arrays.equals(abyte, abyte1)) {
                     class11531.N(false);
                     ((class11519)this.N_3).N(class11531);
                  } else {
                     class11531.N(true);
                     ((class11519)this.N_3).N(class11531);
                     this.N(class09378);
                  }
               } catch (IOException ioexception) {
                  ((Logger)y_0).error("Failed to serialize {} after ack", class09378, ioexception);
               }
            }
         }
      }
   }

   public synchronized void N() {
      ((Deque)this.N_0).clear();
      ((Map)this.N_1).clear();
      ((Set)this.N_2).clear();
      this.N_4 = false;
      ((Deque)this.N_0).add(class11283.N());
      this.B();
   }
}
