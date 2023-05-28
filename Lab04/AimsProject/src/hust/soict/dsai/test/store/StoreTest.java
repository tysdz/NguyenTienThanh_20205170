package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Shawshank Redemption", "Drama", "Frank Darabont", 142, 9.5f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Godfather", "Crime", "Francis Ford Coppola", 175, 9.0f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Dark Knight", "Action", "Christopher Nolan", 152, 8.8f);

        Store store = new Store();
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        System.out.println("Before removing DVD:");
        for (DigitalVideoDisc dvd : store.getItemsInStore()) {
            if (dvd != null) {
                System.out.println(dvd.getTitle());
            }
        }

        store.removeDVD(dvd2);

        System.out.println("After removing DVD:");
        for (DigitalVideoDisc dvd : store.getItemsInStore()) {
            if (dvd != null) {
                System.out.println(dvd.getTitle());
            }
        }
    }
}
