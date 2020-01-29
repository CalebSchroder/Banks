public class SavingsAccount extends Account {

    private double interest; 

    public SavingsAccount(int accnum, double interest) {
        super(accnum);
        this.interest = interest;

    }

    public double addInterest() {
        return getBalance() + (getBalance() * interest);
    }
    public void update() {
        addInterest();
    }


}