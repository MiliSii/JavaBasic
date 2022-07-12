package exceptions;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Main {
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