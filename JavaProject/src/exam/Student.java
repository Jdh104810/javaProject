package exam;

import java.util.Scanner;

public class Student {
   
    int stdNo;      // 학번
    String stdName; // 성명
    int year;       // 학년
    double score;   // 점수

    
    public void inputStdInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("****학생 정보 입력****");
        System.out.print("학번 : ");
        stdNo = scanner.nextInt();

        System.out.print("성명 : ");
        stdName = scanner.next();

        System.out.print("학년 : ");
        year = scanner.nextInt();

        System.out.print("점수 : ");
        score = scanner.nextDouble();
    }

   
    public void showStdInfo() {
        System.out.println("\n****학생 정보 출력****");
        System.out.println("학번 : " + stdNo);
        System.out.println("성명 : " + stdName);
        System.out.println("학년 : " + year);
        System.out.println("점수 : " + score);
    }

    
    public static void main(String[] args) {
        Student student = new Student();
        student.inputStdInfo();          
        student.showStdInfo();          
    }
}