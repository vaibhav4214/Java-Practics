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
           NestedC n=new NestedC();
        n.printName();
    }

    class NestedC{
        
        void printName()
        {
            System.out.println("Nested Class");
        }
    }
 
}