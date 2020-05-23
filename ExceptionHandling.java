import java.io.*;
import java.util.*;
import java.math.*;
import java.text.*;
import java.util.regex.*;

public class ExceptionHandling{

public static void main(String[] args){

    Scanner scanner = new Scanner(System.in); 
    try{
        String S = scanner.next();
        System.out.println(""+Integer.parseInt(S));
    }catch(Exception e){
        System.out.println("Bad String");
    }

}
}

