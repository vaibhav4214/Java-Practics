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