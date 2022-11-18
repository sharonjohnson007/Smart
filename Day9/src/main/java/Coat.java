package main.java;

public class Coat {


        private double price;
        private String customer;

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            if(customer.equals("student")){
                this.price = price * 0.8;
            }else{
                this.price = price;
            }
        }

        public String getCustomer() {
            return customer;
        }

        public void setCustomer(String customer) {
            this.customer = customer;
        }

    public static void main(String[] args) {
        Coat coat=new Coat();
        coat.setCustomer("student");
        System.out.println("the customer is"+" "+coat.getCustomer());
        coat.setPrice(200);
        System.out.println("price is"+" "+coat.getPrice());
    }

}
