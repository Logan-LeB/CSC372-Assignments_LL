class BankAccount {
    String firstName;
    String lastName;
    int accountID;
    double balance;

    public BankAccount() {
        accountID = 0;
        firstName = "Forename";
        lastName = "Surname";
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
    }

    public void withdrawal(double subDeposit) {
        balance -= subDeposit;
    }

    public void accountSummary() {
        double roundedBalance = Math.floor(balance * 100) / 100.00;
        String formattedBalance = String.format("$%.2f", roundedBalance);
        System.out.println("ACCOUNT SUMMARY");
        System.out.println(
            "First Name: " + firstName + "\n" +
            "Last Name: " + lastName + "\n" +
            "Account ID: " + accountID + "\n" +
            "Balance: " + formattedBalance);
 
    }
}

class CheckingAccount extends BankAccount{
    public void tempMethod() {
        System.out.println("Hello");
    }
}


public class BankAccountProgram {
    public static void main(String[] args) {
        BankAccount bank_account = new BankAccount();
        bank_account.setFirstName("John");
        bank_account.setLastName("Johnson");
        bank_account.setAccountID(00000001);
        bank_account.deposit(99.999);
        bank_account.accountSummary(); 
    }
    
}
