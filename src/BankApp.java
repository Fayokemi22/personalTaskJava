public class BankApp {
    public static int balance = 1000;
    private static final String PIN = "1234";

    public static int deposit(int amount) {
        balance = balance + amount;
        return balance;
    }

    public static String withdraw(int amount, String enteredPin) {
        if (!enteredPin.equals(PIN)) {
            return "Wrong PIN";
        }
        if (amount > balance) {
            return "Insufficient funds";
        }
        balance = balance - amount;
        return "Withdrawal successful";
    }
}