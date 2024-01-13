package number;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static final int NUMBER_ATTEMPTS = 3;
    public static final int UPPER_BOUND = 10;
    public static final int LOWER_BOUND = 0;

    public static void main(String[] args) {
        Random random = new Random();
        int computerNumber = random.nextInt(UPPER_BOUND);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input a number from " + LOWER_BOUND + " to "
                + UPPER_BOUND + ". You have " + NUMBER_ATTEMPTS + " attempts."
        );

        int inputtingNumber;
        for (int i = 1; i <= NUMBER_ATTEMPTS; i++) {
            System.out.println("This is attempt number " + i);
            inputtingNumber = scanner.nextInt();

            if (inputtingNumber == computerNumber) {
                System.out.println("You entered a correct number!");
                break;
            }

            if (i == NUMBER_ATTEMPTS) {
                System.out.println("Your attempts are over. You couldn't guess the number. Thank you for playing.");
            } else {
                System.out.println("You entered an incorrect number. Please try again.");
            }
        }

        scanner.close();
    }
}
