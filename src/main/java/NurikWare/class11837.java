package NurikWare;

public record class11837(String iconPath, int iconColor, String text, Runnable onClick, boolean disabled) {

   public boolean L() {
      return this.disabled;
   }

   public class11837(String var1, int var2, String var3, Runnable var4) {
      this(var1, var2, var3, var4, false);
   }

   public class11837(String iconPath, int iconColor, String text, Runnable onClick, boolean disabled) {
      super();
      this.iconPath = iconPath;
      this.iconColor = iconColor;
      this.text = text;
      this.onClick = onClick;
      this.disabled = disabled;
   }

   public class11837(String var1, int var2, Runnable var3) {
      this(var1, var2, null, var3, false);
   }

   public Runnable i() {
      return this.onClick;
   }

   public String u() {
      return this.iconPath;
   }

   public int y() {
      return this.iconColor;
   }

   public String N() {
      return this.text;
   }
}
