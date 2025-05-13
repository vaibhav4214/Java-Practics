public class Strings {
    public static void main(String[] args) {
        

        String str= "how are you ?";
        String str2="";
        System.out.println(str.length());
        System.out.println(str.substring(4));
        System.out.println(str.substring(3,6));
        System.out.println(str.replace("how", "who"));
        System.out.println(str2.isEmpty());
        // convert char to string
        char[] c={'a','b'};
        String str3= new String(c);
        System.out.println(str3);
    }
}
