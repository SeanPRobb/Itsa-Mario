import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sean on 8/29/15.
 */
public class PyramidTest {
    @Test(expected=Exception.class)
    public void negativeNumberFail() throws Exception{
            Pyramid pyramid= new Pyramid(-20);
    }

}