package NurikWare;

public final class class09937 implements class09898 {
   private final class10021 N;
   private float y;
   private float L;
   private float u;
   private float i;
   private float R;
   private float M;
   private float B;
   private float Z;
   private float z;
   private float U;
   private float E;
   private float W;
   private int m;
   private float P;
   private String s = "";
   private float T;
   private float b;
   private int j;
   private float v;
   private float n;
   private float t;
   private float G;
   private int l = -1;
   private boolean d;
   private Object w;

   private void w() {
      this.j++;
      this.N.e();
   }

   public void L(float var1) {
      float f = Math.max(0.0F, var1);
      if (!M(this.i, f)) {
         this.i = f;
         this.w();
      }
   }

   public void L(float var1, float var2) {
      if (!M(this.y, var1) || !M(this.L, var2)) {
         this.y = var1;
         this.L = var2;
         this.w();
      }
   }

   @Override
   public float L() {
      return this.L;
   }

   @Override
   public float M() {
      return this.U;
   }

   private static boolean M(float var0, float var1) {
      return Float.floatToIntBits(var0) == Float.floatToIntBits(var1);
   }

   public float P() {
      return this.b;
   }

   public boolean T() {
      return this.d;
   }

   class09937(class10021 var1) {
      super();
      this.N = var1;
   }

   @Override
   public float B() {
      return this.E;
   }

   @Override
   public float Z() {
      return this.W;
   }

   @Override
   public float i() {
      return this.i;
   }

   public void i(float var1, float var2) {
      float f = Math.max(0.0F, class09693.N(var1, var2));
      float f1 = class09693.N(this.T, 0.0F, f);
      if (!M(this.b, f) || !M(this.T, f1)) {
         this.b = f;
         this.T = f1;
         this.w();
      }
   }

   public float b() {
      return this.v;
   }

   public int s() {
      return this.l;
   }

   public float n() {
      return this.G;
   }

   public float l() {
      return this.B;
   }

   public float d() {
      return this.Z;
   }

   public float m() {
      return this.T;
   }

   public float t() {
      return this.R;
   }

   public float v() {
      return this.t;
   }

   public float j() {
      return this.n;
   }

   public float U() {
      return this.P;
   }

   public int z() {
      return this.m;
   }

   @Override
   public float u() {
      return this.u;
   }

   public void u(float var1, float var2) {
      this.B = var1;
      this.Z = var2;
   }

   private float u(float var1) {
      return class09693.N(var1, 0.0F, this.b);
   }

   public void y(float var1, float var2) {
      float f = Math.max(0.0F, var1);
      float f1 = Math.max(0.0F, var2);
      if (!M(this.u, f) || !M(this.i, f1)) {
         this.u = f;
         this.i = f1;
         this.w();
      }
   }

   public void y(float var1) {
      float f = Math.max(0.0F, var1);
      if (!M(this.u, f)) {
         this.u = f;
         this.w();
      }
   }

   @Override
   public float y() {
      return this.y;
   }

   public String E() {
      return this.s;
   }

   public void N(float var1, float var2, float var3, float var4, int var5, boolean var6) {
      this.v = var1;
      this.n = var2;
      this.t = var3;
      this.G = var4;
      this.l = var5;
      this.d = var6;
   }

   public void N(float var1) {
      this.P = var1;
   }

   public void N(float var1, float var2, float var3, float var4) {
      float f = Math.max(0.0F, var3);
      float f1 = Math.max(0.0F, var4);
      if (!M(this.z, var1) || !M(this.U, var2) || !M(this.E, f) || !M(this.W, f1)) {
         this.z = var1;
         this.U = var2;
         this.E = f;
         this.W = f1;
         this.w();
      }
   }

   public Object N() {
      return this.w;
   }

   public void N(String var1) {
      String sx = var1 == null ? "" : var1;
      if (!this.s.equals(sx)) {
         this.s = sx;
         this.w();
      }
   }

   public void N(float var1, float var2) {
      this.R = Math.max(0.0F, var1);
      this.M = Math.max(0.0F, var2);
   }

   public void N(Object var1) {
      this.w = var1;
   }

   public void N(int var1) {
      if (this.m != var1) {
         this.m = var1;
         this.w();
         this.N.H();
      }
   }

   public int W() {
      return this.j;
   }

   @Override
   public float R() {
      return this.z;
   }

   public boolean R(float var1, float var2) {
      float f = class09693.N(var1, var2);
      float f1 = this.u(f);
      if (M(this.T, f1)) {
         return false;
      } else {
         this.T = f1;
         this.w();
         return true;
      }
   }

   public float G() {
      return this.M;
   }
}
