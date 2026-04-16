enum Status {
    Running, Success, Failed, Done;
}

enum Laptop {
    MacBook(100), Surface(), XPS(500);
    private int price;
    private Laptop(){
        this.price=1000;
    }
    private Laptop(int price){
        this.price=price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
}

class EnumExample{
    public static void main(String args[]){
        Status s = Status.Failed;
        System.out.println(s);
        System.out.println(s.getClass().getSuperclass());//enum extends Enum class
        System.out.println(s.ordinal());//index of an element in enum
        Status[] ss = Status.values();
        for(Status status:ss){
            System.out.println(status);
        }

        Laptop lap = Laptop.MacBook;
        Laptop[] laptops = Laptop.values();
        for(Laptop laps:laptops){
            System.out.println(laps+":"+laps.getPrice());
        }
    }
}