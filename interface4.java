
interface printing {
    void print();
}
interface showing {
    void show();
}
public class interface4 implements printing,showing{
        public void print(){
        System.out.println("printing....");
    }
    public void show(){
        System.out.println("showing ");
    }

    public static void main(String args[])
    {
        interface4 obj=new interface4();
        obj.print();
        obj.show();
        printing  ob=new interface4();
        //ob.show();
        ob.print();
    }
}
//printing....
// showing
// printing....