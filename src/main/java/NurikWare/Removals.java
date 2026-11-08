package NurikWare;

import java.util.Iterator;
import java.util.List;
import minecraft.class04909;

@class11080(
   L = "Removals",
   y = class11072.VISUAL,
   N = class11106.SCREEN
)
public class Removals extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object u_0;
   public Object u_1;
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public Object R_0;
   public Object R_1;
   public Object R_2;
   public Object R_3;
   public Object R_4;
   public Object R_5;
   public Object R_6;
   public Object R_7;
   public Object M_0;
   public Object M_1;

   private void T() {
   }

   public Removals() {
      super();
      this.T();
      this.L_0 = new class11422("tilt-view", true, class09315.class);
      this.L_1 = new class11422("vignette-overlay", true, class09338.class);
      this.L_2 = new class11422("fire-overlay", true, class10962.class);
      this.L_3 = new class11422("under-water-overlay", true, class10960.class);
      this.M_0 = new class11422("wall-overlay", true, class10978.class);
      this.M_1 = new class11422("rain", true, class09323.class);
      this.i_0 = new class11422("fog", true, class10981.class);
      this.i_1 = new class11422("blindness", true, class10993.class);
      this.i_2 = new class11422("nausea", true, class10956.class);
      this.R_0 = new class11422("totem-pop", true, class09350.class);
      this.R_1 = new class11422("status-effect-overlay", true, class10995.class);
      this.R_2 = new class11422("scoreboard", true, class10979.class);
      this.R_3 = new class11451("holograms", true);
      this.R_4 = new class11418("camera-clip", true);
      this.R_5 = new class11416("heart-effect", true);
      this.R_6 = new class11455("fishing-bobber", true);
      this.R_7 = class11524.y(
         this,
         "removals",
         (class11422)this.M_0,
         (class11422)this.L_3,
         (class11422)this.L_2,
         (class11422)this.L_0,
         (class11422)this.L_1,
         (class11451)this.R_3,
         (class11418)this.R_4,
         (class11422)this.i_1,
         (class11416)this.R_5,
         (class11422)this.i_2,
         (class11422)this.M_1,
         (class11422)this.i_0,
         (class11422)this.R_0,
         (class11422)this.R_1,
         (class11422)this.R_2,
         (class11455)this.R_6
      );
      this.u_0 = class11524.y(
         this,
         "sounds",
         new class11406("trident", true, class04909.QC, class04909.yh),
         new class11406("wither-spawn", true, class04909.Jy),
         new class11406("end-portal-open", true, class04909.Ui),
         new class11406("anarchy-events", true, class04909.Oa, class04909.zK, class04909.db),
         new class11406("exp-bottle", true, class04909.QB, class04909.Us)
      );
      this.u_1 = class11524.N(this, "sound-multiplier", 0.5F, 0.0F, 1.0F, 0.01F);
   }

   private void N(Object var1) {
      this.T();
      ((List)((class11523)this.R_7).i()).forEach(var1x -> var1x.y(var1));
   }

   @class11782
   public void N(class09326 var1) {
      this.T();
      Iterator iterator = ((List)((class11523)this.u_0).i()).iterator();

      while (iterator.hasNext()) {
         if (((class11406)iterator.next()).test(var1)) {
            var1.N(((class11504)this.u_1).i());
         }
      }
   }
}
