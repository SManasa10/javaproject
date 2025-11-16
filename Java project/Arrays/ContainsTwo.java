public class ContainsTwo {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 23, 9};

        boolean has12 = false, has23 = false;

        for (int n : arr) {
            if (n == 12) has12 = true;
            if (n == 23) has23 = true;
        }

        if (has12 && has23)
            System.out.println("Both 12 and 23 exist");
        else
            System.out.println("Not found");
    }
}
