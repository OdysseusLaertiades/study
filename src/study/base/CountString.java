package FirstSteps;
import java.io.*;
import java.util.*;

public class CountString {
    static PrintWriter pw = new PrintWriter(System.out,true);
    static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {

       pw.println("Введите число: ");
       String str = sc.next();
       int sum = 0;

       for(int i = 0; i<str.length(); i++){
          sum += Integer.parseInt(String.valueOf(str.charAt(i)));
       }

       pw.println(sum);
    }
}