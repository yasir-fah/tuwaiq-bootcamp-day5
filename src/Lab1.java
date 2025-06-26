import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);




        /*1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
            two numbers , takes two numbers as input
         */
        System.out.println("------------ exercise number 1 ------------");
        System.out.println("please entr your first number");
        int firstNumber = input.nextInt();

        System.out.println("please enter second number");
        int secondNumber = input.nextInt();

        input.nextLine();

        System.out.println("please enter 1 to start counting");
        String startPoint = input.nextLine();

        switch(startPoint){
            case "1":
            case "sum":
                System.out.println("the sum of "+firstNumber+" + "+ secondNumber+" = "+(firstNumber+secondNumber));
            case "multiply":
                System.out.println("the multiply of "+firstNumber+" * "+ secondNumber+" = "+(firstNumber*secondNumber));
            case "subtract":
                System.out.println("the subtract of "+firstNumber+" - "+secondNumber+" = "+(firstNumber-secondNumber));
            case "divide":
                System.out.println("the division of "+firstNumber+" / "+secondNumber+" = "+(firstNumber/secondNumber));
            case "remainder":
                System.out.println("the remainder of "+firstNumber+" % "+secondNumber+" = "+(firstNumber%secondNumber));
        }





        /*2. Write a Java program that takes a number as input and prints its multiplication table up to
            10.
         */
        System.out.println("------------ exercise number 2 ------------");

        System.out.println("please enter your number: ");
        int numberSchedule = input.nextInt();

        System.out.println("the multiply schedule of "+numberSchedule+" number is: ");
        for(int i = 1; i <= 10; i++) {
            System.out.println(numberSchedule+" X "+i+" = "+numberSchedule * i);
        }





        /*3. Write a Java program to print the area and perimeter of a circle.
         */
        System.out.println("------------ exercise number 3 ------------");

        System.out.println("Enter the Radius of the Circle");
        double radius = input.nextDouble();

        System.out.println("Perimeter is: "+(2 *radius)*(Math.PI));
        System.out.println("Area is: "+ (Math.PI* Math.pow(radius, 2)));





        /*4. Java program to find out the average of a set of integers */

        System.out.println("------------ exercise number 4 ------------");

        System.out.println("Enter the count of integer: ");
        double countOfInteger = input.nextDouble();

        double container = 0;
        for(int i = 1; i <= countOfInteger; i++) {
            System.out.println("Enter integer: "+i);
            int number = input.nextInt();
            container = container + number;
    }
        System.out.println("the average is: "+container/countOfInteger);





        /*5. Write a Java program that accepts three integers as input, adds the first two integers
            together, and then determines whether the sum is equal to the third integer.
         */
        System.out.println("------------ exercise number 5 ------------");

        System.out.println("please enter first number");
        int number1 = input.nextInt();

        System.out.println("please enter second number");
        int number2 = input.nextInt();

        System.out.println("please enter third number");
        int number3 = input.nextInt();


        boolean isResult = true;
        if(number1+number2 == number3 ){
            System.out.println("Input the first number: "+ number1);
            System.out.println("Input the second number: "+ number2);
            System.out.println("Input the third number: "+ number3);
            System.out.println("the result is: "+ (isResult));
        }else{
            System.out.println("Input the first number: "+ number1);
            System.out.println("Input the second number: "+ number2);
            System.out.println("Input the third number: "+ number3);
            System.out.println("the result is: "+ (!isResult));
        }





        /*6. Write a Java program to reverse a word.*/
        System.out.println("------------ exercise number 6 ------------");
        input.nextLine();
        System.out.println("Enter a word");
        String inputWord = input.nextLine();

        String reverseWord = "";

        for(int i = inputWord.length() - 1; i >= 0; i--) {
            reverseWord += inputWord.charAt(i);
        }
        System.out.println("input word is: " + inputWord);
        System.out.println("Reversed word is: " + reverseWord);





        /*7 - Java program to check whether the given number is even or odd */
        System.out.println("------------ exercise number 7 ------------");

        System.out.println("Enter your number to check whether if it even or odd: ");
        int number = input.nextInt();

        if(number % 2 == 0){
            System.out.println("The number " +number+" is even");
        }else {
            System.out.println("The number " +number+" is odd");
        }





        /*8- Java program to convert the temperature in Centigrade to Fahrenheit*/
        System.out.println("------------ exercise number 8 ------------");

        System.out.println("Enter temperature in Centigrade: ");
        double weatherDegree = input.nextDouble();

        double toFahrenheit = (weatherDegree * 1.8) + 32;
        System.out.println("Temperature in Fahrenheit is: "+toFahrenheit+" F");





        /*9.Write a Java program that takes a string and a number from the user,then prints the
            character in the given index */
        System.out.println("------------ exercise number 9 ------------");
        input.nextLine(); //for prevent the leftover

        System.out.println("Enter a String: ");
        String str = input.nextLine();

        System.out.println("chose index of the String: (hence, don't exceed "+(str.length()-1)+")");
        int choiceIndex = input.nextInt();

        System.out.println("the character of index "+choiceIndex+" is "+str.charAt(choiceIndex));





        /* 10. Write a Java program to print the area and perimeter of a rectangle */
        System.out.println("------------ exercise number 10 ------------");

        System.out.println("enter the width of the TRIANGLE");
        float triangleWidth = input.nextFloat();

        System.out.println("enter the height of the TRIANGLE");
        float triangleHeight = input.nextFloat();

        System.out.println("Area is: "+triangleWidth+"*"+triangleHeight+" = "+(triangleWidth*triangleHeight));
        System.out.println("Perimetr is: "+2+"*"+"("+triangleWidth+"+"+triangleHeight+")="+2*(triangleWidth+triangleHeight));


    /*11. Write a Java program to compare two numbers.*/
        System.out.println("------------ exercise number 11 ------------");

        System.out.println("Enter the first integer: ");
        int numberToCompare1 = input.nextInt();

        System.out.println("Enter the second integer: ");
        int numberToCompare2 = input.nextInt();

        if(numberToCompare1 != numberToCompare2){
            System.out.println(numberToCompare1+ "!=" + numberToCompare2);
            if(numberToCompare1 < numberToCompare2 ){
                System.out.println(numberToCompare1 + "<" + numberToCompare2);
                System.out.println(numberToCompare1 + "<=" + numberToCompare2);
            }
            if(numberToCompare1 > numberToCompare2){
                System.out.println(numberToCompare2 + "<" + numberToCompare1);
                System.out.println(numberToCompare2 + "<=" + numberToCompare1);
            }
        }else if(numberToCompare1 == numberToCompare2){
            System.out.println(numberToCompare1 + "==" + numberToCompare2);
        }





        /*12. Write a Java program to convert seconds to hours, minutes and seconds. */
        System.out.println("------------ exercise number 12 ------------");

        System.out.println("Enter the seconds");
        int inSeconds = input.nextInt();

        int minutes2 = inSeconds % 60;
        int hours = inSeconds /60 / 60;
         inSeconds = inSeconds % 60;

        System.out.println(hours + ":" + minutes2 + ":" + inSeconds);





        /*13. Write a Java program that accepts four integers from the user and prints equal if all
            four are equal, and not equal otherwise. */
        System.out.println("------------ exercise number 13 ------------");

        System.out.println("enter first number");
        int number1Equalizing = input.nextInt();

        System.out.println("enter second number");
        int number2Equalizing = input.nextInt();

        System.out.println("enter third number");
        int number3Equalizing = input.nextInt();

        System.out.println("enter fourth number");
        int number4Equalizing = input.nextInt();

        if(number1Equalizing == number2Equalizing && number3Equalizing == number4Equalizing){
            System.out.println("Input first number:"+ number1Equalizing);
            System.out.println("Input second number:"+ number2Equalizing);
            System.out.println("Input third number:"+ number3Equalizing);
            System.out.println("Input fourth number:"+ number4Equalizing);

            System.out.println("numbers are equal! ");
        }else {
            System.out.println("Input first number:"+ number1Equalizing);
            System.out.println("Input second number:"+ number2Equalizing);
            System.out.println("Input third number:"+ number3Equalizing);
            System.out.println("Input fourth number:"+ number4Equalizing);

            System.out.println("numbers are not equal! ");
        }





        /*14- Write a Java program that reads an integer and check whether it is negative, zero, or
            positive.
         */
        System.out.println("------------ exercise number 14 ------------");

        System.out.println("enter number: ");
        int checkInt = input.nextInt();

        if(checkInt >0){
            System.out.println("number is positive "+ checkInt);
        }else if(checkInt < 0){
            System.out.println("number is negative "+ checkInt);
        }else {
            System.out.println("number is Zero "+ checkInt);
        }





        /*15- Write a program to enter the numbers till the user wants and at the end it
        should display the count of positive, negative and zeros entered (End loop use -1 ,
        Don’t count -1) */
        System.out.println("------------ exercise number 15 ------------");

        int numbers;
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int zeroNumbers = 0;

        do {
            System.out.println("enter numbers, press -1 to show the calculations");
             numbers = input.nextInt();

             if(numbers >= 1){
                 positiveNumbers++;
             }else if(numbers < 0 && numbers != -1){
                 negativeNumbers++;
             }else if(numbers == 0){
                 zeroNumbers++;
             }

        }while (numbers != -1);

        System.out.println("The positive numbers are: " + positiveNumbers);
        System.out.println("The negative numbers are: " + negativeNumbers);
        System.out.println("The zero numbers are: " + zeroNumbers);





        /*16 - Write a program that prompts the user to input an integer and then outputs the
            number with the digits reversed.
         */
        System.out.println("------------ exercise number 16 ------------");
        System.out.println("hence, i tried to solve it with integer but the output was wrong, so i make it as a 'String'.");
        System.out.println("enter please:");
        String toReverse = input.nextLine();


        System.out.println("reversed is: ");
        for (int i = toReverse.length() -1 ; i >=0 ; i--) {
            System.out.print(toReverse.charAt(i));
        }





        /*17 - Write a program to enter the numbers till the user wants and at the end the
            program should display the largest and smallest numbers entered. */
        System.out.println("------------ exercise number 17 ------------");

        int integers;
        int largest = 0;
        int smallest = 1000000000;
        String seeCalculations;

        do {
            System.out.println("enter numbers");
             integers = input.nextInt();

            input.nextLine();
            System.out.println("write 'out' if you want to see calculations, or anything for continuo'");
            seeCalculations = input.nextLine();

             if(integers > largest){
                 largest = integers;
             }else if(integers < smallest){
                 smallest = integers;
             }
        }while (!seeCalculations.equals("out"));
            System.out.println("The largest number is " + largest);
            System.out.println("The smallest number is " + smallest);





        /*18 - Determine and print the number of times the character ‘a’ appears in the input
                entered by the user. */
        System.out.println("------------ exercise number 18 ------------");

        System.out.println("enter your sentence : ");
        String sentenceCharCounter = input.nextLine();

        int counter = 0;
        for (int i = 0; i < sentenceCharCounter.length(); i++) {
            if (sentenceCharCounter.charAt(i) == 'a') {
                counter++;
            }
        }
        System.out.println("letter a shown in this sentence "+counter+" times");

    }
}