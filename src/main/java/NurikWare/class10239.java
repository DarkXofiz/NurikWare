package NurikWare;

import java.util.Optional;
import minecraft.class01255;
import minecraft.class02819;
import minecraft.class03764;
import minecraft.class05946;

public record class10239(class05946<class01255> key, class01255 value) {

   public class01255 L() {
      return this.value;
   }


   public class05946<class01255> y() {
      return this.key;
   }

   public class02819 N() {
      return new class02819(Optional.empty(), class03764.N(this.key, this.value));
   }
}
