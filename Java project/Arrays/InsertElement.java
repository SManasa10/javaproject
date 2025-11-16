public class InsertElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int pos = 2;
        int value = 3;

        for (int i = arr.length - 1; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = value;

        for (int n : arr) System.out.print(n + " ");
    }
}
