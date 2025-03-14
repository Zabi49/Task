package MAR13th;

public class increment_decrement {
    public static void main(String[] args) {
        int a = 10, b = 10;

        System.out.println("Prefix Increment: " + (++a)); // 11
        System.out.println("Postfix Increment: " + (b++)); // 10
        System.out.println("After Postfix Increment, b: " + b); // 11

        int c = 10, d = 10;

        System.out.println("Prefix Decrement: " + (--c)); // 9
        System.out.println("Postfix Decrement: " + (d--)); // 10
        System.out.println("After Postfix Decrement, d: " + d); // 9
    }
}
