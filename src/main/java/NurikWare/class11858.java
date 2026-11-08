package NurikWare;

import java.util.function.Consumer;
import java.util.regex.Pattern;

public record class11858(String placeholderKey, String value, Pattern regex, Consumer<String> onChange, class09785<Boolean> focused) {

   public class09785<Boolean> L() {
      return this.focused;
   }


   public String i() {
      return this.value;
   }

   public String u() {
      return this.placeholderKey;
   }

   public Pattern y() {
      return this.regex;
   }

   public Consumer<String> N() {
      return this.onChange;
   }
}
