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
        String halfPyramidToPrint = "";

        for (int layerIndex = 0; layerIndex < height; layerIndex++) {
            //This calculates the amount of hashes to have in the current printing layer.
            //Since the initial layer will have 2 hashes we take the layer index and add two to it.
            int hashCount = layerIndex + 2;
            //To create the half pyramid form we need to have the correct number of spaces to justify the hashes correctly
            //This is the height and you subtract the hash count minus 1
            int spaceCount = height - (hashCount - 1);

            //for loops do not need curly braces if it only needs a single line inside the loop
            //An example of this are the next two for loops.  This only allows for cleaner code.
            for (int spaceIndex = 0; spaceIndex < spaceCount; spaceIndex++)
                halfPyramidToPrint += " ";

            for (int hashIndex = 0; hashIndex < hashCount; hashIndex++)
                halfPyramidToPrint += "#";

            //This is to go to the next line of the layer.
            halfPyramidToPrint += "\n";
        }

        return halfPyramidToPrint;
    }


}
