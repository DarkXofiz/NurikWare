package NurikWare;

import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import minecraft.class00487;
import minecraft.class04348;
import minecraft.class07263;

public class class09369<S> {
   private final class04348 N;
   private final class07263<S> y;
   private final List<class00487> L;
   private final List<CommandNode<S>> u;

   public class09369(class04348 var1, class07263<S> var2, List<class00487> var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      ObjectArrayList objectarraylist = new ObjectArrayList();
      objectarraylist.size(var3.size());
      this.u = objectarraylist;
   }

   public CommandNode<S> N(int var1) {
      CommandNode commandnode = this.u.get(var1);
      if (commandnode != null) {
         return commandnode;
      } else {
         class00487 class00487 = this.L.get(var1);
         Object object;
         if (class00487.N() == null) {
            object = new RootCommandNode();
         } else {
            ArgumentBuilder argumentbuilder = class00487.N().N(this.N, this.y);
            if ((class00487.y() & 8) != 0) {
               argumentbuilder.redirect(this.N(class00487.L()));
            }

            boolean flag = (class00487.y() & 4) != 0;
            boolean flag1 = (class00487.y() & 32) != 0;
            object = this.y.N(argumentbuilder, flag, flag1).build();
         }

         this.u.set(var1, (CommandNode<S>)object);

         for (int i : class00487.u()) {
            CommandNode commandnode1 = this.N(i);
            if (!(commandnode1 instanceof RootCommandNode)) {
               object.addChild(commandnode1);
            }
         }

         return (CommandNode<S>)object;
      }
   }
}
