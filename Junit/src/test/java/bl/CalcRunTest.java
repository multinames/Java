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

//    @Test
//    void sub() throws Exception {
//        fail("Not implemented");
//    }
//
//    @Test
//    void mul() throws  Exception {
//        fail("Not implemented");
//    }
//
//    @Test
//    void div() throws Exception {
//        fail("Not implemented");
//    }
}