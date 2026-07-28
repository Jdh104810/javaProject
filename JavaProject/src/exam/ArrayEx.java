package exam;

import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int maxStudents = 5;
        String[] name = new String[maxStudents];
        int[] gram = new int[maxStudents];
        int[] list = new int[maxStudents];
        int[] read = new int[maxStudents];
        
        int count = 0;
        
        System.out.println("*** 영어 시험 점수 입력 ***");
        
        while (count < maxStudents) {
            int num = count + 1;
            System.out.print(num + "번 성명 입력: ");
            name[count] = scanner.next();
            
            System.out.print(num + "번 문법 점수 입력: ");
            gram[count] = scanner.nextInt();
            
            System.out.print(num + "번 듣기 점수 입력: ");
            list[count] = scanner.nextInt();
            
            System.out.print(num + "번 독해 점수 입력: ");
            read[count] = scanner.nextInt();
            
            count++;
            
            if (count >= maxStudents) {
                break;
            }
            
            System.out.print("계속 입력하시겠습니까? (y입력하면 계속): ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
        }
        
        System.out.println("\n*** 영어 시험 결과 ***");
        
        for (int i = 0; i < count; i++) {
            int total = gram[i] + list[i] + read[i];
            int grade;
            
            if (total >= 800) {
                grade = 1;
            } else if (total >= 600) {
                grade = 2;
            } else if (total >= 400) {
                grade = 3;
            } else {
                grade = 4;
            }
            

            String gradeStr = "";
            switch (grade) {
                case 1: gradeStr = "1등급"; break;
                case 2: gradeStr = "2등급"; break;
                case 3: gradeStr = "3등급"; break;
                case 4: gradeStr = "4등급"; break;
            }
            
            int studentNum = i + 1;
            System.out.println(studentNum + "번 " + name[i] + " " + total + " " + gradeStr);
        }
        
        scanner.close();
    }
}