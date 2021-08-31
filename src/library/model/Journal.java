package library.model;

import library.model.Document;

public class Journal extends Document {
    private String releaseDate;
    private int issueNumber;

    public Journal(int id, String producer, int releaseNumber, String releaseDate, int issueNumber) {
        super(id, producer, releaseNumber);
        this.releaseDate = releaseDate;
        this.issueNumber = issueNumber;
    }

    public Journal() {
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public double calcualateCost() {
        return 20000;
    }

    @Override
    public String toString() {
        return " [ ID: " + getId() + ";" + "    " + "Producer:" + getProducer() + ";" + "    " + "ReleaseNumber:" + getReleaseNumber() + ";" + "    " + "ReleaseDate:" + releaseDate + ";" + "   " + "IssueNumber:" + issueNumber + ";"+ "  " + "calcalcualateCost:"  + calcualateCost() + " ]";
    }
}
