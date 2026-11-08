package NurikWare;

record class09850(boolean shouldRunFullLayout, boolean shouldRunPositionUpdate, boolean hasScrollDirty, boolean viewportChanged) {
   public boolean L() {
      return this.hasScrollDirty;
   }

   class09850(boolean shouldRunFullLayout, boolean shouldRunPositionUpdate, boolean hasScrollDirty, boolean viewportChanged) {
      super();
      this.shouldRunFullLayout = shouldRunFullLayout;
      this.shouldRunPositionUpdate = shouldRunPositionUpdate;
      this.hasScrollDirty = hasScrollDirty;
      this.viewportChanged = viewportChanged;
   }

   public boolean u() {
      return this.viewportChanged;
   }

   public boolean y() {
      return this.shouldRunPositionUpdate;
   }

   public boolean N() {
      return this.shouldRunFullLayout;
   }
}
