package NurikWare;

import minecraft.class06715;
import minecraft.class06889;

public record class10672(class06889 pos, String text, class06715 style) {

   public class06715 L() {
      return this.style;
   }

   public class10672(class06889 pos, String text, class06715 style) {
      super();
      this.pos = pos;
      this.text = text;
      this.style = style;
   }

   public String y() {
      return this.text;
   }

   public class06889 N() {
      return this.pos;
   }
}
