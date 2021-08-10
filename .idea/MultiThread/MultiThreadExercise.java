package MultiThread;

public class MultiThreadExercise {

    public static void main(String[] args) throws InterruptedException {

      // Multithreading =   process of executing multiple threads simultaneously
        //                  helps maximum utilization of CPU
        //                  threads are independent, they don't affect the execution of other threads
        //                  an exception in one thread will not interrupt other threads
        //                  useful for serving multiple clients, multiplayer games, or other mutually independent tasks

        MyMultipleThreads thread1 = new MyMultipleThreads(); // first method of creating threads make class that extends Thread

        MyRunnable runnable1 = new MyRunnable(); // second method of creating threads is implementing the runnable interface
        Thread thread2 = new Thread(runnable1); // where you pass the element into the Thread constructor


        //thread1.setDaemon(true); // will stop if the jvm quit
        //thread2.setDaemon(true);
        // The second option is better if you want more polymorphism, because you can still extend the second option, you can't on the first
        thread1.start();
        //thread1.join(3000); // calling thead (ex.main) wait until the specified thead dies or for x amount of milliseconds
        thread2.start();

        System.out.println(1/0);


    }
}
