package NurikWare;

import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import minecraft.class01391;
import minecraft.class01422;
import minecraft.class02579;
import minecraft.class02583;
import minecraft.class02609;
import minecraft.class06830;
import minecraft.class07311;
import minecraft.class07331;

public class class11913 extends class01422 {
   private static String[] j;
   public Object N_0;
   public Object N_1;
   public static Object y_0;
   public static Object y_1 = N(0.2F, 1.0F, -0.7F);
   public static Object y_2 = N(-0.2F, 1.0F, 0.7F);

   public void L() {
   }

   private static void M() {
      j = new String[3];
      j[0] = "glint";
      j[1] = "Sampler0";
      j[2] = "Sampler0";
   }

   private float M(int var1) {
      return (var1 / 16.0F + 0.5F) / 16.0F;
   }

   public class11913() {
      super(new class02579(256), new LinkedHashMap());
      this.i();
      this.N_0 = new LinkedHashMap();
      this.N_1 = new ArrayList();
   }

   static {
      M();
      z();
   }

   private void i() {
   }

   private static void z() {
      y_0 = j[2];
   }

   public void u() {
   }

   private int y(ByteBuffer var1, int var2) {
      int i = var1.get(var2) & 255;
      int jx = var1.get(var2 + 1) & 255;
      int k = var1.get(var2 + 2) & 255;
      return (var1.get(var2 + 3) & 0xFF) << 24 | i << 16 | jx << 8 | k;
   }

   private GpuTextureView y(class07311 var1) {
      Map<String, class06830> map = ((class11105)var1).nurikware$getRenderSetup().N();
      class06830 class06830 = map.get(j[1]);
      if (class06830 == null) {
         class06830 = map.values().stream().findFirst().orElse(null);
      }

      return class06830 == null ? null : class06830.N();
   }

   public List<class11904> y() {
      this.i();
      ArrayList arraylist = new ArrayList(((Map)this.N_0).size());
      ((Map)this.N_0).forEach((var2, var3) -> {
         class11904 class11904 = this.N(var2, var3.N());
         if (class11904 != null) {
            arraylist.add(class11904);
         }
      });
      return arraylist;
   }

   public void N(class07311 var1) {
   }

   private int[] N(DrawMode var1, int var2) {
      if (var1 == DrawMode.QUADS) {
         int i1 = var2 / 4;
         int[] aint1 = new int[i1 * 6];

         for (int jx = 0; jx < i1; jx++) {
            int k = jx * 4;
            int l = jx * 6;
            aint1[l] = k;
            aint1[l + 1] = k + 1;
            aint1[l + 2] = k + 2;
            aint1[l + 3] = k + 2;
            aint1[l + 4] = k + 3;
            aint1[l + 5] = k;
         }

         return aint1;
      } else if (var1 != DrawMode.TRIANGLES) {
         return null;
      } else {
         int[] aint = new int[var2];
         int i = 0;

         while (i < var2) {
            aint[i] = i++;
         }

         return aint;
      }
   }

   private float N(ByteBuffer var1, int var2) {
      float f = var1.get(var2) / 127.0F;
      float f1 = var1.get(var2 + 1) / 127.0F;
      float f2 = var1.get(var2 + 2) / 127.0F;
      float f3 = Math.max(0.0F, ((float[])y_1)[0] * f + ((float[])y_1)[1] * f1 + ((float[])y_1)[2] * f2);
      float f4 = Math.max(0.0F, ((float[])y_2)[0] * f + ((float[])y_2)[1] * f1 + ((float[])y_2)[2] * f2);
      return Math.min(1.0F, (f3 + f4) * 0.6F + 0.4F);
   }

   public void N() {
      this.i();
      ((Map)this.N_0).clear();
      ((List)this.N_1).forEach(class02579::close);
      ((List)this.N_1).clear();
   }

   private static float[] N(float var0, float var1, float var2) {
      float f = (float)Math.sqrt(var0 * var0 + var1 * var1 + var2 * var2);
      return new float[]{var0 / f, var1 / f, var2 / f};
   }

   private int N(int var1, float var2) {
      int i = var1 >>> 24;
      int jx = (int)((var1 >> 16 & 0xFF) * var2);
      int k = (int)((var1 >> 8 & 0xFF) * var2);
      int l = (int)((var1 & 0xFF) * var2);
      return i << 24 | jx << 16 | k << 8 | l;
   }

