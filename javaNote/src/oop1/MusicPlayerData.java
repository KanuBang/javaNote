package oop1;

public class MusicPlayerData {
    private int volume = 0;
    private boolean isOn = false;


    void turnOn(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    void turnOff(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("볼륨: " + data.volume);
    }

    void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("볼륨: " + data.volume);
    }

    void currentState(MusicPlayerData data) {
        // 음악 플레이어 상태
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨" + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
