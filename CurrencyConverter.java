import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base currency: ");
        String baseCurrency = scanner.nextLine().toUpperCase();
        System.out.print("Enter the target currency: ");
        String targetCurrency = scanner.nextLine().toUpperCase();
        double exchangeRate = fetchExchangeRate(baseCurrency, targetCurrency);
        if (exchangeRate == -1) {
            System.out.println("Failed to fetch exchange rate. Please try again later.");
            return;
        }
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();
        double convertedAmount = amount * exchangeRate;
        System.out.printf("%.2f %s is equal to %.2f %s\n", amount, baseCurrency, convertedAmount, targetCurrency);
        scanner.close();
    }
    private static double fetchExchangeRate(String baseCurrency, String targetCurrency) {
        return 1.23;
    }
}