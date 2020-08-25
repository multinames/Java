package bl;

import org.junit.internal.runners.statements.Fail;
import  org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcRunTest {

    private  Calculator calculator;


    @BeforeEach
    void setUp() throws Exception   {
        calculator = new CalcRun() ;
    }

    @Test
    void add() throws  Exception {
        // case1
        int expectedResult1 = 10;
        int actualResult1= calculator.add(3,7);
        assertEquals(expectedResult1,actualResult1);

        // case 2
        int expectedResult2 = -4;
        int actualResult2= calculator.add(3,-7);
        assertEquals(expectedResult2,actualResult2);

        //case3
        int expectedResult3 = -10;
        int actualResult3= calculator.add(-3,-7);
        assertEquals(expectedResult3,actualResult3);
    }

    @Test
    void sub() throws Exception {
        //case 1
        int expectedResult1 = 7;
        int actualResult1= calculator.sub(10,3);
        assertEquals(expectedResult1, actualResult1);

        //case 2
        int expectedResult2 = -13;
        int actualResult2= calculator.sub(-10,3);
        assertEquals(expectedResult2, actualResult2);

    }

    @Test
    void mul() throws  Exception {
        //case 1
        int expectedResult1 = 21;
        int actualResult1= calculator.mul(7,3);
        assertEquals(expectedResult1, actualResult1);

        //case 2
        int expectedResult2 = -21;
        int actualResult2= calculator.mul(-7,3);
        assertEquals(expectedResult2, actualResult2);

        //case 3
        int expectedResult3 = 21;
        int actualResult3= calculator.mul(-7,-3);
        assertEquals(expectedResult3, actualResult3);

    }

    @Test
    void div() throws Exception {
        //case 1
        int expectedResult1 = 5;
        int actualResult1= calculator.div(10,2);
        assertEquals(expectedResult1, actualResult1);

        //case 2
        int expectedResult2 = 5;
        int actualResult2= calculator.div(10,2);
        assertEquals(expectedResult2, actualResult2);
    }
}