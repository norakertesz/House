package typeConversion;

public class Logic {

    public static void main(String[] args) {

        //The sun is shining and ti is raining.

        boolean sunShine = true;
        boolean rain = true;
        System.out.println(sunShine && rain);
        boolean confusion = false;
        boolean knowledge = true;
        System.out.println(confusion || knowledge);

//(1 > 3 && ( ! 3-1<5)) || 2*2==4
        boolean result = 1 > 3 && (!(3 - 1 < 5)) || 2 * 2 == 4;
        System.out.println(result);
        boolean result2 = 6 >= 2 * 3 || 2 - 3 < 0 && ((1 * 1 == 1) && (1 != 1 + 1));
        System.out.println(result2);




    }
}
