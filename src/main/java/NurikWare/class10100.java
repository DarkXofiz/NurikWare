package NurikWare;

import minecraft.class01167;
import minecraft.class03448;
import minecraft.class06143;
import minecraft.class07138;
import org.joml.Vector3f;

public class class10100 extends class01167<class07138> {
   protected class10100(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, class07138 var14, class06143 var15) {
      super(var1, var2, var4, var6, var8, var10, var12, var14, var15);
      float f = this.field_3840.z() * 0.4F + 0.6F;
      Vector3f vector3f = var14.N();
      this.field_62633 = this.N(vector3f.x(), f);
      this.field_62634 = this.N(vector3f.y(), f);
      this.field_62635 = this.N(vector3f.z(), f);
   }
}
