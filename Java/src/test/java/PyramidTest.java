import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void pyramidToStringHeightOfOne() throws Exception {
        Pyramid pyramid = new Pyramid(1);

        //This says that pyramid toString should return ##
        // if it does then this test passes.
        assertEquals("##\n", pyramid.toString());
    }

    @Test
    public void pyramidToStringHeightOfTwo() throws Exception {
        Pyramid pyramid = new Pyramid(2);

        //This says that pyramid toString should return ##
        // if it does then this test passes.
        assertEquals(" ##\n###\n", pyramid.toString());
    }

}