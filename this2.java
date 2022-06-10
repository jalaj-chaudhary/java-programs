public class this2 {
    public static void main(String args[]){
        example obj=new example();
        obj.run();

    }
    
}
class example {
    public void  msg(){
        System.out.println("message is going on");
    }
    public void run(){
       
        System.out.println("running");
        this.msg();
    }
}
// running
// message is going on
