package Book;

public class Book {
    protected String title;
    protected int year;
    protected double price;

    public String getTittle() {
        return this.title;
    }

    public void setTittle(String tittle) {
        this.title = tittle;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book() {
        super();
        title = "";
        year = 0;
        price = 0;
    }

    public Book(String tittle, int year, double price) {
        super();
        this.title = tittle;
        this.year = year;
        this.price = price;
    }
    //menghitung diskon
    public double hitungDiskon() {
        double diskon;
        if (year >= 2021) {
            return price;
        } else if(year >= 2011 && year <= 2020) {
            return price * 0.8;
        } else {
            return price * 0.5;
        }
    }
    public void print(){
        System.out.println("Tittle: " + title);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
        System.out.println("Diskon: " + hitungDiskon());
    }
}