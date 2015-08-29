/**
 * Created by sean on 8/29/15.
 */
public class Pyramid {

    private int height = 0;

    public Pyramid(int height) throws Exception {
        if (height > 0 && height < 24) {
            this.height = height;
        } else {
            throw new Exception("The pyramid height must be a non negative number and no greater then 23.");
        }
    }

    //This java class already had a toString method that was automatically created.
    //Since we do not want to use that method we tell our method to override the old method.
    @Override
    public String toString() {
        return "";
    }


}
