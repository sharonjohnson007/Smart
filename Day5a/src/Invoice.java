public class Invoice extends Customer {

    private int id;
    private Customer customer;
    private double amount;

    public Invoice( int id, Customer customer, double amount) {
        super(customer.getId(), customer.getName(), customer.getDiscount());
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getCustomerId(){
        return customer.getId();
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public int getCustomerDiscount(){
        return customer.getDiscount();
    }
    public double getAmountAfterDiscount(){
         return amount=amount-customer.getDiscount();
    }
    public String toString(){
        return "Invoice[id="+id+customer.toString()+"amount="+amount+"]";
    }
}
