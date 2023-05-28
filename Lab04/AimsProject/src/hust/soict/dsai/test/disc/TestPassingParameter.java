package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class TestPassingParameter {

    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        DVDWrapper dvd1 = new DVDWrapper(jungleDVD);
        DVDWrapper dvd2 = new DVDWrapper(cinderellaDVD);
        swap(dvd1, dvd2);
        //swap(jungleDVD, cinderellaDVD);
        jungleDVD = dvd1.dvd;
        cinderellaDVD = dvd2.dvd;
        System.out.println("jungle dvd title: " + dvd1.dvd.getTitle());
        System.out.println("cinderellale dvd title: " + dvd2.dvd.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderellale dvd title: " + cinderellaDVD.getTitle());

        //changeTittle(jungleDVD, cinderellaDVD.getTitle());
        //System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }

    public static void swap(DVDWrapper dvd1, DVDWrapper dvd2)
    {
        //This method swaps dvd objects in wrappers dvd1 and dvd2
        DigitalVideoDisc tmpDigitalVideoDisc = dvd1.dvd;
        dvd1.dvd = dvd2.dvd;
        dvd2.dvd = tmpDigitalVideoDisc;
    }
	
	/*public static void swap(Object o1, Object o2)
	{
		Object tmpObject = o1;
		o1= o2;
		o2 = tmpObject;
	}*/

    public static void changeTittle(DigitalVideoDisc dvd, String title) {
        String oldTitleString = dvd.getTitle();
        dvd.setTitle(title);
        //System.out.println ("The current jungle title is: " + dvd.getTitle());
        //dvd = new hust.soict.dsai.aims.media.DigitalVideoDisc(oldTitleString); //vi no tham chieu toi vi tri khac roi, nen co thay doi ve oldTittle thi cung khong anh huong gi toi jungleDVD
        //System.out.println ("The current jungle title is: " + dvd.getTitle());
    }

}


//Wrapper over class that is used for swapping
class DVDWrapper {
    DigitalVideoDisc dvd;
    //Constructor
    DVDWrapper (DigitalVideoDisc dvd) {
        this.dvd = dvd;
    }
}