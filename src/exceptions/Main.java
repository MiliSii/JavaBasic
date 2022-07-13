package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.logging.Logger;

import static java.lang.Class.forName;

public class Main {
    public static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    //CHECKED EXCEPTIONS
    //Java verifies checked exceptions at compile-time.
    //a method must handle in its body or throw to the caller method so the caller method can handle it.
    //Checked exceptions are checked by the Java compiler so they are called compile time exceptions.

    public static void exampleCh() throws ClassNotFoundException {
        try {
            forName("src/exceptions/test.java");
        } catch (ClassNotFoundException e) {
            System.out.println("Class cannot be find");
            throw new ClassNotFoundException(e.getMessage());

        }
    }

    public static void exampleCh1() {

        try {
            forName("src/exceptions/test.java");
        } catch (Exception e) {
            LOGGER.getLogger("Exception :: " , e.getMessage());

        }
    }



    public static void readFile(String fileName){
        try {
            FileReader reader=new FileReader(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e); //throw-It is mainly used to throw a custom exception.

        }

    }

    public static void readFile1(){
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
// If a program throws an unchecked exception, it reflects some error inside the program logic.

    public static void LengthOfString(){
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
    static void checkNumberOfPropleInTheRoom(int peopleNumber) {
        if (peopleNumber > 30) {
            throw new ArithmeticException("Access denied - there is no free seat in the room");
        }
        else {
            System.out.println("Access granted - there is a free seat in the room");
        }

    }

    static void ArrayIndex(){
        try {
            int[] myArray = {1,2,3,4,5};
            //System.out.println("Elements in the array are: ");
            System.out.println(Arrays.toString(myArray));
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the index of the required element: ");
            int element = s.nextInt();

            System.out.println("Element in the given index is : "+myArray[element]);
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }

    public static  void ListOfNumbers(){

        try {
            Integer[] n ={1,2};
            System.out.println(n[8]);
        } catch (Exception e) {
            throw new ArrayIndexOutOfBoundsException(e.getMessage());
        }


    }

    public static void exampleIllegalStateException(){
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

//TRY-Catch(multiple)

    public static void ArrayZero(){
        try {
            int array[] = new int[10];
            array[10] = 30 / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void number(){
        int number=0;
        try {
            Scanner s=new Scanner(System.in);
            System.out.println("input a number: ");
            number=s.nextInt();
            System.out.println(number);


        } catch (Exception e1){

            System.out.println("Input is not a number");
        } catch (Throwable e){
            System.out.println(e.getMessage());

        }finally {
            System.out.println("entered number is "+number);
        }

    }


    public static void main(String[] args) throws ClassNotFoundException {

        //exampleCh();
        //readFile("testing.txt");
        //readFile1();
        //LengthOfString();
        //InputNumber();
        //checkNumberOfPropleInTheRoom(20);
        ArrayIndex();
        //ListOfNumbers();
        //exampleIllegalStateException();
        //ArrayZero();
        //number();

    }


}
