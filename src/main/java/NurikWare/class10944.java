package NurikWare;

import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Map;
import minecraft.class00392;
import minecraft.class08388;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState;
import net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
public class class10944 implements FabricRenderState {
   @Nullable
   public class08388 N;
   public byte y;
   public byte L;
   public byte u;
   public boolean i;
   @Nullable
   public class00392 R;
   @Nullable
   private Map M;

   public void setData(RenderStateDataKey var1, Object var2) {
      if (this.M == null) {
         this.M = new Reference2ObjectOpenHashMap();
      }

      this.M.put(var1, var2);
   }

   public class10944() {
      super();
   }

   @Nullable
   public Object getData(RenderStateDataKey var1) {
      return this.M == null ? null : this.M.get(var1);
   }

   public void clearExtraData() {
      if (this.M != null) {
         this.M.clear();
      }
   }

   public Object getDataOrDefault(RenderStateDataKey var1, Object var2) {
      return this.M == null ? var2 : this.M.getOrDefault(var1, var2);
   }
}
