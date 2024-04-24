public class Main {
    public static void main(String[] args) {
        // Creating threads
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        // Starting threads
        thread1.start();
        thread2.start();

        // Thread priorities
        thread1.setPriority(Thread.MIN_PRIORITY); // Set minimum priority
        thread2.setPriority(Thread.MAX_PRIORITY); // Set maximum priority

        // Thread names
        thread1.setName("Thread 1");
        thread2.setName("Thread 2");

        // Joining threads
        try {
            thread1.join(); // Main thread waits for thread1 to finish
            thread2.join(); // Main thread waits for thread2 to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // Getting thread state
        System.out.println("Thread 1 State: " + thread1.getState());
        System.out.println("Thread 2 State: " + thread2.getState());

        // Checking if threads are alive
        System.out.println("Is Thread 1 alive? " + thread1.isAlive());
        System.out.println("Is Thread 2 alive? " + thread2.isAlive());

        System.out.println("Main thread exiting.");
    }
}
