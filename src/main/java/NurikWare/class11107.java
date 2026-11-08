package NurikWare;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import minecraft.class06570;

public class class11107 {
   @class09245(
      L = "potion.paladin",
      y = "Зелье Палладина",
      N = class11165.POTIONS
   )
   public static final class11664 N = new class11664(class06570.lO);
   @class09245(
      L = "armor.boots.crush",
      y = "Ботинки Крушителя",
      N = class11165.ARMOR
   )
   public static final class11664 y = new class11664(class06570.bI);
   @class09245(
      L = "arrow.blood",
      y = "Кровавая Стрела",
      N = class11165.ARROWS
   )
   public static final class11664 L = new class11664(class06570.lI);
   @class09245(
      L = "sphere.bestia",
      y = "Сфера Бестии",
      N = class11165.SPHERES
   )
   public static final class11664 u = new class11664(class06570.Gw);
   @class09245(
      L = "potion.assassin",
      y = "Зелье Ассасина",
      N = class11165.POTIONS
   )
   public static final class11664 i = new class11664(class06570.lO);
   @class09245(
      L = "tool.trident.crush",
      y = "Трезубец Крушителя",
      N = class11165.TOOLS
   )
   public static final class11664 R = new class11664(class06570.db);
   @class09245(
      L = "consumable.passkey.armor",
      y = "Отмычка к Броне",
      N = class11165.CONSUMABLES
   )
   public static final class11664 M = new class11664(class06570.mL);
   @class09245(
      L = "consumable.dust",
      y = "Явная пыль",
      N = class11165.CONSUMABLES
   )
   public static final class11664 B = new class11664(class06570.vg);
   @class09245(
      L = "consumable.stratum",
      y = "Пласт",
      N = class11165.CONSUMABLES
   )
   public static final class11664 Z = new class11664(class06570.ny);
   @class09245(
      L = "potion.radiation",
      y = "Зелье Радиации",
      N = class11165.POTIONS
   )
   public static final class11664 z = new class11664(class06570.lO);
   @class09245(
      L = "consumable.passkey.spheres",
      y = "Отмычка к Сферам",
      N = class11165.CONSUMABLES
   )
   public static final class11664 U = new class11664(class06570.mL);
   @class09245(
      L = "arrow.zeus",
      y = "Стрела Зевса",
      N = class11165.ARROWS
   )
   public static final class11664 E = new class11664(class06570.lI);
   @class09245(
      L = "potion.holy-water",
      y = "Святая вода",
      N = class11165.POTIONS
   )
   public static final class11664 W = new class11664(class06570.lO);
   @class09245(
      L = "tal.demona",
      y = "Талисман Демона",
      N = class11165.TALISMANS
   )
   public static final class11664 m = new class11664(class06570.la);
   @class09245(
      L = "armor.helmet.crush",
      y = "Шлем Крушителя",
      N = class11165.ARMOR
   )
   public static final class11664 P = new class11664(class06570.bQ);
   @class09245(
      L = "consumable.passkey.items",
      y = "Отмычка к Ресурсам",
      N = class11165.CONSUMABLES
   )
   public static final class11664 s = new class11664(class06570.mL);
   @class09245(
      L = "arrow.rejuvenation",
      y = "Стрела терапии",
      N = class11165.ARROWS
   )
   public static final class11664 T = new class11664(class06570.lI);
   @class09245(
      L = "arrow.light",
      y = "Световая Стрела",
      N = class11165.ARROWS
   )
   public static final class11664 b = new class11664(class06570.lI);
   @class09245(
      L = "tool.pickaxe.crush",
      y = "Кирка Крушителя",
      N = class11165.TOOLS
   )
   public static final class11664 j = new class11664(class06570.Tf);
   @class09245(
      L = "tool.mace.crush",
      y = "Булава Крушителя",
      N = class11165.TOOLS
   )
   public static final class11664 v = new class11664(class06570.Gm);
   public static Object[] n;
   @class09245(
      L = "potion.rage",
      y = "Зелье Гнева",
      N = class11165.POTIONS
   )
   public static final class11664 t = new class11664(class06570.lO);
   @class09245(
      L = "block.tnt.black",
      y = "Блэк",
      N = class11165.BLOCKS
   )
   public static final class11664 G = new class11664(class06570.mi);
   @class09245(
      L = "block.tnt.while",
      y = "Вайт",
      N = class11165.BLOCKS
   )
   public static final class11664 l = new class11664(class06570.mi);
   @class09245(
      L = "consumable.disorientation",
      y = "Дезориентация",
      N = class11165.CONSUMABLES
   )
   public static final class11664 d = new class11664(class06570.nG);
   @class09245(
      L = "tal.mraka",
      y = "Талисман Мрака",
      N = class11165.TALISMANS
   )
   public static final class11664 w = new class11664(class06570.la);
   @class09245(
      L = "consumable.goods-aura",
      y = "Божья Аура",
      N = class11165.CONSUMABLES
   )
   public static final class11664 k = new class11664(class06570.ss);
   @class09245(
      L = "tal.tirana",
      y = "Талисман Тирана",
      N = class11165.TALISMANS
   )
   public static final class11664 Y = new class11664(class06570.la);
   @class09245(
      L = "arrow.freeze",
      y = "Стрела Обледенения",
      N = class11165.ARROWS
   )
   public static final class11664 Q = new class11664(class06570.lI);
   @class09245(
      L = "arrow.agony",
      y = "Мучительная Стрела",
      N = class11165.ARROWS
   )
   public static final class11664 O = new class11664(class06570.lI);
   @class09245(
      L = "sphere.ikara",
      y = "Сфера Икара",
      N = class11165.SPHERES
   )
   public static final class11664 g = new class11664(class06570.Gw);
   @class09245(
      L = "consumable.snowball",
      y = "Снежок Заморозка",
      N = class11165.CONSUMABLES
   )
   public static final class11664 I = new class11664(class06570.jP);
   @class09245(
      L = "tool.crossbow.crush",
      y = "Арбалет Крушителя",
      N = class11165.TOOLS
   )
   public static final class11664 J = new class11664(class06570.dw);
   @class09245(
      L = "armor.chestplate.crush",
      y = "Нагрудник Крушителя",
      N = class11165.ARMOR
   )
   public static final class11664 o = new class11664(class06570.bO);
   @class09245(
      L = "tal.yarosti",
      y = "Талисман Ярости",
      N = class11165.TALISMANS
   )
   public static final class11664 q = new class11664(class06570.la);
   @class09245(
      L = "tal.razdora",
      y = "Талисман Раздора",
      N = class11165.TALISMANS
   )
   public static final class11664 K = new class11664(class06570.la);
   @class09245(
      L = "consumable.trap",
      y = "Трапка",
      N = class11165.CONSUMABLES
   )
   public static final class11664 V = new class11664(class06570.TW);
   @class09245(
      L = "sphere.gidra",
      y = "Сфера Гидры",
      N = class11165.SPHERES
   )
   public static final class11664 e = new class11664(class06570.Gw);
   @class09245(
      L = "consumable.passkey.weapon",
      y = "Отмычка к Оружию",
      N = class11165.CONSUMABLES
   )
   public static final class11664 H = new class11664(class06570.mL);
   @class09245(
      L = "tal.crush",
      y = "Талисман Крушителя",
      N = class11165.TALISMANS
   )
   public static final class11664 c = new class11664(class06570.la);
   @class09245(
      L = "potion.drowsiness",
      y = "Зелье Снотворное",
      N = class11165.POTIONS
   )
   public static final class11664 X = new class11664(class06570.lO);
   @class09245(
      L = "tool.bow.crush",
      y = "Лук",
      N = class11165.TOOLS
   )
   public static final class11664 a = new class11664(class06570.sx);
   @class09245(
      L = "armor.leggings.crush",
      y = "Поножи Крушителя",
      N = class11165.ARMOR
   )
   public static final class11664 p = new class11664(class06570.bg);
   @class09245(
      L = "armor.elytra.unbreakable",
      y = "Нерушимые Элитры",
      N = class11165.ARMOR
   )
   public static final class11664 F = new class11664(class06570.sT);
   @class09245(
      L = "tal.karatel",
      y = "Талисман Карателя",
      N = class11165.TALISMANS
   )
   public static final class11664 A = new class11664(class06570.la);
   @class09245(
      L = "tal.vihrya",
      y = "Талисман Вихря",
      N = class11165.TALISMANS
   )
   public static final class11664 f = new class11664(class06570.la);
   @class09245(
      L = "sphere.erida",
      y = "Сфера Эрида",
      N = class11165.SPHERES
   )
   public static final class11664 C = new class11664(class06570.Gw);
   @class09245(
      L = "sphere.aresa",
      y = "Сфера Ареса",
      N = class11165.SPHERES
   )
   public static final class11664 S = new class11664(class06570.Gw);
   @class09245(
      L = "tool.sword.crush",
      y = "Меч Крушителя",
      N = class11165.TOOLS
   )
   public static final class11664 x = new class11664(class06570.TF);
   @class09245(
      L = "consumable.passkey.tools",
      y = "Отмычка к Инструментам",
      N = class11165.CONSUMABLES
   )
   public static final class11664 D = new class11664(class06570.mL);
   @class09245(
      L = "sphere.haosa",
      y = "Сфера Хаоса",
      N = class11165.SPHERES
   )
   public static final class11664 h = new class11664(class06570.Gw);
   @class09245(
      L = "sphere.satira",
      y = "Сфера Сатира",
      N = class11165.SPHERES
   )
   public static final class11664 r = new class11664(class06570.Gw);
   @class09245(
      L = "potion.popper",
      y = "Хлопушка",
      N = class11165.POTIONS
   )
   public static final class11664 NN = new class11664(class06570.lO);
   @class09245(
      L = "block.damager",
      y = "Блок Дамагер",
      N = class11165.BLOCKS
   )
   public static final class11664 Ny = new class11664(class06570.sH);

