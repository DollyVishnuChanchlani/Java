/*class A implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hi");
        }
    }
}*/
class B implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello");
        }
    }
}
class RunnableExample{
    public static void main(String args[]){
        Runnable obj1 = ()->{//converting class to lambda xpression as Runnable is functional interface and this method is called only once
                for(int i=0;i<5;i++){
                    System.out.println("Hi");
                }
        };
        Runnable obj2 = new B();
        Thread t1= new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}