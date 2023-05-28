package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable   {
    private static int nbDigitalVideoDiscs = 0;
    private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // Constructor Methods

    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
        this.id = ++nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String category, String title, float cost) {
        super();
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String director, String category, String title, float cost) {
        super();
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public boolean isMatch(String title) {
        return this.title.toLowerCase().contains(title.toLowerCase());
    }

    public String toString() {
        return "DVD - " + "ID: " + id + ", Title: " + title + ", Category: " + category + ", Director: " + director + ", Length: " + length + ", Cost: " + cost;
    }

    public static DigitalVideoDisc searchByID(DigitalVideoDisc[] collection, int id) {
        for (DigitalVideoDisc dvd : collection) {
            if (dvd.getId() == id) {
                return dvd;
            }
        }
        System.out.println("No match found for ID: " + id);
        return null;
    }

    public static void searchByTitle(DigitalVideoDisc[] collection, String title) {
        boolean matchFound = false;
        for (DigitalVideoDisc dvd : collection) {
            if (dvd.isMatch(title)) {
                System.out.println(dvd.toString());
                matchFound = true;
            }
        }
        if (!matchFound) {
            System.out.println("No match found for title: " + title);
        }
    }
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + getLength());
    }

}
