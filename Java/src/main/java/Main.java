import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sean on 8/29/15.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //This prompts the user for the height of the half pyramid
        System.out.print("Height:");
        int height = 0;
        //This loop will continue asking for a height input until there is a valid answer.
        while (height == 0) {
            try {
                //This parses the input in to an int
                height = Integer.parseInt(br.readLine());
                //This creates a new Pyramid and gets the corresponding string for that pyramid.
                System.out.print(new Pyramid(height).toString());
            } catch (Exception e) {
                //This prints out the exception message that was thrown
                System.out.println(e.getMessage());
                //This reprompts the user to input a height.
                System.out.print("Retry:");
                //This will reset the height number so the user can input a number again.
                height = 0;
            }
        }

    }
}
