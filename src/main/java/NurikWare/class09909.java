package NurikWare;

import java.util.Objects;

public record class09909(class09924 command) implements class09935 {
   public class09909(class09924 command) {
      super();
      Objects.requireNonNull(command, "command");
      this.command = command;
   }

   public class09924 N() {
      return this.command;
   }
}
