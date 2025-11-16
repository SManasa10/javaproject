
class PrivateExample {

    @SuppressWarnings("FieldMayBeFinal")
    private int num = 10;             
    private void show() {            
        System.out.println("Private Method Called");
    }

    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();
        System.out.println("Private field: " + obj.num);
        obj.show();   
    }
}

