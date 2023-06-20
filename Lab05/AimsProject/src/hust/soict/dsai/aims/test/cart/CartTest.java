package hust.soict.dsai.aims.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

import static hust.soict.dsai.aims.Aims.*;

public class CartTest {
    public static void main(String[] args) {
        // Create a new cart
        Cart cart = new Cart();
        // Create new did objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                string2, string3, i, f);
        cart.addMedia(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                string2, string3, i, f);
        cart.addMedia(dvd2);
        // Test the print method
        cart.prinCast();
        // To-do: Test the search methods here
        cart.searchCart();
        cart.sortCartByTitle();
    }
}

