package HomeWork24;

public abstract class AccountAbstract {
    protected String accountNumber;
    protected double crossCourse;
    protected ElectronicWallet electronicWallet;
    protected BankAccount bankAccount;
    protected double accountMain;

    public AccountAbstract(String accountNumber) {
        this.accountNumber = accountNumber;
        this.accountMain = 0;
    }
    public void makeCrossCourse(double timeCourse) {
        this.crossCourse = timeCourse;
    }
    public boolean checkTransfer(double amount) {
        if((this.accountMain + amount) >= 0) {
            return true;

        } else {
            System.out.println("Operation impossible");
            return false;
        }
    }
    public void makeTransfer(double amount) {
        if(checkTransfer(amount)) {
            this.accountMain += amount;
        }
    }

    public double getAccountMain() {
        return accountMain;
    }
}
