package NurikWare;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

public class class10945 {
   public Object N_0;
   public Object N_1;

   public boolean L() {
      return ((Map)this.N_0).isEmpty();
   }

   public Optional<class09250> L(UUID var1) {
      return Optional.ofNullable((class09250)((Map)this.N_0).get(var1));
   }

   public void L(class09250 var1) {
      ((Map)this.N_0).put(var1.R(), var1);
      ((AtomicLong)this.N_1).incrementAndGet();
      class11519.y(class11495.class);
   }

   private void M() {
   }

   public class10945() {
      super();
      this.M();
      this.N_0 = new LinkedHashMap();
      this.N_1 = new AtomicLong();
   }

   public List<class09250> u() {
      return List.copyOf(((Map)this.N_0).values());
   }

   public void y(UUID var1) {
      class09250 class09250 = (class09250)((Map)this.N_0).get(var1);
      if (class09250 != null) {
         class09250.N(!class09250.y());
         ((AtomicLong)this.N_1).incrementAndGet();
         class11519.y(class11495.class);
      }
   }

   public int y() {
      return ((Map)this.N_0).size();
   }

   public void y(class09250 var1) {
      ((Map)this.N_0).remove(var1.R());
      ((AtomicLong)this.N_1).incrementAndGet();
   }

   public void N(UUID var1) {
      if (((Map)this.N_0).remove(var1) != null) {
         ((AtomicLong)this.N_1).incrementAndGet();
         class11519.y(class11495.class);
      }
   }

   public long N() {
      return ((AtomicLong)this.N_1).get();
   }

   public void N(class09250 var1) {
      ((Map)this.N_0).put(var1.R(), var1);
      ((AtomicLong)this.N_1).incrementAndGet();
   }
}
