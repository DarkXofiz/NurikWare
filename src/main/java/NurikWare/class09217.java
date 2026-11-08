package NurikWare;

public class class09217 {
   public static Object N_0 = class09991.N()
      .M()
      .N(class09962.N())
      .y(class09962.N())
      .N(12.0F)
      .B(8.0F)
      .j(4.0F)
      .v(10.0F)
      .L(class09662.N(-16777216, 0.25F))
      .N(class09975.COLUMN)
      .y((Integer)class09181.y_0)
      .u((Integer)class09181.L_2)
      .z(1.0F)
      .Z(12.0F)
      .N(class09983.BORDER_BOX)
      .l(1.0F)
      .W(16.0F)
      .N(var0 -> var0.l(0.0F).W(0.0F))
      .y(var0 -> var0.l(0.0F).W(0.0F))
      .N(class09994.s((class09743)class11644.N_0), class09994.Z((class09743)class11644.N_0));
   public static Object N_1 = class09991.N(class09221.N(20, class09079.REGULAR), class09991.N().i((Integer)class09181.N_0));
   public static Object N_2 = class09991.N(class09221.N(14, class09079.REGULAR), class09991.N().i(class11300.L(6579300, 64.0F)).N(class09964.NOWRAP));
   public static Object y_0 = new class09217()::N;
   public static Object y_1;
   public static Object y_2;
   public static Object y_3;
   public static Object y_4;
   public static Object y_5;

   private class09217() {
      super();
   }

   static {
      N();
      y();
   }

   private static int y(String[] var0, int var1) {
      int i = 1;
      int j = 0;

      for (String s : var0) {
         if (j == 0) {
            j = s.length();
         } else if (j + 1 + s.length() > var1) {
            i++;
            j = s.length();
         } else {
            j += 1 + s.length();
         }
      }

      return i;
   }

   private static void y() {
      y_0 = null;
      y_1 = 12;
      y_2 = 12;
      y_3 = 8;
      y_4 = 16;
      y_5 = 36;
      N_0 = null;
      N_1 = null;
      N_2 = null;
   }

   private static String y(String var0) {
      String s = var0.trim().replaceAll("\\s+", " ");
      if (s.isEmpty()) {
         return s;
      } else {
         String[] astring = s.split(" ");
         if (astring.length == 1) {
            return s;
         } else {
            int i = y(astring, 36);
            int j = 1;
            int k = 36;
            int l = 36;

            while (j <= k) {
               int i1 = (j + k) / 2;
               if (y(astring, i1) <= i) {
                  l = i1;
                  k = i1 - 1;
               } else {
                  j = i1 + 1;
               }
            }

            return N(astring, l);
         }
      }
   }

   private static String N(String[] var0, int var1) {
      StringBuilder stringbuilder = new StringBuilder();
      int i = 0;

      for (String s : var0) {
         if (i == 0) {
            stringbuilder.append(s);
            i = s.length();
         } else if (i + 1 + s.length() > var1) {
            stringbuilder.append('\n').append(s);
            i = s.length();
         } else {
            stringbuilder.append(' ').append(s);
            i += 1 + s.length();
         }
      }

      return stringbuilder.toString();
   }

   private class09798 N(class11846 var1, class09809 var2) {
      class11067 class11067 = var1.L();
      return class09778.N(class09991.N((class09991)N_0, class11629.N(var1.N(), 0.0F, 500)), var2x -> {
         var2x.N(class11067.L(), (class09991)N_1);
         var2x.N(y(var1.y()), (class09991)N_2);
      });
   }

   private static void N() {
   }
}
