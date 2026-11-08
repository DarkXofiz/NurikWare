package NurikWare;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class class11480 {
   private static String[] R;
   private static String[] M;
   private static String[] B;
   public static Object N_0;
   public static Object N_1;
   public static Object N_2;

   public static String L() {
      return LocalDateTime.now().format(DateTimeFormatter.ofPattern(B[0]));
   }

   private static void M() {
      N_0 = M[4];
      N_1 = M[5];
      N_2 = M[6];
   }

   private class11480() {
      super();
      throw new UnsupportedOperationException(M[3]);
   }

   static {
      B();
      M();
   }

   private static void B() {
      R = new String[4];
      R[0] = "HH:mm";
      R[1] = "dd.MM.yyyy HH:mm";
      R[2] = "dd.MM HH:mm";
      R[3] = "dd.MM.yyyy HH:mm";
      B = new String[3];
      B[0] = "dd.MM.yyyy";
      B[1] = "HH:mm";
      B[2] = "Сегодня в";
      M = new String[7];
      M[0] = "Today at";
      M[1] = "Вчера в";
      M[2] = "Yesterday at";
      M[3] = "This is a utility class and cannot be instantiated";
      M[4] = "dd.MM.yyyy HH:mm";
      M[5] = "dd.MM.yyyy";
      M[6] = "HH:mm";
   }

   private static String U() {
      return class11938.P().N() == class11999.RU ? B[2] : M[0];
   }

   public static String y() {
      return LocalDateTime.now().format(DateTimeFormatter.ofPattern(R[3]));
   }

   public static String N(String var0, long var1) {
      DateTimeFormatter datetimeformatter = DateTimeFormatter.ofPattern(var0);
      return Instant.ofEpochMilli(var1).atZone(ZoneId.systemDefault()).format(datetimeformatter);
   }

   public static String N() {
      return LocalDateTime.now().format(DateTimeFormatter.ofPattern(B[1]));
   }

   public static String N(long var0) {
      ZoneId zoneid = ZoneId.systemDefault();
      ZonedDateTime zoneddatetime = Instant.ofEpochMilli(var0).atZone(zoneid);
      LocalDate localdate = zoneddatetime.toLocalDate();
      LocalDate localdate1 = LocalDate.now(zoneid);
      String s = zoneddatetime.format(DateTimeFormatter.ofPattern(R[0]));
      if (localdate.equals(localdate1)) {
         return U() + " " + s;
      } else if (localdate.equals(localdate1.minusDays(1L))) {
         return R() + " " + s;
      } else {
         return localdate.getYear() != localdate1.getYear()
            ? zoneddatetime.format(DateTimeFormatter.ofPattern(R[1]))
            : zoneddatetime.format(DateTimeFormatter.ofPattern(R[2]));
      }
   }

   private static String R() {
      return class11938.P().N() == class11999.RU ? M[1] : M[2];
   }
}
