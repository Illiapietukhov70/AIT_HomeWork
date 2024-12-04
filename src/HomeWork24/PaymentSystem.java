package HomeWork24;

public interface PaymentSystem {
    void withdrawMoney(double amount);
    void depositTransfer(double amount);
    void checkBalance();
    void transferMoney(AccountMain accountOut, double amount);
    default double crossCourse() {
        return 1.06; // 04-12-2024
    } ;
}
