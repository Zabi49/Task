package typecasting;

public class typecasting2 {
    public static void main(String[] args) {
        int a = 2, b = 9, c = -11;

        // Using nested ternary operator
        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println("The maximum value is: " + max);  // Outputs: The maximum value is: 20
    }
}
