import java.util.concurrent.Callable;

public class MyCallable1 implements Callable<Integer> {
    private Integer count = 1;

    @Override
    public Integer call() throws Exception {
        Thread.sleep(3000);
        System.out.println("Hello! My name is: " + Thread.currentThread().getName() + "; Message count: " + count);
        return count++;
    }
}
