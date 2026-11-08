package NurikWare;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11306 {
   public static Object N_0 = LogManager.getLogger(String.class);
   public static Object N_1;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public boolean y_init;

   private void L() {
      class11938.z().N(class11967.L());
   }

   public synchronized void L(class11290 var1) {
      ((Deque)this.y_0).add(class11323.L(var1.u()));
      this.y();
   }

   public class11306(class11325 var1) {
      super();
      this.Z();
      this.y_0 = new ArrayDeque();
      this.y_1 = new HashSet();
      this.y_2 = var1;
   }

   static {
      i();
      u();
   }

   private void Z() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_3 = false;
      }
   }

   private static void i() {
   }

   private void U() {
      if (!(Boolean)this.y_3) {
         this.y_3 = true;
         ((Logger)N_0).warn("preset sync deferred, retrying list in {} ticks", 1500);
         class11938.Z().y(1500, () -> {
            this.y_3 = false;
            if (class11938.z().R()) {
               this.L();
            }
         });
      }
   }

   public synchronized void u(class11290 var1) {
      ((Deque)this.y_0).add(class11323.N(var1.u()));
      this.y();
   }

   private static void u() {
      N_0 = null;
      N_1 = 1500;
   }

   private void y(class11827 var1) {
      ((class11325)this.y_2).N(var1.u()).ifPresent(var2 -> {
         var2.N(var1.L());
         var2.N(var1.N());
         var2.L(var1.N());
         var2.u(var1.i());
         if (var2.M() == class11296.DIRTY) {
            var2.N(class11296.SYNCED);
         }

         ((class11325)this.y_2).N(var2);
      });
   }

   public synchronized void y(class11290 var1) {
      ((Deque)this.y_0).add(class11323.y(var1.u()));
      this.y();
   }

   private void y() {
      class11405 class11405 = class11938.z();
      if (class11405.R()) {
         while (!((Deque)this.y_0).isEmpty()) {
            class11323 class11323 = (class11323)((Deque)this.y_0).poll();
            class11290 class11290 = ((class11325)this.y_2).N(class11323.N()).orElse(null);
            if (class11290 != null) {
               switch (((int[])class11314.N_1)[class11323.y().ordinal()]) {
                  case 1:
                     if (class11290.N() && class11290.U() != null) {
                        class11405.N(class11967.N(class11290.u(), class11290.i(), class11290.U(), class11290.L()));
                     }
                     break;
                  case 2:
                     if (!class11290.E() && class11290.N() && class11290.U() != null) {
                        class11405.N(class11967.N(class11290.Z(), class11290.U(), class11290.L()));
                     }
                     break;
                  case 3:
                     if (class11290.E()) {
                        ((class11325)this.y_2).y(class11290.u());
                     } else {
                        class11405.N(class11967.N(class11290.Z()));
                     }
                     break;
                  case 4:
                     if (!class11290.E()) {
                        class11405.N(class11967.N(class11290.Z(), class11290.i()));
                     }
                     break;
                  case 5:
                     if (class11290.E()) {
                        ((Set)this.y_1).remove(class11290.u());
                     } else {
                        class11405.N(class11967.y(class11290.Z()));
                     }
               }
            }
         }
      }
   }

   private String y(class09274 var1) {
      class09279 class09279 = var1.y();

      return switch (((int[])class11314.N_0)[var1.N().ordinal()]) {
         case 1 -> "list: " + ((class09272)class09279).N().size() + " entries";
         case 2 -> {
            class11827 class11827x = ((class09291)class09279).N();
            yield "create: id=" + class11827x.R() + " name=" + class11827x.L();
         }
         case 3 -> {
            class09292 class09292 = (class09292)class09279;
            class11827 class11827 = class09292.N();
            int j = class09292.y() == null ? 0 : class09292.y().length;
            yield "update: id=" + class11827.R() + " name=" + class11827.L() + " bytes=" + j;
         }
         case 4 -> {
            class09261 class09261 = (class09261)class09279;
            class11827 class11827xxx = class09261.N();
            int i = class09261.L() == null ? 0 : class09261.L().length;
            yield "get: id=" + class11827xxx.R() + " name=" + class11827xxx.L() + " bytes=" + i;
         }
         case 5 -> {
            class09293 class09293 = (class09293)class09279;
            yield "delete: id=" + class09293.N();
         }
         case 6 -> {
            class11827 class11827xx = ((class09258)class09279).N();
            yield "rename: id=" + class11827xx.R() + " name=" + class11827xx.L();
         }
         case 7 -> {
            class09281 class09281 = (class09281)class09279;
            yield "nack: id=" + class09281.y() + " code=" + class09281.L();
         }
         default -> throw new MatchException(null, null);
      };
   }

   public synchronized void N(UUID var1) {
      ((Set)this.y_1).add(var1);
      ((Deque)this.y_0).add(class11323.u(var1));
      this.y();
   }

   public synchronized void N(class09274 var1) {
      switch (((int[])class11314.N_0)[var1.N().ordinal()]) {
         case 1:
            this.N(((class09272)var1.y()).N());
            break;
         case 2:
            this.N(((class09291)var1.y()).N());
            break;
         case 3:
            this.N((class09292)var1.y());
            break;
         case 4:
            this.N((class09261)var1.y());
            break;
         case 5:
            this.N((class09293)var1.y());
            break;
         case 6:
            this.y(((class09258)var1.y()).N());
            break;
         case 7:
            this.N((class09281)var1.y());
      }

      this.y();
   }

   private void N(class09292 var1) {
      class11827 class11827 = var1.N();
      ((class11325)this.y_2).N(class11827.u()).ifPresent(var3 -> {
         var3.N(class11827.N());
         var3.L(class11827.N());
         var3.u(class11827.i());
         var3.N(var1.L());
         var3.N(var1.y());
         var3.N(var1.y() != null && var1.y().length > 0);
         var3.N(class11296.SYNCED);
         ((class11325)this.y_2).N(var3);
      });
   }

   private void N(class09293 var1) {
      ((class11325)this.y_2).N(var1.N()).ifPresent(var1x -> ((class11325)this.y_2).y(var1x.u()));
   }

   private void N(List<class11827> var1) {
      HashSet hashset = new HashSet();

      for (class11827 class11827 : var1) {
         hashset.add(class11827.u());
         class11290 class11290xx = ((class11325)this.y_2).N(class11827.u()).orElse(null);
         if (class11290xx == null) {
            class11290 class11290x = new class11290(
               class11827.u(),
               class11827.R(),
               class11827.L(),
               class11827.y(),
               class11827.N(),
               class11827.N(),
               class11827.i(),
               class11296.SYNCED,
               1,
               false,
               null
            );
            ((class11325)this.y_2).N(class11290x);
         } else {
            switch (((int[])class11314.N_2)[class11290xx.M().ordinal()]) {
               case 1:
                  boolean flag2 = class11827.i() != class11290xx.R();
                  class11290xx.y(class11827.R());
                  class11290xx.u(class11827.i());
                  class11290xx.N(class11827.L());
                  class11290xx.y(class11827.y());
                  if (class11827.N() > class11290xx.y()) {
                     class11290xx.N(class11827.N());
                     class11290xx.L(class11827.N());
                  }

                  if (flag2) {
                     class11290xx.N(false);
                     class11290xx.N(null);
                  }

                  ((class11325)this.y_2).N(class11290xx);
                  break;
               case 2:
                  class11290xx.y(class11827.R());
                  class11290xx.u(class11827.i());
                  boolean flag = !class11827.L().equals(class11290xx.i());
                  boolean flag1 = class11290xx.N() && class11290xx.U() != null;
                  if (flag) {
                     ((Deque)this.y_0).add(class11323.i(class11290xx.u()));
                  }

                  if (flag1) {
                     ((Deque)this.y_0).add(class11323.L(class11290xx.u()));
                  }

                  if (!flag && !flag1) {
                     if (class11827.N() > class11290xx.y()) {
                        class11290xx.N(class11827.N());
                        class11290xx.L(class11827.N());
                     }

                     class11290xx.N(class11296.SYNCED);
                     ((class11325)this.y_2).N(class11290xx);
                  }
                  break;
               case 3:
                  class11290xx.y(class11827.R());
                  class11290xx.u(class11827.i());
                  ((class11325)this.y_2).N(class11290xx);
                  ((Deque)this.y_0).add(class11323.L(class11290xx.u()));
                  break;
               case 4:
                  class11290xx.y(class11827.R());
                  class11290xx.u(class11827.i());
                  ((Deque)this.y_0).add(class11323.N(class11290xx.u()));
            }
         }
      }

      for (class11290 class11290x : ((class11325)this.y_2).L()) {
         if (!hashset.contains(class11290x.u())) {
            switch (((int[])class11314.N_2)[class11290x.M().ordinal()]) {
               case 1:
               case 4:
                  ((class11325)this.y_2).y(class11290x.u());
                  break;
               case 2:
                  if (!class11290x.E()) {
                     class11290x.y(0L);
                     class11290x.u(0L);
                     class11290x.N(class11296.LOCAL);
                     ((class11325)this.y_2).N(class11290x);
                  }

                  ((Deque)this.y_0).add(class11323.y(class11290x.u()));
                  break;
               case 3:
                  ((Deque)this.y_0).add(class11323.y(class11290x.u()));
            }
         }
      }

      this.R();
      this.y();
   }

   public synchronized void N(class11290 var1) {
      ((Deque)this.y_0).add(class11323.i(var1.u()));
      this.y();
   }

   private void N(class09261 var1) {
      class11827 class11827 = var1.N();
      class11290 class11290 = ((class11325)this.y_2).N(class11827.u()).orElse(null);
      if (class11290 == null) {
         class11290 = new class11290(
            class11827.u(),
            class11827.R(),
            class11827.L(),
            class11827.y(),
            class11827.N(),
            class11827.N(),
            class11827.i(),
            class11296.SYNCED,
            var1.y(),
            true,
            var1.L()
         );
      } else {
         class11290.y(class11827.R());
         class11290.N(class11827.L());
         class11290.y(class11827.y());
         class11290.N(class11827.N());
         class11290.L(class11827.N());
         class11290.u(class11827.i());
         class11290.N(var1.y());
         class11290.N(var1.L());
         class11290.N(var1.L() != null && var1.L().length > 0);
         if (class11290.M() == class11296.LOCAL || class11290.M() == class11296.DIRTY) {
            class11290.N(class11296.SYNCED);
         }
      }

      ((class11325)this.y_2).N(class11290);
      if (((Set)this.y_1).remove(class11827.u()) && class11290.N() && class11290.U() != null) {
         try {
            new class11291().N(class11290.L(), class11290.U());
         } catch (RuntimeException runtimeexception) {
            ((Logger)N_0).error("Failed to apply preset {}", class11290.i(), runtimeexception);
         }
      }
   }

   private void N(class11827 var1) {
      ((class11325)this.y_2).N(var1.u()).ifPresent(var2 -> {
         var2.y(var1.R());
         var2.N(var1.L());
         var2.y(var1.y());
         var2.N(var1.N());
         var2.L(var1.N());
         var2.u(var1.i());
         var2.N(class11296.SYNCED);
         ((class11325)this.y_2).N(var2);
      });
   }

   private void N(class09281 var1) {
      class11790 class11790 = class11790.N(var1.L());
      if (class11790 == null) {
         ((Logger)N_0).warn("preset NACK with unknown error code {}", var1.L());
      } else if (class11790 == class11790.staticFields_1e32a81813f643834bbda8f07cef7f07f_0) {
         this.U();
      } else {
         class11290 class11290 = var1.y() > 0L ? ((class11325)this.y_2).N(var1.y()).orElse(null) : ((class11325)this.y_2).N(var1.N()).orElse(null);
         if (class11290 == null) {
            ((Logger)N_0).warn("preset NACK for unknown id={} clientId={}", var1.y(), var1.N());
         } else {
            ((Set)this.y_1).remove(class11290.u());
            if (class11790 == class11790.staticFields_0e32a81813f643834bbda8f07cef7f07f_1) {
               this.U();
            }

            ((Logger)N_0).warn("preset NACK id={} clientId={} code={}", var1.y(), var1.N(), class11790);
         }
      }
   }

   public synchronized void N() {
      ((Deque)this.y_0).clear();
      ((Set)this.y_1).clear();
      this.y_3 = false;
      this.L();
   }

   private void R() {
      UUID uuid = class11938.M().N(class11521.class).y();
      if (uuid != null) {
         class11290 class11290 = ((class11325)this.y_2).N(uuid).orElse(null);
         if (class11290 != null && !class11290.E()) {
            if (!class11290.N() || class11290.U() == null) {
               ((Set)this.y_1).add(uuid);
               ((Deque)this.y_0).add(class11323.u(uuid));
            }
         }
      }
   }
}
