package bl;

public class CalcRun implements Calculator{


    public int add(int a, int b) {
        return a+b;
    }

    public int sub(int a, int b) {
         return a-b;
    }

    public int mul(int a, int b) {

        return a*b;
    }

    public int div(int a, int b) {
        int result = 0;
        try {
            result = a/b;
        }catch (ArithmeticException e) {
            System.out.println("Divisor by zero not possible");
        }
        return result;
    }
}
