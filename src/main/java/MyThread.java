public class MyThread extends Thread {
    private static Integer i = 0;

    public static void increaseI() {
        i = i + 1;
    }

    public static Integer getI() {
        return i;
    }
}
