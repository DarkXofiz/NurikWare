package NurikWare;

import java.awt.geom.Area;
import java.awt.geom.PathIterator;
import java.awt.geom.Path2D.Double;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.util.msdfgen.MSDFGen;
import org.lwjgl.util.msdfgen.MSDFGenVector2;

public final class class09716 {
   private static final double N = 1.0E-6;
   private static final double y = 1.0E-7;
   private static volatile class09747 L = class09747.JTS;

   static long L(long var0) {
      MemoryStack memorystack = MemoryStack.stackPush();

      long i;
      try {
         PointerBuffer pointerbuffer = memorystack.mallocPointer(1);
         N(MSDFGen.msdf_shape_add_contour(var0, pointerbuffer), "add_contour");
         i = pointerbuffer.get(0);
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

      return i;
   }

   private class09716() {
      super();
   }

   private static long u(long var0) {
      Double d0 = y(var0);
      return d0 == null ? 0L : N(new Area(d0));
   }

   static Double y(long var0) {
      MemoryStack memorystack = MemoryStack.stackPush();

      Double d0;
      label78: {
         Double d1;
         try {
            PointerBuffer pointerbuffer = memorystack.mallocPointer(1);
            N(MSDFGen.msdf_shape_get_contour_count(var0, pointerbuffer), "contour_count");
            long i = pointerbuffer.get(0);
            if (i == 0L) {
               d0 = null;
               break label78;
            }

            d0 = new Double(1);
            MSDFGenVector2 msdfgenvector2 = MSDFGenVector2.malloc(memorystack);

            for (long j = 0L; j < i; j++) {
               PointerBuffer pointerbuffer1 = memorystack.mallocPointer(1);
               N(MSDFGen.msdf_shape_get_contour(var0, j, pointerbuffer1), "get_contour");
               long k = pointerbuffer1.get(0);
               PointerBuffer pointerbuffer2 = memorystack.mallocPointer(1);
               N(MSDFGen.msdf_contour_get_edge_count(k, pointerbuffer2), "edge_count");
               long l = pointerbuffer2.get(0);
               if (l != 0L) {
                  boolean flag = false;

                  for (long i1 = 0L; i1 < l; i1++) {
                     PointerBuffer pointerbuffer3 = memorystack.mallocPointer(1);
                     N(MSDFGen.msdf_contour_get_edge(k, i1, pointerbuffer3), "get_edge");
                     double[] adouble = N(pointerbuffer3.get(0), msdfgenvector2);
                     if (!flag) {
                        d0.moveTo(adouble[0], adouble[1]);
                        flag = true;
                     }

                     switch ((adouble.length - 2) / 2) {
                        case 1:
                           d0.lineTo(adouble[2], adouble[3]);
                           break;
                        case 2:
                           d0.quadTo(adouble[2], adouble[3], adouble[4], adouble[5]);
                           break;
                        case 3:
                           d0.curveTo(adouble[2], adouble[3], adouble[4], adouble[5], adouble[6], adouble[7]);
                           break;
                        default:
                           throw new IllegalStateException("unexpected point count " + adouble.length);
                     }
                  }

                  if (flag) {
                     d0.closePath();
                  }
               }
            }

            d1 = d0;
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

         return d1;
      }

      if (memorystack != null) {
         memorystack.close();
      }

      return d0;
   }

   static long y() {
      MemoryStack memorystack = MemoryStack.stackPush();

      long i;
      try {
         PointerBuffer pointerbuffer = memorystack.mallocPointer(1);
         N(MSDFGen.msdf_shape_alloc(pointerbuffer), "shape_alloc");
         i = pointerbuffer.get(0);
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

      return i;
   }

   private static void N(long var0, int var2, MSDFGenVector2 var3, double var4, double var6) {
      var3.set(var4, var6);
      N(MSDFGen.msdf_segment_set_point(var0, var2, var3), "set_point");
   }

   private static long N(MemoryStack var0, int var1) {
      PointerBuffer pointerbuffer = var0.mallocPointer(1);
      N(MSDFGen.msdf_segment_alloc(var1, pointerbuffer), "segment_alloc");
      return pointerbuffer.get(0);
   }

   static void N(long var0, double var2, double var4, double var6, double var8, double var10, double var12, double var14, double var16) {
      MemoryStack memorystack = MemoryStack.stackPush();

      try {
         long i = N(memorystack, 2);
         MSDFGenVector2 msdfgenvector2 = MSDFGenVector2.malloc(memorystack);
         N(i, 0, msdfgenvector2, var2, var4);
         N(i, 1, msdfgenvector2, var6, var8);
         N(i, 2, msdfgenvector2, var10, var12);
         N(i, 3, msdfgenvector2, var14, var16);
         N(MSDFGen.msdf_contour_add_edge(var0, i), "add_edge");
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

   static void N(long var0, double var2, double var4, double var6, double var8, double var10, double var12) {
      MemoryStack memorystack = MemoryStack.stackPush();

      try {
         long i = N(memorystack, 1);
         MSDFGenVector2 msdfgenvector2 = MSDFGenVector2.malloc(memorystack);
         N(i, 0, msdfgenvector2, var2, var4);
         N(i, 1, msdfgenvector2, var6, var8);
         N(i, 2, msdfgenvector2, var10, var12);
         N(MSDFGen.msdf_contour_add_edge(var0, i), "add_edge");
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

   private static boolean N(double var0, double var2, double var4, double var6) {
      return Math.abs(var0 - var4) < 1.0E-6 && Math.abs(var2 - var6) < 1.0E-6;
   }

   static void N(int var0, String var1) {
      if (var0 != 0) {
         throw new IllegalStateException("msdfgen " + var1 + " failed (err=" + var0 + ")");
      }
   }

   public static long N(long var0) {
      return switch (L) {
         case JTS -> class09737.N(var0);
         case AWT_AREA -> u(var0);
      };
   }

   private static void N(long var0, List<class09739> var2) {
      long i = L(var0);
      double d0 = 0.0;
      double d1 = 0.0;
      double d2 = 0.0;
      double d3 = 0.0;

      for (class09739 class09739 : var2) {
         double[] adouble = class09739.y();
         switch (class09739.N()) {
            case 0:
               d0 = d2 = adouble[0];
               d1 = d3 = adouble[1];
               break;
            case 1:
               if (!N(d0, d1, adouble[0], adouble[1])) {
                  N(i, d0, d1, adouble[0], adouble[1]);
               }

               d0 = adouble[0];
               d1 = adouble[1];
               break;
            case 2:
               N(i, d0, d1, adouble[0], adouble[1], adouble[2], adouble[3]);
               d0 = adouble[2];
               d1 = adouble[3];
               break;
            case 3:
               N(i, d0, d1, adouble[0], adouble[1], adouble[2], adouble[3], adouble[4], adouble[5]);
               d0 = adouble[4];
               d1 = adouble[5];
               break;
            case 4:
               if (!N(d0, d1, d2, d3)) {
                  N(i, d0, d1, d2, d3);
               }

               d0 = d2;
               d1 = d3;
         }
      }
   }

   private static double N(List<class09739> var0) {
      double d0 = 0.0;
      double d1 = 0.0;
      double d2 = 0.0;
      double d3 = 0.0;
      double d4 = 0.0;

      for (class09739 class09739 : var0) {
         double d5;
         double d6;
         switch (class09739.N()) {
            case 0:
               d0 = d2 = class09739.y()[0];
               d1 = d3 = class09739.y()[1];
               continue;
            case 1:
               d5 = class09739.y()[0];
               d6 = class09739.y()[1];
               break;
            case 2:
               d5 = class09739.y()[2];
               d6 = class09739.y()[3];
               break;
            case 3:
               d5 = class09739.y()[4];
               d6 = class09739.y()[5];
               break;
            case 4:
               d5 = d0;
               d6 = d1;
               break;
            default:
               continue;
         }

         d4 += d2 * d6 - d5 * d3;
         d2 = d5;
         d3 = d6;
      }

      return d4 * 0.5;
   }

   private static long N(Area var0) {
      MemoryStack memorystack = MemoryStack.stackPush();

      long i;
      try {
         PointerBuffer pointerbuffer = memorystack.mallocPointer(1);
         N(MSDFGen.msdf_shape_alloc(pointerbuffer), "shape_alloc");
         i = pointerbuffer.get(0);
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

      ArrayList arraylist = new ArrayList();
      ArrayList arraylist1 = null;
      PathIterator pathiterator = var0.getPathIterator(null);

      for (double[] adouble = new double[6]; !pathiterator.isDone(); pathiterator.next()) {
         int j = pathiterator.currentSegment(adouble);
         if (j == 0) {
            arraylist1 = new ArrayList();
            arraylist.add(arraylist1);
         }

         if (arraylist1 != null) {
            arraylist1.add(new class09739(j, (double[])adouble.clone()));
         }
      }

      for (List list : arraylist) {
         if (!(Math.abs(N(list)) < 1.0E-7)) {
            N(i, list);
         }
      }

      return i;
   }

   private static double[] N(long var0, MSDFGenVector2 var2) {
      MemoryStack memorystack = MemoryStack.stackPush();

      double[] adouble1;
      try {
         PointerBuffer pointerbuffer = memorystack.mallocPointer(1);
         N(MSDFGen.msdf_segment_get_point_count(var0, pointerbuffer), "point_count");
         int i = (int)pointerbuffer.get(0);
         double[] adouble = new double[i * 2];

         for (int j = 0; j < i; j++) {
            N(MSDFGen.msdf_segment_get_point(var0, j, var2), "get_point");
            adouble[j * 2] = var2.x();
            adouble[j * 2 + 1] = var2.y();
         }

         adouble1 = adouble;
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

      return adouble1;
   }

   public static class09747 N() {
      return L;
   }

   public static void N(class09747 var0) {
      L = var0;
   }

   static void N(long var0, double var2, double var4, double var6, double var8) {
      MemoryStack memorystack = MemoryStack.stackPush();

      try {
         long i = N(memorystack, 0);
         MSDFGenVector2 msdfgenvector2 = MSDFGenVector2.malloc(memorystack);
         N(i, 0, msdfgenvector2, var2, var4);
         N(i, 1, msdfgenvector2, var6, var8);
         N(MSDFGen.msdf_contour_add_edge(var0, i), "add_edge");
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
}
