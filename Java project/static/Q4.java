
class Q4 {

    void instanceMethod() {
        System.out.println("Instance method called");
    }

    static void callInstanceMethod() {
        Q4 obj = new Q4();
        obj.instanceMethod();
    }

    public static void main(String[] args) {
        callInstanceMethod();
    }
}
