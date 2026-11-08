package NurikWare;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.CLongBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.freetype.FT_Face;
import org.lwjgl.util.freetype.FT_MM_Var;
import org.lwjgl.util.freetype.FT_Var_Axis;
import org.lwjgl.util.freetype.FreeType;
import org.lwjgl.util.msdfgen.MSDFGen;
import org.lwjgl.util.msdfgen.MSDFGenBitmap;
import org.lwjgl.util.msdfgen.MSDFGenBounds;
import org.lwjgl.util.msdfgen.MSDFGenExt;
import org.lwjgl.util.msdfgen.MSDFGenRange;
import org.lwjgl.util.msdfgen.MSDFGenTransform;
import org.lwjgl.util.msdfgen.MSDFGenVector2;

public final class class09745 implements AutoCloseable {
   public static final double N = 3.0;
   private static final long y = 2003265652L;
   private final FT_Face L;
   private long u;
   private long i;
   private ByteBuffer R;
   private boolean M = true;
   private final class09749 B;
   private final int Z;
   private final long[] z;
   private float U;

   public float L() {
      return this.U;
   }

   public class09755 L(int var1, int var2, int var3, double var4) {
      return this.N(0, 1, false, var1, var2, var3, var4, var4);
   }

   private void L(float var1) {
      MemoryStack memorystack = MemoryStack.stackPush();

      try {
         CLongBuffer clongbuffer = memorystack.mallocCLong(this.z.length);
         clongbuffer.put(this.z);
         clongbuffer.put(this.Z, u(var1));
         clongbuffer.flip();
         y(FreeType.FT_Set_Var_Design_Coordinates(this.L, clongbuffer), "FT_Set_Var_Design_Coordinates");
      } catch (Throwable throwable1) {
         if (memorystack != null) {
            try {
               memorystack.close();
            } catch (Throwable throwable) {
               throwable1.addSuppressed(throwable);
            }
         }

         throw throwable1;
      }

      if (memorystack != null) {
         memorystack.close();
      }
   }

   private class09745(long var1, FT_Face var3, long var4, ByteBuffer var6, class09757 var7) {
      super();
      this.u = var1;
      this.L = var3;
      this.i = var4;
      this.R = var6;
      if (var7 != null) {
         this.B = var7.N();
         this.Z = var7.y();
         this.z = var7.L();
         this.U = var7.N().y();
      } else {
         this.B = null;
         this.Z = -1;
         this.z = null;
         this.U = Float.NaN;
      }
   }

   @Override
   public void close() {
      if (this.i != 0L) {
         MSDFGenExt.msdf_ft_font_destroy(this.i);
         this.i = 0L;
      }

      if (this.u != 0L) {
         FreeType.FT_Done_Face(this.L);
         FreeType.FT_Done_FreeType(this.u);
         this.u = 0L;
      }

      if (this.R != null) {
         MemoryUtil.memFree(this.R);
         this.R = null;
      }
   }

   private static long u() {
      MemoryStack memorystack = MemoryStack.stackPush();

      long ix;
      try {
         PointerBuffer pointerbuffer = memorystack.mallocPointer(1);
         y(FreeType.FT_Init_FreeType(pointerbuffer), "FT_Init_FreeType");
         ix = pointerbuffer.get(0);
      } catch (Throwable throwable1) {
         if (memorystack != null) {
            try {
               memorystack.close();
            } catch (Throwable throwable) {
               throwable1.addSuppressed(throwable);
            }
         }

         throw throwable1;
      }

      if (memorystack != null) {
         memorystack.close();
      }

      return ix;
   }

   private static long u(float var0) {
      return Math.round(var0 * 65536.0);
   }

   private static byte[] y(MSDFGenBitmap var0, int var1) {
      MemoryStack memorystack = MemoryStack.stackPush();

      byte[] abyte1;
      try {
         PointerBuffer pointerbuffer = memorystack.mallocPointer(1);
         N(MSDFGen.msdf_bitmap_get_pixels(var0, pointerbuffer), "get_pixels");
         FloatBuffer floatbuffer = MemoryUtil.memFloatBuffer(pointerbuffer.get(0), var1);
         byte[] abyte = new byte[var1];

         for (int ix = 0; ix < var1; ix++) {
            abyte[ix] = y(floatbuffer.get(ix));
         }

         abyte1 = abyte;
      } catch (Throwable throwable1) {
         if (memorystack != null) {
            try {
               memorystack.close();
            } catch (Throwable throwable) {
               throwable1.addSuppressed(throwable);
            }
         }

         throw throwable1;
      }

      if (memorystack != null) {
         memorystack.close();
      }

      return abyte1;
   }

