import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Ask user for number to count to
        System.out.print("Count to: ");
        int upper_bound = input.nextInt();

        // Count up the upper_bound starting from 0
        for (int i = 0; i <= upper_bound; i++) {
            System.out.print(i + " ");
        }

        // close scanner object
        input.close();
    }
}