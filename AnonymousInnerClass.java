class Outer{
    int age;
    public void show(){
        System.out.println("outer Class show");
    }
}

class AnonymousInnerClass{
    public static void main(String args[]){
        Outer outer = new Outer(){
            public void show(){
                System.out.println("inner Class show");
            }
        };
        outer.show();

    }
}