   private static void y(int var0, String var1) {
      if (var0 != 0) {
         throw new IllegalStateException("FreeType " + var1 + " failed (err=" + var0 + ")");
      }
   }

   public class09755 y(int var1, int var2, int var3, double var4) {
      return this.N(3, 4, true, var1, var2, var3, var4, var4);
   }

   public class09749 y() {
      return this.B;
   }

   public static byte y(float var0) {
      int ix = (int)(var0 * 256.0F);
      if (ix < 0) {
         ix = 0;
      } else if (ix > 255) {
         ix = 255;
      }

      return (byte)ix;
   }

   private class09755 N(int var1, int var2, boolean var3, int var4, int var5, int var6, double var7, double var9) {
      MemoryStack memorystack = MemoryStack.stackPush();

      class09755 class09755;
      try {
         DoubleBuffer doublebuffer = memorystack.mallocDouble(1);
         PointerBuffer pointerbuffer = memorystack.mallocPointer(1);
         N(MSDFGenExt.msdf_ft_font_load_glyph(this.i, var4, 1, doublebuffer, pointerbuffer), "load_glyph");
         long ix = pointerbuffer.get(0);
         long j = this.M ? class09716.N(ix) : 0L;
         long k = j != 0L ? j : ix;

         try {
            N(MSDFGen.msdf_shape_normalize(k), "shape_normalize");
            if (j != 0L) {
               N(MSDFGen.msdf_shape_orient_contours(k), "orient_contours");
            }

            if (var3) {
               N(MSDFGen.msdf_shape_edge_colors_simple(k, 3.0), "edge_colors");
            }

            MSDFGenBounds msdfgenbounds = MSDFGenBounds.malloc(memorystack);
            N(MSDFGen.msdf_shape_get_bounds(k, msdfgenbounds), "get_bounds");
            double d0 = Math.max(msdfgenbounds.r() - msdfgenbounds.l(), msdfgenbounds.t() - msdfgenbounds.b());
            double d1 = d0 > 0.0 ? (Math.min(var5, var6) - 2.0 * var9) / d0 : 1.0;
            MSDFGenBitmap msdfgenbitmap = MSDFGenBitmap.malloc(memorystack);
            N(MSDFGen.msdf_bitmap_alloc(var1, var5, var6, msdfgenbitmap), "bitmap_alloc");

            try {
               MSDFGenVector2 msdfgenvector2 = MSDFGenVector2.malloc(memorystack).set(d1, d1);
               MSDFGenVector2 msdfgenvector21 = MSDFGenVector2.malloc(memorystack).set(var9 / d1 - msdfgenbounds.l(), var9 / d1 - msdfgenbounds.b());
               double d2 = var7 / d1;
               MSDFGenRange msdfgenrange = MSDFGenRange.malloc(memorystack).set(-d2 / 2.0, d2 / 2.0);
               MSDFGenTransform msdfgentransform = MSDFGenTransform.malloc(memorystack);
               msdfgentransform.set(msdfgenvector2, msdfgenvector21, msdfgenrange);
               N(var1, msdfgenbitmap, k, msdfgentransform);
               class09755 = new class09755(N(msdfgenbitmap, var5 * var6 * var2), var5, var6, var2, doublebuffer.get(0));
            } finally {
               MSDFGen.msdf_bitmap_free(msdfgenbitmap);
            }
         } finally {
            if (j != 0L) {
               MSDFGen.msdf_shape_free(j);
            }

            MSDFGen.msdf_shape_free(ix);
         }
      } catch (Throwable throwable1) {
         if (memorystack != null) {
            try {
               memorystack.close();
            } catch (Throwable throwable) {
               throwable1.addSuppressed(throwable);
            }
         }

         throw throwable1;
      }

      if (memorystack != null) {
         memorystack.close();
      }

      return class09755;
   }

