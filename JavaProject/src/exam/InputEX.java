package exam;

import java.util.Scanner;

public class InputEX {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("이름 입력 : ");
        String name = scanner.next();

        System.out.print("학년 입력 : ");
        int year = scanner.nextInt();

        System.out.print("점수 입력 : ");
        double score = scanner.nextDouble();

        System.out.print("학점 입력 : ");
        char grade = scanner.next().charAt(0);


        System.out.println("--------------------");
        System.out.println("이름 : " + name);
        System.out.println("학년 : " + year);
        System.out.println("점수 : " + score);
        System.out.println("학점 : " + grade);

        scanner.close();
    }
}
