public class Abstractclass {
    
    public static void main(String[] args) {
        //we can not create object of abstract class
        //abstraction is like details hiding
        //create abstract class using abstract kkeyword with clas
        // but we can create referance of abstract class (tiger t=new animal())
        //abstract methode can not have body
        //if we create abstract method then compulsory to create his class abstract
        //but abstract class contain both simple or abstract methode
        // when other class extends abstract class then other class need to define(implement) all abstract methode  which is declare in extended abstract class
      //  animal a=new animal(); Cannot instantiate the type animal
        
        tiger t=new tiger();
        dog t2=new dog();
        t2.eat();


        t.eat();
    }
}

abstract class animal
{
   abstract  public void eat();
   
}
class tiger extends animal
{
    @Override
    public void eat() {
        {
            System.out.println("Nonveage");
        }
    }
}
class dog extends animal
{

    @Override
    public void eat() {
        System.out.println("Eat Both Veg And Nonveg");
    }
    
}


//Youtube link:-https://www.youtube.com/watch?v=iSP60D5UZ8U