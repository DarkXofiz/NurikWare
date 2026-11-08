package NurikWare;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class class09674 {
   private static final Properties Z;
   private String z;
   public boolean N = true;
   public boolean y = true;
   public boolean L = true;
   public boolean u = true;
   public class09684 i = class09684.LAST_TO_FIRST;
   public class09664 R = class09664.NORMAL;
   public class09688 M = class09688.PROPORTIONAL;
   public static boolean B;

   class09674(String var1) {
      super();
      this.z = var1;
   }

   public void y() {
      try {
         File file1 = new File(this.z);
         boolean flag = file1.exists();
         File file2 = file1.getParentFile();
         if (!file2.exists()) {
            file2.mkdirs();
         }

         FileWriter filewriter = new FileWriter(file1);
         N(filewriter, "RMBTweak", this.N);
         N(filewriter, "LMBTweakWithItem", this.y);
         N(filewriter, "LMBTweakWithoutItem", this.L);
         N(filewriter, "WheelTweak", this.u);
         N(filewriter, "WheelSearchOrder", String.valueOf(this.i.ordinal()));
         N(filewriter, "WheelScrollDirection", String.valueOf(this.R.ordinal()));
         N(filewriter, "ScrollItemScaling", String.valueOf(this.M.ordinal()));
         N(filewriter, "Debug", B);
         filewriter.close();
         if (!flag) {
            class09673.N("Created the config file.");
         }
      } catch (IOException ioexception) {
         class09673.N("Failed to write the config file: " + this.z);
         ioexception.printStackTrace();
      }
   }

   private static int N(String var0, int var1) {
      try {
         return Integer.parseInt(var0);
      } catch (NumberFormatException numberformatexception) {
         return var1;
      }
   }

   private static void N(FileWriter var0, String var1, boolean var2) throws IOException {
      N(var0, var1, var2 ? "1" : "0");
   }

   private static void N(FileWriter var0, String var1, String var2) throws IOException {
      var0.write(var1 + "=" + var2 + "\n");
   }

   public void N() {
      Properties properties = new Properties(Z);

      try {
         FileReader filereader = new FileReader(this.z);
         properties.load(filereader);
         filereader.close();
      } catch (FileNotFoundException filenotfoundexception) {
         class09673.N("Generating the config file at: " + this.z);
         this.y();
         return;
      } catch (IOException ioexception) {
         class09673.N("Failed to read the config file: " + this.z);
         ioexception.printStackTrace();
      }

      this.N = N(properties.getProperty("RMBTweak"), 1) != 0;
      this.y = N(properties.getProperty("LMBTweakWithItem"), 1) != 0;
      this.L = N(properties.getProperty("LMBTweakWithoutItem"), 1) != 0;
      this.u = N(properties.getProperty("WheelTweak"), 1) != 0;
      this.i = class09684.N(N(properties.getProperty("WheelSearchOrder"), 1));
      this.R = class09664.N(N(properties.getProperty("WheelScrollDirection"), 0));
      this.M = class09688.N(N(properties.getProperty("ScrollItemScaling"), 0));
      B = N(properties.getProperty("Debug"), 0) != 0;
   }
}
