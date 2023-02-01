import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<Integer> task = () -> {
            MyThread.increaseI();
            System.out.println("Hello! My name is: " + MyThread.currentThread().getName());
            return MyThread.getI();
        };
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        for (int i = 0; i < 10; i++) {
            Future result = executorService.submit(task);
            System.out.println(result.get());
        }
        executorService.shutdown();
    }
}
