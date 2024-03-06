package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        // 부모 -> 자식
        Parent poly = new Child();
        // 부모가 자식의 기능은 호출할 수 없다.
        // poly.childMethod();

        // 다운캐스팅 (부모 타입 -> 자식 타입)
        // 부모 타입이 자식 타입으로 바뀜.
        Child child = (Child) poly;
        child.childMethod();
        child.parentMethod();

        // child -> parent 불가
        // Child child1 = poly;

    }
}
