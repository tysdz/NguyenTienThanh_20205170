package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle", string2, string3, i, f);
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella", string2, string3, i, f);
        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }

    public static void swap(Object o1, Object o2) {
        DigitalVideoDisc a = (DigitalVideoDisc) o1;
        DigitalVideoDisc b = (DigitalVideoDisc) o2;
        DigitalVideoDisc tmp = new DigitalVideoDisc(a.getTitle(), string2, string3, i, f);
        a.setTitle(b.getTitle());
        b.setTitle(tmp.getTitle());
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        title = oldTitle;
    }
}
