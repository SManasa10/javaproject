
class Q3 {

    static int a = 10;
    static int b = 20;

    void showStaticVars() {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Q3 obj = new Q3();
        obj.showStaticVars();
    }
}
