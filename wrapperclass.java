public class wrapperclass {
    public static void main (String args[]){
        int x=50;
        Integer y=Integer.valueOf(x);//explicit autoboxing
        System.out.println(y);
        Integer z=x;//auto
        System.out.println(z);
        System.out.println("unboxing");
       // Integer a=new Integer(5);
        //autoboxing incomplete

    }
    
}
