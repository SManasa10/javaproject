
class Q5 {

    static void staticMethod() {
        System.out.println("Static method called");
    }

    void instanceMethod() {
        staticMethod();
    }

    public static void main(String[] args) {
        Q5 obj = new Q5();
        obj.instanceMethod();
    }
}