   private static void M() {
      n = new Object[]{null, null};
   }

   private class11107() {
      super();
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      M();
      n[0] = new LinkedHashMap();
      n[1] = new LinkedHashMap();

      try {
         L();
      } catch (Throwable throwable) {
         new RuntimeException("Failed to init custom items from annotations", throwable);
      }
   }

   public static Iterable<class11664> y() {
      return ((Map)n[0]).values();
   }

   public static Stream<class11664> N() {
      return ((Map)n[0]).values().stream();
   }

   public static List<class11664> N(class11165 var0) {
      return (List<class11664>)((Map)n[1]).get(var0);
   }

   public static class11664 N(String var0) {
      return (class11664)((Map)n[0]).get(var0);
   }

   private static void L() {
      Field[] afield = class11107.class.getDeclaredFields();

      for (int ix = 0; ix < afield.length; ix++) {
         Field field = afield[ix];
         class09245 class09245 = field.getAnnotation(class09245.class);
         if (class09245 != null) {
            class11664 class11664 = (class11664)field.get(null);
            if (class11664 != null) {
               String sx = class09245.L();
               class11165 class11165 = class09245.N();
               class11664.y(sx);
               class11664.N(class09245.y());
               class11664.N(class11165);
               ((Map)n[0]).put(sx, class11664);
               ((Map)n[1]).computeIfAbsent(class11165, var0x -> new ArrayList<>()).add(class11664);
            }
         }
      }
   }
}
