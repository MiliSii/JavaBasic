package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.channels.ScatteringByteChannel;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Class.forName;
import static java.lang.reflect.Array.newInstance;

public class Main {



    public static void InputNumber(){
        int number=0;
        int number1=0;
        try {
            Scanner s=new Scanner(System.in);
            System.out.println("input a number: ");
            number=s.nextInt();

            Scanner s1=new Scanner(System.in);
            number1=s1.nextInt();
            System.out.println(number/number1);

        } catch (InputMismatchException e1){
            System.out.println("invalid integer");
            //System.out.println(e1.getMessage());
        } catch (ArithmeticException e2){
            System.out.println("cannot divade by 0");
        } catch (Exception e3){

            System.out.println("input must be number");

        }

    }

    public static void m(){
        int number=0;
        try {
            Scanner s=new Scanner(System.in);
            System.out.println("input a number: ");
            number=s.nextInt();
            System.out.println(number);
        } catch (Exception e1){
            System.out.println("input must be number");
            Scanner s=new Scanner(System.in);
            System.out.println("input a number: ");
            number=s.nextInt();
            System.out.println(number);
        } catch (Throwable e){
            System.out.println(e.getMessage());

        }finally {
            System.out.println("entered number is "+number);
        }

    }


    public static void t(){
        try {
            int array[] = new int[10];
            array[10] = 30 / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static  void ListOfNumbers(){
        try {
            Integer[] n ={1,2};
            System.out.println(n[8]);
        }catch (Exception e){
            System.out.println("an exception happend!");
        }

    }

    public static void multiple(){
        try {
            String s = null;
            System.out.println(s.length());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }



    //CHECKED EXCEPTIONS
    //Java verifies checked exceptions at compile-time.
    //a method must handle in its body or throw to the caller method so the caller method can handle it.
    //Checked exceptions are checked by the Java compiler so they are called compile time exceptions.

    public static void exampleCh() throws ClassNotFoundException {
        forName("exceptions-mili");
    }

    public static void readFile(String fileName){
        try {
            FileReader reader=new FileReader(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

            ////Alternate logic
            //		e.printStackTrace();
        }

    }
    public static void x(){

    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }

    }

   /* public static void Object newInstance(){

    }*/

    //UNCHECKED EXCEPTIONS
public static void l(){
    try
    {
        //FileReader file = new FileReader("test.txt");

        //file = null;

       // file.read();
        Scanner input = new Scanner(new File("word.txt"));
        String in = "";
        in = input.nextLine();
    }
    catch (IOException e)
    {
        //Alternate logic
        e.printStackTrace();
    }
}


    public static void main(String[] args) {


        //InputNumber();
        //readFile("New Microsoft Word Document.txt");
        //multiple();
         // m();
        //x();
        l();


















      /*  try {
            int[] i={8,8,8};
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }*/


         /*  int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[10]); // error!


        try {
            int[] myNumbers1 = {1, 2, 3};
            System.out.println(myNumbers1[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }


       try {
            int[] myNumbers3 = {1, 2, 3};
            System.out.println(myNumbers3[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }


          checkAge(15); // Set age to 15 (which is below 18...)
          checkAge(20);//working
*/
//program to print the exception information using printStackTrace() method
      /*  int a=5;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }

//program to print the exception information using toString() method
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e.toString());
        }

        //program to print the exception information using getMessage() method
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }*/

    }


}
