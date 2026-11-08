package NurikWare;

import java.util.Optional;
import minecraft.class00751;
import minecraft.class02074;
import minecraft.class03515;
import minecraft.class03542;
import minecraft.class04132;
import minecraft.class05946;

public class class09558 implements class03542 {
   public class09558(class02074 var1) {
      super();
      this.N = var1;
   }

   public <T> Optional<class03515<T>> N(class05946<? extends class00751<? extends T>> var1) {
      return this.N.N(var1).map(class04132::y);
   }
}
