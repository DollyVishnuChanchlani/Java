abstract class Outer{
    int age;
    public abstract void show();
}

class AbstractAnonymousInnerClass{
    public static void main(String args[]){
        Outer outer = new Outer(){
            public void show(){
                System.out.println("inner Class show");
            }
        };
        outer.show();

    }
}