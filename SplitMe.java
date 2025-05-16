

public class SplitMe {
    
    public static void main(String[] args) {
        
            String str="I Am Java Developers";
            SplitDemo s=new SplitDemo();
            s.SplitD(str);
    }
}

class SplitDemo
{
    void SplitD(String str)
    {
            String arr[];
            arr=str.split(" ");
            for(String s:arr)
            {
                System.out.println(s);
            }
    }
}