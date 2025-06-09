//nested class  inside his parent class only
// class created inside other class called as nested class

public class NestedClass {
    public static void main(String[] args) {
        
        Demo d=new Demo();
        d.printName();
    }    

}

class Demo {

    void printName()
    {
        System.out.println("Java");
         
    }

    class NestedC{
        
        void printName()
        {
            System.out.println("Nested Class");
        }
    }
 
}