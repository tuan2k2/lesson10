package library.model;

public class Book extends Document {
    private String author;
    private int page;

    public Book(int id, String producer, int releaseNumber, String author, int page) {
        super(id, producer, releaseNumber);
        this.author = author;
        this.page = page;
    }

    public Book() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public double calcualateCost() {
        return page*500;
    }
    @Override
    public String toString() {
        return " [ ID: " + getId() + ";" + "    " + "Producer:" + getProducer() + ";" + "    " + "ReleaseNumber:" + getReleaseNumber() + ";" + "    " + "Author:" + author + ";" + "   " + "Number Of Page:" + page + ";"+ "  " + "calcalcualateCost:"  + calcualateCost() + " ]";
    }
}