import com.epam.tat.module4.Calculator;
import org.junit.*;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;


public class CalculatorTest {

    private static Calculator calculator;



    @BeforeClass
    public static void setup() {
        calculator = new Calculator();
        System.out.println("Calculator instance created.");
    }

    @AfterClass
    public static void teardown() {
        System.out.println("All tests executed.");
    }

    @Before
    public void beforeTest() {
        System.out.println("Starting test...");
    }

    @After
    public void afterTest() {
        System.out.println("Test completed.");
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();



    @Test
    @Category(ArithmeticTests.class)
    public void testMult() {
        Assert.assertEquals(20, calculator.mult(4, 5));
    }

    @Test
    @Category(ArithmeticTests.class)
    public void testSubPositive() {
        Assert.assertEquals(4, calculator.sub(9, 5));
    }

    @Test
    @Category(ArithmeticTests.class)
    public void testDivPositive() {
        Assert.assertEquals(3, calculator.div(9, 3));
    }

    @Test
    @Category(ArithmeticTests.class)
    public void testIsPositive() {
        Assert.assertTrue(calculator.isPositive(10));
    }


    @Test(timeout=100)
    public void testDivByZero() {
        thrown.expect(NumberFormatException.class);
        thrown.expectMessage("Attempt to divide by zero");
        calculator.div(10, 0);
    }

    @Test
    public void testSumNegative() {
        Assert.assertNotEquals(15, calculator.sum(5, 7));
    }

    @Test()
    public void testMultNegative() {
        Assert.assertNotEquals(25, calculator.mult(5, 3));
    }

    @Test
    public void testIsNegative() {
        Assert.assertTrue(calculator.isNegative(-15));
    }



    @Test
    public void testSubNegative() {
        Assert.assertNotEquals(10, calculator.sub(20, 5));
    }
}
