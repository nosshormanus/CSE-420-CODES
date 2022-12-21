import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class Lab01 {
    static String [] others = {",", ";", "(", ")", "{", "}", "[", "]"};
    static ArrayList<String> Others = new ArrayList<String>() ;
    
    static String [] mathOperators = {"+", "-", "*", "/", "=", "++", "--", "%", "+=", "-="};
    static ArrayList<String> MathOperators = new ArrayList<String>() ;
    
    static String [] logicalOperators = {">", ">=", "=<", "==", "||", "&&", "!", "!="};
    static ArrayList<String> LogicalOperators = new ArrayList<String>() ;
    
    static String[] keywords = {"abstract", "continue", "for", "new", "switch", "assert", "default", "goto", "package", "synchronized", "boolean", "do", "if", "private", "this", "break", "double", "implements", "protected", "throw", "byte", "else", "import", "public", "throws", "case", "enum", "instanceof", "return", "transient", "catch", "extends", "int", "short", "try", "char", "final", "interface", "static", "void", "class", "finally", "long", "strictfp", "volatile", "const", "float", "native", "super", "while"};
    static ArrayList<String> Keywords = new ArrayList<String>() ;

    static String[] identifiers = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    static ArrayList<String> Identifiers = new ArrayList<String>() ;

    static ArrayList<String> Numericals = new ArrayList<String>() ;
    
    public static void main(String [] args){
        File input = new File("C:\\Users\\User\\Desktop\\420LAB\\Lab 1\\inputLab1.txt");
        try {
            Scanner sc = new Scanner(input);  
            while (sc.hasNext()) {
                String s=sc.next();
                checkOthers(s);
                checkMathOperators(s);
                checkLogicalOperators(s);
                checkKeywords(s);
                
                checkIdentifiers(s);
                checkNumericals(s);
            }
            System.out.print("Keywords: ");
            print(Keywords);
            
            System.out.print("Identifiers: ");
            print(Identifiers);

            System.out.print("Math Operators: ");
            print(MathOperators);

            System.out.print("Logical Operators: ");
            print(LogicalOperators);

            System.out.print("Numerical Values: ");
            print(Numericals);

            System.out.print("Others: ");
            print2(Others);            

        }
        
        catch(Exception e) {
            System.out.println("input file not found \n ****Specify the correct file directory for the input file**** \n ****source code and input file ar in the same directory****");
        }

    }

    public static void checkOthers(String s){
        
        for (int i=0; i<others.length; i++) {
           
            if (s.contains(others[i]) && !Others.contains(others[i])) {                
                Others.add(others[i]);
            }

        }

    }

    public static void checkMathOperators(String s) {
        
        for (int i=0; i<mathOperators.length; i++) {
            
            if (s.contains(mathOperators[i]) && !MathOperators.contains(mathOperators[i])) {                
                MathOperators.add(mathOperators[i]);
            }

        }

    }

    public static void checkLogicalOperators(String s) {
       
        for (int i=0; i<logicalOperators.length; i++) {
            
            if (s.contains(logicalOperators[i]) && !LogicalOperators.contains(logicalOperators[i])) {                
                LogicalOperators.add(logicalOperators[i]);
            }

        }

    }

    public static void checkKeywords(String s) {  
        for (int i=0; i<keywords.length; i++) {
            if (s.contains(keywords[i]) && !Keywords.contains(keywords[i])) {                
                Keywords.add(keywords[i]);
            }
        }
    }
    
    public static void checkIdentifiers(String s) {
             for (int i=0; i<identifiers.length; i++) {
            if (s.contains(identifiers[i]) && !Identifiers.contains(identifiers[i]) && !Keywords.contains(s)) {                
                Identifiers.add(identifiers[i]);
            }
        }

        

    }

    public static void checkNumericals(String s) {
                  
            if (!LogicalOperators.contains(s) && !MathOperators.contains(s) && !Keywords.contains(s) && !Others.contains(s) && !Identifiers.contains(s)) {                
                Numericals.add(s);
            }
        

    }

    public static void print(ArrayList<String> array) {

        for (int i = 0; i < array.size(); i++) {

            if (i == 0) {
                System.out.print(array.get(i));
            } else {
                System.out.print(", " + array.get(i));
            }           

        }
        
        System.out.println("");

    }
    public static void print2(ArrayList<String> array) {

        for (int i = 0; i < array.size(); i++) {
                System.out.print(array.get(i));
        }
        
        System.out.println("");

    }

}