import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.fabricmc.loader.api.metadata.CustomValue;
import net.fabricmc.loader.api.metadata.CustomValue.CvArray;
import net.fabricmc.loader.api.metadata.CustomValue.CvObject;
import net.fabricmc.loader.api.metadata.CustomValue.CvType;

abstract class NurikWareCv implements CustomValue {
   NurikWareCv() {
      super();
   }

   public CvObject getAsObject() {
      throw new ClassCastException("not an object");
   }

   public CvArray getAsArray() {
      throw new ClassCastException("not an array");
   }

   public String getAsString() {
      throw new ClassCastException("not a string");
   }

   public Number getAsNumber() {
      throw new ClassCastException("not a number");
   }

   public boolean getAsBoolean() {
      throw new ClassCastException("not a boolean");
   }

   static Map<String, CustomValue> emptyMap() {
      return new LinkedHashMap<>();
   }

   static List<CustomValue> emptyList() {
      return new ArrayList<>();
   }

   static final class Arr extends NurikWareCv implements CvArray {
      private final List<CustomValue> list;

      Arr(List<CustomValue> var1) {
         super();
         this.list = var1;
      }

      public CvType getType() {
         return CvType.ARRAY;
      }

      @Override
      public CvArray getAsArray() {
         return this;
      }

      public int size() {
         return this.list.size();
      }

      public CustomValue get(int var1) {
         return this.list.get(var1);
      }

      public Iterator<CustomValue> iterator() {
         return this.list.iterator();
      }
   }

   static final class Bool extends NurikWareCv {
      private final boolean value;

      Bool(boolean var1) {
         super();
         this.value = var1;
      }

      public CvType getType() {
         return CvType.BOOLEAN;
      }

      @Override
      public boolean getAsBoolean() {
         return this.value;
      }
   }

   static final class Nil extends NurikWareCv {
      static final NurikWareCv.Nil INSTANCE = new NurikWareCv.Nil();

      Nil() {
         super();
      }

      public CvType getType() {
         return CvType.NULL;
      }
   }

   static final class Num extends NurikWareCv {
      private final Number value;

      Num(Number var1) {
         super();
         this.value = var1;
      }

      public CvType getType() {
         return CvType.NUMBER;
      }

      @Override
      public Number getAsNumber() {
         return this.value;
      }
   }

   static final class Obj extends NurikWareCv implements CvObject {
      private final Map<String, CustomValue> map;

      Obj(Map<String, CustomValue> var1) {
         super();
         this.map = var1;
      }

      public CvType getType() {
         return CvType.OBJECT;
      }

      @Override
      public CvObject getAsObject() {
         return this;
      }

      public int size() {
         return this.map.size();
      }

      public boolean containsKey(String var1) {
         return this.map.containsKey(var1);
      }

      public CustomValue get(String var1) {
         return this.map.get(var1);
      }

      public Iterator<Entry<String, CustomValue>> iterator() {
         return this.map.entrySet().iterator();
      }
   }

   static final class Str extends NurikWareCv {
      private final String value;

      Str(String var1) {
         super();
         this.value = var1;
      }

      public CvType getType() {
         return CvType.STRING;
      }

      @Override
      public String getAsString() {
         return this.value;
      }
   }
}
