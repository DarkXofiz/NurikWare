package page.langeweile.ok_zoomer.config.screen;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import minecraft.class00392;
import minecraft.class01885;
import minecraft.class01894;
import minecraft.class03686;
import minecraft.class04141;
import minecraft.class04927;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class06366;
import minecraft.class06478;
import org.quiltmc.config.api.Config;
import org.quiltmc.config.api.Configs;
import org.quiltmc.config.api.Constraint;
import org.quiltmc.config.api.Constraint.Range;
import org.quiltmc.config.api.values.TrackedValue;
import org.quiltmc.config.api.values.ValueTreeNode;
import org.quiltmc.config.api.values.ValueTreeNode.Section;
import page.langeweile.ok_zoomer.config.ConfigEnums$ConfigEnum;
import page.langeweile.ok_zoomer.config.ConfigEnums$ZoomPresets;
import page.langeweile.ok_zoomer.config.OkZoomerConfigManager;
import page.langeweile.ok_zoomer.config.metadata.WidgetSize;
import page.langeweile.ok_zoomer.config.metadata.WidgetSize$Size;
import page.langeweile.ok_zoomer.config.screen.components.OkZoomerFloatSlider;
import page.langeweile.ok_zoomer.config.screen.components.OkZoomerIntegerSlider;
import page.langeweile.ok_zoomer.config.screen.components.OkZoomerSelectionList;
import page.langeweile.ok_zoomer.utils.ModUtils;

public class OkZoomerConfigScreen extends class05096 {
   private final class01894 configId;
   private final class05096 parent;
   private ConfigTextUtils configTextUtils;
   private final class03686 layout = new class03686(this);
   private OkZoomerSelectionList selectionList;
   private final Map<TrackedValue<Object>, Object> newValues;
   private final Set<TrackedValue<Object>> invalidValues;
   private class06478 buttonBuffer = null;

   public OkZoomerConfigScreen(class05096 var1) {
      super(ConfigTextUtils.getConfigTitle(ModUtils.id("config")));
      this.configId = ModUtils.id("config");
      this.parent = var1;
      this.newValues = new Reference2ObjectArrayMap();
      this.invalidValues = new ObjectArraySet();
   }

