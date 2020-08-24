import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {

    @Test
    public void TestCalc() throws Exception {
        Calculator calculator = new Calculator();
        int add = calculator.add(3,4);
        Assert.assertEquals(4,add);


    }
}
