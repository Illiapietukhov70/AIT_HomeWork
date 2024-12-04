package HomeWork24;

public class AccountMain extends AccountAbstract{
    public AccountMain(String accountNumber) {
        super(accountNumber);
        this.bankAccount = new BankAccount(this);
        this.electronicWallet = new ElectronicWallet(this);
    }
}


