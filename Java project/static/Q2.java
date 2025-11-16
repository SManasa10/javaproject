
class Q2 {

    int x = 50;
    int y = 100;

    static void printInstanceVariables() {
        Q2 obj = new Q2(); 
        System.out.println(obj.x);
        System.out.println(obj.y);
    }

    public static void main(String[] args) {
        printInstanceVariables();
    }
}
