package NurikWare;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joml.Vector2f;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;

public class class11292 extends class11488 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public static Object y_0 = LogManager.getLogger(String.class);

   public Vector2f L() {
      this.z();
      return (Vector2f)this.N_3;
   }

   public Vector2f L(String var1) {
      this.z();
      return (Vector2f)((Map)this.N_0).get(var1);
   }

   public Map<String, class11763> M() {
      this.z();
      return (Map<String, class11763>)this.N_1;
   }

   private void P() {
      this.z();
      ((Map)this.N_0).clear();
      ((Map)this.N_1).clear();

      for (class11769 class11769 : (List)class11730.N_7) {
         Vector2f vector2f = class11769.m();
         if (vector2f != null) {
            ((Map)this.N_0).put(class11769.E(), vector2f);
            ((Map)this.N_1).put(class11769.E(), class11769.L());
         }
      }

      this.N_3 = class09193.y();
      ((Map)this.N_2).clear();

      for (Entry entry : class09223.N().entrySet()) {
         ((Map)this.N_2).put((String)entry.getKey(), (Boolean)((class09785)entry.getValue()).L());
      }
   }

   public class11292(String var1, int var2) {
      super(var1, var2, null);
      this.z();
      this.N_0 = new HashMap();
      this.N_1 = new HashMap();
      this.N_2 = new HashMap();
   }

   static {
      U();
   }

   public Map<String, Vector2f> B() {
      this.z();
      return (Map<String, Vector2f>)this.N_0;
   }

   public Map<String, Boolean> Z() {
      this.z();
      return (Map<String, Boolean>)this.N_2;
   }

   private static void U() {
      y_0 = null;
   }

   private void z() {
   }

   public Vector2f y() {
      this.z();
      return (Vector2f)this.N_3;
   }

   public Boolean y(String var1) {
      this.z();
      return (Boolean)((Map)this.N_2).get(var1);
   }

   public class11763 N(String var1) {
      this.z();
      return (class11763)((Map)this.N_1).get(var1);
   }

   @Override
   public void N(MessageBufferPacker var1) throws IOException {
      this.z();
      this.P();
      var1.packArrayHeader(3);
      var1.packMapHeader(((Map)this.N_0).size());

      for (Entry entry : ((Map)this.N_0).entrySet()) {
         var1.packString((String)entry.getKey());
         class11763 class11763 = (class11763)((Map)this.N_1).get(entry.getKey());
         var1.packArrayHeader(3);
         var1.packFloat(((Vector2f)entry.getValue()).x);
         var1.packFloat(((Vector2f)entry.getValue()).y);
         var1.packInt(class11763 != null ? class11763.ordinal() : 0);
      }

      if ((Vector2f)this.N_3 == null) {
         var1.packNil();
      } else {
         var1.packArrayHeader(2);
         var1.packFloat(((Vector2f)this.N_3).x);
         var1.packFloat(((Vector2f)this.N_3).y);
      }

      var1.packMapHeader(((Map)this.N_2).size());

      for (Entry entry1 : ((Map)this.N_2).entrySet()) {
         var1.packString((String)entry1.getKey());
         var1.packBoolean((Boolean)entry1.getValue());
      }
   }

   @Override
   public void N(int var1, MessageUnpacker var2) throws IOException {
      this.z();
      var2.unpackArrayHeader();
      ((Map)this.N_0).clear();
      ((Map)this.N_1).clear();
      int i = var2.unpackMapHeader();

      for (int j = 0; j < i; j++) {
         try {
            String s = var2.unpackString();
            int k = var2.unpackArrayHeader();
            float f = var2.unpackFloat();
            float f1 = var2.unpackFloat();
            if (k > 2) {
               int l = var2.unpackInt();
               class11763[] aclass11763 = class11763.values();
               if (l >= 0 && l < aclass11763.length) {
                  ((Map)this.N_1).put(s, aclass11763[l]);
               }

               for (int i1 = 3; i1 < k; i1++) {
                  var2.skipValue();
               }
            }

            ((Map)this.N_0).put(s, new Vector2f(f, f1));
         } catch (Exception exception1) {
            ((Logger)y_0).warn("Skipped corrupt hud position #{} in {}: {}", j, this.u(), exception1.getMessage());
         }
      }

      if (var2.tryUnpackNil()) {
         this.N_3 = null;
      } else {
         var2.unpackArrayHeader();
         float f2 = var2.unpackFloat();
         float f3 = var2.unpackFloat();
         this.N_3 = new Vector2f(f2, f3);
      }

      ((Map)this.N_2).clear();
      int j1 = var2.unpackMapHeader();

      for (int k1 = 0; k1 < j1; k1++) {
         try {
            String s1 = var2.unpackString();
            boolean flag = var2.unpackBoolean();
            ((Map)this.N_2).put(s1, flag);
         } catch (Exception exception) {
            ((Logger)y_0).warn("Skipped corrupt subcategory flag #{} in {}: {}", k1, this.u(), exception.getMessage());
         }
      }
   }

   @Override
   public boolean d_() {
      this.z();
      return ((Map)this.N_0).isEmpty() && (Vector2f)this.N_3 == null && ((Map)this.N_2).isEmpty();
   }
}
