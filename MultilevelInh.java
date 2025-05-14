//Multilevel Inheritance Use The Property Of His Parents Parent class


public class MultilevelInh {
    
            public static void main(String[] args) {
                
                class3 c3=new class3();
                c3.PrintName();
            }

}

class class1
{
    void PrintName()
    
    {
        System.out.println("Multilevel");
    }
}

class class2 extends class1
{

}

class class3 extends class2
{


}
