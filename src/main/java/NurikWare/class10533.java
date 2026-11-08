package NurikWare;

public record class10533(int priority, Runnable task) implements Runnable {

   public class10533(int priority, Runnable task) {
      super();
      this.priority = priority;
      this.task = task;
   }

   @Override
   public void run() {
      this.task.run();
   }

   public Runnable y() {
      return this.task;
   }

   public int N() {
      return this.priority;
   }
}
