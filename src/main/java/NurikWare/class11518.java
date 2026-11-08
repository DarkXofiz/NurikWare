package NurikWare;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import minecraft.class06202;
import minecraft.class07533;
import minecraft.class07536;

public class class11518 {
   public static Object N_0 = y();

   private static void L() {
      N_0 = null;
   }

   private class11518() {
      super();
   }

   static {
      L();
   }

   private static Path y() {
      return class07536.m() == class07533.field_1137
         ? ((File)class06202.Nq().l_1).toPath().resolve("NurikWare")
         : Paths.get(System.getProperty("user.home"), "AppData", "Roaming", "NurikWare");
   }
}
