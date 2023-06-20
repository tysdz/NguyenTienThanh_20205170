package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Shawshank Redemption", string2, string3, i, f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Godfather", string2, string3, i, f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Dark Knight", string2, string3, i, f);

        Store store = new Store();
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);

        System.out.println("Before removing DVD:");
        for (Media dvd : store.getItemInStore()) {
            if (dvd != null) {
                System.out.println(dvd.getTitle());
            }
        }

        store.removeMedia(dvd2);

        System.out.println("After removing DVD:");
        for (Media dvd : store.getItemInStore()) {
            if (dvd != null) {
                System.out.println(dvd.getTitle());
            }
        }
    }
}
