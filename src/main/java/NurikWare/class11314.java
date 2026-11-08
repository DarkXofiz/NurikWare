package NurikWare;

// $VF: synthetic class
public class class11314 {
   public static Object N_0 = new int[class09277.values().length];
   public static Object N_1 = new int[class11298.values().length];
   public static Object N_2 = new int[class11296.values().length];

   private static void L() {
      N_0 = null;
      N_1 = null;
      N_2 = null;
   }

   static {
      L();
      ((int[])N_2)[class11298.CREATE.ordinal()] = 1;
      ((int[])N_2)[class11296.DIRTY.ordinal()] = 2;
      ((int[])N_2)[class11296.LOCAL.ordinal()] = 3;
      ((int[])N_2)[class11296.DELETING.ordinal()] = 4;
      ((int[])N_1)[class11298.CREATE.ordinal()] = 1;
      ((int[])N_1)[class11298.UPDATE.ordinal()] = 2;
      ((int[])N_1)[class11298.DELETE.ordinal()] = 3;
      ((int[])N_1)[class11298.RENAME.ordinal()] = 4;
      ((int[])N_1)[class11298.LOAD.ordinal()] = 5;
      ((int[])N_0)[class09277.LIST_RESPONSE.ordinal()] = 1;
      ((int[])N_0)[class09277.CREATE_RESPONSE.ordinal()] = 2;
      ((int[])N_0)[class09277.UPDATE_RESPONSE.ordinal()] = 3;
      ((int[])N_0)[class09277.GET_RESPONSE.ordinal()] = 4;
      ((int[])N_0)[class09277.DELETE_RESPONSE.ordinal()] = 5;
      ((int[])N_0)[class09277.RENAME_RESPONSE.ordinal()] = 6;
      ((int[])N_0)[class09277.NACK.ordinal()] = 7;
   }
}
