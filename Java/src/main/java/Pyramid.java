/**
 * Created by sean on 8/29/15.
 */
public class Pyramid {

    private int height;

    public Pyramid(int height) throws Exception {
        if (height > 0 && height < 24) {
            this.height = height;
        } else {
            throw new Exception("The pyramid height must be a non negative number and no greater then 23.");
        }
    }


}
