class Outer{
    int age;
    public void show(){
        System.out.println("outer Class show");
    }
    static class Inner{
        public void showInner(){
            System.out.println("inner Class show");
        }
    }
}

class StaticInnerClass{
    public static void main(String args[]){
        Outer outer = new Outer();
        outer.show();
        Outer.Inner inner = new Outer.Inner();
        inner.showInner();

    }
}