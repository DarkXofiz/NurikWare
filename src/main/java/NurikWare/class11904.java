package NurikWare;

import com.mojang.blaze3d.textures.GpuTextureView;

public record class11904(GpuTextureView texture, float[] positions, float[] uvs, int[] colors, float[] lights, float[] normals, int[] indices) {

   public int[] L() {
      return this.colors;
   }

   public float[] M() {
      return this.positions;
   }


   public GpuTextureView i() {
      return this.texture;
   }

   public float[] u() {
      return this.uvs;
   }

   public int[] y() {
      return this.indices;
   }

   public float[] N() {
      return this.lights;
   }

   public float[] R() {
      return this.normals;
   }
}
