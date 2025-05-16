public class JoinM {
    public static void main(String[] args) {
        
        String[] arr={"java","Python","Html"};
            for(String s:arr)
            {
                System.out.println(s);
            }
        String JoinArray=String.join(" ",arr);
        System.out.println(JoinArray);
    }
}
