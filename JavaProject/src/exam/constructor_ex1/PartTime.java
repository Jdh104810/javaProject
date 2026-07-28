package exam.constructor_ex1;

public class PartTime extends Worker {
    int hours;      // 근무 시간
    int unitPrice;  // 시급

    // 생성자
    public PartTime(String joominNo, String name, int unitPrice, int hours) {
        super(joominNo, name);
        this.unitPrice = unitPrice;
        this.hours = hours;
    }

    // 총지불액 계산해서 반환
    public int calculatePay() {
        return this.unitPrice * this.hours;
    }

    // toString() 오버라이딩
    @Override
    public String toString() {
        return super.toString() + 
               "\n시급 : " + unitPrice + " 원" +
               "\n근무시간 : " + hours + " 시간" +
               "\n총지불액 : " + calculatePay() + " 원";
    }
}