   public class09745 N(boolean var1) {
      this.M = var1;
      return this;
   }

   private static class09757 N(long var0, FT_Face var2) {
      MemoryStack memorystack = MemoryStack.stackPush();

      Object object;
      label129: {
         class09757 class09757;
         label130: {
            try {
               PointerBuffer pointerbuffer = memorystack.mallocPointer(1);
               if (FreeType.FT_Get_MM_Var(var2, pointerbuffer) != 0) {
                  object = null;
                  break label129;
               }

               FT_MM_Var ft_mm_var = FT_MM_Var.create(pointerbuffer.get(0));

               try {
                  int ix = ft_mm_var.num_axis();
                  long j = ft_mm_var.axis().address();
                  long[] along = new long[ix];
                  int k = -1;
                  class09749 class09749 = null;

                  for (int l = 0; l < ix; l++) {
                     FT_Var_Axis ft_var_axis = FT_Var_Axis.create(j + (long)l * FT_Var_Axis.SIZEOF);
                     along[l] = ft_var_axis.def();
                     if (ft_var_axis.tag() == 2003265652L) {
                        k = l;
                        class09749 = new class09749(N(ft_var_axis.minimum()), N(ft_var_axis.def()), N(ft_var_axis.maximum()));
                     }
                  }

                  if (k < 0) {
                     class09757 = null;
                     break label130;
                  }

                  class09757 = new class09757(class09749, k, along);
               } finally {
                  FreeType.FT_Done_MM_Var(var0, ft_mm_var);
               }
            } catch (Throwable throwable1) {
               if (memorystack != null) {
                  try {
                     memorystack.close();
                  } catch (Throwable throwable) {
                     throwable1.addSuppressed(throwable);
                  }
               }

               throw throwable1;
            }

            if (memorystack != null) {
               memorystack.close();
            }

            return class09757;
         }

         if (memorystack != null) {
            memorystack.close();
         }

         return class09757;
      }

      if (memorystack != null) {
         memorystack.close();
      }

      return (class09757)object;
   }

   private static float[] N(MSDFGenBitmap var0, int var1) {
      MemoryStack memorystack = MemoryStack.stackPush();

      float[] afloat1;
      try {
         PointerBuffer pointerbuffer = memorystack.mallocPointer(1);
         N(MSDFGen.msdf_bitmap_get_pixels(var0, pointerbuffer), "get_pixels");
         FloatBuffer floatbuffer = MemoryUtil.memFloatBuffer(pointerbuffer.get(0), var1);
         float[] afloat = new float[var1];
         floatbuffer.get(afloat);
         afloat1 = afloat;
      } catch (Throwable throwable1) {
         if (memorystack != null) {
            try {
               memorystack.close();
            } catch (Throwable throwable) {
               throwable1.addSuppressed(throwable);
            }
         }

         throw throwable1;
      }

      if (memorystack != null) {
         memorystack.close();
      }

      return afloat1;
   }

