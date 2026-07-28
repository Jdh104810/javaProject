package exam;

import java.util.Random;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        Random random = new Random();

        // 1~45 중 중복되지 않는 6개의 숫자 생성
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = random.nextInt(45) + 1; // 1부터 45까지의 랜덤 수

           
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--; 
                    break;
                }
            }
        }

     
        System.out.println("=== 로또 번호 생성 프로그램 ===");
        System.out.print("생성된 로또 번호: ");
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }
        System.out.println();
    }
}