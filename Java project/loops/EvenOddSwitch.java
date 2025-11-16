public class EvenOddSwitch {
    public static void main(String[] args) {

        int num = 10;
        int result = num % 2;

        switch(result) {
            case 0 -> System.out.println(num + " is Even");
            case 1 -> System.out.println(num + " is Odd");
        }
    }
}
