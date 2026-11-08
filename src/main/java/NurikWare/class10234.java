package NurikWare;

import minecraft.class06909;

public record class10234(class06909 row, int column, int page) {
   public int L() {
      return this.page;
   }

   public class10234(class06909 row, int column, int page) {
      super();
      this.row = row;
      this.column = column;
      this.page = page;
   }

   public int y() {
      return this.column;
   }

   public class06909 N() {
      return this.row;
   }
}
