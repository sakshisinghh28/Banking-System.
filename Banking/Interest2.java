package bank;

class Interest2 extends CurrentAccount implements RBI {
    public void calculateInterest() {
        if (currentRate >= cinterest) {
            System.out.println("Interest will be 2% for current account so the total balance is " + balance * 0.02);
        } else {
            System.out.println("Minimum interest rate criteria not met");
        }
    }
}
