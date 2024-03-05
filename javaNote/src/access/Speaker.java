package access;

public class Speaker {

    private int volume;

    public Speaker(int volume) {
        this.volume =  volume;
    }

    public void volumeUp() {
        if(this.volume >= 100){
            System.out.println("쵀대 음량은 100입니다.");
        } else{
            this.volume += 10;
            System.out.println("음량 10 UP");
        }
    }


    public void volumeDown() {
        if(this.volume == 0) {
            System.out.println("음량은 음수가 될 수 없습니다.");
        } else {
            this.volume -= 10;
            System.out.println("음량 10 DOWN");
        }

    }

    public void showVolume() {
        System.out.println("현재 음량 = " + this.volume);
    }
}
