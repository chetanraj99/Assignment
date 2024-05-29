class BankAccount {
    private int balance = 0;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ", Current Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ", Current Balance: " + balance);
        } else {
            System.out.println("Insufficient balance to withdraw " + amount);
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                account.deposit(100);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                account.withdraw(50);
            }
        });

        t1.start();
        t2.start();
    }
}