   public void method_25426() {
      Config config = Configs.getConfig(this.configId.y(), this.configId.N());
      this.configTextUtils = new ConfigTextUtils(config);
      this.selectionList = new OkZoomerSelectionList(this.field_22787, this.field_22789, this.field_22790 - 64, 32, this);
      this.selectionList.addCategory(class00392.L("config.ok_zoomer.presets"));
      class06366 class06366xx = class06366.N(
            var0 -> class00392.L(String.format("config.ok_zoomer.presets.preset.%s", var0.toString().toLowerCase(Locale.ROOT))), ConfigEnums$ZoomPresets.CAMERA
         )
         .N(ConfigEnums$ZoomPresets.values())
         .N(var0 -> class04141.N(class00392.L(String.format("config.ok_zoomer.presets.preset.%s.tooltip", var0.toString().toLowerCase(Locale.ROOT)))))
         .N(0, 0, 150, 20, class00392.L("config.ok_zoomer.presets.preset"));
      class05362 class05362 = class05362.method_46430(
            class00392.L("config.ok_zoomer.presets.apply_preset"), var2x -> this.resetToPreset((ConfigEnums$ZoomPresets)class06366xx.y())
         )
         .N(class04141.N(class00392.L("config.ok_zoomer.presets.apply_preset.tooltip")))
         .N();
      this.selectionList.addButton(class06366xx, class05362);

      for (ValueTreeNode valuetreenode : config.nodes()) {
         if (valuetreenode instanceof Section section) {
            this.selectionList.addCategory(this.configTextUtils.getCategoryText(section.key().toString()));

            for (ValueTreeNode valuetreenode1 : section) {
               WidgetSize$Size widgetsize$size = (WidgetSize$Size)valuetreenode1.metadata(WidgetSize.TYPE);
               if (valuetreenode1 instanceof TrackedValue trackedvalue) {
                  this.newValues.putIfAbsent(trackedvalue, trackedvalue.getRealValue());
                  if (trackedvalue.value() instanceof Boolean) {
                     class06366 class06366x = class06366.N((Boolean)this.newValues.get(trackedvalue))
                        .N(var2x -> class04141.N(this.configTextUtils.getOptionTextTooltip(trackedvalue)))
                        .N(0, 0, 150, 20, this.configTextUtils.getOptionText(trackedvalue), (var2x, var3x) -> this.newValues.replace(trackedvalue, var3x));
                     this.addOptionToList(class06366x, widgetsize$size);
                  } else if (trackedvalue.value() instanceof Float) {
                     if ((Boolean)OkZoomerConfigManager.CONFIG.tweaks.numericSliders.value()) {
                        OkZoomerFloatSlider okzoomerfloatslider = new OkZoomerFloatSlider(
                           trackedvalue,
                           this.configTextUtils.getOptionText(trackedvalue),
                           0,
                           0,
                           150,
                           20,
                           (Float)this.newValues.get(trackedvalue),
                           var2x -> this.newValues.replace(trackedvalue, var2x)
                        );
                        okzoomerfloatslider.method_47400(class04141.N(this.configTextUtils.getOptionTextTooltip(trackedvalue)));
                        this.addOptionToList(okzoomerfloatslider, widgetsize$size);
                     } else {
                        class04927 class04927x = new class04927(this.field_22793, 0, 0, 150, 20, this.configTextUtils.getOptionText(trackedvalue));
                        class04927x.method_1852(((Float)this.newValues.get(trackedvalue)).toString());
                        class04927x.method_1863(var4 -> {
                           try {
                              float f = Float.NEGATIVE_INFINITY;
                              float f1 = Float.POSITIVE_INFINITY;

                              for (Constraint constraint : trackedvalue.constraints()) {
                                 if (constraint instanceof Range range) {
                                    f = Math.max((Float)range.min(), f);
                                    f1 = Math.min((Float)range.max(), f1);
                                 }
                              }

                              float f2 = Float.parseFloat(var4);
                              if (f2 < f || f2 > f1) {
                                 throw new IndexOutOfBoundsException();
                              }

                              this.newValues.replace(trackedvalue, f2);
                              this.invalidValues.remove(trackedvalue);
                              class04927x.method_1868(-2039584);
                           } catch (IndexOutOfBoundsException | NumberFormatException numberformatexception) {
                              this.invalidValues.add(trackedvalue);
                              class04927x.method_1868(-65536);
                           }
                        });
                        class04927x.method_47400(
                           class04141.N(
                              class05220.y(
                                 new class00392[]{this.configTextUtils.getOptionText(trackedvalue), this.configTextUtils.getOptionTextTooltip(trackedvalue)}
                              )
                           )
                        );
                        this.addOptionToList(class04927x, widgetsize$size);
                     }
                  } else if (trackedvalue.value() instanceof Integer) {
                     if ((Boolean)OkZoomerConfigManager.CONFIG.tweaks.numericSliders.value()) {
                        OkZoomerIntegerSlider okzoomerintegerslider = new OkZoomerIntegerSlider(
                           trackedvalue,
                           this.configTextUtils.getOptionText(trackedvalue),
                           0,
                           0,
                           150,
                           20,
                           (Integer)this.newValues.get(trackedvalue),
                           var2x -> this.newValues.replace(trackedvalue, var2x)
                        );
                        okzoomerintegerslider.method_47400(class04141.N(this.configTextUtils.getOptionTextTooltip(trackedvalue)));
                        this.addOptionToList(okzoomerintegerslider, widgetsize$size);
                     } else {
                        class04927 class04927 = new class04927(this.field_22793, 0, 0, 150, 20, this.configTextUtils.getOptionText(trackedvalue));
                        class04927.method_1852(((Integer)this.newValues.get(trackedvalue)).toString());
                        class04927.method_1863(var4 -> {
                           try {
                              int i = Integer.MIN_VALUE;
                              int j = Integer.MAX_VALUE;

                              for (Constraint constraint : trackedvalue.constraints()) {
                                 if (constraint instanceof Range range) {
                                    i = Math.max((Integer)range.min(), i);
                                    j = Math.min((Integer)range.max(), j);
                                 }
                              }

                              int k = Integer.parseInt(var4);
                              if (k < i || k > j) {
                                 throw new IndexOutOfBoundsException();
                              }

                              this.newValues.replace(trackedvalue, k);
                              this.invalidValues.remove(trackedvalue);
                              class04927.method_1868(-2039584);
                           } catch (IndexOutOfBoundsException | NumberFormatException numberformatexception) {
                              this.invalidValues.add(trackedvalue);
                              class04927.method_1868(-65536);
                           }
                        });
                        class04927.method_47400(
                           class04141.N(
                              class05220.y(
                                 new class00392[]{this.configTextUtils.getOptionText(trackedvalue), this.configTextUtils.getOptionTextTooltip(trackedvalue)}
                              )
                           )
                        );
                        this.addOptionToList(class04927, widgetsize$size);
                     }
                  } else if (trackedvalue.value() instanceof ConfigEnums$ConfigEnum configenums$configenum) {
                     class06366 class06366x = class06366.N(
                           var2x -> this.configTextUtils.getEnumOptionText(trackedvalue, var2x), (ConfigEnums$ConfigEnum)this.newValues.get(trackedvalue)
                        )
                        .N((ConfigEnums$ConfigEnum[])((Enum)configenums$configenum).getDeclaringClass().getEnumConstants())
                        .N(var2x -> class04141.N(this.configTextUtils.getEnumOptionTextTooltip(trackedvalue, var2x)))
                        .N(0, 0, 150, 20, this.configTextUtils.getOptionText(trackedvalue), (var2x, var3x) -> this.newValues.replace(trackedvalue, var3x));
                     this.addOptionToList(class06366x, widgetsize$size);
                  }
               }
            }

            if (this.buttonBuffer != null) {
               this.selectionList.addButton(this.buttonBuffer, null);
               this.buttonBuffer = null;
            }
         }
      }

      this.method_37063(this.selectionList);
      this.layout.N(this.field_22785, this.field_22793);
      class01885 class01885 = (class01885)this.layout.y(class01885.i().N(8));
      class01885.N(class05362.method_46430(class00392.L("config.ok_zoomer.discard_changes"), var1x -> this.resetNewValues()).N(150).N());
      class01885.N(class05362.method_46430(class05220.u, var1x -> this.method_25419()).N(150).N());
      this.layout.method_48206(var1x -> this.method_37063(var1x));
      this.method_48640();
   }

