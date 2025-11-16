public class string1 {
    public static void main(String[] args) {

        String s1 = "Hello";                     
        @SuppressWarnings("RedundantStringConstructorCall")
        String s2 = new String("Hello World");   
        char[] chars = {'J', 'A', 'V', 'A'};
        String s3 = new String(chars);         

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
