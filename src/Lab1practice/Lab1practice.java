import java.util.Scanner;

public class Lab1practice {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Ask the user on average how many hours per day they use their phone
        System.out.print("How many hours per day do you use your phone? ");
        double dailyUse = keyboard.nextDouble();

        // Calculate the total time spent using their phone for an entire week
        double weeklyUse = dailyUse * 7;

        // Display the results below
        System.out.println("Total hours per day: " + dailyUse);
        System.out.println("Total hours per week: " + weeklyUse);
    }
}
