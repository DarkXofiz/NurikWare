package NurikWare;

public enum class09867 {
   POINTER_MOVE(true, true),
   POINTER_DOWN(true, true),
   POINTER_UP(true, true),
   CLICK(true, true),
   WHEEL(true, true),
   KEY_DOWN(true, true),
   KEY_UP(true, true),
   TEXT_INPUT(true, true),
   INPUT(true, true),
   CHANGE(true, true),
   FOCUS(false, false),
   BLUR(false, false),
   HOVER_ENTER(false, false),
   HOVER_LEAVE(false, false),
   TRANSITION_END(false, false);

   private final boolean bubbles;
   private final boolean cancelable;

   private class09867(boolean var3, boolean var4) {
      this.bubbles = var3;
      this.cancelable = var4;
   }

   public boolean y() {
      return this.cancelable;
   }

   public boolean N() {
      return this.bubbles;
   }
}
