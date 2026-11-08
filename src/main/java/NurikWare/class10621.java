package NurikWare;

public record class10621(int startTime, int endTime) {

   public class10621(int startTime, int endTime) {
      super();
      this.startTime = startTime;
      this.endTime = endTime;
   }

   public int y() {
      return this.endTime;
   }

   public int N() {
      return this.startTime;
   }
}
