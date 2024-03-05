package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 스피커 객체의 내부 속성에 접근할 수 없도록 함.
        // 메서드를 통해서만 객체 내부 속성에 접근 가능.
        // 메서드에 작성된 볼륨 제한 조건이 예외없이 지켜지게 됨.
        // speaker.volume = 1000;

    }
}
