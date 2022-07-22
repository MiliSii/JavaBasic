package exceptions;

import exceptions.exception.*;

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
            throw new RuntimeException("Class on path not find: " + e.getMessage());
        }
    }


    public static void readFile(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e); //throw-It is mainly used to throw a custom exception.

        }

    }

    public static void readFile1(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
        } catch (Exception e) {
            LOGGER.info("File does not exist : " + e.getMessage());

        }

    }

    public static void File() {
        try {
            FileReader file = new FileReader("src/exceptions/test.txt");

            file.read();

        } catch (FileNotFoundException e) {
            throw new RuntimeException("Incorrect path to the file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void File1() throws MyIOException {
        try {
            FileReader file = new FileReader("src/exceptions/test.txt");
            file.read();
        } catch (IOException e) {
            throw new MyIOException("Incorrect path to the file " + e.getMessage());

        }
    }


    //UNCHECKED EXCEPTIONS
// If a program throws an unchecked exception, it reflects some error inside the program logic.

    public static void LengthOfString() {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (Exception e) {
            throw new NullPointerException(e.getMessage());
        }

    }

    public static void LengthOfString1() {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (Exception e) {
            LOGGER.info("String is empty, length is zero " + e.getMessage());
        }

    }


    public static void InputNumber() {
        int number;
        int number1;
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("input a number: ");
            number = s.nextInt();

            Scanner s1 = new Scanner(System.in);
            System.out.println("input second number: ");
            number1 = s1.nextInt();
            System.out.println(number / number1);

        } catch (InputMismatchException e1) {
            System.out.println("invalid integer");
            //System.out.println(e1.getMessage());
        } catch (ArithmeticException e2) {
            System.out.println("cannot divade by 0");
        } catch (Exception e3) {

            System.out.println("input must be number");

        }

    }

    public static void InputNumber1() {
        int number;
        int number1;
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("input a number: ");
            number = s.nextInt();
            System.out.println("input second number: ");
            Scanner s1 = new Scanner(System.in);
            number1 = s1.nextInt();
            System.out.println(number / number1);

        } catch (InputMismatchException e1) {
            //System.out.println("invalid integer");
            throw new MyInputMismatchException("invalid integer" + e1.getMessage());
            //System.out.println(e1.getMessage());
        } catch (ArithmeticException e2) {
            throw new MyArithmeticException("cannot divade by 0 " + e2.getMessage());
            //System.out.println("cannot divade by 0");
        } catch (Exception e3) {

            System.out.println("input must be number");
        }
    }

    static void checkNumberOfPropleInTheRoom(int peopleNumber) {
        if (peopleNumber > 30) {
            throw new ArithmeticException("Access denied - there is no free seat in the room");
        } else {
            System.out.println("Access granted - there is a free seat in the room");
        }
    }

    static void checkNumberOfPropleInTheRoom1(int peopleNumber) throws PeopleException {
        if (peopleNumber > 30) {
            throw new PeopleException("Access denied - there is no free seat in the room");
        } else {
            System.out.println("Access granted - there is a free seat in the room");
        }
    }

    static void ArrayIndex() {
        try {
            int[] myArray = {1, 2, 3, 4, 5};
            System.out.println(Arrays.toString(myArray));
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the index of the required element: ");
            int element = s.nextInt();
            System.out.println("Element in the given index is : " + myArray[element]);
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }


    static void ArrayIndex1() throws IndexException {
        try {
            int[] myArray = {1, 2, 3, 4, 5};
            System.out.println(Arrays.toString(myArray));
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the index of the required element: ");
            int element = s.nextInt();

            System.out.println("Element in the given index is : " + myArray[element]);
        } catch (IndexOutOfBoundsException e) {
            LOGGER.info("Index can be from 0 to 4 : " + e.getMessage());
            throw new IndexException(e.getMessage());
        }
    }


    public static void ListOfNumbers() {

        try {
            Integer[] n = {1, 2};
            System.out.println(n[8]);
        } catch (Exception e) {
            throw new ArrayIndexOutOfBoundsException(e.getMessage());
        }


    }

    public static void ListOfNumbers1() throws Exception {

        try {
            Integer[] n = {1, 2};
            System.out.println(n[8]);
        } catch (Exception e) {
            LOGGER.info("Lenght can be 0 and 2 - " + e.getMessage());
        }
    }


    public static void exampleIllegalStateException() {
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

    public static void exampleIllegalStateException1() {
        try {
            ArrayList<String> list = new ArrayList<String>();
            list.add("a");
            list.add("b");
            list.add("c");

            Iterator<String> it = list.iterator();
            it.remove();
        } catch (Exception e) {
            LOGGER.info("Exeption becouse iterator can not use remuve(): " + e.getMessage());
        }
    }

//TRY-Catch(multiple)

    public static void ArrayZero() {
        try {
            int array[] = new int[10];
            array[10] = 30 / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void ArrayZero1() throws Exception {
        try {
            int array[] = new int[10];
            array[10] = 30 / 0;
        } catch (MyArithmeticException | MyArrayIndexOutOfBoundsException e) {
            throw new Exception("jhfb");
            //LOGGER.info(e.getMessage());
        }
    }

    public static void number() {
        int number = 0;
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("input a number: ");
            number = s.nextInt();
            System.out.println(number);
            LOGGER.info("number " + number);

        } catch (Exception e1) {

            LOGGER.info(e1.getMessage());
        } catch (Throwable e) {
            LOGGER.info(e.getMessage());

        } finally {
            System.out.println("entered number is " + number);
        }

    }


    public static void main(String[] args) throws Exception {

        //exampleCh();
        //exampleCh1();

        //readFile("testing.txt");
        //readFile1("testing.txt");

        //File();
        //File1();

        //LengthOfString();
        //LengthOfString1();

        //InputNumber();
        InputNumber1();

        //checkNumberOfPropleInTheRoom(60);
        //checkNumberOfPropleInTheRoom1(60);

        //ArrayIndex();
        //ArrayIndex1();

        //ListOfNumbers();
        //ListOfNumbers1();

        //exampleIllegalStateException();
        //exampleIllegalStateException1();

        //ArrayZero();
        //ArrayZero1();


        //number();


    }


}
