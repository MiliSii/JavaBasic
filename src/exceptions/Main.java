package exceptions;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Main {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        //TRY-CATCH

        try {
            String[] people ={"milica","ana"};
            System.out.println(people[8]);
        }catch (Exception e){
            System.out.println("an exception happend!");
        }


        try {
            Scanner s=new Scanner(System.in);
            System.out.println("input number: ");
            int number=s.nextInt();
            System.out.println(number);

        }catch (Exception e1){

            System.out.println("input must be number");
        }


        try {
            int[] i={8,8,8};
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }

    }
}