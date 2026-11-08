package NurikWare;

import java.util.Arrays;
import java.util.Comparator;

public enum class12002 {
   UNKNOWN(-1, "None"),
   MOUSE_1(0, "M1"),
   MOUSE_2(1, "M2"),
   MOUSE_3(2, "M3"),
   F14(303, "F14"),
   F15(304, "F15"),
   F16(305, "F16"),
   KP_4(324, "Num 4"),
   KP_5(325, "Num 5"),
   KP_6(326, "Num 6"),
   KP_7(327, "Num 7"),
   KP_8(328, "Num 8"),
   KP_9(329, "Num 9"),
   KP_DECIMAL(330, "Num ."),
   LEFT(263, "Left"),
   DOWN(264, "Down"),
   UP(265, "Up"),
   PAGE_UP(266, "PgUp"),
   PAGE_DOWN(267, "PgDn"),
   HOME(268, "Home"),
   END(269, "End"),
   CAPS_LOCK(280, "Caps"),
   WORLD_2(162, "World 2"),
   ESCAPE(256, "Esc"),
   ENTER(257, "Enter"),
   TAB(258, "Tab"),
   KP_DIVIDE(331, "Num /"),
   KP_MULTIPLY(332, "Num *"),
   S(83, "S"),
   T(84, "T"),
   U(85, "U"),
   V(86, "V"),
   W(87, "W"),
   H(72, "H"),
   I(73, "I"),
   J(74, "J"),
   K(75, "K"),
   COMMA(44, ","),
   MINUS(45, "-"),
   F12(301, "F12"),
   F13(302, "F13"),
   DIGIT_3(51, "3"),
   DIGIT_4(52, "4"),
   DIGIT_5(53, "5"),
   DIGIT_6(54, "6"),
   DIGIT_7(55, "7"),
   DIGIT_8(56, "8"),
   SCROLL_LOCK(281, "Scroll"),
   NUM_LOCK(282, "Num"),
   PRINT_SCREEN(283, "Print"),
   PAUSE(284, "Pause"),
   F1(290, "F1"),
   F2(291, "F2"),
   F3(292, "F3"),
   F4(293, "F4"),
   MOUSE_4(3, "M4"),
   MOUSE_5(4, "M5"),
   MOUSE_6(5, "M6"),
   MOUSE_7(6, "M7"),
   MOUSE_8(7, "M8"),
   SPACE(32, "Space"),
   APOSTROPHE(39, "'"),
   LEFT_ALT(342, "Alt"),
   LEFT_SUPER(343, "Win"),
   RIGHT_SHIFT(344, "RShift"),
   RIGHT_CONTROL(345, "RCtrl"),
   RIGHT_ALT(346, "RAlt"),
   KP_SUBTRACT(333, "Num -"),
   KP_ADD(334, "Num +"),
   F17(306, "F17"),
   F18(307, "F18"),
   F19(308, "F19"),
   F20(309, "F20"),
   F21(310, "F21"),
   F5(294, "F5"),
   F6(295, "F6"),
   F7(296, "F7"),
   F8(297, "F8"),
   F9(298, "F9"),
   F22(311, "F22"),
   F23(312, "F23"),
   F24(313, "F24"),
   F25(314, "F25"),
   KP_0(320, "Num 0"),
   KP_1(321, "Num 1"),
   KP_2(322, "Num 2"),
   KP_3(323, "Num 3"),
   F10(299, "F10"),
   F11(300, "F11"),
   C(67, "C"),
   D(68, "D"),
   E(69, "E"),
   F(70, "F"),
   G(71, "G"),
   KP_ENTER(335, "Num Enter"),
   KP_EQUAL(336, "Num ="),
   LEFT_SHIFT(340, "Shift"),
   LEFT_CONTROL(341, "Ctrl"),
   RIGHT_SUPER(347, "RWin"),
   MENU(348, "Menu"),
   SEMICOLON(59, ";"),
   EQUAL(61, "="),
   DIGIT_0(48, "0"),
   DIGIT_1(49, "1"),
   DIGIT_2(50, "2"),
   L(76, "L"),
   M(77, "M"),
   N(78, "N"),
   X(88, "X"),
   Y(89, "Y"),
   Z(90, "Z"),
   LEFT_BRACKET(91, "["),
   BACKSLASH(92, "\\"),
   RIGHT_BRACKET(93, "]"),
   GRAVE_ACCENT(96, "`"),
   WORLD_1(161, "World 1"),
   PERIOD(46, "."),
   SLASH(47, "/"),
   BACKSPACE(259, "Backspace"),
   INSERT(260, "Ins"),
   DELETE(261, "Del"),
   RIGHT(262, "Right"),
   DIGIT_9(57, "9"),
   A(65, "A"),
   B(66, "B"),
   O(79, "O"),
   P(80, "P"),
   Q(81, "Q"),
   R(82, "R");
   public static Object staticFields_291c77d4eef6663e78b13d1ab4c444dad1_2 = Arrays.stream(values())
      .sorted(Comparator.comparingInt(var0 -> var0.fields_01c77d4eef6663e78b13d1ab4c444dad1_0))
      .toArray(class12002[]::new);
   // $VF: synthetic field
   private static final class12002[] $VALUES = Z();
   public Integer fields_01c77d4eef6663e78b13d1ab4c444dad1_0;
   public String fields_01c77d4eef6663e78b13d1ab4c444dad1_1;
   public boolean fields_01c77d4eef6663e78b13d1ab4c444dad1_init;

