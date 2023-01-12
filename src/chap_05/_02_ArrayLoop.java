package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        //배열의 순회
        String[] coffees = {"아메리카노", "카페모카", "라뗴", "카푸치노"};
        //System.out.println(coffees[0] + " 하나");
        //System.out.println(coffees[1] + " 하나");

        //for 반복문 순회
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("-----------------------");

        //배열의 길이를 이용한 순회
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("-----------------------");

        //enhanced for (for-each) 반복문 (향상된 for 문)
        for (String coffee :
                coffees){ //coffees란 배열의 값이 순서대로 순회하는데 그때그때 순회되는 값을 coffee란 이름으로 받아 사용하겠다.
            System.out.println(coffee + "하나");
        }
        System.out.println("주세요");
        //모든 값을 순회할거면 enhanced for 를 사용 인덱스를 구분해야한다면 for 사용
    }
}