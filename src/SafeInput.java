import java.util.Scanner;

public class SafeInput {

    // PART A
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }

    // PART B
    public static int getInt(Scanner pipe, String prompt) {
        int result = 0;
        boolean valid = false;

        do {
            System.out.print(prompt + ": ");

            if (pipe.hasNextInt()) {
                result = pipe.nextInt();
                valid = true;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                pipe.next();   // discard bad input
            }

            pipe.nextLine();   // clear newline
        } while (!valid);

        return result;
    }

    // PART C
    public static double getDouble(Scanner pipe, String prompt) {
        double result = 0;
        boolean valid = false;

        do {
            System.out.print(prompt + ": ");

            if (pipe.hasNextDouble()) {
                result = pipe.nextDouble();
                valid = true;
            } else {
                System.out.println("Invalid input. Please enter a number.");
                pipe.next();
            }

            pipe.nextLine();
        } while (!valid);

        return result;
    }

    // PART D
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int result = 0;
        boolean valid = false;

        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");

            if (pipe.hasNextInt()) {
                result = pipe.nextInt();
                if (result >= low && result <= high) {
                    valid = true;
                } else {
                    System.out.println("Number out of range.");
                }
            } else {
                System.out.println("Invalid input. Enter an integer.");
                pipe.next();
            }

            pipe.nextLine();
        } while (!valid);

        return result;
    }

    // PART E
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double result = 0;
        boolean valid = false;

        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");

            if (pipe.hasNextDouble()) {
                result = pipe.nextDouble();
                if (result >= low && result <= high) {
                    valid = true;
                } else {
                    System.out.println("Number out of range.");
                }
            } else {
                System.out.println("Invalid input. Enter a number.");
                pipe.next();
            }

            pipe.nextLine();
        } while (!valid);

        return result;
    }

    // PART F
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String response = "";
        boolean valid = false;
        boolean result = false;

        do {
            System.out.print(prompt + " [Y/N]: ");
            response = pipe.nextLine().trim().toUpperCase();

            if (response.equals("Y")) {
                valid = true;
                result = true;
            } else if (response.equals("N")) {
                valid = true;
                result = false;
            } else {
                System.out.println("Please enter Y or N.");
            }
        } while (!valid);

        return result;
    }

    // PART G
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String response = "";
        boolean valid = false;

        do {
            System.out.print(prompt + ": ");
            response = pipe.nextLine();

            if (response.matches(regEx)) {
                valid = true;
            } else {
                System.out.println("Input does not match required pattern.");
            }
        } while (!valid);

        return response;
    }

    // PART H - Pretty Header
    public static void prettyHeader(String msg) {
        final int WIDTH = 60;

        // top row
        for (int i = 0; i < WIDTH; i++) {
            System.out.print("*");
        }
        System.out.println();

        // middle row
        int space = WIDTH - msg.length() - 6;  // 6 = "***" + "***"
        int left = space / 2;
        int right = space - left;

        System.out.print("***");
        for (int i = 0; i < left; i++) System.out.print(" ");
        System.out.print(msg);
        for (int i = 0; i < right; i++) System.out.print(" ");
        System.out.println("***");

        // bottom row
        for (int i = 0; i < WIDTH; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static double getAverage(int values[]) {
        double sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }
        double average = sum / values.length;

        return average;
    }
}