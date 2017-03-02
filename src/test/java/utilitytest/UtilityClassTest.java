package utilitytest;

import org.junit.*;

import static org.junit.Assert.*;

import utility.UtilityClass;

/**
 * Created by School of  IT on 3/2/2017.
 */
public class UtilityClassTest {

    UtilityClass uClass;
    UtilityClass uClass1;

    @BeforeClass
    public static void initClassParameter() {
        System.out.println("Class Parameter initialized");
        System.out.println("Class Parameter initialized");
    }


    @AfterClass
    public static void closeClassParameter() {
        System.out.println("Class Parameter Closed");
    }

    @Before
    public void initTestCase() {
        uClass = new UtilityClass();
        uClass1 = new UtilityClass();
        System.out.println("Before");
    }

    @Test
    public void calculateSquare() {
        int output = uClass.squareCalculator(5);
        System.out.println("TestSquare");
        assertEquals(output, 25);
    }

    @After
    public void closeResource() {
        System.out.println("ClosingResource");
    }

    @Test
    public void calculateCube() {
        int output = uClass.cubeCalculator(5);
        System.out.println("TestCube");

        assertEquals(output, 125);
    }
}
