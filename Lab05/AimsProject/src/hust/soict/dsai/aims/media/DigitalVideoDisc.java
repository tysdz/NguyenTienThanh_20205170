package hust.soict.dsai.aims.media;

import javax.swing.*;

public class DigitalVideoDisc extends Disc implements Playable {

    public DigitalVideoDisc() {
        super(string2, string3, i, f);
    }

    public void play() {
        JFrame j = new JFrame();
        String text =  "Playing DVD: " + this.getTitle() + "\nDVD length: " + this.getLength();
        JOptionPane.showMessageDialog(j, text, "Play Media", JOptionPane.INFORMATION_MESSAGE);

    }

    @Override
    public String toString() {
        return "(Digital Dvd): " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - "
                + this.getLength() + " : " + this.getCost() + "$";
    }

}