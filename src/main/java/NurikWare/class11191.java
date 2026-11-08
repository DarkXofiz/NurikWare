package NurikWare;

// $VF: synthetic class
public class class11191 {
   public static Object N_0 = new int[class11181.values().length];
   public static Object N_1 = new int[class11199.values().length];
   public static Object N_2 = new int[class11175.values().length];

   private static void L() {
      N_0 = null;
      N_1 = null;
      N_2 = null;
   }

   static {
      L();
      ((int[])N_2)[class11199.NEAREST.ordinal()] = 1;
      ((int[])N_2)[class11175.CLAMP_TO_BORDER.ordinal()] = 2;
      ((int[])N_2)[class11175.REPEAT.ordinal()] = 3;
      ((int[])N_2)[class11175.MIRRORED_REPEAT.ordinal()] = 4;
      ((int[])N_1)[class11199.NEAREST.ordinal()] = 1;
      ((int[])N_1)[class11199.LINEAR.ordinal()] = 2;
      ((int[])N_1)[class11199.NEAREST_MIPMAP_NEAREST.ordinal()] = 3;
      ((int[])N_1)[class11199.LINEAR_MIPMAP_NEAREST.ordinal()] = 4;
      ((int[])N_1)[class11199.NEAREST_MIPMAP_LINEAR.ordinal()] = 5;
      ((int[])N_1)[class11199.LINEAR_MIPMAP_LINEAR.ordinal()] = 6;
      ((int[])N_0)[class11181.RGBA8.ordinal()] = 1;
      ((int[])N_0)[class11181.RGB8.ordinal()] = 2;
      ((int[])N_0)[class11181.RGB16F.ordinal()] = 3;
      ((int[])N_0)[class11181.RG16F.ordinal()] = 4;
      ((int[])N_0)[class11181.DEPTH32.ordinal()] = 5;
   }
}
