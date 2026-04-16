@FunctionalInterface //SAM(Single Abstract Method)
interface A{
    void show();//method is by default abstract and public
}

class FuncIntLambdaEx{
    public static void main(String args[]){
        A a = () -> System.out.println("in show");
        a.show();
    }
}