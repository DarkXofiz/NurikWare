package NurikWare;

import org.lwjgl.opengl.GL33;

public record class09087(class09069... attrs) {

   public int L() {
      int i = 0;

      for (class09069 class09069 : this.attrs) {
         i += class09069.N();
      }

      return i;
   }


   public void y() {
      int i = this.L();
      int j = 0;

      for (int k = 0; k < this.attrs.length; k++) {
         class09069 class09069 = this.attrs[k];
         GL33.glEnableVertexAttribArray(k);
         if (class09069.i() != 5124 && class09069.i() != 5125) {
            GL33.glVertexAttribPointer(k, class09069.u(), class09069.i(), class09069.L(), i, j);
         } else {
            GL33.glVertexAttribIPointer(k, class09069.u(), class09069.i(), i, j);
         }

         if (class09069.M() != 0) {
            GL33.glVertexAttribDivisor(k, class09069.M());
         }

         j += class09069.N();
      }
   }

   public class09069[] N() {
      return this.attrs;
   }
}
