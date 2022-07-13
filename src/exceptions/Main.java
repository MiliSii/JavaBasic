package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.channels.ScatteringByteChannel;
import java.util.*;

import static java.lang.Class.forName;
import static java.lang.reflect.Array.newInstance;

public class Main {





    public static void m(){
        int number=0;
        try {
            Scanner s=new Scanner(System.in);
            System.out.println("input a number: ");
            number=s.nextInt();
            System.out.println(number);

            // metoda koja vrsi citanje unosa i/o
           // unos();
        } catch (Exception e1){
            // obraditi izuzetak
            System.out.println("Input is not a number");
        } catch (Throwable e){
            System.out.println(e.getMessage());

        }finally {
            System.out.println("entered number is "+number);
        }

    }

    // funkcija koja proverava unos i baca izuzetak -



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



    public static void l(){
        try
        {
            FileReader file = new FileReader("src/exceptions/test.txt");

            file.read();

        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException("Incorrect path to the file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    //UNCHECKED EXCEPTIONS


    public static void multiple(){
        try {
            String s = null;
            System.out.println(s.length());
        } catch (Exception e) {
            throw new NullPointerException(e.getMessage());
        }

    }
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
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }

    }

    static void j(){
        try {
            int[] myArray = {1,2,3,4,5};
            System.out.println("Elements in the array are: ");
            System.out.println(Arrays.toString(myArray));
            Scanner s = new Scanner(System.in);

            System.out.println("Enter the index of the required element: ");
            int element = s.nextInt();

            System.out.println("Element in the given index is :: "+myArray[element]);
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }

    public static void texampleIllegalStateException(){
        try {
            ArrayList<String> list = new ArrayList<String>();
            list.add("a");
            list.add("b");
            list.add("c");

            Iterator<String> it = list.iterator();
            it.remove();
        } catch (IllegalStateException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }


    public static void main(String[] args) {


        //InputNumber();
        //readFile("New Microsoft Word Document.txt");
        //multiple();
        // m();
        //x();
        //l();
        //j();
        //texampleIllegalStateException();


    }


}
