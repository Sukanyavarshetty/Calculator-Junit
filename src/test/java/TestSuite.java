
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Categories.IncludeCategory(ArithmeticTests.class)
@Suite.SuiteClasses({
        CalculatorTest.class,

})
public class TestSuite {

}

