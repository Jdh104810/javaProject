package exam;

import java.util.Scanner;

public class TimeCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("시간 입력 (초) : ");
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600; 
        int minutes = (totalSeconds % 3600) / 60; 
        int seconds = totalSeconds % 60;  

        System.out.println(totalSeconds + "초는 " + hours + "시간, " + minutes + "분, " + seconds + "초입니다.");

        scanner.close();
    }
}