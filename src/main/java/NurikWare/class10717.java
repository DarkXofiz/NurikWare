package NurikWare;

import java.util.Arrays;
import java.util.Collection;

public enum class10717 {
   SINGLE_WORD("word", "words_with_underscores"),
   GREEDY_PHRASE("word", "words with spaces", "\"and symbols\"");

   public Object fields_087762afe2ca3344abe8671e76bb865b2_0;

   private class10717(String... var3) {
      this.B();
      this.fields_087762afe2ca3344abe8671e76bb865b2_0 = Arrays.asList(var3);
   }

   static {
      R();
   }

   private void B() {
   }

   public Collection<String> N() {
      return (Collection<String>)this.fields_087762afe2ca3344abe8671e76bb865b2_0;
   }

   private static void R() {
   }
}
