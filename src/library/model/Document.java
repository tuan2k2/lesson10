package library.model;

public abstract class Document {
    private int id;
    private String producer;
    private int releaseNumber;

    public Document(int id, String producer, int releaseNumber) {
        this.id = id;
        this.producer = producer;
        this.releaseNumber = releaseNumber;
    }

    public Document() {
    }
    public abstract double calcualateCost();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", producer='" + producer + '\'' +
                ", releaseNumber=" + releaseNumber +
                '}';
    }
}
