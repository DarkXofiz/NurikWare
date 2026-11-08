package NurikWare;

import com.mojang.blaze3d.buffers.Std140Builder;
import java.nio.ByteBuffer;
import minecraft.class00063;
import org.joml.Matrix4fc;

public record class09112(Matrix4fc modelView, int x, int y, int z, float visibility, int textureAtlasWidth, int textureAtlasHeight) implements class00063 {
   public int L() {
      return this.y;
   }

   public int M() {
      return this.textureAtlasHeight;
   }


   public float i() {
      return this.visibility;
   }

   public int u() {
      return this.z;
   }

   public int y() {
      return this.x;
   }

   public void N(ByteBuffer var1) {
      Std140Builder.intoBuffer(var1)
         .putMat4f(this.modelView)
         .putFloat(this.visibility)
         .putIVec2(this.textureAtlasWidth, this.textureAtlasHeight)
         .putIVec3(this.x, this.y, this.z);
   }

   public Matrix4fc N() {
      return this.modelView;
   }

   public int R() {
      return this.textureAtlasWidth;
   }
}
