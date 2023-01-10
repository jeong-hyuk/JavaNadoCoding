package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String IDNum = "901231-1234567";
        System.out.println(IDNum.substring(0, 8)); //0 위치부터 8 위치 직전까지

        IDNum = "990113-1074613";
        System.out.println(IDNum.substring(0, IDNum.indexOf("-") + 2));
    }
}