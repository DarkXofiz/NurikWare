package NurikWare;

import java.awt.geom.PathIterator;
import java.awt.geom.Path2D.Double;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Point;
import org.locationtech.jts.geom.Polygon;
import org.locationtech.jts.operation.polygonize.Polygonizer;
import org.locationtech.jts.operation.union.UnaryUnionOp;

final class class09737 {
   private static final double N = 6.0E-4;
   private static final double y = 1.0E-7;
   private static final GeometryFactory L = new GeometryFactory();

   private class09737() {
      super();
   }

   private static void N(List<Coordinate[]> var0, List<Coordinate> var1) {
      if (var1 != null && var1.size() >= 3) {
         Coordinate coordinate = (Coordinate)var1.get(0);
         Coordinate coordinate1 = (Coordinate)var1.get(var1.size() - 1);
         if (coordinate.x != coordinate1.x || coordinate.y != coordinate1.y) {
            var1.add(new Coordinate(coordinate.x, coordinate.y));
         }

         if (var1.size() >= 4) {
            var0.add(var1.toArray(new Coordinate[0]));
         }
      }
   }

   private static long N(Geometry var0) {
      long i = class09716.y();

      for (int j = 0; j < var0.getNumGeometries(); j++) {
         if (var0.getGeometryN(j) instanceof Polygon polygon) {
            N(i, polygon.getExteriorRing().getCoordinates());

            for (int k = 0; k < polygon.getNumInteriorRing(); k++) {
               N(i, polygon.getInteriorRingN(k).getCoordinates());
            }
         }
      }

      return i;
   }

   private static void N(long var0, Coordinate[] var2) {
      if (var2.length >= 4) {
         long i = class09716.L(var0);

         for (int j = 0; j < var2.length - 1; j++) {
            Coordinate coordinate = var2[j];
            Coordinate coordinate1 = var2[j + 1];
            if (Math.abs(coordinate.x - coordinate1.x) >= 1.0E-7 || Math.abs(coordinate.y - coordinate1.y) >= 1.0E-7) {
               class09716.N(i, coordinate.x, coordinate.y, coordinate1.x, coordinate1.y);
            }
         }
      }
   }

   private static List<Coordinate[]> N(Double var0) {
      ArrayList arraylist = new ArrayList();
      PathIterator pathiterator = var0.getPathIterator(null, 6.0E-4);
      double[] adouble = new double[6];

      ArrayList arraylist1;
      for (arraylist1 = null; !pathiterator.isDone(); pathiterator.next()) {
         switch (pathiterator.currentSegment(adouble)) {
            case 0:
               N(arraylist, arraylist1);
               arraylist1 = new ArrayList();
               arraylist1.add(new Coordinate(adouble[0], adouble[1]));
               break;
            case 1:
               if (arraylist1 != null) {
                  arraylist1.add(new Coordinate(adouble[0], adouble[1]));
               }
            case 2:
            case 3:
            default:
               break;
            case 4:
               N(arraylist, arraylist1);
               arraylist1 = null;
         }
      }

      N(arraylist, arraylist1);
      return arraylist;
   }

   static long N(long var0) {
      Double d0 = class09716.y(var0);
      if (d0 == null) {
         return 0L;
      } else {
         List<Coordinate[]> list = N(d0);
         if (list.isEmpty()) {
            return 0L;
         } else {
            ArrayList arraylist = new ArrayList(list.size());

            for (Coordinate[] acoordinate : list) {
               arraylist.add(L.createLineString(acoordinate));
            }

            Geometry geometry;
            try {
               geometry = L.buildGeometry(arraylist).union();
            } catch (RuntimeException runtimeexception1) {
               return 0L;
            }

            Polygonizer polygonizer = new Polygonizer();
            polygonizer.add(geometry);
            Collection collection = polygonizer.getPolygons();
            if (collection.isEmpty()) {
               return 0L;
            } else {
               ArrayList arraylist1 = new ArrayList();

               for (Polygon polygon : collection) {
                  Point point = polygon.getInteriorPoint();
                  if (N(point.getX(), point.getY(), list) != 0) {
                     arraylist1.add(polygon);
                  }
               }

               if (arraylist1.isEmpty()) {
                  return 0L;
               } else {
                  Geometry geometry1;
                  try {
                     geometry1 = UnaryUnionOp.union(arraylist1);
                  } catch (RuntimeException runtimeexception) {
                     geometry1 = L.buildGeometry(arraylist1).buffer(0.0);
                  }

                  return geometry1 != null && !geometry1.isEmpty() ? N(geometry1) : 0L;
               }
            }
         }
      }
   }

   private static double N(Coordinate var0, Coordinate var1, double var2, double var4) {
      return (var1.x - var0.x) * (var4 - var0.y) - (var2 - var0.x) * (var1.y - var0.y);
   }

   private static int N(double var0, double var2, List<Coordinate[]> var4) {
      int i = 0;

      for (Coordinate[] acoordinate : var4) {
         for (int j = 0; j < acoordinate.length - 1; j++) {
            Coordinate coordinate = acoordinate[j];
            Coordinate coordinate1 = acoordinate[j + 1];
            if (coordinate.y <= var2) {
               if (coordinate1.y > var2 && N(coordinate, coordinate1, var0, var2) > 0.0) {
                  i++;
               }
            } else if (coordinate1.y <= var2 && N(coordinate, coordinate1, var0, var2) < 0.0) {
               i--;
            }
         }
      }

      return i;
   }
}
