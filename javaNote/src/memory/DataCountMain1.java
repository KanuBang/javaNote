package memory;

public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 dataA = new Data1("A");
        System.out.println("count: " + Data1.count);
        Data1 dataB = new Data1("B");
        System.out.println("count: " + Data1.count);
        Data1 dataC = new Data1("C");
        System.out.println("count: " + Data1.count);
    }
}
