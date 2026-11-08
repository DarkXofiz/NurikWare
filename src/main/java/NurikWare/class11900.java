package NurikWare;

import java.util.ArrayDeque;
import java.util.Deque;
import minecraft.class00743;
import minecraft.class02484;
import minecraft.class02575;
import minecraft.class02830;
import minecraft.class04453;
import minecraft.class05462;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07050;
import minecraft.class07482;
import minecraft.class07510;

public class class11900 implements class11819 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public Object N_7;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;

   private void L() {
      class11328 class11328 = (class11328)((Deque)this.N_1).poll();
      if (class11328 != null) {
         int i = class11281.R(class11328);
         if (class11281.y(i)) {
            if ((Integer)this.N_4 == -1 && (Integer)this.y_4 == -1 && this.L(class11328) != null) {
               this.y_3 = class11328;
               this.y_0 = true;
            }
         } else if (!((class04453)((class06202)this.N_0).T_4).method_7357().N((class06584)((class04453)((class06202)this.N_0).T_4).method_31548().u().get(i))) {
            if ((Integer)this.N_4 == -1) {
               this.N_4 = i;
            }

            this.N_5 = i;
            this.y_0 = true;
         }
      }
   }

   private class11297 L(class11328 var1) {
      return class11281.L((class11328)(var2 -> this.N(var2, var1))).findFirst().orElse(null);
   }

   private boolean M() {
      return (Integer)this.N_2 <= 0 && (Integer)this.N_3 <= 0;
   }

   public class11900(int var1) {
      this(var1, 0);
   }

   public class11900(int var1, int var2) {
      super();
      this.N();
      this.N_0 = class06202.Nq();
      this.N_1 = new ArrayDeque();
      this.N_4 = -1;
      this.N_5 = -1;
      this.y_4 = -1;
      this.y_5 = -1;
      this.N_2 = var1;
      this.N_3 = var2;
   }

   private void B() {
      if (!class11938.m().u()
         && (class07482)((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3
            == ((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2
         && ((class07482)((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).M().R()) {
         class06584 class06584 = (class06584)((class04453)((class06202)this.N_0).T_4).method_31548().u().get((Integer)this.y_4);
         class02830 class02830 = (class02830)class06584.method_58694(class02484.D);
         if (class02830 != null && !class02830.M()) {
            int i = class11281.L((Integer)this.y_4);
            if (class02830.Z() && class02830.B() != 0) {
               class05462.N(class06584, 0);
               ((class06202)this.N_0).NE().N(new class02575(i, 0));
            }

            int j = class11281.L((Integer)this.y_5);
            boolean flag = !((class06584)((class04453)((class06202)this.N_0).T_4).method_31548().u().get((Integer)this.y_5)).R();
            class12029 class12029 = class11938.m().N(0, i, 1, class07510.field_7790).N(0, j, 0, class07510.field_7790);
            if (flag) {
               class12029.N(0, i, 0, class07510.field_7790);
            }

            class12029.y();
            this.y_4 = -1;
            this.y_5 = -1;
         } else {
            this.y_4 = -1;
            this.y_5 = -1;
         }
      }
   }

   private void Z() {
      if ((Integer)this.N_3 <= 0) {
         this.z();
      } else {
         this.N_7 = (Integer)this.N_3;
         this.y_2 = true;
      }
   }

   private void i() {
      int i = ((class04453)((class06202)this.N_0).T_4).method_31548().N();
      if (class11281.u((Integer)this.N_5)) {
         class11322.N((Integer)this.N_5);
         this.Z();
         if (this.M()) {
            class11322.i();
            if ((Integer)this.N_4 == (Integer)this.N_5) {
               this.N_4 = -1;
            }
         }
      } else if (this.M()) {
         class11938.m()
            .N(((class07482)((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b, (Integer)this.N_5, i, class07510.field_7791)
            .i()
            .N(new class12008(this::Z))
            .N(((class07482)((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b, (Integer)this.N_5, i, class07510.field_7791)
            .L();
         if ((Integer)this.N_4 == (Integer)this.N_5) {
            this.N_4 = -1;
         }
      } else {
         class11938.m()
            .N(((class07482)((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b, (Integer)this.N_5, i, class07510.field_7791)
            .y((class12040)(var1x -> this.Z()))
            .y();
      }
   }

   private void U() {
      this.N_6 = (Integer)this.N_6 - 1;
      if ((Boolean)this.y_2) {
         if ((Integer)this.N_7 > 0) {
            this.N_7 = (Integer)this.N_7 - 1;
         } else {
            this.y_2 = false;
            this.z();
         }
      } else {
         if (!(Boolean)this.y_0) {
            this.L();
         }

         if ((Boolean)this.y_0) {
            if ((class11328)this.y_3 != null) {
               class11328 class11328 = (class11328)this.y_3;
               this.y_3 = null;
               this.y(class11328);
            } else if ((Boolean)this.y_1) {
               this.Z();
            } else if ((Integer)this.N_5 != -1) {
               this.i();
            }

            this.N_5 = -1;
            this.y_0 = false;
            this.y_1 = false;
         } else {
            if ((Integer)this.N_6 == 0 && (Integer)this.N_4 != -1) {
               int i = ((class04453)((class06202)this.N_0).T_4).method_31548().N();
               if (class11281.u((Integer)this.N_4)) {
                  class11322.i();
               } else {
                  class11938.m()
                     .N(
                        ((class07482)((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b,
                        (Integer)this.N_4,
                        i,
                        class07510.field_7791
                     )
                     .y();
               }

               this.N_4 = -1;
            }

            if ((Integer)this.N_6 <= 0 && (Integer)this.y_4 != -1) {
               this.B();
            }
         }
      }
   }

   private void z() {
      if (!((class04453)((class06202)this.N_0).T_4).method_6047().R()) {
         class11907.N(class07050.field_5808);
         this.N_6 = (Integer)this.N_2;
      }
   }

   private int y() {
      class00743<class06584> class00743 = ((class04453)((class06202)this.N_0).T_4).method_31548().u();

      for (int i = 9; i < class00743.size(); i++) {
         if (((class06584)class00743.get(i)).R()) {
            return i;
         }
      }

      return -1;
   }

   private void y(class11328 var1) {
      if (!class11938.m().u()
         && (class07482)((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3
            == ((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2
         && ((class07482)((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).M().R()) {
         class11297 class11297 = this.L(var1);
         if (class11297 != null) {
            class02830 class02830 = (class02830)class11297.N().method_58694(class02484.D);
            int i = this.N(class02830, var1);
            if (i != -1 && !((class04453)((class06202)this.N_0).T_4).method_7357().N(class02830.N(i))) {
               class06584 class06584 = ((class04453)((class06202)this.N_0).T_4).method_6047();
               boolean flag = !class06584.R() && class02830.i() == 1 && class02830.y(class06584);
               int j = !class06584.R() && !flag ? this.y() : -1;
               if (class06584.R() || flag || !class11281.y(j)) {
                  int k = class11281.L(class11297.y());
                  int l = ((class04453)((class06202)this.N_0).T_4).method_31548().N();
                  int i1 = class11281.L(l);
                  if (class02830.B() != i) {
                     class05462.N(class11297.N(), i);
                     ((class06202)this.N_0).NE().N(new class02575(k, i));
                  }

                  class12029 class12029 = class11938.m().N(0, k, 1, class07510.field_7790).N(0, i1, 0, class07510.field_7790);
                  if (!class06584.R()) {
                     if (flag) {
                        class12029.N(0, k, 0, class07510.field_7790);
                        this.y_4 = class11297.y();
                        this.y_5 = l;
                     } else {
                        class12029.N(0, class11281.L(j), 0, class07510.field_7790);
                        this.N_4 = j;
                     }
                  }

                  class12029.y((class12040)(var1x -> this.Z())).y();
                  this.N_6 = (Integer)this.N_2;
               }
            }
         }
      }
   }

   @Override
   public void y(Object var1) {
      if (var1 instanceof class10992) {
         this.U();
      }
   }

   public void N(int var1) {
      this.N_2 = var1;
   }

   public void N(class11328 var1) {
      ((Deque)this.N_1).add(var1);
   }

   private int N(class02830 var1, class11328 var2) {
      for (int i = 0; i < var1.i(); i++) {
         if (var2.test(var1.N(i))) {
            return i;
         }
      }

      return -1;
   }

   private void N() {
      this.N_2 = 0;
      this.y_0 = false;
      this.N_3 = 0;
      this.y_1 = false;
      this.N_4 = 0;
      this.y_2 = false;
      this.N_5 = 0;
      this.y_4 = 0;
      this.N_6 = 0;
      this.y_5 = 0;
      this.N_7 = 0;
   }

   private boolean N(class06584 var1, class11328 var2) {
      class02830 class02830 = (class02830)var1.method_58694(class02484.D);
      return class02830 == null ? false : class02830.y().anyMatch(var2::test);
   }
}
