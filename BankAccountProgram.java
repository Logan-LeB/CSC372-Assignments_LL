class BankAccount {
    public String firstName;
    public String lastName;
    public int accountID;
    public double balance;

    public BankAccount(String firstName, String lastName, int accountID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountID = accountID;
        balance = 0.0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAccountID() {
        return accountID;
    }

    public double getBalance() {
        return balance;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public void setAccountID(int newAccountID) {
        this.accountID = newAccountID;
    }

    public void deposit(double addDeposit) {
        balance += addDeposit;
        System.out.println("\nDeposit accepted.");
        printBalance(true);
    }

    public void withdrawal(double subDeposit) {
        if (subDeposit > balance) {
            System.out.println("\nInsufficient funds, unable to withdraw.");
            printBalance(true);
        }
        else {
            balance -= subDeposit;
            System.out.println("\nWithdrawal accepted.");
            printBalance(true);
        }
    }

    public String formatBalance() {
        double roundedBalance = Math.floor(balance * 100) / 100.00;
        String formattedBalance = String.format("$%.2f", roundedBalance);
        return formattedBalance;
    }

    public void printBalance(Boolean newLine) {
        System.out.println("Current Balance: " + formatBalance());
        if (newLine){
            System.out.print("\n");
            }
    }

    public void accountSummary() {
        //tempBalance = formatBalance();
        System.out.println("\nACCOUNT SUMMARY");
        System.out.println(
            "First Name: " + firstName + "\n" +
            "Last Name: " + lastName + "\n" +
            "Account ID: " + accountID + "\n" +
            "Balance: " + formatBalance());
 
    }
}

class CheckingAccount extends BankAccount{
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



public class BankAccountProgram {
    public static void main(String[] args) {
        CheckingAccount testChecking = new CheckingAccount("John", "Johnson", 1, 0.01, true);
        testChecking.displayAccount(); 
        testChecking.deposit(99.999);
        testChecking.processWithdrawal(50.00);
        testChecking.processWithdrawal(72.00);
        testChecking.setEnableOverdraft(false);
        testChecking.processWithdrawal(1.00);

    }
    
}
