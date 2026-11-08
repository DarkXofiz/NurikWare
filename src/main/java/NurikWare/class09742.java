package NurikWare;

import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import org.lwjgl.CLongBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.freetype.FT_Face;
import org.lwjgl.util.freetype.FT_MM_Var;
import org.lwjgl.util.freetype.FT_Var_Axis;
import org.lwjgl.util.freetype.FT_Vector;
import org.lwjgl.util.freetype.FreeType;

public final class class09742 implements AutoCloseable {
   private static final int[] N;
   private final class09734 y;
   private final byte[] L;
   private final long u;
   private final class09735 i;
   private final int R;
   private final double M;
   private final double B;
   private final int Z = 1;
   private final long z;
   private final ByteBuffer U;
   private final FT_Face E;
   private final int W;
   private final boolean m;
   private final class09730 P;
   private final class09718 s;
   private final class09752 T = new class09752();
   private final class09731 b = new class09731();
   private class09726 j;
   private int[] v = new int[64];
   private int n;
   private class09726 t;
   private final IntOpenHashSet G = new IntOpenHashSet(256);
   private int[] l = new int[256];
   private int[] d = new int[256];
   private int[] w = new int[256];
   private int[] k = new int[256];
   private int[] Y = new int[256];
   private int Q;
   private final int[] O = new int[2];
   private int[] g;
   private class09761[] I;
   private final BlockingQueue<int[]> J = new LinkedBlockingQueue<>();
   private final Queue<class09724> o = new ConcurrentLinkedQueue<>();
   private final Executor q;
   private final Queue<class09745> K = new ConcurrentLinkedQueue<>();
   private final List<class09745> V = Collections.synchronizedList(new ArrayList<>());
   private volatile boolean e;
   private Thread H;

   public ByteBuffer L() {
      return this.j.u();
   }

   public boolean L(int var1) {
      return FreeType.FT_Get_Char_Index(this.E, var1) != 0;
   }

   public int M() {
      return 1;
   }

   private void P() {
      int ix = this.t.N();
      if (ix >= this.y.R()) {
         throw new IllegalStateException("atlas exceeded max page size " + this.y.R() + "px");
      } else {
         int jx = Math.min(this.y.R(), ix * 2);
         class09726 class09726x = new class09726(jx, jx, this.R);
         int[] aint = this.s();

         for (int kx = 0; kx < this.Q; kx++) {
            int lx = aint[kx];
            if (this.d[lx] != 0) {
               if (!class09726x.N(this.d[lx], this.w[lx], 1, this.O)) {
                  throw new IllegalStateException("repack failed at " + jx + "px");
               }

               class09726x.N(this.t, this.k[lx], this.Y[lx], this.d[lx], this.w[lx], this.O[0], this.O[1]);
               this.k[lx] = this.O[0];
               this.Y[lx] = this.O[1];
            }
         }

         class09726 class09726x = this.t;
         this.t = class09726x;
         int i1 = this.Q;
         this.o
            .offer(
               new class09720(
                  class09726x,
                  class09726x,
                  jx,
                  jx,
                  Arrays.copyOf(this.l, i1),
                  Arrays.copyOf(this.k, i1),
                  Arrays.copyOf(this.Y, i1),
                  Arrays.copyOf(this.d, i1),
                  Arrays.copyOf(this.w, i1),
                  i1
               )
            );
      }
   }

