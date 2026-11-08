package NurikWare;

import org.apache.logging.log4j.LogManager;

public class class11185 {
   public static Object N_0 = P("target_scan.frag");
   public static Object N_1 = P("waypoint_scan.frag");
   public static Object N_2 = N("text_alpha_mask.vert", "text_alpha_mask.frag", false);
   public static Object N_3 = N("text_alpha_mask.vert", "text_alpha_mask.frag", true);
   public static Object N_4;
   public static Object y_0 = P("target_head.frag");
   public static Object y_1 = P("target_health_ring.frag");
   public static Object L_0 = P("depth_mask.frag");
   public static Object L_1 = P("flood.frag");
   public static Object L_2 = P("outline_pass.frag");
   public static Object L_3 = P("uv_seed.frag");
   public static Object L_4 = P("jump_flood.frag");
   public static Object L_5 = P("esp_mix.frag");
   public static Object L_6 = P("grayscale_fade.frag");
   public static Object u_0 = P("color_picker_pipette_preview.frag");
   public static Object u_1 = P("depth_filter.frag");
   public static Object i_0 = P("sky_borealis_aurora.frag");
   public static Object i_1 = P("shockwave.frag");
   public static Object i_2 = P("chams.frag");
   public static Object i_3;
   public static Object i_4;
   public static Object i_5 = P("sparkle.frag");
   public static Object R_0 = LogManager.getLogger(String.class);
   public static Object R_1;
   public static Object R_2 = Q("default.vert");
   public static Object R_3 = N("blurred_round_rect.frag", false);
   public static Object M_0 = P("sky_aurora.frag");
   public static Object M_1 = P("sky_borealis.frag");
   public static Object B_0 = N(10, 0.0F, 1.0F);
   public static Object B_1 = N(15, 1.0F, 0.0F);
   public static Object B_2 = N(15, 0.0F, 1.0F);
   public static Object B_3 = P("downscale.frag");
   public static Object B_4 = P("downscale_composite.frag");
   public static Object B_5 = P("texture_copy.frag");
   public static Object Z_0 = N("blurred_round_rect.frag", true);
   public static Object Z_1 = P("color_multiply.frag");
   public static Object Z_2 = P("layer_composite.frag");
   public static Object Z_3 = P("color_picker_alpha.frag");
   public static Object Z_4 = P("color_picker_gradient.frag");
   public static Object Z_5 = P("color_picker_hue.frag");
   public static Object z_0;
   public static Object z_1;
   public static Object U_0 = P("glows.frag");
   public static Object U_1 = P("glowf.frag");
   public static Object U_2 = N().N("gaussian.frag").N();
   public static Object U_3 = M();
   public static Object U_4 = N(5, 1.0F, 0.0F);
   public static Object U_5 = N(5, 0.0F, 1.0F);
   public static Object U_6 = N(10, 1.0F, 0.0F);
   public static Object E_0;
   public static Object E_1 = N(false, false);
   public static Object E_2 = N(false, true);
   public static Object E_3 = N(true, false);
   public static Object E_4 = N(true, true);
   public static Object E_5;
   public static Object E_6;
   public static Object E_7;
   public static Object W_0;

   private static class09322 M() {
      return ((class11193)U_2).N().N("radius", class11169.INT).N("weights", class11169.FLOAT_ARRAY).N("direction", class11169.VEC2).y();
   }

   private static class09322 P(String var0) {
      return new class09322((String)R_2, Q(var0));
   }

   private static String Q(String var0) {
      return "shaders/" + var0;
   }

   private class11185() {
      super();
      ((class09322)N_4).N("Scene", 0);
      ((class09322)z_0).N("Scene", 0);
      ((class09322)z_1).N("Scene", 0);
      ((class09322)E_0).N("Scene", 0);
   }

   static {
      B();
      String s = Q("ghost.vert");
      i_3 = new class09322(s, Q("ghost.frag"));
      String s1 = Q("hands.vert");
      i_4 = new class09322(s1, Q("hands.frag"));
      String s2 = Q("pos_color.vert");
      N_4 = new class09322(s2, Q("pos_color.frag"));
      String s3 = Q("line.vert");
      z_0 = new class09322(s3, Q("line.frag"));
      String s4 = Q("blockesp_cube.vert");
      z_1 = new class09322(s4, Q("pos_color.frag"));
      String s5 = Q("trajectory_grid.vert");
      E_0 = new class09322(s5, Q("trajectory_grid.frag"));
      String s6 = Q("kill_effect.vert");
      E_5 = new class09322(s6, Q("kill_effect.frag"));
      String s7 = Q("particle_instanced.vert");
      E_6 = new class09322(s7, Q("particle_instanced.frag"));
      String s8 = Q("arc_instanced.vert");
      E_7 = new class09322(s8, Q("arc_instanced.frag"));
      String s9 = Q("font.vert");
      W_0 = new class09322(s9, Q("font.frag"));
   }

   private static void B() {
      R_0 = null;
      R_1 = "shaders/";
      R_2 = null;
      R_3 = null;
      Z_0 = null;
      Z_1 = null;
      Z_2 = null;
      Z_3 = null;
      Z_4 = null;
      Z_5 = null;
      u_0 = null;
      u_1 = null;
      L_0 = null;
      L_1 = null;
      L_2 = null;
      L_3 = null;
      L_4 = null;
      L_5 = null;
      L_6 = null;
      U_0 = null;
      U_1 = null;
      U_2 = null;
      U_3 = null;
      U_4 = null;
      U_5 = null;
      U_6 = null;
      B_0 = null;
      B_1 = null;
      B_2 = null;
      B_3 = null;
      B_4 = null;
      B_5 = null;
      M_0 = null;
      M_1 = null;
      i_0 = null;
      i_1 = null;
      i_2 = null;
      i_3 = null;
      i_4 = null;
      i_5 = null;
      y_0 = null;
      y_1 = null;
      N_0 = null;
      N_1 = null;
      N_2 = null;
      N_3 = null;
      N_4 = null;
      z_0 = null;
      z_1 = null;
      E_0 = null;
      E_1 = null;
      E_2 = null;
      E_3 = null;
      E_4 = null;
      E_5 = null;
      E_6 = null;
      E_7 = null;
      W_0 = null;
   }

   private static float[] y(int var0) {
      int i = var0 - 1;
      float f = Math.max(i / 3.0F, 1.0F);
      float[] afloat = new float[30];
      double d0 = 0.0;

      for (int j = 0; j <= i; j++) {
         double d1 = Math.exp(-(j * j) / (2.0 * f * f));
         afloat[j] = (float)d1;
         d0 += j == 0 ? d1 : d1 * 2.0;
      }

      for (int k = 0; k <= i; k++) {
         afloat[k] = (float)(afloat[k] / d0);
      }

      return afloat;
   }

   public static class11172 N() {
      return class11193.N("shaders/");
   }

   private static class09322 N(boolean var0, boolean var1) {
      return N().N("ui_uber.vert", "ui_uber.frag").N("CLIP_USE_LOOP", var1).N("BLUR_ENABLED", var0).y();
   }

   private static class09322 N(String var0, boolean var1) {
      return N().N(var0).N("CLIP_USE_LOOP", var1).y();
   }

   private static class09322 N(int var0, float var1, float var2) {
      return ((class11193)U_2).N().N("radius", var0 - 1).N("weights", y(var0)).N("direction", new float[]{var1, var2}).y();
   }

   private static class09322 N(String var0, String var1, boolean var2) {
      return N().N(var0, var1).N("CLIP_USE_LOOP", var2).y();
   }
}
