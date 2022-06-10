

interface printing1{
    void print();
}
interface showing1 extends printing1{
    void show();
}
public class interface5 implements showing1{
    public void print(){
        System.out.println("printing");
    }
    public void show(){
        System.out.println("show");
    }
    public static void main(String args[]){
            interface5 ob= new interface5();
            ob.print();
            ob.show();
    }
}
// printing
// show


