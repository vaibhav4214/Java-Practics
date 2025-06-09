//it is used to achive abstraction
// intrface support multiple inheritance
// it is used to achive loosli coupled
//interface contain only abstract methode
// if we define void show() in interface then it is by default public abstract methode
// if we defint variable int a=10; then it is by default public static final

 interface  Interfa {
    
            void show();

}

 class IntfUSe implements Interfa
{
    public     void show()
        {
            System.out.println("ok");
        }
}
class Interfaces
{
    public static void main(String[] args) {
        
        IntfUSe f= new IntfUSe();
        f.show();
    }
}



// youtube  link-https://www.youtube.com/watch?v=go4c9seTlY8&t=430s