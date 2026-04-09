class Outer{
    int age;
    public void show(){
        System.out.println("outer Class show");
    }
    class Inner{
        public void showInner(){
            System.out.println("inner Class show");
        }
    }
}

class InnerClass{
    public static void main(String args[]){
        Outer outer = new Outer();
        outer.show();
        Outer.Inner inner = outer.new Inner();
        inner.showInner();

    }
}