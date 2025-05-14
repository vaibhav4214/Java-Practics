//Multiple Constructor
public class MultipleConstructor {
    
    public static void main(String[] args) {
        
            Demo d =new Demo();
            Demo d1=new Demo("anil");
            Demo d2=new Demo("Ajay",45);
    }
}

class Demo
{
    Demo()
    {
        System.out.println("Default Constructor");
    }
    Demo(String name)
    {
        System.out.println(name);
    }
    Demo(String name, int age)
    {
        System.out.println(name + age);
    }
}