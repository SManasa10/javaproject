public class string11 {
    public static void main(String[] args) {
        String str = "apple,banana,grapes";

        String[] arr = str.split(",");
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
