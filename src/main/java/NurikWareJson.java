import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

final class NurikWareJson {
   private final String s;
   private int i;

   private NurikWareJson(String var1) {
      super();
      this.s = var1;
   }

   static Object parse(String var0) {
      NurikWareJson nurjson = new NurikWareJson(var0);
      nurjson.ws();
      Object object = nurjson.value();
      nurjson.ws();
      return object;
   }

   private void ws() {
      while (this.i < this.s.length()) {
         char c0 = this.s.charAt(this.i);
         if (c0 != ' ' && c0 != '\t' && c0 != '\r' && c0 != '\n' && c0 != '\ufeff') {
            return;
         }

         this.i++;
      }
   }

   private Object value() {
      char c0 = this.s.charAt(this.i);
      switch (c0) {
         case '"':
            return this.str();
         case '[':
            return this.arr();
         case 'f':
            this.i += 5;
            return Boolean.FALSE;
         case 'n':
            this.i += 4;
            return null;
         case 't':
            this.i += 4;
            return Boolean.TRUE;
         case '{':
            return this.obj();
         default:
            return this.num();
      }
   }

   private Map<String, Object> obj() {
      LinkedHashMap linkedhashmap = new LinkedHashMap();
      this.i++;
      this.ws();
      if (this.s.charAt(this.i) == '}') {
         this.i++;
         return linkedhashmap;
      } else {
         char c0;
         do {
            this.ws();
            String sx = this.str();
            this.ws();
            this.i++;
            this.ws();
            linkedhashmap.put(sx, this.value());
            this.ws();
            c0 = this.s.charAt(this.i++);
         } while (c0 != '}');

         return linkedhashmap;
      }
   }

   private List<Object> arr() {
      ArrayList arraylist = new ArrayList();
      this.i++;
      this.ws();
      if (this.s.charAt(this.i) == ']') {
         this.i++;
         return arraylist;
      } else {
         char c0;
         do {
            this.ws();
            arraylist.add(this.value());
            this.ws();
            c0 = this.s.charAt(this.i++);
         } while (c0 != ']');

         return arraylist;
      }
   }

   private String str() {
      StringBuilder stringbuilder = new StringBuilder();
      this.i++;

      while (true) {
         char c0 = this.s.charAt(this.i++);
         if (c0 == '"') {
            return stringbuilder.toString();
         }

         if (c0 != '\\') {
            stringbuilder.append(c0);
         } else {
            char c1 = this.s.charAt(this.i++);
            switch (c1) {
               case 'b':
                  stringbuilder.append('\b');
                  break;
               case 'c':
               case 'd':
               case 'e':
               case 'g':
               case 'h':
               case 'i':
               case 'j':
               case 'k':
               case 'l':
               case 'm':
               case 'o':
               case 'p':
               case 'q':
               case 's':
               default:
                  stringbuilder.append(c1);
                  break;
               case 'f':
                  stringbuilder.append('\f');
                  break;
               case 'n':
                  stringbuilder.append('\n');
                  break;
               case 'r':
                  stringbuilder.append('\r');
                  break;
               case 't':
                  stringbuilder.append('\t');
                  break;
               case 'u':
                  stringbuilder.append((char)Integer.parseInt(this.s.substring(this.i, this.i + 4), 16));
                  this.i += 4;
            }
         }
      }
   }

   private Number num() {
      int ix;
      for (ix = this.i; this.i < this.s.length(); this.i++) {
         char c0 = this.s.charAt(this.i);
         if (c0 != '-' && c0 != '+' && c0 != '.' && c0 != 'e' && c0 != 'E' && (c0 < '0' || c0 > '9')) {
            break;
         }
      }

      String sx = this.s.substring(ix, this.i);
      if (sx.indexOf(46) < 0 && sx.indexOf(101) < 0 && sx.indexOf(69) < 0) {
         try {
            return Integer.valueOf(sx);
         } catch (NumberFormatException numberformatexception) {
            return Long.valueOf(sx);
         }
      } else {
         return Double.valueOf(sx);
      }
   }
}
