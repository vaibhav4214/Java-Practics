//constructor call when object created of class
// constructor have two type 1) Default Construcotr 2)Parameterize Conststructor
//A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:
public class Constructor {
    public static void main(String[] args) {
        
        Const c1=new Const("Parametrize Const");
        Const c2=new Const();

    }
}

class Const{

    Const()
    {
        System.out.println("Default Constructor");
    }

    Const(String a)
    {
            System.out.println("Paramiterize Constructor");
    }
}