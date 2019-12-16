import java.util.Scanner;

public class CountingMachineRevisited {
    public static void main(String[] args) {
        // Declare are variables
        Scanner input = new Scanner(System.in);
        int Min_bound, Max_bound, increment;

        // Ask user where to start counting
        System.out.print("Count from: ");
        Min_bound = input.nextInt();

        // Ask user to where to stop counting
        System.out.print("Count to: ");
        Max_bound = input.nextInt();

        // Ask user how to count/with what increment
        System.out.print("Count by: ");
        increment = input.nextInt();

        // count and display all number on the same line
        for (int i = Min_bound; i <= Max_bound; i+=increment) {
            System.out.print(i + " ");
        }

        input.close();
    }
}