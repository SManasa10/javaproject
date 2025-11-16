public class ContainsValue {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 9};
        int value = 7;
        boolean found = false;

        for (int n : arr) {
            if (n == value) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Value found" : "Value not found");
    }
}
