public class this1 {
        public static void main(String args[]){
            student obj=new student(4,"tanmay",6000);
            obj.show();
    
        }
        
    }
    class student {
        int r_no;
        String name;
        float fee;
        public student(int r_no,String name,float fee){
            this.r_no=r_no;                          
            this.name=name;
            this.fee=fee;
        }
        public void show(){
            System.out.println("roll no:"+ r_no+"\nname:"+name+"\nfee:"+fee);
        }
    }
// roll no:4
// name:tanmay
// fee:6000.0
