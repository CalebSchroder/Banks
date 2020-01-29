public class CurrentAccount extends Account {

    private double overdraftLimit;

    public CurrentAccount(int accnum, double overdraftLimit) {
        super(accnum);
        this.overdraftLimit = overdraftLimit;

    }

    public void withdraw(double sum) {
        if ((bal - sum) <= -overdraftLimit) {
            bal =- sum;
        } else {
            System.out.println("nice try bud, not today");
        }

    }
    public void check () {
        if (bal <-overdraftLimit) {
            System.out.println("Reeeee, over the overdraft limit");
        }
    }
    public void update() {
        check();
    }

}