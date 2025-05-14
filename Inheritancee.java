//Using Inheritance We Can Use The Properties Of Parents Class in Child class
// child class not access private property of parent class


class Parents
{
    void Print()
    {
        System.out.println("Parents");
    }
}

class Child extends Parents
{
        void Print1()
        {
            System.out.println("child");
        }
}

public class Inheritancee {
    public static void main(String[] args) {
        
            Child c=new Child();
            c.Print();
            c.Print1();
            Parents p=new Parents();
            p.Print();

    }
    
}
