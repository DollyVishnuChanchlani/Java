class A extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hi");
            try{
                Thread.sleep(10);//millisec
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello");
        }
    }
}
class ThreadExample{
    public static void main(String args[]){
        A a = new A();
        B b = new B();
        a.setPriority(Thread.MAX_PRIORITY-1);//10 max 1 min
        System.out.println(b.getPriority());
        a.start();
        b.start();
    }
}