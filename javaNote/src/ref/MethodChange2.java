package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전 dataA.value: " + dataA.value);
        change(dataA);
        System.out.println("메서드 호출 전 dataA.value: " + dataA.value);
    }

    static void change(Data data) {
        data.value = 20;
    }
}
