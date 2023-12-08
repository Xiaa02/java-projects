import java.util.Scanner;

public class RainfallAnalyzer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int caseNumber = 1;

        while (true) {
            int startYear = s.nextInt();
            int endYear = s.nextInt();
            
            if (startYear == 0 && endYear == 0) {
                break;
            }

            System.out.println("Case #" + caseNumber + ":");

            for (int year = startYear; year <= endYear; year++) {
                double[] monthlyRainfall = new double[12];
                double totalRainfall = 0;
                int minMonth = -1;
                int maxMonth = -1;

                for (int i = 0; i < 12; i++) {
                    monthlyRainfall[i] = s.nextDouble();
                    totalRainfall += monthlyRainfall[i];

                    if (minMonth == -1 || monthlyRainfall[i] < monthlyRainfall[minMonth]) {
                        minMonth = i;
                    }

                    if (maxMonth == -1 || monthlyRainfall[i] >= monthlyRainfall[maxMonth]) {
                        maxMonth = i;
                    }
                }

                double averageRainfall = totalRainfall / 12.0;

                System.out.printf("Year %d: Avg: %.2f  Lo: %s Hi: %s%n",
                        year, averageRainfall, getMonthName(minMonth), getMonthName(maxMonth));
            }

            caseNumber++;
        }
    }
    
    public static String getMonthName(int month) {
        switch (month) {
            case 0: return "Jan";
            case 1: return "Feb";
            case 2: return "Mar";
            case 3: return "Apr";
            case 4: return "May";
            case 5: return "Jun";
            case 6: return "Jul";
            case 7: return "Aug";
            case 8: return "Sep";
            case 9: return "Oct";
            case 10: return "Nov";
            case 11: return "Dec";
            default: return "";
        }
    }
}
