package typeConversion;

public class IfElse {

    public static void main(String[] args) {
        boolean isSenior = true;
        boolean isDog = true;
        boolean isStudent = true;
        if (isSenior) {
            System.out.println("Discount!");
        } else if (isDog) {
            System.out.println("Discount!");
        } else if (isStudent) {
            System.out.println("Discount!");
        } else {
            System.out.println("no discount!");
        }

        String person1 = "student";
        String person2 = "senior";
        String person3 = "dog";
        String result = person1;

        if (result == person1) {
            System.out.println("You have to buy a " + person1 + " ticket.");
        } else if (result == person2) {
            System.out.println("You have to buy a " + person2 + " ticket.");
        } else if (result == person3) {
            System.out.println("You have to buy a " + person3 + " ticket.");
        } else {
            System.out.println("You have to buy a normal ticket.");
        }


        int nonF = 3;
        int fic = 1;
        if (nonF > 2 && fic > 0) {

            System.out.println("Discount!");

        } else {
            System.out.println("not discount!");
        }
    }

}
