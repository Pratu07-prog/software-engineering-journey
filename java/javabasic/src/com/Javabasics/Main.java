package java.javabasic.src.com.Javabasics;

import java.awt.*;
import java.sql.SQLOutput;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        int age = 30;
//        int temp = 20; //initializing a variable
//        age = 35;
//        System.out.println(age);
//        System.out.println("Hello World"); //textual data is always surrounded with double queotes
//
////        Types in Java
////        Primitive Types: byte, short, int, long, flaot, doubt, char, boolean
////        byte age = 30;
//        int weight = 123_456_78;
//        long viewsCount = 3_123_456_789L;
//        float price = 10.99F;
//        double prices = 10.99;
//        char letter = 'A'; //single char with single quotes
//        boolean isEligible = false;
//
//        Date now = new Date(); //obj is instance of class
//        System.out.println(now);

//        byte x = 1;
//        byte y = x;
//        x = 2;
//        System.out.println(y);
//
//        Point point1 = new Point( 1, 2);
//        Point point2 = point1;
//        point1.x = 10;
//        System.out.println(point2);

//        STRINGS IN JAVA
//        String message =  new String("Hello World");
//        String message1 = "Hello WOrld  " + "123  ";
//        System.out.println(message);
//        System.out.println(message1);
//        System.out.println(message.endsWith("d"));
//        System.out.println(message1.length());
//        System.out.println(message.indexOf("o"));
//        System.out.println(message.repeat(2));
//        System.out.println(message1.replace("123", "pratu"));
//        System.out.println(message1);
//        System.out.println(message.toLowerCase());
//        System.out.println(message1.trim());
//        System.out.println(message1);

//        ESCAPE SEQUENCE
//
////        double quotes
//        String s1 = "c:\"Hello\"";
//        System.out.println(s1);
////        Backslash
//        String s2 = "c:\\WIndows\\\\...";
//        System.out.println(s2);
////        endl
//        String s3 = "c:\nWindows";
//        System.out.println(s3);
////        tab
//        String s4 = "c:\tWindows";
//        System.out.println(s4);


// ARRAYS
//
//        int[] numbers = new int[10];
//        numbers[0] = 1;
//        numbers[1] = 50;
//        System.out.println(numbers);
//        System.out.println(Arrays.toString(numbers));
//
//        int[] arr = {2, 3, 4, 5, 10};
//        System.out.println(arr.length);
//        System.out.println(Arrays.toString(arr));

//        MULTIDIMENSIONAL ARRAYS

//        int [][] numbers = new int[2][3];
//        numbers[1][2] = 34;
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(Arrays.deepToString(numbers));
//
//        int [][][] threedArray = new int [2][2][2];
//        threedArray[0][0][0] = 28;
//        System.out.println(Arrays.deepToString(threedArray));
//
//        int[][] arr2 = {{1,2, 3}, {4, 5, 6, 7}};
//        System.out.println(Arrays.deepToString(arr2));


//        CONSTANTS
//        final float PI = 3.14F;
//        System.out.println(PI);

//        ARITHMETIC EXPRESSIONS

//        int x = 2;
//        int y = x++;
//        int y1 = ++x;
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(y1);
//
//        double res = (double) 10/ (double) 8;
//        System.out.println(res);
//
//        int x = 3;
//        System.out.println(x);
//        x+=1;
//        System.out.println(x);
//        x*=10;
//        System.out.println(x);
//        x/=4;
//        System.out.println(x);
//        x%=3;
//        System.out.println(x);


//        ORDER OF OPERATIONS  ()  */  +-
//        int x = 10+3*2;
//        System.out.println(x);
//        int x1 = (10+3)*2;
//        System.out.println(x1);


//        CASING AND TYPE CONVERSION

//        Implicit casing
//        byte > short > int > long > float > double
//        short x = 2;
//        int y = x + 4;
//        System.out.println(y);
//        double x1 = 2.45;
//        int y1 = (int)x1 + 1;
//        System.out.println(y1);
//        String x2 = "1.2";
//        double y2 = Double.parseDouble(x2) + 1;
//        System.out.println(y2);


//        THE MATH CLASS
//        int res = Math.round(1.345F);
//        System.out.println(res);
//
//        int result = (int)Math.ceil(1.76F);
//        System.out.println(result);
//
//        int maxi = Math.max(12, 67);
//        System.out.println(maxi);
//
//        double randomNo = Math.random();
//        System.out.println(randomNo);



//        FORMATTING NUMBERS

//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String res = currency.format(1234567.891);
//        System.out.println(res);
//
//        NumberFormat percentage = NumberFormat.getPercentInstance();
//        String percent = percentage.format(0.09);
//        System.out.println(percent);

//        READING INPUT

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Name: ");
//        String name = scanner.nextLine().trim();
//        System.out.print("Age: ");
//        byte age = scanner.nextByte();
//        System.out.println("Hello "+ name);
//        System.out.println("Your age is "+ age);


//        MORTGAGE CALCULATOR

//        Principal:
//        Annual Interest Rates:
//        Period(Years):
//        Mortgage: = P r(1+r)^n / (1+r)^n - 1
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Principal: ");
//        int principal = sc.nextInt();
//        System.out.print("Annual Interest Rate: ");
//        float rate = sc.nextFloat();
//        System.out.print("Period(Years): ");
//        int tenure = sc.nextInt();
//        rate = rate/100/12;
//        tenure = tenure*12;
//        double mortgage = principal*rate*(Math.pow(rate+1, tenure))/(Math.pow(1+rate, tenure) - 1);
//        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
//        System.out.print("Mortgage: "+ mortgageFormatted);











        















    }
}

