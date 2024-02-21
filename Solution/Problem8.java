import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the time string (e.g., '4h 20m 10s'): ");
        String timeString = scanner.nextLine();

        int totalSeconds = convertTimeStringToSeconds(timeString);
        System.out.println("Total number of seconds: " + totalSeconds);

        scanner.close();
    }

    public static int convertTimeStringToSeconds(String timeString) {
        int totalSeconds = 0;
        String[] parts = timeString.split("\\s+");
        for (String part : parts) {
            if (part.endsWith("h")) {
                int hours = Integer.parseInt(part.substring(0, part.length() - 1));
                totalSeconds += hours * 3600;
            } else if (part.endsWith("m")) {
                int minutes = Integer.parseInt(part.substring(0, part.length() - 1));
                totalSeconds += minutes * 60;
            } else if (part.endsWith("s")) {
                int seconds = Integer.parseInt(part.substring(0, part.length() - 1));
                totalSeconds += seconds;
            }
        }
        return totalSeconds;
    }
}

