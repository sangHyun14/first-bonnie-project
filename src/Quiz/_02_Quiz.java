package Quiz;

public class _02_Quiz {
    public static void main(String[] args) {
        int x = 121;
        String result = (x >= 120) ? (" 탑승 가능 합니다") : ("탑승 불가능 합니다.");
        System.out.println("키가 "+ x + "cm 이므로" + result);
    }
}
