import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the factorial function below. I added the factorial formula which is n*factorial(n-1)
    static int factorial(int n) {
        if (n>1){
            return n * factorial(n-1);
        }
        else{
            return n;
        }
    }

    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n);
        

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        //print result
        System.out.print(result);
        bufferedWriter.close();

        scanner.close();
    }
}
public class Recursion {
    
}