package Threads;

public class Main {

    public static void main(String[] args) {

        System.out.println(Thread.activeCount());
        //Thread.currentThread().setName("MAINNN");

        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setPriority(7); // Goes from 1-10
        System.out.println(Thread.currentThread().getPriority());

        System.out.println(Thread.currentThread().isAlive());

        for(int i = 3; i>0;i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        MyThread thread2 = new MyThread();
        thread2.setDaemon(true);
        thread2.start();
        System.out.println(thread2.isDaemon());

        System.out.println(thread2.isAlive());

        thread2.setName("2nd thread");
        thread2.setPriority(8);

        System.out.println(thread2.getName());



    }
}
