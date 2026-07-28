package classInfo;

public class FinalEx {

    public static void main(String[] args) {
       
        Final f1 = new Final("123456789-56789", "계백");

        System.out.println(f1.nation);
        System.out.println(f1.ssn);
        System.out.println(f1.name);

        // f1.nation = "japan";
        // f1.ssn = "5555-6666";
        f1.name = "을지문덕"; 
    }
}