public class ThisKey {
    
    public static void main(String[] args) {
        Demo d=new Demo();
    }
}

class Demo
{
    int age=50;
    Demo()
    {
    this.printAge(age);  
      }
    void printAge(int a)
    {
        System.out.println("age is----------->" +a);
    }
}