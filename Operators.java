import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Operators {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        //print total meal cost where totalcost is rounded integer
        int total = (int)Math.round(meal_cost+(meal_cost * tip_percent *0.01)+meal_cost*tax_percent *0.01));

        System.out.print(total);

       
    }
}
