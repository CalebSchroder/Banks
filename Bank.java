public class Bank {
    private Account[] accounts;


    public Bank(Account[] accounts) {
        this.accounts = accounts;
    }

    public void update() {
        for (i = 0; i < accounts.length; i ++) {
            if (accounts[i] instanceof SavingsAccount) {
                ((SavingsAccount)account[i]).update();
            }
            if (accounts[i] instanceof CurrentAccount) {
                ((CurrentAccount)account[i]).update();
            }
        }
    }
}