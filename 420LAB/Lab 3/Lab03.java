import java.util.*;
import java.util.regex.*;
import java.io.*;

public class Lab03{
    public static void main(String[]args) throws FileNotFoundException {
        
        Scanner sc;
        String s = null;
        
        sc = new Scanner(new File("C:\\Users\\User\\Desktop\\420LAB\\Lab 3\\inputLab3.txt"));
        

        int noOfRe = Integer.parseInt(sc.nextLine());

        String [] arrayRe = new String[noOfRe];
        

        for(int i=0; i<arrayRe.length; i++){
            arrayRe[i] = sc.nextLine();
        }
        

        int noOfStr = Integer.parseInt(sc.nextLine());
        String [] arrayStr = new String[noOfStr];
        
        for(int i=0; i<arrayStr.length; i++){
            arrayStr[i] = sc.nextLine();
        }
        
        for(int i=0; i<arrayStr.length; i++){
            boolean result = false;
            int count = 0;
            for(int j=0; j<arrayRe.length; j++){
                result = Pattern.matches(arrayRe[j], arrayStr[i]);
                if(result==true){
                    System.out.println("Yes, " + (j+1));
                    count++;
                }
                result = false;
            }
            if(count==0) System.out.println("No, " + "0");
        }
    }   
}