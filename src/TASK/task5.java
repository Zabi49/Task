package TASK;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first side: ");
        int side1 = scanner.nextInt();

        System.out.println("enter the second side: ");
        int side2 = scanner.nextInt();

        System.out.println("enter the third side");
        int side3 = scanner.nextInt();

        if ((side1 == side2 && side1 == side3) ||
                (side1 == side3 && side1 == side2) ||
                (side2 == side3 && side2 == side1)) {
            System.out.println("The Triangle is Equilateral");

        } else {
            System.out.println("The Triangle is not Equilateral");

        }


    }
}

