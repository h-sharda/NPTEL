public class W06_P3 extends Thread{

    @Override
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args){

        // Creating object of thread class
        W06_P3 thread=new W06_P3();

        // Start the thread
        thread.start();
    }
}
