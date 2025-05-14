public class HeirarchicalInh {

    public static void main(String[] args) {
        Child1 c1=new Child1();
        Child2 c2=new Child2();
        c1.Print("Child1");
        c2.Print("Child2");

    }
    
}

class Parent
{
    void Print(String name)
    {
        System.out.println("Called Parent From-->"+name);
    }
}
class Child1 extends Parent
{

}
class Child2 extends Parent
{

}