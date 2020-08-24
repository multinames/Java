public class RunTests {
    public static void main(String[] args) {
        try {
            TestCalculator testCalculator = new TestCalculator();
            testCalculator.TestCalc();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
