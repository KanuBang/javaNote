package final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수: " + Constant.MAX_USERS);
        int currentUser = 999;
        method(currentUser++);
        method(currentUser++);
        method(currentUser++);

    }

    private static void method(int currentUserCount){
        System.out.println("참여자 수 : " + currentUserCount);
        if(currentUserCount > Constant.MAX_USERS){
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 찹가합니다.");
        }
    }
}
