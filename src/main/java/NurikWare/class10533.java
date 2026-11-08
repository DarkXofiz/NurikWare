package NurikWare;

public record class10533(int priority, Runnable task) implements Runnable {


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
