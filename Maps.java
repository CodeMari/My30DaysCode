//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;
import java.util.Scanner; 

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String,Integer> myMap = new HashMap<String,Integer>(); 
        int n = in.nextInt();
        in.nextLine();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            myMap.put(name, phone);   
            in.nextLine();
        } 
        while(in.hasNext()){
            String s = in.nextLine();
            // Write code here
             if (myMap.containsKey(s)){
                 System.out.println(s+"="+myMap.get(s));
             }else{
                 System.out.println("Not found");
             
             }
            
        } 
       in.close(); 
    }
}
