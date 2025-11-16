public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int remove = 6;

        for (int n : arr) {
            if (n != remove)
                System.out.print(n + " ");
        }
    }
}
