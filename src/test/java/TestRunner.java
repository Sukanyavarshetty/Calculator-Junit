import org.junit.runner.JUnitCore;

public class TestRunner {
    public static void main(String[] args) {
        JUnitCore junit = new JUnitCore();
        junit.addListener(new CustomTestListener());
        junit.run(CalculatorTest.class);

    }
}

