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
