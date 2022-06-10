public class super1 {
        public static void main(String args[]){
            abc obj=new abc(5);
    
        }    
    }
    class ab extends Object{ //by default extends Object class
        public ab(){
            System.out.println("an ab const");
    
        }
        public ab(int i){
            System.out.println("an ab parameterized const");
        }
    }
    class abc extends ab{
        public abc(){   
            System.out.println("an abc const");
        }
        public abc(int i)
        {
            super(5);
            System.out.println("an abc parameterized const");
        }
    }
// an ab parameterized const
// an abc parameterized const
