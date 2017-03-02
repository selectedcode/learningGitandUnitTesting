package utility;

/**
 * Created by School of  IT on 3/2/2017.
 */
public class UtilityClass {

    public int squareCalculator(int number) {
        return (number * number);
    }

    public int cubeCalculator(int number) {
        return (squareCalculator(number) * number);
    }
}
