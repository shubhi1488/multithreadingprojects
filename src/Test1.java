class Test1 extends Thread {
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("Test1"+i);
        }
    }

}
class Test56{
    public static void main(String[] args) {
        Test1 obj=new Test1();
        obj.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread"+1);

        }
    }
}
