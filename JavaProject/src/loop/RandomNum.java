package loop;

import java.util.Random;
public class RandomNum {

	public static void main(String[] args) {
		Random rd = new Random();
		// 난수 생성 : Math 클래스의 random() 메소드 사용
		// Math.random() : 0 < 난수 < 1-> 실수형 난수 1개 반환
		for(int i=1; i<=10; i++) {
			double num = (int)(Math.random() * 10); //0~9
			num = rd.nextInt(10)+1; //1~10
			System.out.println(num);
		}
	}

}
