package TASK;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("What is your age " + name);
        int age = scanner.nextInt();
        System.out.println("you are " + age + " years old");
    }
}
