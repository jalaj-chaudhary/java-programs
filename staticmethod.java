
interface amount{
    static int amt(int y){  //if static body can be given
        return y*y;
    }
}
class balance implements amount {
    public int run(int x) {
        return x * x;
    }
}
public class staticmethod{
    public static void main(String args[]){
        balance t=new balance();
        System.out.println(amount.amt(20)); //no need to create obj can be directly called using interface name like in normal static method we call tby class names
        System.out.println(t.run(8));
    }
}

//400
//64