   private class11904 N(class07311 var1, class02609 var2) {
      if (var2 == null) {
         return null;
      } else if (var1.field_64011.contains(j[0])) {
         var2.close();
         return null;
      } else {
         class02609 class02609 = var2;

         Object object1;
         label122: {
            Object object2;
            label123: {
               class11904 class11904;
               label124: {
                  Object object;
                  try {
                     GpuTextureView gputextureview = this.y(var1);
                     if (gputextureview == null) {
                        object1 = null;
                        break label122;
                     }

                     class02583 class02583 = var2.L();
                     VertexFormat vertexformat = class02583.N();
                     if (vertexformat.contains(VertexFormatElement.POSITION) && vertexformat.contains(VertexFormatElement.UV0)) {
                        int[] aint1 = this.N(class02583.u(), class02583.y());
                        if (aint1 == null) {
                           object2 = null;
                           break label123;
                        }

                        int i = vertexformat.getVertexSize();
                        int jx = vertexformat.getOffset(VertexFormatElement.POSITION);
                        int k = vertexformat.getOffset(VertexFormatElement.UV0);
                        int l = vertexformat.contains(VertexFormatElement.COLOR) ? vertexformat.getOffset(VertexFormatElement.COLOR) : -1;
                        int i1 = vertexformat.contains(VertexFormatElement.UV2) ? vertexformat.getOffset(VertexFormatElement.UV2) : -1;
                        int j1 = vertexformat.contains(VertexFormatElement.NORMAL) ? vertexformat.getOffset(VertexFormatElement.NORMAL) : -1;
                        ByteBuffer bytebuffer = var2.N().duplicate().order(ByteOrder.nativeOrder());
                        int k1 = class02583.y();
                        float[] afloat = new float[k1 * 3];
                        float[] afloat1 = new float[k1 * 2];
                        int[] aint = new int[k1];
                        float[] afloat2 = new float[k1 * 2];
                        float[] afloat3 = new float[k1 * 3];

                        for (int l1 = 0; l1 < k1; l1++) {
                           int i2 = l1 * i;
                           afloat[l1 * 3] = bytebuffer.getFloat(i2 + jx);
                           afloat[l1 * 3 + 1] = bytebuffer.getFloat(i2 + jx + 4);
                           afloat[l1 * 3 + 2] = bytebuffer.getFloat(i2 + jx + 8);
                           afloat1[l1 * 2] = bytebuffer.getFloat(i2 + k);
                           afloat1[l1 * 2 + 1] = bytebuffer.getFloat(i2 + k + 4);
                           afloat2[l1 * 2] = this.M(i1 < 0 ? 240 : bytebuffer.getShort(i2 + i1));
                           afloat2[l1 * 2 + 1] = this.M(i1 < 0 ? 240 : bytebuffer.getShort(i2 + i1 + 2));
                           int j2 = l < 0 ? -1 : this.y(bytebuffer, i2 + l);
                           if (j1 >= 0) {
                              afloat3[l1 * 3] = bytebuffer.get(i2 + j1) / 127.0F;
                              afloat3[l1 * 3 + 1] = bytebuffer.get(i2 + j1 + 1) / 127.0F;
                              afloat3[l1 * 3 + 2] = bytebuffer.get(i2 + j1 + 2) / 127.0F;
                              j2 = this.N(j2, this.N(bytebuffer, i2 + j1));
                           } else {
                              afloat3[l1 * 3 + 2] = 1.0F;
                           }

                           aint[l1] = j2;
                        }

                        class11904 = new class11904(gputextureview, afloat, afloat1, aint, afloat2, afloat3, aint1);
                        break label124;
                     }

                     object = null;
                  } catch (Throwable throwable1) {
                     if (var2 != null) {
                        try {
                           class02609.close();
                        } catch (Throwable throwable) {
                           throwable1.addSuppressed(throwable);
                        }
                     }

                     throw throwable1;
                  }

                  if (var2 != null) {
                     var2.close();
                  }

                  return (class11904)object;
               }

               if (var2 != null) {
                  var2.close();
               }

               return class11904;
            }

            if (var2 != null) {
               var2.close();
            }

            return (class11904)object2;
         }

         if (var2 != null) {
            var2.close();
         }

         return (class11904)object1;
      }
   }

   public class01391 method_73477(class07311 var1) {
      this.i();
      return (class01391)((Map)this.N_0).computeIfAbsent(var1, var1x -> {
         this.i();
         class02579 class02579 = new class02579(var1x.method_22722());
         ((List)this.N_1).add(class02579);
         return new class07331(class02579, var1x.method_23033(), var1x.method_23031());
      });
   }
}
