package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc[] itemsInStore;
    private int currentIndex;

    public Store() {
        itemsInStore = new DigitalVideoDisc[10];
        currentIndex = 0;
    }

    public void addDVD(DigitalVideoDisc disc) {
        if (currentIndex >= itemsInStore.length) {
            System.out.println("hust.soict.dsai.aims.store.Store is full, cannot add DVD.");
            return;
        }

        itemsInStore[currentIndex++] = disc;
        System.out.println("DVD added to store.");
    }

    public void removeDVD(DigitalVideoDisc disc) {
        int index = -1;
        for (int i = 0; i < currentIndex; i++) {
            if (itemsInStore[i] == disc) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("DVD not found in store.");
            return;
        }

        for (int i = index; i < currentIndex - 1; i++) {
            itemsInStore[i] = itemsInStore[i + 1];
        }
        itemsInStore[--currentIndex] = null;

        System.out.println("DVD removed from store.");
    }
    public DigitalVideoDisc[] getItemsInStore() {
        return itemsInStore;
    }
}
