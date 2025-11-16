public class FindIndex {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        int target = 15;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Index = " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}
