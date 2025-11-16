
class Q7 {

    static void staticMethod() {
        System.out.println("Static method called");
    }

    void instanceMethod() {
        System.out.println("Instance method called");
    }

    public static void main(String[] args) {

        staticMethod();

        Q7 obj = new Q7();
        obj.instanceMethod();
    }
}
