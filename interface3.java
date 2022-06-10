interface bank{
    float rateofint();
}
class sbi implements bank{
    public float rateofint(){
        return 10.5f;
    }
}
class pnb implements bank{
    public float rateofint(){
        return 8.0f;
    }
}
public class interface3{
    public static void main(String args[])
    {
        bank b=new sbi();
        float f=b.rateofint();
        System.out.println("rate of interest is:"+f);
    }
}
// drawing circle
// drawing rectangle