   private class09742(byte[] var1, class09734 var2, Executor var3) {
      super();
      if (var3 == null) {
         throw new IllegalArgumentException("bakeExecutor");
      } else {
         this.y = var2;
         this.L = var1;
         this.q = var3;
         this.i = var2.y();
         this.R = this.i.N();
         this.M = var2.L();
         this.B = var2.u();
         this.u = N(var1);
         MemoryStack memorystack = MemoryStack.stackPush();

         try {
            PointerBuffer pointerbuffer = memorystack.mallocPointer(1);
            if (FreeType.FT_Init_FreeType(pointerbuffer) != 0) {
               throw new IllegalStateException("FT_Init_FreeType failed");
            }

            this.z = pointerbuffer.get(0);
         } catch (Throwable throwable3) {
            if (memorystack != null) {
               try {
                  memorystack.close();
               } catch (Throwable throwable1) {
                  throwable3.addSuppressed(throwable1);
               }
            }

            throw throwable3;
         }

         if (memorystack != null) {
            memorystack.close();
         }

         this.U = MemoryUtil.memAlloc(var1.length);
         this.U.put(var1).flip();
         memorystack = MemoryStack.stackPush();

         try {
            PointerBuffer pointerbuffer1 = memorystack.mallocPointer(1);
            if (FreeType.FT_New_Memory_Face(this.z, this.U, 0L, pointerbuffer1) != 0) {
               MemoryUtil.memFree(this.U);
               FreeType.FT_Done_FreeType(this.z);
               throw new IllegalStateException("FT_New_Memory_Face failed");
            }

            this.E = FT_Face.create(pointerbuffer1.get(0));
         } catch (Throwable throwable2) {
            if (memorystack != null) {
               try {
                  memorystack.close();
               } catch (Throwable throwable) {
                  throwable2.addSuppressed(throwable);
               }
            }

            throw throwable2;
         }

         if (memorystack != null) {
            memorystack.close();
         }

         this.W = Math.max(1, this.E.units_per_EM() & '\uffff');
         this.E();
         this.m = FreeType.FT_HAS_KERNING(this.E);
         this.P = class09730.N(var1);
         this.s = new class09718((double)this.E.ascender() / this.W, (double)this.E.descender() / this.W, (double)this.E.height() / this.W);
         class09726 class09726 = new class09726(var2.i(), var2.i(), this.R);
         this.j = class09726;
         this.t = class09726;
      }
   }

   public class09734 B() {
      return this.y;
   }

   public long Z() {
      return this.u;
   }

   public int i() {
      return this.j.y();
   }

   private int[] s() {
      int ix = this.Q;
      int[] aint = new int[ix];
      int jx = 0;

      while (jx < ix) {
         aint[jx] = jx++;
      }

      for (int j1 = 1; j1 < ix; j1++) {
         int kx = aint[j1];
         int lx = this.w[kx];

         int i1;
         for (i1 = j1 - 1; i1 >= 0 && this.w[aint[i1]] < lx; i1--) {
            aint[i1 + 1] = aint[i1];
         }

         aint[i1 + 1] = kx;
      }

      return aint;
   }

   private class09745 m() {
      class09745 class09745 = this.K.poll();
      if (class09745 != null) {
         return class09745;
      } else {
         class09745 = class09745.N(this.L);
         this.y(class09745);
         this.V.add(class09745);
         return class09745;
      }
   }

   private void U() {
      this.e = true;
      this.H = N(this::W, "msdf-atlas-coordinator");
      this.H.start();
   }

   @Override
   public void close() {
      this.e = false;
      this.J.offer(N);

      try {
         this.H.join();
      } catch (InterruptedException interruptedexception) {
         Thread.currentThread().interrupt();
      }

      synchronized (this.V) {
         Iterator<class09745> iterator = this.V.iterator();

         while (iterator.hasNext()) {
            iterator.next().close();
         }

         this.V.clear();
      }

      this.K.clear();
      this.N();
      this.j.i();
      FreeType.FT_Done_Face(this.E);
      FreeType.FT_Done_FreeType(this.z);
      MemoryUtil.memFree(this.U);
   }

   public class09718 z() {
      return this.s;
   }

   private class09761 u(int var1) {
      class09745 class09745 = this.m();

      class09761 class09761;
      try {
         class09761 = class09745.N(var1, this.M, this.B, this.i);
      } finally {
         this.N(class09745);
      }

      return class09761;
   }

   public int u() {
      return this.j.N();
   }

