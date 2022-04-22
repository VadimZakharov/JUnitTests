import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Vector2dTest {

    private final double EPS = 1e-9;
    private static Vector2d v1;

    @BeforeClass
    public static void CreateVector2d(){
        v1 = new Vector2d();
    }

    @Test
    public void newVectorShouldHaveZeroLength(){
        Assert.assertEquals(0,v1.length(), EPS);
    }
    @Test
    public void newVectorShouldHaveZeroX(){
        Assert.assertEquals(0,v1.getX(), EPS);
    }
    @Test
    public void newVectorShouldHaveZeroY(){
        Assert.assertEquals(0,v1.getY(), EPS);
    }

}
