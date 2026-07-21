package exam;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ArithmeticOperatorEX {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //변수 선언
        int kor, eng, math, total;
        double average;

        System.out.print("국어 점수 입력 : ");
        kor = scanner.nextInt();

        System.out.print("영어 점수 입력 : ");
        eng = scanner.nextInt();

        System.out.print("수학 점수 입력 : ");
        math = scanner.nextInt();

        System.out.println("================");
        total = kor + eng + math;
        average = (double) total / 3.0;

        //소수점 이하 자리수 두자리로 조정
        DecimalFormat df = new DecimalFormat();
        
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + df.format(average));

        scanner.close();
    }
}