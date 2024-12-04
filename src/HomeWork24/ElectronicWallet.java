package HomeWork24;

public class ElectronicWallet implements PaymentSystem{
    private AccountMain accountMain;
    public ElectronicWallet(AccountMain accountMain) {
        this.accountMain = accountMain;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount > 0) {
            amount = -amount * crossCourse();
            accountMain.makeTransfer(amount);
        }
    }

    @Override
    public void depositTransfer(double amount) {
        if (amount > 0) {
            accountMain.makeTransfer(amount * crossCourse());
            System.out.println("Transaction successful");
        } else {
            System.out.println("Operation impossible");
        }

    }

    @Override
    public void checkBalance() {
        System.out.printf("Bank Account %s, Balance  = %.2f EUR\n",accountMain.accountNumber, accountMain.getAccountMain() * crossCourse());
    }

    @Override
    public void transferMoney(AccountMain accountOut, double amount) {
        if(amount > 0 ) {
            accountOut.makeTransfer(amount * crossCourse());
            withdrawMoney(amount);


        } else {
            System.out.println("Operation impossible");
        }

    }
}
