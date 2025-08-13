import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tryWithResources {
    public static void main(String[] args) throws IOException {
        int num = 0;
        BufferedReader br = null;
        try {

            InputStreamReader isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);
            num = Integer.parseInt(br.readLine());
        }
        /*
         * It always runs after the try (and any catch), no matter what happens — even
         * if an exception is thrown, even if you return from the method.
         * 
         * Finally block is used for closing connections or here the bufferedreader
         * types
         */
        finally {
            System.out.println("In finally block!");
            br.close();
        }
    }
}