   public class09761 N(int var1, double var2, double var4, class09735 var6) {
      int ix = (int)Math.ceil(var4 / 2.0) + 1;
      double d0 = var2;
      MemoryStack memorystack = MemoryStack.stackPush();

      class09761 class09761;
      label188: {
         class09761 class09761x;
         try {
            DoubleBuffer doublebuffer = memorystack.mallocDouble(1);
            PointerBuffer pointerbuffer = memorystack.mallocPointer(1);
            N(MSDFGenExt.msdf_ft_font_load_glyph(this.i, var1, 1, doublebuffer, pointerbuffer), "load_glyph");
            long j = pointerbuffer.get(0);
            long k = this.M ? class09716.N(j) : 0L;
            long l = k != 0L ? k : j;

            try {
               N(MSDFGen.msdf_shape_normalize(l), "shape_normalize");
               if (k != 0L) {
                  N(MSDFGen.msdf_shape_orient_contours(l), "orient_contours");
               }

               if (var6.L()) {
                  N(MSDFGen.msdf_shape_edge_colors_simple(l, 3.0), "edge_colors");
               }

               MSDFGenBounds msdfgenbounds = MSDFGenBounds.malloc(memorystack);
               N(MSDFGen.msdf_shape_get_bounds(l, msdfgenbounds), "get_bounds");
               double d1 = msdfgenbounds.l();
               double d2 = msdfgenbounds.b();
               double d3 = msdfgenbounds.r();
               double d4 = msdfgenbounds.t();
               double d5 = d3 - d1;
               double d6 = d4 - d2;
               if (d5 > 0.0 && d6 > 0.0) {
                  int j1 = (int)Math.ceil(d5 * d0) + 2 * ix;
                  int i1 = (int)Math.ceil(d6 * d0) + 2 * ix;
                  MSDFGenBitmap msdfgenbitmap = MSDFGenBitmap.malloc(memorystack);
                  N(MSDFGen.msdf_bitmap_alloc(var6.y(), j1, i1, msdfgenbitmap), "bitmap_alloc");

                  try {
                     MSDFGenVector2 msdfgenvector2 = MSDFGenVector2.malloc(memorystack).set(d0, d0);
                     MSDFGenVector2 msdfgenvector21 = MSDFGenVector2.malloc(memorystack).set(ix / d0 - d1, ix / d0 - d2);
                     double d7 = var4 / d0;
                     MSDFGenRange msdfgenrange = MSDFGenRange.malloc(memorystack).set(-d7 / 2.0, d7 / 2.0);
                     MSDFGenTransform msdfgentransform = MSDFGenTransform.malloc(memorystack);
                     msdfgentransform.set(msdfgenvector2, msdfgenvector21, msdfgenrange);
                     N(var6.y(), msdfgenbitmap, l, msdfgentransform);
                     byte[] abyte = y(msdfgenbitmap, j1 * i1 * var6.N());
                     double d8 = d1 - ix / d0;
                     double d9 = d2 - ix / d0;
                     class09761 = new class09761(abyte, j1, i1, var6.N(), d8, d9, d8 + j1 / d0, d9 + i1 / d0, doublebuffer.get(0));
                     break label188;
                  } finally {
                     MSDFGen.msdf_bitmap_free(msdfgenbitmap);
                  }
               }

               class09761x = new class09761(new byte[0], 0, 0, var6.N(), 0.0, 0.0, 0.0, 0.0, doublebuffer.get(0));
            } finally {
               if (k != 0L) {
                  MSDFGen.msdf_shape_free(k);
               }

               MSDFGen.msdf_shape_free(j);
            }
         } catch (Throwable throwable1) {
            if (memorystack != null) {
               try {
                  memorystack.close();
               } catch (Throwable throwable) {
                  throwable1.addSuppressed(throwable);
               }
            }

            throw throwable1;
         }

         if (memorystack != null) {
            memorystack.close();
         }

         return class09761x;
      }

      if (memorystack != null) {
         memorystack.close();
      }

      return class09761;
   }

   private static void N(int var0, MSDFGenBitmap var1, long var2, MSDFGenTransform var4) {
      switch (var0) {
         case 0:
            N(MSDFGen.msdf_generate_sdf(var1, var2, var4), "generate_sdf");
            break;
         case 1:
            N(MSDFGen.msdf_generate_psdf(var1, var2, var4), "generate_psdf");
            break;
         case 2:
            N(MSDFGen.msdf_generate_msdf(var1, var2, var4), "generate_msdf");
            break;
         case 3:
            N(MSDFGen.msdf_generate_mtsdf(var1, var2, var4), "generate_mtsdf");
            break;
         default:
            throw new IllegalArgumentException("unsupported bitmap type " + var0);
      }
   }

   private static class09745 N(long var0, long var2, ByteBuffer var4) {
      FT_Face ft_face = FT_Face.create(var2);
      class09757 class09757 = N(var0, ft_face);
      MemoryStack memorystack = MemoryStack.stackPush();

      class09745 class09745;
      try {
         PointerBuffer pointerbuffer = memorystack.mallocPointer(1);
         int ix = MSDFGenExt.msdf_ft_adopt_font(var2, pointerbuffer);
         if (ix != 0) {
            FreeType.FT_Done_Face(ft_face);
            FreeType.FT_Done_FreeType(var0);
            if (var4 != null) {
               MemoryUtil.memFree(var4);
            }

            throw new IllegalStateException("msdf_ft_adopt_font failed (err=" + ix + ")");
         }

         class09745 = new class09745(var0, ft_face, pointerbuffer.get(0), var4, class09757);
      } catch (Throwable throwable1) {
         if (memorystack != null) {
            try {
               memorystack.close();
            } catch (Throwable throwable) {
               throwable1.addSuppressed(throwable);
            }
         }

         throw throwable1;
      }

      if (memorystack != null) {
         memorystack.close();
      }

      return class09745;
   }

