package chap_04;

import java.util.Scanner;

public class _04_SwitchCase {
    public static void main(String[] args) {
        //switch case
        //1등 : 전액 장학금
        //2등 : 반액 장학금
        //3등 : 반액 장학금
        //그 외 : 장학금 대상 아님

        Scanner sc = new Scanner(System.in);
        int ranking; //등수
        ranking = sc.nextInt();

        //if else 문을 이용
        if(ranking == 1){
            System.out.println("전액 장학금");
        }else if(ranking == 2){
            System.out.println("반액 장학금");
        }else if(ranking == 3){
            System.out.println("반액 장학금");
        }else{
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        //switch case 문을 이용
        /**
        switch(expression){
            case A: ... 수행할 명령 ...
                break;
            case B:
                break;
            case c:
                break;
                ...
            default: ... 수행할 명령 ...
        }
         */

        switch(ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");

        //중고상품의 등급에 따른 가격을 책정 (1급 : 최상, 4급 : 최하)
        int grade;
        System.out.println("중고 상품의 등급은 : ");
        grade = sc.nextInt();
        int price = 7000;
        switch (grade){
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "듭급 제품의 가격 : " + price + "원");

        //범위의 값이면 if문을 사용
        //하나의 값을 나와질 때는 case문을 사용
    }
}

