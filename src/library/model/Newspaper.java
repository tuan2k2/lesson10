package library.model;

import library.model.Document;

public class Newspaper extends Document {
    private String releaseDate;

    public Newspaper(int id, String producer, int releaseNumber, String releaseDate) {
        super(id, producer, releaseNumber);
        this.releaseDate = releaseDate;
    }

    public Newspaper() {
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public double calcualateCost() {
        return 15000;
    }

    @Override
    public String toString() {
        return " [ ID: " + getId() + ";" + "    " + "Producer:" + getProducer() + ";" + "    " + "ReleaseNumber:" + getReleaseNumber() + ";" + "    " + "ReleaseDate:" + releaseDate + ";"  + "  " + "calcalcualateCost:"  + calcualateCost() + " ]";
    }
}