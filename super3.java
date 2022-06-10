public class super3 {
    public static void main(String args[]){
        test2 obj=new test2();
        obj.cat();
    }
}   
    class animal {
        void cat(){
            System.out.println("some noise");
        }
    } 
    class animal1 extends animal  {
        void cat(){
            System.out.println("some noise 2");
        }
    }
    class test2 extends animal1{
        int i=13;
        public void cat(){
            super.cat();
            System.out.println("some different noise");
        }
    
}
// some noise 2
// some different noise

