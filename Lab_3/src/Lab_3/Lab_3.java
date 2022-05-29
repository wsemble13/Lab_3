package Lab_3;

import java.text.NumberFormat;
import java.util.Scanner;

public class Lab_3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please Enter first value...");
        double firstValue = Double.parseDouble(keyboard.nextLine());
        double smallestValue = firstValue;
        double largestValue = firstValue;

        System.out.println("Please Enter second value...");
        double secondValue = Double.parseDouble(keyboard.nextLine());

        if (smallestValue > secondValue) {
            smallestValue = secondValue;
        } else if (largestValue < secondValue){
            largestValue = secondValue;
        }

        System.out.println("Please Enter third value...");
        double thirdValue = Double.parseDouble(keyboard.nextLine());

        if (smallestValue > thirdValue) {
            smallestValue = thirdValue;
        } else if (largestValue < thirdValue){
            largestValue = thirdValue;
        }

        System.out.println("Please Enter fourth value...");
        double fourthValue = Double.parseDouble(keyboard.nextLine());

        if (smallestValue > fourthValue) {
            smallestValue = fourthValue;
        } else if (largestValue < fourthValue){
            largestValue = fourthValue;
        }

        System.out.println("Please Enter fifth value...");
        double fifthValue = Double.parseDouble(keyboard.nextLine());

        if (smallestValue > fifthValue) {
            smallestValue = fifthValue;
        } else if (largestValue < fifthValue){
            largestValue = fifthValue;
        }

        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMaximumFractionDigits(3);


        System.out.println("The Largest Number is " + numberFormat.format(largestValue) + "\nThe Smallest Number is " + numberFormat.format(smallestValue));

        double average = (double)(firstValue + secondValue + thirdValue + fourthValue + fifthValue) / 5;
        System.out.println("The average of the numbers is " + numberFormat.format(average));
        double standardDeviation = Math.sqrt(((Math.pow(firstValue - average, 2)) + (Math.pow(secondValue - average, 2)) + (Math.pow(thirdValue - average, 2))
                + (Math.pow(fourthValue - average, 2)) + (Math.pow(fifthValue - average, 2))) / 5);
        System.out.println("The standard deviation is " + numberFormat.format(standardDeviation));
    }
}
