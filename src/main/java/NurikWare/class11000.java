package NurikWare;

import com.google.common.collect.AbstractIterator;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DataResult.Error;
import com.mojang.serialization.DataResult.Success;
import java.util.ListIterator;
import java.util.Objects;
import minecraft.class07709;
import minecraft.class08318;
import org.jspecify.annotations.Nullable;

public class class11000<T> extends AbstractIterator<T> {
   public class11000(class08318 var1, ListIterator var2) {
      super();
      this.y = var1;
      this.N = var2;
   }

   @Nullable
   protected T computeNext() {
      while (this.N.hasNext()) {
         int i = this.N.nextIndex();
         class07709 class07709 = (class07709)this.N.next();
         DataResult dataresult = this.y.y.parse(this.y.N.N(), class07709);
         Objects.requireNonNull(dataresult);
         Object object = dataresult;
         switch (object) {
            case Success success:
               return (T)((Success)object).value();
            case Error error:
               this.y.N(i, class07709, error);
               if (!error.partialValue().isPresent()) {
                  break;
               }

               return (T)error.partialValue().get();
            default:
               throw new MatchException(null, null);
         }
      }

      return (T)this.endOfData();
   }
}
