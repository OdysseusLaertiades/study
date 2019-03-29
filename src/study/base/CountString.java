package FirstSteps;
import java.io.*;
import java.util.*;

public class CountString {

    static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out,true);
        boolean check = true;
        while(check) {
            try {
                pw.println("Enter you number, please: ");
                long number = sc.nextLong();
                pw.println("To what degree will raise you number: ");
                long degree = sc.nextLong();
                long temporary_deegre = degree; //variable for final sysout
                long result = 1;

                while (degree != 0) {
                    result *= number;
                    degree--;
                }
                pw.println(number + " в " + temporary_deegre + " степени = " + result);
                check = false;

            } catch (Exception e) {
                pw.println("Ошибка! Повторите ввод");
                sc.next();
                continue;
            }
        }
    }
}