package NurikWare;

public record class09939(String owner, String name) {

   class09939(String owner, String name) {
      super();
      this.owner = owner;
      this.name = name;
   }

   public String y() {
      return this.name;
   }

   public String N() {
      return this.owner;
   }
}
