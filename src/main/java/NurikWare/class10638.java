package NurikWare;

import java.util.List;
import minecraft.class01807;
import minecraft.class06617;
import minecraft.class07340;

public record class10638(int bitsInMemory, int bitsInStorage) implements class06617 {
   public int L() {
      return this.bitsInStorage;
   }

   public class10638(int bitsInMemory, int bitsInStorage) {
      super();
      this.bitsInMemory = bitsInMemory;
      this.bitsInStorage = bitsInStorage;
   }

   public int y() {
      return this.bitsInMemory;
   }

   public boolean N() {
      return true;
   }

   public <T> class07340<T> N(class01807<T> var1, List<T> var2) {
      return var1.L();
   }
}
