package NurikWare;

import java.util.ArrayList;

record class09760(int contentBottom, int layoutBottom, int currentHeight, int appendX, int appendY, int appendRowHeight, ArrayList<class09756> freeRects) {
   public int L() {
      return this.currentHeight;
   }

   public ArrayList<class09756> M() {
      return this.freeRects;
   }

   class09760(int contentBottom, int layoutBottom, int currentHeight, int appendX, int appendY, int appendRowHeight, ArrayList<class09756> freeRects) {
      super();
      this.contentBottom = contentBottom;
      this.layoutBottom = layoutBottom;
      this.currentHeight = currentHeight;
      this.appendX = appendX;
      this.appendY = appendY;
      this.appendRowHeight = appendRowHeight;
      this.freeRects = freeRects;
   }

   public int i() {
      return this.appendY;
   }

   public int u() {
      return this.appendX;
   }

   public int y() {
      return this.layoutBottom;
   }

   public int N() {
      return this.contentBottom;
   }

   public int R() {
      return this.appendRowHeight;
   }
}
