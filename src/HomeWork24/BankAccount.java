package HomeWork24;

public class BankAccount implements PaymentSystem{
    private AccountMain accountMain;
    public BankAccount(AccountMain accountMain) {
        this.accountMain = accountMain;

    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount > 0) {
            amount = -amount;
            accountMain.makeTransfer(amount);
        }

    }

    @Override
    public void depositTransfer(double amount) {
        if (amount > 0) {
            accountMain.makeTransfer(amount);
            System.out.println("Transaction successful");
        } else {
            System.out.println("Operation impossible");
        }
    }



    @Override
    public void checkBalance() {
        System.out.printf("Bank Account %s, Balance = %.2f  USD\n",accountMain.accountNumber, accountMain.getAccountMain());
    }

    @Override
    public void transferMoney(AccountMain accountOut, double amount) {
        if(amount > 0) {
            accountOut.makeTransfer(amount);
            withdrawMoney(amount);

        } else {
            System.out.println("Operation impossible");
        }
    }

}
