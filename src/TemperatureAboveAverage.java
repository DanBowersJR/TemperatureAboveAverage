import java.util.Scanner;

public class TemperatureAboveAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int numDays = scanner.nextInt();

        int[] temps = new int[numDays];
        int sum = 0;

        for (int i = 0; i < numDays; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temps[i] = scanner.nextInt();
            sum += temps[i];
        }

        double average = (double) sum / numDays;
        System.out.println("Average temperature: " + average);

        int countAbove = 0;
        for (int temp : temps) {
            if (temp > average) {
                countAbove++;
            }
        }

        System.out.println("Number of days above average: " + countAbove);
    }
}
