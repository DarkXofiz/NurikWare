package NurikWare;

import java.util.List;
import java.util.Map;

public record class09773(String id, String label, Map<String, String> fields, List<class09773> children) {
   public Map<String, String> L() {
      return this.fields;
   }

   public class09773(String id, String label, Map<String, String> fields, List<class09773> children) {
      super();
      this.id = id;
      this.label = label;
      this.fields = fields;
      this.children = children;
   }

   public List<class09773> u() {
      return this.children;
   }

   public String y() {
      return this.label;
   }

   public String N() {
      return this.id;
   }
}
