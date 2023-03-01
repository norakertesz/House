package typeConversion;

import java.util.Scanner;

public class StringConversion {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        String input = scanner.nextLine();
 int input2=Integer.parseInt(input);
        System.out.println(input2);

        //convert to double
        double input3=Double.parseDouble(input);
        System.out.println(input3);
    }
}
