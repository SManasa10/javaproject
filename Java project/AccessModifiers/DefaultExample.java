
class DefaultExample {

    @SuppressWarnings("unused")
    int val = 20;              
    @SuppressWarnings("unused")
    void display() {           
        System.out.println("Default method called");
    }

    public static void main(String[] args) {
        DefaultExample obj = new DefaultExample();
        System.out.println("Default field: " + obj.val);
        obj.display();
    }
}

