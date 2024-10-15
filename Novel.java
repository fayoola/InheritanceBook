package Book;

public class Novel extends Book {
    protected String genre;

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public Novel(String genre2, String title, int year, double price, String subject) {
        super();
        genre = "Kosong";
    }
    public Novel(String tittle, int year, double price, String genre) {
        super(tittle, year, price);
        this.genre = genre;
    }
    public void print() {
        super.print();
        System.out.println("Genre: " + genre);
    }
}