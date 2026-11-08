package NurikWare;

import com.google.gson.annotations.SerializedName;

public record class11675(String name, String password, String lastLogin) {
   @SerializedName("name")
   public String L() {
      return this.name;
   }

   public class11675(String name, String password, String lastLogin) {
      super();
      this.name = name;
      this.password = password;
      this.lastLogin = lastLogin;
   }

   @SerializedName("password")
   public String y() {
      return this.password;
   }

   @SerializedName("last-login")
   public String N() {
      return this.lastLogin;
   }
}
