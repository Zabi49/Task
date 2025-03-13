package ex_03_literals;

public class lab033_literals {
    public static void main(String[] args) {
        int num = 100;
        long largeNum = num;  // int to long (implicit casting)
        double decimalNum = largeNum;  // long to double (implicit casting)

        System.out.println("int: " + num);      // 100
        System.out.println("long: " + largeNum); // 100
        System.out.println("double: " + decimalNum); // 100.0

    }
}
