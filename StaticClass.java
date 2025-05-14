//static class access outside class also
// we can not call non static property inside static class
// static class alway nested class
class Demo

{
   static class NestC{
         void prints()
        {
            System.out.println("static class");
        }
    }
}

public class StaticClass {
    
    public static void main(String[] args) {
        

        Demo.NestC n=new Demo.NestC();
        n.prints();
    }


}


