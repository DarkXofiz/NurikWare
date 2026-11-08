package NurikWare;

import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import com.mojang.blaze3d.vertex.VertexFormatElement.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import minecraft.class08523;
import minecraft.class08852;
import minecraft.class08859;
import minecraft.class08861;
import minecraft.class08865;
import org.jspecify.annotations.Nullable;
import org.lwjgl.opengl.ARBVertexAttribBinding;

public class class11662 extends class08865 {
   private final Map<VertexFormat, class08861> N = new HashMap<>();
   private final class08859 y;
   private final boolean L;

   public class11662(class08859 var1) {
      super();
      this.y = var1;
      if ("Mesa".equals(GlStateManager._getString(7936))) {
         String s = GlStateManager._getString(7938);
         this.L = s.contains("25.0.0") || s.contains("25.0.1") || s.contains("25.0.2");
      } else {
         this.L = false;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void N(VertexFormat var1, @Nullable class08523 var2) {
      class08861 class08861x = this.N.get(var1);
      if (class08861x != null) {
         GlStateManager._glBindVertexArray(class08861x.N);
         if (var2 != null && class08861x.L != var2) {
            if (this.L && class08861x.L != null && class08861x.L.u == var2.u) {
               ARBVertexAttribBinding.glBindVertexBuffer(0, 0, 0L, 0);
            }

            ARBVertexAttribBinding.glBindVertexBuffer(0, var2.u, 0L, var1.getVertexSize());
            class08861x.L = var2;
         }
      } else {
         int i = GlStateManager._glGenVertexArrays();
         GlStateManager._glBindVertexArray(i);
         if (var2 != null) {
            List<VertexFormatElement> list = var1.getElements();

            for (int j = 0; j < list.size(); j++) {
               VertexFormatElement vertexformatelement = list.get(j);
               GlStateManager._enableVertexAttribArray(j);
               switch (class08852.N[vertexformatelement.usage().ordinal()]) {
                  case 1:
                  case 2:
                  case 3:
                     if (vertexformatelement.type() == Type.FLOAT) {
                        ARBVertexAttribBinding.glVertexAttribFormat(
                           j, vertexformatelement.count(), GlConst.toGl(vertexformatelement.type()), false, var1.getOffset(vertexformatelement)
                        );
                     } else {
                        ARBVertexAttribBinding.glVertexAttribIFormat(
                           j, vertexformatelement.count(), GlConst.toGl(vertexformatelement.type()), var1.getOffset(vertexformatelement)
                        );
                     }
                     break;
                  case 4:
                  case 5:
                     ARBVertexAttribBinding.glVertexAttribFormat(
                        j, vertexformatelement.count(), GlConst.toGl(vertexformatelement.type()), true, var1.getOffset(vertexformatelement)
                     );
               }

               ARBVertexAttribBinding.glVertexAttribBinding(j, 0);
            }
         }

         if (var2 != null) {
            ARBVertexAttribBinding.glBindVertexBuffer(0, var2.u, 0L, var1.getVertexSize());
         }

         class08861 class08861x = new class08861(i, var1, var2);
         this.y.N(class08861x);
         this.N.put(var1, class08861x);
      }
   }
}
