package NurikWare;

import fun.crashsystem.jdrpc.entity.User;

public class class11472 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;

   public void L(int var1) {
      this.y_1 = var1;
   }

   public int L() {
      return (Integer)this.y_1;
   }

   public void L(String var1) {
      this.N_2 = var1;
   }

   public int M() {
      return (Integer)this.N_0;
   }

   public class11472() {
      super();
      this.m();
      this.y_1 = -1;
      this.y_2 = -1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof class11472 class11472)) {
         return false;
      } else if (!class11472.N(this)) {
         return false;
      } else if (this.M() != class11472.M()) {
         return false;
      } else if (this.R() != class11472.R()) {
         return false;
      } else if (this.z() != class11472.z()) {
         return false;
      } else if (this.L() != class11472.L()) {
         return false;
      } else if (this.U() != class11472.U()) {
         return false;
      } else {
         String s = this.Z();
         String s1 = class11472.Z();
         if (s == null ? s1 == null : s.equals(s1)) {
            String s2 = this.B();
            String s3 = class11472.B();
            if (s2 == null ? s3 == null : s2.equals(s3)) {
               String s4 = this.y();
               String s5 = class11472.y();
               if (s4 == null ? s5 == null : s4.equals(s5)) {
                  class11802 class11802x = this.i();
                  class11802 class11802x = class11472.i();
                  if (class11802x == null ? class11802x == null : class11802x.equals(class11802x)) {
                     String s6 = this.u();
                     String s7 = class11472.u();
                     if (s6 == null ? s7 == null : s6.equals(s7)) {
                        User user = this.N();
                        User user1 = class11472.N();
                        return user == null ? user1 == null : user.equals(user1);
                     } else {
                        return false;
                     }
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   @Override
   public String toString() {
      return "ClientUser(uid="
         + this.M()
         + ", username="
         + this.Z()
         + ", apiToken="
         + this.B()
         + ", hasPremium="
         + this.R()
         + ", subscribeTimeMinutes="
         + this.z()
         + ", hash="
         + this.y()
         + ", role="
         + this.i()
         + ", prefixIndex="
         + this.L()
         + ", avatarTextureId="
         + this.U()
         + ", avatarBase64="
         + this.u()
         + ", discordUser="
         + this.N()
         + ")";
   }

   @Override
   public int hashCode() {
      byte b0 = 59;
      int i = 1;
      i = i * 59 + this.M();
      i = i * 59 + (this.R() ? 79 : 97);
      long j = this.z();
      i = i * 59 + (int)(j >>> 32 ^ j);
      i = i * 59 + this.L();
      i = i * 59 + this.U();
      String s = this.Z();
      i = i * 59 + (s == null ? 43 : s.hashCode());
      String s1 = this.B();
      i = i * 59 + (s1 == null ? 43 : s1.hashCode());
      String s2 = this.y();
      i = i * 59 + (s2 == null ? 43 : s2.hashCode());
      class11802 class11802 = this.i();
      i = i * 59 + (class11802 == null ? 43 : class11802.hashCode());
      String s3 = this.u();
      i = i * 59 + (s3 == null ? 43 : s3.hashCode());
      User user = this.N();
      return i * 59 + (user == null ? 43 : user.hashCode());
   }

   public String B() {
      return (String)this.N_2;
   }

   public String Z() {
      return (String)this.N_1;
   }

   public class11802 i() {
      return (class11802)this.y_0;
   }

   private void m() {
      this.N_0 = 0;
      this.y_1 = 0;
      this.N_3 = false;
      this.y_2 = 0;
      this.N_4 = 0L;
   }

   public int U() {
      return (Integer)this.y_2;
   }

   public long z() {
      return 999999999L;
   }

   public void u(String var1) {
      this.N_5 = var1;
   }

   public String u() {
      return (String)this.y_3;
   }

   public void y(int var1) {
      this.N_0 = var1;
   }

   public String y() {
      return (String)this.N_5;
   }

   public void y(String var1) {
      this.y_3 = var1;
   }

   public void N(long var1) {
      this.N_4 = var1;
   }

   public void N(User var1) {
      this.y_4 = var1;
   }

   public void N(int var1) {
      this.y_2 = var1;
   }

   public void N(String var1) {
      this.N_1 = var1;
   }

   public void N(boolean var1) {
      this.N_3 = var1;
   }

   public boolean N(Object var1) {
      return var1 instanceof class11472;
   }

   public User N() {
      return (User)this.y_4;
   }

   public void N(class11802 var1) {
      this.y_0 = var1;
   }

   public boolean R() {
      return true;
   }
}
