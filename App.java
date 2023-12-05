import java.util.Scanner;
import java.time.YearMonth;
public class App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Month (1-12): ");
        int month = scanner.nextInt();
        System.out.println("Enter the year: ");
        int year = scanner.nextInt();
        int daysInMonth = getDaysInMonth(year, month);
        YearMonth yearMonth = YearMonth.of(year, month);
        String monthName = yearMonth.getMonth().getDisplayName(java.time.format.TextStyle.FULL, java.util.Locale.getDefault());
        System.out.println("Number of days in " + monthName + " " + year + "is " + daysInMonth);

    }
    private static int getDaysInMonth(int year, int month) {
    YearMonth yearMonth = YearMonth.of(year, month);
    int daysInMonth = yearMonth.lengthOfMonth();
    return daysInMonth;
    }
}
