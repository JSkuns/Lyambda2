public class Main {

    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener listenerError = System.out::println;
        int error = 33;

        Worker worker = new Worker(listener, listenerError, error);
        worker.start();
    }

}
