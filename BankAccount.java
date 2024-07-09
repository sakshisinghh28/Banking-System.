abstract class BankAccount {
    private long mobileNumber, accountNumber;
    private String name;
    protected int balance;
    protected int minBalance = 1000;
    protected int maxWithdrawal = 100000;
    protected int amount;

    public BankAccount() {
        balance = 1000;
    }

    public void inputData() {
        System.out.println("Enter name");
        name = new java.util.Scanner(System.in).next();
        System.out.println("Enter mobile number");
        mobileNumber = new java.util.Scanner(System.in).nextLong();
        System.out.println("Enter account number");
        accountNumber = new java.util.Scanner(System.in).nextLong();
    }

    public void display() {
        System.out.println("Name: " + name + "\t Mobile number: " + mobileNumber + "\t Account number: " + accountNumber + "\t Balance: " + balance);
    }

    abstract public void deposit();

    abstract public void withdraw();
}

class SavingAccount extends BankAccount {
    private int savingsRate = 4;

    @Override
    public void deposit() {
        System.out.println("Enter amount to deposit in saving account: ");
        amount = new java.util.Scanner(System.in).nextInt();
        balance += amount;
        System.out.println("The balance is " + balance);
    }

    @Override
    public void withdraw() {
        System.out.println("Enter amount to withdraw from saving account");
        amount = new java.util.Scanner(System.in).nextInt();
        if ((balance - amount) < minBalance) {
            System.out.println("At least 1000 should be present in saving account");
        } else if (amount > maxWithdrawal) {
            System.out.println("Maximum withdrawal allowed is 100000");
        } else {
            balance -= amount;
            System.out.println("Balance is " + balance);
        }
    }
}

class CurrentAccount extends BankAccount {
    private int currentRate = 2;

    @Override
    public void deposit() {
        System.out.println("Enter amount to deposit in current account: ");
        amount = new java.util.Scanner(System.in).nextInt();
        balance += amount;
        System.out.println("The balance in current account " + balance);
    }

    @Override
    public void withdraw() {
        System.out.println("Enter amount to withdraw from current account");
        amount = new java.util.Scanner(System.in).nextInt();
        if ((balance - amount) < minBalance) {
            System.out.println("At least 1000 should be present in current account");
        } else if (amount > maxWithdrawal) {
            System.out.println("Maximum withdrawal allowed is 100000");
        } else {
            balance -= amount;
            System.out.println("Balance in current account " + balance);
        }
    }
}

class FixedDepositAccount extends BankAccount {
    private int fdRate = 6; // Example fixed deposit interest rate

    @Override
    public void deposit() {
        System.out.println("Enter amount to deposit in fixed deposit account: ");
        amount = new java.util.Scanner(System.in).nextInt();
        balance += amount;
        System.out.println("The balance in fixed deposit account " + balance);
    }

    @Override
    public void withdraw() {
        System.out.println("Withdrawal not allowed in fixed deposit account until maturity.");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Account Type: Fixed Deposit Account");
    }
}
