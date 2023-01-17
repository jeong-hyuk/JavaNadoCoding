package chap_06;

public class _04_ParameterAndReturn {

    public static int getPower(int number) {
        return number * number;
    }

    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        //전달값과 반환값이 있는 메소드
        System.out.println(getPower(3)); //3은 전달값 sout은 반환값을 받기 위한 공간임

        System.out.println(getPowerByExp(2,4));
    }
}
