public class Worker {

    private final OnTaskDoneListener callback;
    private final OnTaskErrorListener errorCallback;
    private final int error;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback, int error) {
        this.callback = callback;
        this.errorCallback = errorCallback;
        this.error = error;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == error) {
                errorCallback.onError("The task " + i + " is not completed");
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }

}
