public class Account extends Customer {

    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account(int id, Customer customer, double balance) {
        super(customer.getID(), customer.getName(), customer.getGender());
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        super(customer.getID(), customer.getName(), customer.getGender());
        this.id = id;
        this.customer = customer;
    }

    public Account() {
        Customer customer = new Customer(101, "johnson", 'm');
        new Account(this.id, this.customer, this.balance);

    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {

        return "Balance=" +  String.format("%.2f", balance) + "\t" + customer.toString();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public Account deposit(double amount) {
        Account account = new Account();
        account.setBalance(account.getBalance() + amount);
        return account;


    }

    public Account withdraw(double amount) {
        Account account = new Account();
        if (balance >= amount) {

            balance=balance-amount;
            return account;


        } else {
            System.out.println("Amount withdrawn exceeds the current balance");
            return account;
        }

    }
}








