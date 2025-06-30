public class CheckingAccount extends BankAccount{
    public double interestRate;
    public Boolean enableOverdraft;

    public CheckingAccount(String firstName, String lastName, int accountID, double interestRate, Boolean enableOverdraft) {
        super(firstName, lastName, accountID);
        this.interestRate = interestRate;
        this.enableOverdraft = enableOverdraft;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public Boolean getEnableOverdraft() {
        return enableOverdraft;
    }

    public void setInterestRate(double newInterestRate) {
        this.interestRate = newInterestRate;
    }

    public void setEnableOverdraft(Boolean isEnableOverdraft) {
        this.enableOverdraft = isEnableOverdraft;
    }

    public void processWithdrawal(double subDeposit) {
        if (subDeposit > balance) {
            if (enableOverdraft){
                balance -= subDeposit + 30.00;
                System.out.println("Overdraft fee applied.");
                printBalance(true);
                }
            else {
                System.out.println("Insufficient funds, unable to withdraw.");
                printBalance(true);
                }
        }
        else {
                balance -= subDeposit;
                System.out.println("Withdrawal accepted.");
                printBalance(true);
        }
    }

    public void displayAccount() {
        super.accountSummary();
        System.out.print("Interest Rate: " + interestRate + "\n");
    }
}