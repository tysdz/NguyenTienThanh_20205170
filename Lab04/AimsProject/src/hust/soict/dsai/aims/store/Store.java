package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Store {
    private ArrayList<Media> itemsInStore;
    private int currentIndex;

    public Store() {
        itemsInStore = new ArrayList<Media>();
    }


    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println("Media added to store.");
    }


    public void removeMedia(Media media) {
        if (itemsInStore.remove(media)) {
            System.out.println("Media removed from store.");
        } else {
            System.out.println("Media not found in store.");
        }
    }

    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }
}