   public void method_48640() {
      this.layout.N();
      this.selectionList.method_57712(this.field_22789, this.layout);
   }

   public void method_25432() {
      this.newValues.forEach((var1, var2) -> {
         if (!this.invalidValues.contains(var1)) {
            var1.setValue(var2, false);
         }
      });
      OkZoomerConfigManager.CONFIG.save();
   }

   public void method_25419() {
      this.field_22787.N(this.parent);
   }

   private void refresh() {
      double d0 = this.selectionList.method_44387();
      this.method_41843();
      this.selectionList.method_44382(d0);
   }

   public void resetToPreset(ConfigEnums$ZoomPresets var1) {
      this.newValues.clear();
      this.invalidValues.clear();

      for (TrackedValue trackedvalue : OkZoomerConfigManager.CONFIG.values()) {
         this.newValues.put(trackedvalue, ZoomPresets.PRESET_ENUM_TO_PRESET.get(var1).getOrDefault(trackedvalue, trackedvalue.getDefaultValue()));
      }

      this.refresh();
   }

   private void addOptionToList(class06478 var1, WidgetSize$Size var2) {
      if (var2 == WidgetSize$Size.HALF) {
         if (this.buttonBuffer == null) {
            this.buttonBuffer = var1;
         } else {
            this.selectionList.addButton(this.buttonBuffer, var1);
            this.buttonBuffer = null;
         }
      } else {
         if (this.buttonBuffer != null) {
            this.selectionList.addButton(this.buttonBuffer, null);
            this.buttonBuffer = null;
         }

         this.selectionList.addButton(var1);
      }
   }

   private void resetNewValues() {
      this.newValues.clear();

      for (TrackedValue trackedvalue : OkZoomerConfigManager.CONFIG.values()) {
         if (trackedvalue.getRealValue() != null) {
            this.newValues.put(trackedvalue, trackedvalue.getRealValue());
         }
      }

      this.refresh();
   }
}
