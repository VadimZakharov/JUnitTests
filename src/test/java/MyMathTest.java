import org.junit.Test;

public class MyMathTest {
    @Test(expected = ArithmeticException.class)
    public void checkZeroDenominator(){
        MyMath.divide(1,0);
    }
}
