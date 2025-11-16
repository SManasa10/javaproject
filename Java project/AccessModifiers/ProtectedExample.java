
public class ProtectedExample {

    protected int data = 30;
    protected void message() {
        System.out.println("Protected method called");
    }
  public static void main(String[] args) {
        ProtectedExample obj = new ProtectedExample();
        System.out.println(obj.data);
        obj.message();
    }
}

