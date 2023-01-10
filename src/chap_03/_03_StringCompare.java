package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); //문자열 내용이 같으면 true, 다르면 false
        //.equals 괄호 안에 들어간 데이터가 같으면 true 를 반환 그게 변수 일 수 있고 하나의 문자열 일 수 있다
        System.out.println(s2.equals("python")); //p 가 소문자 이므로 false 반환
        System.out.println(s2.equalsIgnoreCase("python")); //대소문자 구뷴 없이 문자열 내용이 같은지 여부 체크

        //문자열 비교 심화
        s1 = "1234"; //벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); //true (내용)
        System.out.println(s1 == s2); //true (참조)

        s1 = new String("1234");
        s2 = new String("1234"); //위 아래는 서로 참조하는 곳이 다르다 (메모리 주소값이 다르다)
        System.out.println(s1.equals(s2)); //true (내용)
        System.out.println(s1 == s2); //false (참조)
    }
}