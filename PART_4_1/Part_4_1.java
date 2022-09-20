package PART_4_1;
import java.util.*;
import java.io.*;
public class Part_4_1 {
    public static void main(String[] args) {
        // ArithmeticException
        try {
            int a = 138, b = 0;
            int c = a/b;  // cannot divide by zero
        }
        catch(ArithmeticException e) {
            System.out.println (e);
        }
        // StringIndexOutOfBoundsException
        try {
            String a = "My name is Yuvrajsinh Solanki "; // length is 30
            char c = a.charAt(40); // accessing 41 element
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        // FileNotFoundException
        try {
            // Following file does not exist
            File file = new File("E://yuvraj.txt");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        // ArrayIndexOutOfBoundsException
        try{
            int a[] = new int[10];
            a[15] = 9; // accessing 16th element in an array of
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println (e);
        }
        System.out.println("This program is created by 21CE138 Yuvrajsinh Solanki");
    }
}
