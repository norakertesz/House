package typeConversion;

import java.util.Scanner;

public class IntExplicit {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a number: ");
        double number = scanner.nextDouble();
        int temp = (int) number;
        System.out.println((float) number);
        System.out.println((long) number);
        System.out.println((short) number);
        String stringNumber = Double.toString(number);
        System.out.println(stringNumber);


    }
}