   public int L() {
      return this.fields_01c77d4eef6663e78b13d1ab4c444dad1_0;
   }

   private static void M() {
   }

   private class12002(int var3, String var4) {
      this.B();
      this.fields_01c77d4eef6663e78b13d1ab4c444dad1_0 = var3;
      this.fields_01c77d4eef6663e78b13d1ab4c444dad1_1 = var4;
   }

   static {
      M();
   }

   @Override
   public String toString() {
      return this.fields_01c77d4eef6663e78b13d1ab4c444dad1_1;
   }

   private void B() {
      if (!this.fields_01c77d4eef6663e78b13d1ab4c444dad1_init) {
         this.fields_01c77d4eef6663e78b13d1ab4c444dad1_init = true;
         this.fields_01c77d4eef6663e78b13d1ab4c444dad1_0 = 0;
      }
   }

   private static void U() {
      UNKNOWN = null;
      MOUSE_1 = null;
      MOUSE_2 = null;
      MOUSE_3 = null;
      MOUSE_4 = null;
      MOUSE_5 = null;
      MOUSE_6 = null;
      MOUSE_7 = null;
      MOUSE_8 = null;
      SPACE = null;
      APOSTROPHE = null;
      COMMA = null;
      MINUS = null;
      PERIOD = null;
      SLASH = null;
      SEMICOLON = null;
      EQUAL = null;
      DIGIT_0 = null;
      DIGIT_1 = null;
      DIGIT_2 = null;
      DIGIT_3 = null;
      DIGIT_4 = null;
      DIGIT_5 = null;
      DIGIT_6 = null;
      DIGIT_7 = null;
      DIGIT_8 = null;
      DIGIT_9 = null;
      A = null;
      B = null;
      C = null;
      D = null;
      E = null;
      F = null;
      G = null;
      H = null;
      I = null;
      J = null;
      K = null;
      L = null;
      M = null;
      N = null;
      O = null;
      P = null;
      Q = null;
      R = null;
      S = null;
      T = null;
      U = null;
      V = null;
      W = null;
      X = null;
      Y = null;
      Z = null;
      LEFT_BRACKET = null;
      BACKSLASH = null;
      RIGHT_BRACKET = null;
      GRAVE_ACCENT = null;
      WORLD_1 = null;
      WORLD_2 = null;
      ESCAPE = null;
      ENTER = null;
      TAB = null;
      BACKSPACE = null;
      INSERT = null;
      DELETE = null;
      RIGHT = null;
      LEFT = null;
      DOWN = null;
      UP = null;
      PAGE_UP = null;
      PAGE_DOWN = null;
      HOME = null;
      END = null;
      CAPS_LOCK = null;
      SCROLL_LOCK = null;
      NUM_LOCK = null;
      PRINT_SCREEN = null;
      PAUSE = null;
      F1 = null;
      F2 = null;
      F3 = null;
      F4 = null;
      F5 = null;
      F6 = null;
      F7 = null;
      F8 = null;
      F9 = null;
      F10 = null;
      F11 = null;
      F12 = null;
      F13 = null;
      F14 = null;
      F15 = null;
      F16 = null;
      F17 = null;
      F18 = null;
      F19 = null;
      F20 = null;
      F21 = null;
      F22 = null;
      F23 = null;
      F24 = null;
      F25 = null;
      KP_0 = null;
      KP_1 = null;
      KP_2 = null;
      KP_3 = null;
      KP_4 = null;
      KP_5 = null;
      KP_6 = null;
      KP_7 = null;
      KP_8 = null;
      KP_9 = null;
      KP_DECIMAL = null;
      KP_DIVIDE = null;
      KP_MULTIPLY = null;
      KP_SUBTRACT = null;
      KP_ADD = null;
      KP_ENTER = null;
      KP_EQUAL = null;
      LEFT_SHIFT = null;
      LEFT_CONTROL = null;
      LEFT_ALT = null;
      LEFT_SUPER = null;
      RIGHT_SHIFT = null;
      RIGHT_CONTROL = null;
      RIGHT_ALT = null;
      RIGHT_SUPER = null;
      MENU = null;
      staticFields_291c77d4eef6663e78b13d1ab4c444dad1_2 = null;
   }

   public String u() {
      return this.fields_01c77d4eef6663e78b13d1ab4c444dad1_1;
   }

   public static class12002 y(int var0) {
      if (var0 >= -1 && var0 <= 348) {
         int i = 0;
         int j = ((class12002[])staticFields_291c77d4eef6663e78b13d1ab4c444dad1_2).length - 1;

         while (i <= j) {
            int k = i + j >>> 1;
            class12002 class12002 = ((class12002[])staticFields_291c77d4eef6663e78b13d1ab4c444dad1_2)[k];
            int l = Integer.compare(class12002.fields_01c77d4eef6663e78b13d1ab4c444dad1_0, var0);
            if (l < 0) {
               i = k + 1;
            } else {
               if (l <= 0) {
                  return class12002;
               }

               j = k - 1;
            }
         }

         return UNKNOWN;
      } else {
         return UNKNOWN;
      }
   }

   public boolean y() {
      return this == UNKNOWN;
   }

   public boolean N() {
      return this.fields_01c77d4eef6663e78b13d1ab4c444dad1_0 >= 0 && this.fields_01c77d4eef6663e78b13d1ab4c444dad1_0 <= 7;
   }

   public boolean N(int var1) {
      return this.fields_01c77d4eef6663e78b13d1ab4c444dad1_0 == var1;
   }

   public boolean N(class12002 var1) {
      return this == var1;
   }
}
