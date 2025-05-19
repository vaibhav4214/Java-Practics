/*1Pawan Sir Notes Page No
 Singleton Class :-
 It is one of the design patterns.
 A class which is having only one object is called as Singleton class.
 Whenever we are having a requirement where we have to avoid multiple object creation
then we will go for singleton design pattern.
 Objects are costly resource it means that whenever we create an object it will consume
more memory inside a RAM*/

public class singleTon {
    public static void main(String[] args) {
        
        singleTonClass s1=singleTonClass.getInstance(); // return alway same instance of Class singleTonClass
        singleTonClass s2=singleTonClass.getInstance(); 
        System.out.println(s1);
        System.out.println(s2);
        Demo d1=new Demo(); //return different instance of class Demo
        Demo d2=new Demo(); 
        System.out.println(d1); 
        System.out.println(d2);
    }
}


class singleTonClass
{
    static singleTonClass obj=new singleTonClass();

    private singleTonClass()
    {
        
    }

    public static singleTonClass getInstance()
    {
        return obj;
    }
}

class Demo1
{

}