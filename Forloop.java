public class Forloop {
    public static void main(String[] args) {
        Table t = new Table();
        t.PrintTable();
    }
}

class Table
{
    public void PrintTable()
    {
        for(int i=1;i<=100;i++)
        {
            for(int j=1;j<=10;j++)
            {
                System.out.println(j*i);
            }
            System.out.println("------Table Of ["+(i+1)+"]");
        }
    }
}