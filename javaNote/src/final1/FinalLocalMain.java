package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        final int data1 = 10;
         // data1 = 20;
        final int data2;
        data2 = 20;
        // data2 = 30;
    }

    static void method1(final int data){
        // data = 20;
        System.out.println("data: " + data);
    }
}
