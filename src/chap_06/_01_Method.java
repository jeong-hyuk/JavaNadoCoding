package chap_06;

public class _01_Method {

    //메소드 정의
    public static void sayHello(){ //동작을 하기 떄문에 동사를 사용
        System.out.println("Hello this is Method");
    }

    public static void main(String[] args) {
        //메소드 호출
        System.out.println("메소드 호출 전");
        for (int i = 0; i < 10; i++) {
            sayHello();
        }
        System.out.println("메소드 호출 후");
    }
}