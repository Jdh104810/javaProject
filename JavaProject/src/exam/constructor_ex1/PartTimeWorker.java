package exam.constructor_ex1;

public class PartTimeWorker {
    public static void main(String[] args) {
        // 객체 생성하면서 생성자에게 값 전달 (주민번호, 성명, 시급, 근무시간 순서)
        PartTime pt = new PartTime("990101-1034567", "홍길동", 6000, 60);

        // 출력 (System.out.println(인스턴스) 형태로 toString 호출)
        System.out.println(pt);
    }
}