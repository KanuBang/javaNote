package oop1;

public class ValueDataMaiin {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        add(valueData);
        add(valueData);
        add(valueData);
        System.out.println("최종 data.value: " + valueData.value);
    }

    private static void add(ValueData data) {
        data.value++;
        System.out.println("증가 후 data.value: " + data.value);
    }
}
