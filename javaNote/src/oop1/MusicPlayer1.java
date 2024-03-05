package oop1;

public class MusicPlayer1 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
        data.turnOn(data);
        data.volumeUp(data);
        data.volumeUp(data);
        data.volumeDown(data);
        data.currentState(data);
        data.turnOff(data);
    }

}
