import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        String myCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        System.out.print("Enter 1 for encrypting and 2 for decrypting: ");
        String inputString = input.readLine();
        int inp1 = Integer.parseInt(inputString);
        if(inp1 == 1){
            System.out.println("You choose encrypt");
            System.out.print("Choose a numeric key for your cipher: ");
            String inputString2 = input.readLine();
            int key = Integer.parseInt(inputString2);

        }
        if(inp1 == 2){
            System.out.println("You choose decrypt");
            System.out.print("Please enter the numeric key for your cipher: ");
            String inputString3 = input.readLine();
            int key = Integer.parseInt(inputString3);

        }
    }
}
