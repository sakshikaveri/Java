import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputFromUser {
    public static void main(String[] args) throws NumberFormatException, IOException {

        System.out.print("Enter a number: ");

        // old method of reading a user input number

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int num = Integer.parseInt(br.readLine());
        System.out.println(num);

        br.close();
    }
}
