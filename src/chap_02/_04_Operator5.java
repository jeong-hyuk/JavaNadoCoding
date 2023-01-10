package chap_02;

public class _04_Operator5 {
    public static void main(String[] args) {
        //삼항 연산자
        //결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)
        int x = 3;
        int y = 5;

        int max = (x > y) ? x : y;
        System.out.println(max); //x 와 y 의 값이 바뀌어도 결국 최대값이 들어가게 5


        int min = (x < y) ? x : y;
        System.out.println(min); //x 와 y 의 값이 바뀌어도 결국 최소값이 들어가게 된다 3

        boolean b = (x == y) ? true : false;
        System.out.println(b); //false


        String s = (x != y) ? "달라요" : "같아요";
        System.out.println(s); //"달라요"
    }
}
