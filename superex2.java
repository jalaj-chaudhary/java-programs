public class superex2 {
    public static void main(String args[]){
        Test_1 obj=new Test_1();
        obj.show();
    }
}   
    class Test {
        int i=10;
    } 
    class Test_1 extends Test{
        int i=13;
        public void show(){
            System.out.println("value is"+super.i);
        }
    
}
