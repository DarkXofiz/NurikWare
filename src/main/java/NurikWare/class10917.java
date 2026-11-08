package NurikWare;

public record class10917(String command, int tick) {

   class10917(String command, int tick) {
      super();
      this.command = command;
      this.tick = tick;
   }

   public int y() {
      return this.tick;
   }

   public String N() {
      return this.command;
   }
}
