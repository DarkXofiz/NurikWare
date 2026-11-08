package NurikWare;

import com.mojang.blaze3d.buffers.Std140Builder;
import java.nio.ByteBuffer;
import minecraft.class00063;
import org.joml.Matrix4fc;
import org.joml.Vector3fc;
import org.joml.Vector4fc;

public record class09110(Matrix4fc modelView, Vector4fc colorModulator, Vector3fc modelOffset, Matrix4fc textureMatrix) implements class00063 {
   public Vector3fc L() {
      return this.modelOffset;
   }


   public Matrix4fc u() {
      return this.textureMatrix;
   }

   public Vector4fc y() {
      return this.colorModulator;
   }

   public void N(ByteBuffer var1) {
      Std140Builder.intoBuffer(var1).putMat4f(this.modelView).putVec4(this.colorModulator).putVec3(this.modelOffset).putMat4f(this.textureMatrix);
   }

   public Matrix4fc N() {
      return this.modelView;
   }
}
