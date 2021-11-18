public class Mythread extends Thread{
    public static void main(String[] args) {
        Thread obj=Thread.currentThread();
        obj.setName("shubhi");//temporarily change the name of the thread
        System.out.println(obj.isAlive());//will return the boolean value
        System.out.println(obj.getName());//will return the object name
        System.out.println(obj.isDaemon());
        //System.out.println(obj.getPriority());//will return the priority value
        obj.setPriority(Thread.MAX_PRIORITY);//change the priority value
        System.out.println(obj.getPriority());
        System.out.println(obj.getId());//return the id
    }
}
