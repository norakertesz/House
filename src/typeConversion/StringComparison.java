package typeConversion;

import java.util.Scanner;

public class StringComparison {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter a string:");
        String name = scanner.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter another String: ");
        String name2 = scanner2.nextLine();

        System.out.println("Both entries are the same: "+ name.equals(name2));

        System.out.println('j');
    }
}