   private void y(Path var1) {
      class09746 class09746 = class09758.N(var1);
      if (class09746 != null) {
         if (class09746.N() == this.u
            && class09746.y() == this.i.ordinal()
            && class09746.L() == this.M
            && class09746.u() == this.B
            && class09746.R() == this.R
            && Double.compare(class09746.i(), this.y.M()) == 0) {
            this.g = class09746.M();
            this.I = class09746.B();
         }
      }
   }

   public double y(int var1) {
      int ix = FreeType.FT_Get_Char_Index(this.E, var1);
      if (ix == 0) {
         return 0.0;
      } else {
         MemoryStack memorystack = MemoryStack.stackPush();

         double d0;
         label47: {
            try {
               CLongBuffer clongbuffer = memorystack.mallocCLong(1);
               if (FreeType.FT_Get_Advance(this.E, ix, 1, clongbuffer) != 0) {
                  d0 = 0.0;
                  break label47;
               }

               d0 = (double)clongbuffer.get(0) / this.W;
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

            return d0;
         }

         if (memorystack != null) {
            memorystack.close();
         }

         return d0;
      }
   }

   private void y(class09745 var1) {
      double d0 = this.y.M();
      if (!Double.isNaN(d0) && var1.y() != null) {
         var1.N((float)d0);
      }
   }

   public boolean y() {
      return this.b.N();
   }

   private void E() {
      double d0 = this.y.M();
      if (!Double.isNaN(d0)) {
         MemoryStack memorystack = MemoryStack.stackPush();

         label128: {
            label129: {
               try {
                  PointerBuffer pointerbuffer = memorystack.mallocPointer(1);
                  if (FreeType.FT_Get_MM_Var(this.E, pointerbuffer) != 0) {
                     break label128;
                  }

                  FT_MM_Var ft_mm_var = FT_MM_Var.create(pointerbuffer.get(0));

                  try {
                     int ix = ft_mm_var.num_axis();
                     long jx = ft_mm_var.axis().address();
                     long[] along = new long[ix];
                     int kx = -1;

                     for (int lx = 0; lx < ix; lx++) {
                        FT_Var_Axis ft_var_axis = FT_Var_Axis.create(jx + (long)lx * FT_Var_Axis.SIZEOF);
                        along[lx] = ft_var_axis.def();
                        if (ft_var_axis.tag() == 2003265652L) {
                           kx = lx;
                        }
                     }

                     if (kx < 0) {
                        break label129;
                     }

                     along[kx] = Math.round(d0 * 65536.0);
                     CLongBuffer clongbuffer = memorystack.mallocCLong(ix);
                     clongbuffer.put(along).flip();
                     FreeType.FT_Set_Var_Design_Coordinates(this.E, clongbuffer);
                  } finally {
                     FreeType.FT_Done_MM_Var(this.z, ft_mm_var);
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

               return;
            }

            if (memorystack != null) {
               memorystack.close();
            }

            return;
         }

         if (memorystack != null) {
            memorystack.close();
         }
      }
   }

   private void N(int var1, int var2, int var3, int var4, int var5) {
      if (this.Q == this.l.length) {
         int ix = this.l.length * 2;
         this.l = Arrays.copyOf(this.l, ix);
         this.d = Arrays.copyOf(this.d, ix);
         this.w = Arrays.copyOf(this.w, ix);
         this.k = Arrays.copyOf(this.k, ix);
         this.Y = Arrays.copyOf(this.Y, ix);
      }

      this.l[this.Q] = var1;
      this.d[this.Q] = var2;
      this.w[this.Q] = var3;
      this.k[this.Q] = var4;
      this.Y[this.Q] = var5;
      this.Q++;
   }

   private static int[] N(class09761[] var0) {
      int ix = var0.length;
      int[] aint = new int[ix];
      int jx = 0;

      while (jx < ix) {
         aint[jx] = jx++;
      }

      for (int j1 = 1; j1 < ix; j1++) {
         int kx = aint[j1];
         int lx = var0[kx] == null ? -1 : var0[kx].u();

         int i1;
         for (i1 = j1 - 1; i1 >= 0 && (var0[aint[i1]] == null ? -1 : var0[aint[i1]].u()) < lx; i1--) {
            aint[i1 + 1] = aint[i1];
         }

         aint[i1 + 1] = kx;
      }

      return aint;
   }

   private void N(int var1, class09761 var2) {
      if (this.G.add(var1)) {
         if (var2.N()) {
            this.N(var1, 0, 0, 0, 0);
            this.o.offer(N(var1, var2, 0, 0, 0, 0));
         } else {
            int ix = var2.L();
            int jx = var2.u();

            while (!this.t.N(ix, jx, 1, this.O)) {
               this.P();
            }

            int kx = this.O[0];
            int lx = this.O[1];
            this.t.N(var2.y(), ix, jx, kx, lx);
            this.N(var1, ix, jx, kx, lx);
            this.o.offer(N(var1, var2, kx, lx, ix, jx));
         }
      }
   }

   public static class09742 N(Path var0, class09734 var1, Executor var2) throws IOException {
      class09742 class09742 = new class09742(Files.readAllBytes(var0), var1, var2);
      class09742.U();
      return class09742;
   }

   private static class09750 N(int var0, class09761 var1, int var2, int var3, int var4, int var5) {
      return new class09750(var0, (float)var1.R(), (float)var1.M(), (float)var1.B(), (float)var1.Z(), (float)var1.z(), var2, var3, var4, var5, 0);
   }

   public void N(Path var1) throws IOException {
      class09758.N(var1, this.u, this.y, this.T, this.j);
   }

   private static Thread N(Runnable var0, String var1) {
      Thread thread = new Thread(var0, var1);
      thread.setDaemon(true);
      return thread;
   }

   private static long N(byte[] var0) {
      long ix = -3750763034362895579L;

      for (byte b0 : var0) {
         ix ^= b0 & 255;
         ix *= 1099511628211L;
      }

      return ix;
   }

   private static void N(int var0, Exception var1) {
      System.err.println("[FontAtlas] failed to bake U+" + Integer.toHexString(var0) + ": " + var1);
   }

   public void N(int var1) {
      if (this.T.N(var1) == -2) {
         this.T.y(var1);
         if (this.n == this.v.length) {
            this.v = Arrays.copyOf(this.v, this.v.length * 2);
         }

         this.v[this.n++] = var1;
      }
   }

   public class09731 N() {
      this.b.B();
      this.b.u = this.R;
      this.b.i = 0;
      this.b.y = this.j.N();
      this.b.L = this.j.y();

      class09724 class09724;
      while ((class09724 = this.o.poll()) != null) {
         if (class09724 instanceof class09750 class09750) {
            this.T.N(class09750);
            if (class09750.Z() > 0) {
               this.b.N(class09750.M(), class09750.B(), class09750.Z(), class09750.z());
            }
         } else if (class09724 instanceof class09720 class09720) {
            this.N(class09720);
         }
      }

      if (this.n > 0) {
         this.J.offer(Arrays.copyOf(this.v, this.n));
         this.n = 0;
      }

      return this.b;
   }

   public double N(int var1, int var2) {
      int ix = FreeType.FT_Get_Char_Index(this.E, var1);
      int jx = FreeType.FT_Get_Char_Index(this.E, var2);
      if (ix == 0 || jx == 0) {
         return 0.0;
      } else if (!this.P.N()) {
         return (double)this.P.N(ix, jx) / this.W;
      } else if (this.m) {
         MemoryStack memorystack = MemoryStack.stackPush();

         double d0;
         label58: {
            try {
               FT_Vector ft_vector = FT_Vector.malloc(memorystack);
               if (FreeType.FT_Get_Kerning(this.E, ix, jx, 2, ft_vector) != 0) {
                  d0 = 0.0;
                  break label58;
               }

               d0 = (double)ft_vector.x() / this.W;
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

            return d0;
         }

         if (memorystack != null) {
            memorystack.close();
         }

         return d0;
      } else {
         return 0.0;
      }
   }

   public static class09742 N(byte[] var0, class09734 var1, Executor var2) {
      class09742 class09742 = new class09742((byte[])var0.clone(), var1, var2);
      class09742.U();
      return class09742;
   }

   private void N(class09720 var1) {
      this.j = var1.N();
      int[] aint = var1.i();
      int[] aint1 = var1.R();
      int[] aint2 = var1.M();
      int[] aint3 = var1.B();
      int[] aint4 = var1.Z();

      for (int ix = 0; ix < var1.z(); ix++) {
         int jx = this.T.L(aint[ix]);
         if (jx >= 0) {
            this.T.N(jx, aint1[ix], aint2[ix], aint3[ix], aint4[ix], 0);
         }
      }

      if (var1.y() != null) {
         var1.y().i();
      }

      this.b.N = true;
      this.b.y = this.j.N();
      this.b.L = this.j.y();
      this.b.Z();

      for (int kx = 0; kx < var1.z(); kx++) {
         if (aint3[kx] > 0) {
            this.b.N(aint1[kx], aint2[kx], aint3[kx], aint4[kx]);
         }
      }
   }

   public static class09742 N(Path var0, class09734 var1, Path var2, Executor var3) throws IOException {
      class09742 class09742 = new class09742(Files.readAllBytes(var0), var1, var3);
      class09742.y(var2);
      class09742.U();
      return class09742;
   }

   public boolean N(int var1, float var2, class09719 var3) {
      int ix = this.T.L(var1);
      if (ix >= 0) {
         this.T.N(ix, var2, this.j.N(), this.j.y(), (float)this.B, (float)this.M, var3);
         return true;
      } else if (ix == -1) {
         return false;
      } else {
         this.N(var1);
         return false;
      }
   }

   public static class09742 N(byte[] var0, class09734 var1, Path var2, Executor var3) {
      class09742 class09742 = new class09742((byte[])var0.clone(), var1, var3);
      class09742.y(var2);
      class09742.U();
      return class09742;
   }

   private void N(int[] var1) {
      int ix = 0;

      for (int jx : var1) {
         if (!this.G.contains(jx)) {
            var1[ix++] = jx;
         }
      }

      if (ix != 0) {
         class09761[] aclass09761 = new class09761[ix];
         CompletableFuture[] acompletablefuture = new CompletableFuture[ix];

         for (int lx = 0; lx < ix; lx++) {
            int j1 = var1[lx];
            acompletablefuture[lx] = CompletableFuture.supplyAsync(() -> this.u(j1), this.q);
         }

         for (int i1 = 0; i1 < ix; i1++) {
            try {
               aclass09761[i1] = (class09761)acompletablefuture[i1].get();
            } catch (Exception exception) {
               aclass09761[i1] = null;
               N(var1[i1], exception);
            }
         }

         int[] aint = N(aclass09761);

         for (int k1 = 0; k1 < ix; k1++) {
            int kx = aint[k1];
            if (aclass09761[kx] != null) {
               this.N(var1[kx], aclass09761[kx]);
            }
         }
      }
   }

   private void N(class09745 var1) {
      this.K.offer(var1);
   }

   private void W() {
      try {
         if (this.I != null) {
            int[] aint = N(this.I);

            for (int ix = 0; ix < this.I.length; ix++) {
               int jx = aint[ix];
               if (this.I[jx] != null) {
                  this.N(this.g[jx], this.I[jx]);
               }
            }

            this.I = null;
            this.g = null;
         }

         while (true) {
            int[] aint1 = this.J.take();
            if (aint1 == N) {
               break;
            }

            this.N(aint1);
         }
      } catch (InterruptedException interruptedexception) {
         Thread.currentThread().interrupt();
      }
   }

   public int R() {
      return this.R;
   }
}
