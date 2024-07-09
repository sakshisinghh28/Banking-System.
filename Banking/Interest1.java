package bank;

class Interest1 extends SavingAccount implements RBI {
    public void calculateInterest() {
        if (savingsRate >= sinterest) {
            System.out.println("Interest will be 4% for saving account so the total balance is " + balance * 0.04);
        } else {
            System.out.println("Minimum interest rate criteria not met");
        }
    }
}
