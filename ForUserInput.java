
import java.util.Scanner;

public class ForUserInput {
    public static void main(String[] args) {
        UserIput u=new UserIput();
        u.Print();
        
    }
}

class UserIput{
    Scanner scan=new Scanner(System.in);
    


    public void Print()
    {
           System.out.println("Plz Enter Value For Table");
        int val=scan.nextInt();
     
        for(int i=1;i<=10;i++)
        {
            System.out.println(i*val);
        }
    }
    
    
}