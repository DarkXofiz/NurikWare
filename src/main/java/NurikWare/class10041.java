package NurikWare;

public record class10041(
   String committedText, String displayText, boolean placeholderVisible, int caretOffset, int selectionStartOffset, int selectionEndOffset, float scrollX
) {
   public static final class10041 N = new class10041(null, null, false, 0, 0, 0, 0.0F);

   public String L() {
      return this.displayText;
   }

   public int M() {
      return this.selectionEndOffset;
   }

   public class10041(
      String committedText, String displayText, boolean placeholderVisible, int caretOffset, int selectionStartOffset, int selectionEndOffset, float scrollX
   ) {
      super();
      committedText = committedText == null ? "" : committedText;
      displayText = displayText == null ? "" : displayText;
      caretOffset = class10067.N(committedText, caretOffset);
      selectionStartOffset = class10067.N(committedText, selectionStartOffset);
      selectionEndOffset = class10067.N(committedText, selectionEndOffset);
      if (selectionStartOffset > selectionEndOffset) {
         int i = selectionStartOffset;
         selectionStartOffset = selectionEndOffset;
         selectionEndOffset = i;
      }

      scrollX = Math.max(0.0F, scrollX);
      this.committedText = committedText;
      this.displayText = displayText;
      this.placeholderVisible = placeholderVisible;
      this.caretOffset = caretOffset;
      this.selectionStartOffset = selectionStartOffset;
      this.selectionEndOffset = selectionEndOffset;
      this.scrollX = scrollX;
   }

   public float B() {
      return this.scrollX;
   }

   public int i() {
      return this.caretOffset;
   }

   public boolean u() {
      return this.placeholderVisible;
   }

   public String y() {
      return this.committedText;
   }

   public boolean N() {
      return this.selectionStartOffset != this.selectionEndOffset;
   }

   public int R() {
      return this.selectionStartOffset;
   }
}
