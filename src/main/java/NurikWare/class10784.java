package NurikWare;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import minecraft.class04770;
import minecraft.class06794;
import minecraft.class07675;
import minecraft.class07680;
import minecraft.class07701;
import minecraft.class08774;

public class class10784 implements class07675 {
   private final class06794 N;

   public class10784(class06794 var1) {
      super();
      this.N = var1;
   }

   public Collection<class08774> getNames(class07701 var1) throws CommandSyntaxException {
      List<class04770> list = this.N.u(var1);
      if (list.isEmpty()) {
         throw class07680.i.create();
      } else {
         ArrayList arraylist = new ArrayList();

         for (class04770 class04770 : list) {
            arraylist.add(class04770.method_72498());
         }

         return arraylist;
      }
   }
}
