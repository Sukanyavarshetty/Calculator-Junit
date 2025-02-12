import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class CalculatorParameterTest {

    private static Calculator calculator;

    @BeforeAll
    public static void setup() {
        calculator = new Calculator();
        System.out.println("Calculator instance created.");
    }

    @AfterAll
    public static void teardown() {
        System.out.println("All tests executed.");
    }

    @BeforeEach
    public void beforeTest() {
        System.out.println("Starting test...");
    }

    @AfterEach
    public void afterTest() {
        System.out.println("Test completed.");
    }


    @ParameterizedTest
    @CsvSource({
            "2, 3, 6",
            "4, 5, 20",
            "6, 7, 42"
    })
    public void testMultiply(long a, long b, long expectedResult) {
        assertEquals(expectedResult, calculator.mult(a, b));
    }






}
