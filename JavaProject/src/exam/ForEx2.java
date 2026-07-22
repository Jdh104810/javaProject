package exam;

import java.util.Scanner;

public class ForEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("단 수 입력 : ");
        int dan = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " x " + i + " = " + (dan * i));
        }

        scanner.close();
    }
}