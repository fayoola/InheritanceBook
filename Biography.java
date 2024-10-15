package Book;

public class Biography extends TextBook{
    protected String about;

    public String getAbout() {
        return this.about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
    public Biography(String about2) {
        super();
        about = "Kosong";
    }
    public Biography(String tittle, int year, double price, String about, String subject) {
        super(tittle, year, price, subject);
        this.about = about;
    }
    public void print() {
        super.print();
        System.out.println("About: " + about);
    }
}