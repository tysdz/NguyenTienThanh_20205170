package hust.soict.dsai.aims.media;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Media otherMedia = (Media) obj;
        return title.equals(otherMedia.title);
    }

    @Override
    public String toString() {
        List<Media> mediaList = new ArrayList<Media>();

// Thêm các đối tượng media (CD, DVD, Book) vào danh sách
        mediaList.add(cd);
        mediaList.add(dvd);
        mediaList.add(book);

// In ra thông tin của từng đối tượng media
        for (Media media : mediaList) {
            System.out.println(media.toString());
        }

        return "Media - Title: " + title + ", Category: " + category + ", Cost: $" + cost;
    }


}
