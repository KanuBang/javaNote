package construct;

public class MethodInitMain {
    public static void main(String[] args) {
        PlayerInit player1 = new PlayerInit("PAVARD", 27, "MALE");
        PlayerInit player2 = new PlayerInit("GNABRY", 27, "MALE");
        PlayerInit player3 = new PlayerInit("KANE", 29, "MALE", "FCB");
        PlayerInit player4 = new PlayerInit("VINI JR", 24, "MALE", "RMA");

        PlayerInit[] players = {player1,player2,player3,player4};

        for(PlayerInit player : players) {
            System.out.printf("이름: %s 나이: %d 성별: %s 소속팀: %s\n", player.name, player.age, player.sex, player.club);
        }
    }

}