   public static class09745 N(byte[] var0) {
      long ix = u();
      ByteBuffer bytebuffer = MemoryUtil.memAlloc(var0.length);
      bytebuffer.put(var0).flip();
      MemoryStack memorystack = MemoryStack.stackPush();

      class09745 class09745;
      try {
         PointerBuffer pointerbuffer = memorystack.mallocPointer(1);
         int j = FreeType.FT_New_Memory_Face(ix, bytebuffer, 0L, pointerbuffer);
         if (j != 0) {
            MemoryUtil.memFree(bytebuffer);
            FreeType.FT_Done_FreeType(ix);
            throw new IllegalStateException("FT_New_Memory_Face failed (err=" + j + ")");
         }

         class09745 = N(ix, pointerbuffer.get(0), bytebuffer);
      } catch (Throwable throwable1) {
         if (memorystack != null) {
            try {
               memorystack.close();
            } catch (Throwable throwable) {
               throwable1.addSuppressed(throwable);
            }
         }

         throw throwable1;
      }

      if (memorystack != null) {
         memorystack.close();
      }

      return class09745;
   }

   public static class09745 N(String var0) {
      long ix = u();
      MemoryStack memorystack = MemoryStack.stackPush();

      class09745 class09745;
      try {
         PointerBuffer pointerbuffer = memorystack.mallocPointer(1);
         int j = FreeType.FT_New_Face(ix, var0, 0L, pointerbuffer);
         if (j != 0) {
            FreeType.FT_Done_FreeType(ix);
            throw new IllegalStateException("FT_New_Face failed for '" + var0 + "' (err=" + j + ")");
         }

         class09745 = N(ix, pointerbuffer.get(0), null);
      } catch (Throwable throwable1) {
         if (memorystack != null) {
            try {
               memorystack.close();
            } catch (Throwable throwable) {
               throwable1.addSuppressed(throwable);
            }
         }

         throw throwable1;
      }

      if (memorystack != null) {
         memorystack.close();
      }

      return class09745;
   }

   private static void N(int var0, String var1) {
      if (var0 != 0) {
         throw new IllegalStateException("msdfgen " + var1 + " failed (err=" + var0 + ")");
      }
   }

   public class09745 N(float var1) {
      if (!Float.isFinite(var1) || var1 <= 0.0F) {
         throw new IllegalArgumentException("weight must be finite and positive");
      } else if (this.B == null) {
         throw new IllegalStateException("font has no variable 'wght' axis; weight cannot be applied");
      } else {
         float f = Math.max(this.B.N(), Math.min(this.B.L(), var1));
         this.L(f);
         this.U = f;
         return this;
      }
   }

   public class09755 N(int var1, int var2, int var3, double var4) {
      return this.N(2, 3, true, var1, var2, var3, var4, var4);
   }

   public int N(int var1) {
      MemoryStack memorystack = MemoryStack.stackPush();

      int ix;
      try {
         IntBuffer intbuffer = memorystack.mallocInt(1);
         N(MSDFGenExt.msdf_ft_font_get_glyph_index(this.i, var1, intbuffer), "get_glyph_index");
         ix = intbuffer.get(0);
      } catch (Throwable throwable1) {
         if (memorystack != null) {
            try {
               memorystack.close();
            } catch (Throwable throwable) {
               throwable1.addSuppressed(throwable);
            }
         }

         throw throwable1;
      }

      if (memorystack != null) {
         memorystack.close();
      }

      return ix;
   }

   private static float N(long var0) {
      return (float)(var0 / 65536.0);
   }

   public boolean N() {
      return this.M;
   }
}
