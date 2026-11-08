package NurikWare;

import java.util.Objects;

public final class class09753 {
   private final class09782 N;
   private final Object y;

   public int L() {
      this.N(class09782.COLOR);
      return (Integer)this.y;
   }

   private class09753(class09782 var1, Object var2) {
      super();
      this.N = Objects.requireNonNull(var1, "kind");
      this.y = Objects.requireNonNull(var2, "value");
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof class09753 class09753) ? false : this.N == class09753.N && this.y.equals(class09753.y);
      }
   }

   @Override
   public String toString() {
      return "TransitionValue[kind=" + this.N + ", value=" + this.y + "]";
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.N, this.y);
   }

   public class09666 i() {
      this.N(class09782.TRANSLATE_LENGTH);
      return (class09666)this.y;
   }

   public class09962 u() {
      this.N(class09782.AXIS_SIZE);
      return (class09962)this.y;
   }

   public float y() {
      this.N(class09782.FLOAT);
      return (Float)this.y;
   }

   public static class09753 N(class09666 var0) {
      return new class09753(class09782.TRANSLATE_LENGTH, Objects.requireNonNull(var0, "value"));
   }

   public static class09753 N(class09962 var0) {
      return new class09753(class09782.AXIS_SIZE, Objects.requireNonNull(var0, "value"));
   }

   public static class09753 N(int var0) {
      return new class09753(class09782.COLOR, var0);
   }

   private void N(class09782 var1) {
      if (this.N != var1) {
         throw new IllegalStateException("Expected " + var1 + " transition value, got " + this.N);
      }
   }

   public class09782 N() {
      return this.N;
   }

   public static class09753 N(float var0) {
      return new class09753(class09782.FLOAT, var0);
   }
}
