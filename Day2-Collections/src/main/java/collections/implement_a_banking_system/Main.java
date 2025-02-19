package collections.implement_a_banking_system;

public class Main {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        bank.createAccount(1234560, 5000);
        bank.createAccount(1234561, 10000);
        bank.createAccount(1234562, 1000);

        bank.deposit(1234560, 2000);
        bank.requestWithdrawal(1234560);
        bank.requestWithdrawal(1234561);

        bank.displayAccountsSortedByBalance();
        bank.processWithdrawals(1000);
        bank.displayAccountsSortedByBalance();
    }

}
