import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        List<Callable<Integer>> taskList = new ArrayList<>();
        taskList.add(new MyCallable1());
        taskList.add(new MyCallable2());

        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        List<Future<Integer>> result = null;

        System.out.println("All");
        for (int i = 0; i < 10; i++) {
            result = executorService.invokeAll(taskList);
        }

        System.out.println("Any: ");

        Integer res = executorService.invokeAny(taskList);
        executorService.shutdown();
    }
}
