package exam;

import java.util.Scanner;

public class ArrayInputEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];

        
        for (int i = 0; i < num.length; i++) {
            System.out.print("num[" + i + "] : ");
            num[i] = scanner.nextInt();
        }

        
        System.out.print("입력된 값 : ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();

        
        int max = num[0]; 
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }

        
        System.out.println("최대값 : " + max);
        
        scanner.close();
    }
}