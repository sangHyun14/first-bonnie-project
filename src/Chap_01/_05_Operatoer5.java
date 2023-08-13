package Chap_01;

public class _05_Operatoer5 {
    public static void main(String[] args) {
        // 삼항 연산자
        // 결과 = (조건) ? (참의 경우 결과값): (거짓인 경우 결과값)

        int x = 5;
        int y = 3;
        int max = ( x > y) ? x : y;
        System.out.println(max);
    }
}
