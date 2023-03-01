package house;

public class LivingRoom {
    public static void main(String[] args) {
//squareMeters, pricePerSquareMeter, Address
        int squareMeters=13;
        double PricePerSquareMeter=1.2;
        String address="Graz 8010 Koeglerweg 15.";
        System.out.println("The cost of the house:"+squareMeters*PricePerSquareMeter+" at "+(address));
    }
}
