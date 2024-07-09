package bank;

import java.util.InputMismatchException;

public class BankingSystem2 {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        CurrentAccount currentAccount = new CurrentAccount();
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount();
        Interest1 interest1 = new Interest1();
        Interest2 interest2 = new Interest2();

        while (true) {
            try {
                System.out.println("\nSelect from options \n1. Input data \n2. Display info \n3. Deposit in saving account \n4. Withdraw from saving account \n5. Deposit in current account \n6. Withdraw from current account \n7. Deposit in fixed deposit account \n8. Calculate interest in saving account \n9. Calculate interest in current account \n10. Exit\n");
                int option = new java.util.Scanner(System.in).nextInt();
                switch (option) {
                    case 1:
                        savingAccount.inputData();
                        break;
                    case 2:
                        savingAccount.display();
                        break;
                    case 3:
                        savingAccount.deposit();
                        break;
                    case 4:
                        savingAccount.withdraw();
                        break;
                    case 5:
                        currentAccount.deposit();
                        break;
                    case 6:
                        currentAccount.withdraw();
                        break;
                    case 7:
                        fixedDepositAccount.deposit();
                        break;
                    case 8:
                        interest1.calculateInterest();
                        break;
                    case 9:
                        interest2.calculateInterest();
                        break;
                    case 10:
                        System.exit(0);
                    default:
                        System.out.println("Invalid option. Please choose a valid option.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                // Clear the scanner's buffer
                new java.util.Scanner(System.in).nextLine();
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
