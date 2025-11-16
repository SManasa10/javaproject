
class Q1 {

    
    static int a = 10;
    static int b = 20;

    
    int x = 100;
    int y = 200;

    
    static void sMethod1() {
        System.out.println("Static Method 1");
    }

    static void sMethod2() {
        System.out.println("Static Method 2");
    }

    
    void iMethod1() {
        System.out.println("Instance Method 1");
    }

    void iMethod2() {
        System.out.println("Instance Method 2");
    }

    public static void main(String[] args) {

        
        System.out.println("Static a = " + a);
        System.out.println("Static b = " + b);

        
        sMethod1();
        sMethod2();

        
        Q1 obj = new Q1();

        System.out.println("Instance x = " + obj.x);
        System.out.println("Instance y = " + obj.y);

        
        obj.iMethod1();
        obj.iMethod2();

        System.out.println("All members used successfully!");
    }
}
