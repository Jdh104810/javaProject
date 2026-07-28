package exam;

import java.util.Random;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int[] counts = new int[10]; // 0~9까지의 숫자가 나온 횟수를 저장할 배열
        Random random = new Random();

        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10); // 0 ~ 9 사이의 랜덤 수
            System.out.print(numbers[i]);
        }
        System.out.println();
    
        for (int i = 0; i < numbers.length; i++) {
            int val = numbers[i];
            counts[val]++;
        }

        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + "의 개수 :" + counts[i]);
        }
    }
}