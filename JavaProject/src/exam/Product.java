package exam;

import java.util.Scanner;

public class Product {
   
    String prdName;  // 상품명
    int prdPrice;    // 가격
    int prdSold;     // 판매 수량
    int prdStock;    // 재고 수량


    public void inputPrdInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("****상품 정보 입력****");
        System.out.print("상품명 : ");
        prdName = scanner.next();

        System.out.print("가격 : ");
        prdPrice = scanner.nextInt();

        System.out.print("판매 수량 : ");
        prdSold = scanner.nextInt();

        System.out.print("재고 수량 : ");
        prdStock = scanner.nextInt();
    }

    
    public void showPrdInfo() {
        System.out.println("\n****상품 정보 출력****");
        System.out.println("상품명 : " + prdName);
        System.out.println("가격 : " + prdPrice);
        System.out.println("판매 수량 : " + prdSold);
        System.out.println("재고 수량 : " + prdStock);
    }

    
    public void salesAmount() {
        int totalSales = prdPrice * prdSold;
        System.out.println("매출액 : " + totalSales);
    }

   
    public void stockAmount() {
        int totalStock = prdPrice * prdStock;
        System.out.println("재고액 : " + totalStock);
    }

   
    public static void main(String[] args) {
        Product product = new Product(); 
        
        product.inputPrdInfo();         
        product.showPrdInfo();        
        product.salesAmount();           
        product.stockAmount();         
    }
}