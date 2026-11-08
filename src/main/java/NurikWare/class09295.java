package NurikWare;

import java.util.Objects;

public record class09295(String login, String minecraftName, boolean premium) {

   public boolean L() {
      return this.premium;
   }

   public class09295(String login, String minecraftName, boolean premium) {
      super();
      this.login = login;
      this.minecraftName = minecraftName;
      this.premium = premium;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 != null && this.getClass() == var1.getClass()) {
         class09295 class09295 = (class09295)var1;
         return Objects.equals(this.login, class09295.login);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(this.login);
   }

   public String y() {
      return this.login;
   }

   public String N() {
      return this.minecraftName;
   }
}
