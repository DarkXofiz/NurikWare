package NurikWare;

import java.util.function.BiConsumer;
import org.joml.Vector2f;

public record class11613(
   String id,
   class09793<class09904> ref,
   class09991 style,
   class09785<Vector2f> position,
   class09785<Boolean> dragging,
   class09785<Vector2f> dragOffset,
   class11598<? super class11613> behavior,
   BiConsumer<class09784, class09809> content
) implements class11632 {

   @Override
   public class09785<Vector2f> L() {
      return this.dragOffset;
   }

   public class09793<class09904> M() {
      return this.ref;
   }


   public BiConsumer<class09784, class09809> B() {
      return this.content;
   }

   public class09991 i() {
      return this.style;
   }

   @Override
   public class09785<Boolean> u() {
      return this.dragging;
   }

   @Override
   public class09785<Vector2f> y() {
      return this.position;
   }

   @Override
   public String N() {
      return this.id;
   }

   public class11598<? super class11613> R() {
      return this.behavior;
   }
}
