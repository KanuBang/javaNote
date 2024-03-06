package poly.basic;

class Epl {
    public static String nation = "England";
}

class Chelsea extends Epl{
    public static String name = "England";
}

class Spurs extends Epl{
    public static String name = "Spurs";
}

public class instanceOfMain {
    public static void main(String[] args) {
        Epl team1 = new Epl();
        Epl team2 = new Spurs();
        Chelsea che = new Chelsea();
        Spurs tot = new Spurs();

        if (new Epl() instanceof Chelsea) {
            System.out.println("pass start");
        } else{
            System.out.println("not pass start");
        }
        if (team2 instanceof Chelsea){
            System.out.println("pass0");
        } else{
            System.out.println("not pass0");
        }
        if (team1 instanceof Epl) {
            System.out.println("pass1");
        } else{
            System.out.println("not pass1");
        }

        if (team1 instanceof Chelsea) {
            System.out.println("pass2");
        } else{
            System.out.println("not pass2");
        }

        if (che instanceof Epl) {
            System.out.println("pass3");
        } else{
            System.out.println("not pass3");
        }

        if (tot instanceof Epl) {
            System.out.println("pass4");
        } else{
            System.out.println("not pass4");
        }
    }
}
