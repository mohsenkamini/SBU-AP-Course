
public class TaskManager {

    private final TaskQueue queue;

    public TaskManager(ThreadGroup group, int threadCount) {
        queue = new TaskQueue();

        // create and start the threads
        for (int i = 0; i < threadCount; i++) {
            // TODO
        }
    }

    public synchronized void doTask(Runnable task) {
        // TODO
    }
}

// A class to represent what the threads should be doing
class TaskHandling implements Runnable {
    private final TaskQueue taskQueue;

    TaskHandling(TaskQueue taskQueue) {
        this.taskQueue = taskQueue;
    }

    @Override
    public void run() {
        // TODO
        // get a task, process it, repeat
    }
}

// A class to represent queue of tasks
// should be THREAD SAFE
class TaskQueue {

    // TODO
    // implement queue using array

    public synchronized void addTask(Runnable task) {
        // TODO
    }

    public synchronized Runnable getTask() {
        // TODO
        return null;
    }
}
