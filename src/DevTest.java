import java.util.Scanner;
import java.util.Random;

public class DevTest {

    public static void main(String[] args) {

        Random rnd = new Random();
        int sum = 0;
        int average = 0;
        int number1 = 0;
        int number2 = 0;
        int count = 0;
        int position = -1;
        int minimum = 100;
        int maximum = 0;

        Scanner in = new Scanner(System.in);

        //task1
        int[] dataPoints = new int[100];

        //task2
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        System.out.print("Datapoints: ");

        //task3
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i] + " | ");
        }

        //task4
        for (int i = 0; i < dataPoints.length; i++) {
            sum = sum + dataPoints[i];
        }

        average = sum / 100;

        System.out.print("\n\nThe average of the random array dataPoints is: " + average);
        System.out.print("\n\nThe sum of the random array dataPoints is: " + sum);

        //task5
        number1 = SafeInput.getRangedInt(in, "\n\nEnter a number between 1 to 100: ", 1, 100);

        //task6
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == number1) {
                count = count + 1;
            }
        }

        System.out.print("\nThe number of times the value entered is found within the array is: " + count);

        //task7
        number2 = SafeInput.getRangedInt(in, "\n\nEnter a number between 1 to 100: ", 1, 100);

        for (int i = 0; i < dataPoints.length; i++) {

            if (number2 == dataPoints[i]) {
                position = i;
                break;
            }
        }

        if (position == -1) { //if index is 100 which it cant be
            System.out.print("\n\nThe value you entered was not found in the array");

        } else { //if index is between 0 - 99
            System.out.print("\n\nThe value you entered was found at array index POSITION: " + position);
        }

        //task8
        for (int i = 0; i < dataPoints.length; i++) {

            if (minimum > dataPoints[i]) {
                minimum = dataPoints[i];
            }

            if (maximum < dataPoints[i]) {
                maximum = dataPoints[i];
            }
        }

        System.out.print("\n\nThe maximum value within the datapoints array is: " + maximum);
        System.out.print("\n\nThe minimum value within the datapoints array is: " + minimum);

        //task9
        System.out.println("\n\nAverage of dataPoints is: " + SafeInput.getAverage(dataPoints));

    }
}
