package PROJECT1;
import java.util.Scanner;
public class BankAccountTester {
        public static Scanner sc = new Scanner (System.in);
        public static void main(String[] args) {
        BankAccount gregChecking = new BankAccount();
        BankAccount bobChecking = new BankAccount(10000);
        System.out.println(gregChecking.getBalance());
        System.out.println("Starting balance");
        System.out.println(bobChecking.getBalance());
        bobChecking.withdraw(500);
        System.out.println("Balance after withdraw");
        System.out.println(bobChecking.getBalance());
        bobChecking.deposit(100);
        System.out.println("Balance After Deposit");
        System.out.println(bobChecking.getBalance());
        // gregChecking.monthlyFee();
        System.out.println(gregChecking.getBalance());
        gregChecking.deposit(100);
        System.out.println("--------------------------------------------------------------");
        // THE SIMPLE INTEREST
        BankAccount output =new BankAccount();
        output.simpleInterest(200, 4, 2);
        System.out.println("--------------------------------------------------------------");
        // start
        System.out.println("Hello, welcome to your bank account.");
        System.out.println("How much money would you like to start with:");
        double startingBal = sc.nextDouble();
        BankAccount user = new BankAccount(startingBal);
        int menuSelection = BankAccount.menu();
        if (menuSelection == 1){
            
            System.out.println("Getting Account Balance:");
            System.out.println("Total Balance: $"+user.getBalance());
        } else if (menuSelection == 2) {
            // deposit
            System.out.println("Please enter the amount to deposit:");
            double depositAmount = sc.nextDouble();
            user.deposit(depositAmount);
            System.out.println("Amount: $" + depositAmount + " was deposited");
            System.out.println("Total Balance: $"+user.getBalance());
        }else if (menuSelection == 3){
            // overdraft
            System.out.println("Please enter the amount to withdraw:");
            double withdrawAmount = sc.nextDouble();
            output.overdraft(user.getBalance(), withdrawAmount);
            System.out.println("Amount: $" + withdrawAmount + " was withdrawn");
        }else if(menuSelection == 4){
            // transfer
            System.out.println("Enter your balance for Bank Account 1:");
            double bank1 = sc.nextDouble();
            System.out.println("How much would you like to transfer to Bank Account 2:");
            double transferBank = sc.nextDouble();
            System.out.println("Enter your balance for Bank Account 2:");
            double bank2 = sc.nextDouble();
            user.transfer(bank1, bank2, transferBank);
        }else if(menuSelection == 5){
            // savings account
            System.out.println("How much would you like to start your savings account with?");
            double initialSavings = sc.nextDouble();
            user.savingsAccount(initialSavings);
        }else if (menuSelection == 0){
            System.out.println("Exit");
        }else{
            System.out.println("Please select a vaild number");
        }
    }
}
