import org.junit.Test;

/**
 * Created by sean on 8/29/15.
 */
public class PyramidTest {

    //This test annotation along with the expected inside of the parenthesis shows that this method is a test
    // and it must throw an exception to pass.
    @Test(expected = Exception.class)
    public void negativeNumberFail() throws Exception {
        Pyramid pyramid = new Pyramid(-20);
    }

    @Test(expected = Exception.class)
    public void numberLargerThanTwentyThree() throws Exception {
        Pyramid pyramid = new Pyramid(24);
    }

}