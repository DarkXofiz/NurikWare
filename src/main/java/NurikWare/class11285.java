package NurikWare;

// $VF: synthetic class
public class class11285 {
   public static Object N_0 = new int[class09251.values().length];
   public static Object N_1 = new int[class11794.values().length];
   public static Object N_2 = new int[class11318.values().length];

   static {
      N();
      ((int[])N_2)[class09251.LIST_RESPONSE.ordinal()] = 1;
      ((int[])N_2)[class11318.CREATE.ordinal()] = 2;
      ((int[])N_2)[class11318.DELETE.ordinal()] = 3;
      ((int[])N_2)[class11318.REFRESH.ordinal()] = 4;
      ((int[])N_1)[class09251.LIST_RESPONSE.ordinal()] = 1;
      ((int[])N_1)[class11794.UPDATED.ordinal()] = 2;
      ((int[])N_1)[class11794.ALREADY_ACTIVATED.ordinal()] = 3;
      ((int[])N_1)[class11794.OWN_LINK.ordinal()] = 4;
      ((int[])N_0)[class09251.LIST_RESPONSE.ordinal()] = 1;
      ((int[])N_0)[class09251.CREATE_RESPONSE.ordinal()] = 2;
      ((int[])N_0)[class09251.DELETE_RESPONSE.ordinal()] = 3;
      ((int[])N_0)[class09251.NACK.ordinal()] = 4;
      ((int[])N_0)[class09251.ACTIVATE_RESPONSE.ordinal()] = 5;
      ((int[])N_0)[class09251.REFRESH_RESPONSE.ordinal()] = 6;
   }

   private static void N() {
      N_0 = null;
      N_1 = null;
      N_2 = null;
   }
}
