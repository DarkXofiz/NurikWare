package NurikWare;

import java.util.Set;

public enum class09353 {
   FLOAT("float", Set.of(5126), false),
   FLOAT_ARRAY("float[]", Set.of(5126), true),
   INT,
   VEC2("vec2", Set.of(35664), false),
   VEC3("vec3", Set.of(35665), false),
   VEC4("vec4", Set.of(35666), false),
   IVEC2("ivec2", Set.of(35667), false),
   IVEC3("ivec3", Set.of(35668), false),
   IVEC4("ivec4", Set.of(35669), false),
   MAT4("mat4", Set.of(35676), false),
   SAMPLER_2D("sampler2D", Set.of(35678), false);

   public String fields_089430c2fab1a37ba83cabd41c73dd1db_0;
   public Set fields_089430c2fab1a37ba83cabd41c73dd1db_1;
   public Boolean fields_089430c2fab1a37ba83cabd41c73dd1db_2;
   public boolean fields_089430c2fab1a37ba83cabd41c73dd1db_init;

   private static void L() {
   }

   private void M() {
      if (!this.fields_089430c2fab1a37ba83cabd41c73dd1db_init) {
         this.fields_089430c2fab1a37ba83cabd41c73dd1db_init = true;
         this.fields_089430c2fab1a37ba83cabd41c73dd1db_2 = false;
      }
   }

   private class09353(String var3, Set<Integer> var4, boolean var5) {
      this.M();
      this.fields_089430c2fab1a37ba83cabd41c73dd1db_0 = var3;
      this.fields_089430c2fab1a37ba83cabd41c73dd1db_1 = var4;
      this.fields_089430c2fab1a37ba83cabd41c73dd1db_2 = var5;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      L();
      Integer integer = 5124;
      Integer integer1 = 35670;
      INT = new class09353("int/bool/sampler2D", Set.of(integer, integer1, 35678), false);
   }

   public String N() {
      return this.fields_089430c2fab1a37ba83cabd41c73dd1db_0;
   }

   public boolean N(int var1, int var2, boolean var3) {
      return this.fields_089430c2fab1a37ba83cabd41c73dd1db_1.contains(var1) && (this.fields_089430c2fab1a37ba83cabd41c73dd1db_2 || var3 || var2 == 1);
   }
}
