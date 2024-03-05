package construct;

public class PlayerInit {
    String name;
    int age;
    String sex;
    String club;

    public PlayerInit(String name, int age, String sex, String club) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.club = club;
    }

    public PlayerInit(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


}
