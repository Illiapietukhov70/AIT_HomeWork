package HomeWork24;

public class BankTest {
    public static void main(String[] args) {
        AccountMain accountMain = new AccountMain("1772773UTS");
        accountMain.electronicWallet.checkBalance();
        accountMain.bankAccount.checkBalance();
        accountMain.bankAccount.depositTransfer(1982);
        accountMain.bankAccount.checkBalance();
        accountMain.electronicWallet.checkBalance();
        AccountMain accountMain1 = new AccountMain("effdsfsew");
        accountMain.electronicWallet.transferMoney(accountMain1, 1234);
        accountMain.electronicWallet.checkBalance();
        accountMain1.bankAccount.checkBalance();
        accountMain1.electronicWallet.withdrawMoney(2000);
        accountMain.electronicWallet.transferMoney(accountMain1, 2000);
    }
}
