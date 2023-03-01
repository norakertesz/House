package typeConversion;

public class Methods {


    public static void main(String[] args) {


        boolean isSenior = true;
        boolean isDog = true;
        boolean isStudent = true;

        checkIfDiscount(isSenior, isDog, isStudent);
        checkIfDiscount(true, true, true);
        checkIfDiscount(true, false, false);
        checkIfDiscount(false, true, true);
        checkIfDiscount(true, false, true);
        checkIfDiscount(false, false, true);
        checkIfDiscount(false, false, false);
        checkIfDiscount(false, true, false);
        checkIfDiscount(true, true, false);
        int nonF = 3;
        int fic = 1;
        checkDiscountBooks(nonF, fic);


    }
public static void checkIfDiscount(boolean isSenior, boolean isDog, boolean isStudent) {


    if (isSenior) {
        System.out.println("Discount!");
    } else if (isDog) {
        System.out.println("Discount!");
    } else if (isStudent) {
        System.out.println("Discount!");
    } else {
        System.out.println("no discount!");
    }

}
public static void checkDiscountBooks(int nonF, int fic){
String discount="Discount 4 Books!";
String notDiscount="not discount 4 Books!";


    if (nonF > 2 && fic > 0) {

        System.out.println(discount);

    } else {
        System.out.println(notDiscount);
    }
}
}


