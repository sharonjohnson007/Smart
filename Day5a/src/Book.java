public class Book extends Author {
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty=0;

    public Book(String isbn,String name,Author author,double price){
        super(author.getName(),author.getEmail());
        this.isbn=isbn;
        this.name=name;
        this.price=price;
    }

    public Book( String isbn, String name1, Author author, double price, int qty) {
        super(author.getName(), author.getEmail());
        this.isbn = isbn;
        this.name = name1;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getIsbn() {
        return isbn;
    }
    public String getname() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public String getAuthorName(){
         return author.getName();
    }
    public String toString(){
        return "Book["+"isbn='"+isbn+"name='"+author.toString()+"price='"+price+"qty='"+qty+"]";
    }
}
