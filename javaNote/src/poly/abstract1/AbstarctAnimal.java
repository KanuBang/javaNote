package poly.abstract1;

// 추상 클래스는 인스턴스로 생성될 필요 없고 상속 역할만 하는 부모 클래스를 만들 때 사용한다.
// 추상 메서드를 하나라도 포함하면 추상 클래스다.
// 모든 메서드가 추상 메서그면 순수 추상 클래스다.
public abstract class AbstarctAnimal {
    public abstract void sound();
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
