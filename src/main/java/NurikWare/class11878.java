package NurikWare;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public record class11878(String avatarRef, String username, long subscribeMinutes) {

   public String L() {
      return this.username;
   }

   public class11878(String avatarRef, String username, long subscribeMinutes) {
      super();
      this.avatarRef = avatarRef;
      this.username = username;
      this.subscribeMinutes = subscribeMinutes;
   }

   public String u() {
      return this.avatarRef;
   }

   public long y() {
      return this.subscribeMinutes;
   }

   public String N() {
      Locale locale = Locale.forLanguageTag(class11938.P().N().N());
      return LocalDate.now().plusDays(((class11472)class11938.L_2).z() / 1440L).format(DateTimeFormatter.ofPattern("d MMMM yyyy", locale)).toLowerCase(locale);
   }
}
