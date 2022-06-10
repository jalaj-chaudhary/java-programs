public class this3 {
  //to invoke current classs constructor:- calling deafault cont from parameterized constructor

    public static void main(String args[]){
        call obj=new call(3);
    }
    
}
class call {
    public call(){
        System.out.println("calling");
    }
    public call(int i){
        this();                                  
        System.out.println(i); 
    }
}
// calling
// 3