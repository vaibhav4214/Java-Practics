
import java.util.Scanner;

public class DoWhile {
    
    public static void main(String[] args) {
   
        Scanner scan=new Scanner(System.in);
        System.out.println("Plz Enter Number");
        int fact=scan.nextInt(); 
        int num=1;
        int i=1;
        do
        {
            num=num*i;
            System.out.println(num);
            i++;
        }while(fact>=i);

    }
}
