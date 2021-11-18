//multithreading application
//runnable interface
class Runnable implements java.lang.Runnable {
    @Override
    public void run() {
        Thread.currentThread().setName("E custom Thread");
        for (int i = 0; i < 10; i++) {
            System.out.println("Runnable");

        }
    }
}
class Test57{
    public static void main(String[] args) {
        Runnable obj=new Runnable();
        Thread obj1=new Thread(obj);
        obj1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");

        }
    }
}
