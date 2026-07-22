package exam;

import java.util.Scanner;

public class ControlEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("****** 상품 정보 ******");
        System.out.println("1 노트북 : 1,200,000 원");
        System.out.println("2 디지털카메라 : 400,000 원");
        System.out.println("************************");

        System.out.print("상품번호 입력 : ");
        int choice = scanner.nextInt();

        if (choice != 1 && choice != 2) {
            System.out.println("잘못 입력하였습니다. 종료합니다.");
            scanner.close();
            return;
        }

        System.out.print("주문 수량 입력 : ");
        int quantity = scanner.nextInt();

        String productName = "";
        int price = 0;

        switch (choice) {
            case 1:
                productName = "노트북";
                price = 1200000;
                break;
            case 2:
                productName = "디지털카메라";
                price = 400000;
                break;
        }

        // 주문액 계산
        int orderAmount = price * quantity;
        double discountRate = 0.0;

        // 할인율 결정
        if (orderAmount >= 1000000) {
            discountRate = 0.10;
        } else if (orderAmount >= 500000) {
            discountRate = 0.05;
        } else {
            discountRate = 0.0;
        }

        // 할인액 및 총 지불액 계산
        int discountAmount = (int) (orderAmount * discountRate);
        int totalAmount = orderAmount - discountAmount;


        System.out.println("****** 주문 내용 ******");
        System.out.println("상품명 : " + productName);
        System.out.println("가격 : " + price + " 원");
        System.out.println("주문 수량 : " + quantity + " 개");
        System.out.println("주문액 : " + orderAmount + " 원");
        System.out.println("할인액 : " + discountAmount + " 원");
        System.out.println("총지불액 : " + totalAmount + " 원");

        scanner.close();
    }
}