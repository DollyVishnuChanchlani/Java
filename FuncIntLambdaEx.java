import java.util.Scanner;
@FunctionalInterface //SAM(Single Abstract Method)
interface A{
    void show(int i);//method is by default abstract and public
}
@FunctionalInterface //SAM(Single Abstract Method)
interface B{
    int add(int i, int j);//method is by default abstract and public
}
class FuncIntLambdaEx{
    public static void main(String args[]){
        A a = i -> System.out.println("in show"+i);//lambda expression works only with functional interface
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        a.show(num);
        B b = (i,j) -> i+j;//lambda expression works only with functional interface
        System.out.println(b.add(5,4));
    }
}