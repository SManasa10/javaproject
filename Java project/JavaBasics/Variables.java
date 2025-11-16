public class Variables {

    int number = 100; 

    void show() {
        int localNumber = 50; 

        System.out.println("Local variable: " + localNumber);
        System.out.println("Global variable: " + this.number);
    }

    public static void main(String[] args) {
        Variables obj = new Variables();
        obj.show();
    }
}

