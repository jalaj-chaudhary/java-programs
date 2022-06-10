interface lab {
    void print();

    default void display() {
        System.out.println("data display");
    }
}
class test_ implements lab{
    public void print(){
        System.out.println("msg");
    }
}
public class defaultmethod {
    public static void main(String args[]){
        test_ ob=new test_();
        ob.print();
        ob.display();
    }
}
// msg
// data display