package bathroom;

public class Bathroom {

    public static void main(String[] args) {
        int squareMeters = 20;
        double pricePerSquareMeter = 1.5;
        String okay = "it is okay";
        System.out.println("If I need a big bathroom, I want this one because it is " + squareMeters + " m2.");
        System.out.println("If I have to buy tiles, that is what it costs:" + (squareMeters * pricePerSquareMeter));
        int height = 2;
        int perimeter = 25;
        System.out.println("If I have to buy wall paint, I need this so much: " + (4 * (height * perimeter)) + " m2");

    }
}
