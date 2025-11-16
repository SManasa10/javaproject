
public class PublicExample {

    public int value = 40;
    public void showMsg() {
        System.out.println("Public method called");
    }
    public static void main(String[] args) {
        PublicExample obj = new PublicExample();

        System.out.println(obj.value);
        obj.showMsg();
    }
}
