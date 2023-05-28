package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

import java.util.Scanner;

public class Aims {
    private static Store store = new Store();
    private static Cart cart = new Cart();

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        System.out.println("AIMS:");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
            case 1:
                viewStore();
                break;
            case 2:
                updateStore();
                break;
            case 3:
                seeCurrentCart();
                break;
            case 0:
                System.out.println("Exiting the program...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                showMenu();
                break;
        }
    }

    public static void viewStore() {
        System.out.println("Items in the store:");
        Media[] items = store.getItemsInStore();
        for (Media item : items) {
            System.out.println(item.getTitle());
        }

        storeMenu();
    }

    public static void storeMenu() {
        System.out.println("Options:");
        System.out.println("--------------------------------");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
            case 1:
                seeMediaDetails();
                break;
            case 2:
                addMediaToCart();
                break;
            case 3:
                playMedia();
                break;
            case 4:
                seeCurrentCart();
                break;
            case 0:
                showMenu();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                storeMenu();
                break;
        }
    }

    public static void seeMediaDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title of the media:");
        String title = scanner.nextLine();

        Media media = store.searchMedia(title);
        if (media != null) {
            System.out.println(media.toString());
            mediaDetailsMenu(media);
        } else {
            System.out.println("Media not found in store.");
            storeMenu();
        }
    }

    public static void mediaDetailsMenu(Media media) {
        System.out.println("Options:");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        if (media instanceof Playable) {
            System.out.println("2. Play");
        }
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1" + (media instanceof Playable ? "-2" : ""));

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
            case 1:
                addToCart(media);
                break;
            case 2:
                if (media instanceof Playable) {
                    ((Playable) media).play();
                } else {
                    System.out.println("Invalid choice. Please try again.");
                    mediaDetailsMenu(media);
                }
                break;
            case 0:
                viewStore();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                mediaDetailsMenu(media);
                break;
        }
    }

    public static void addMediaToCart() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title of the media:");
        String title = scanner.nextLine();

        Media media = store.searchMedia(title);
        if (media != null) {
            cart.addMedia(media);
            if (media instanceof DVD) {
                System.out.println("DVD added to cart. Number of DVDs in cart: " + cart.getDVDCount());
            } else {
                System.out.println("Media added to cart.");
            }
        } else {
            System.out.println("Media not found in store.");
        }

        storeMenu();
    }

    public static void playMedia() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title of the media:");
        String title = scanner.nextLine();

        Media media = store.searchMedia(title);
        if (media != null && media instanceof Playable) {
            ((Playable) media).play();
        } else {
            System.out.println("Media not found or not playable.");
        }

        storeMenu();
    }

    public static void updateStore() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Options:");
        System.out.println("--------------------------------");
        System.out.println("1. Add a media to store");
        System.out.println("2. Remove a media from store");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
            case 1:
                addMediaToStore();
                break;
            case 2:
                removeMediaFromStore();
                break;
            case 0:
                showMenu();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                updateStore();
                break;
        }
    }

    public static void addMediaToStore() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title of the media:");
        String title = scanner.nextLine();
        // Add code to get other details of the media and create an instance
        // of the appropriate media class (CD, DVD, Book) and add it to the store

        System.out.println("Media added to store.");
        updateStore();
    }

    public static void removeMediaFromStore() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title of the media:");
        String title = scanner.nextLine();

        Media media = store.searchMedia(title);
        if (media != null) {
            store.removeMedia(media);
            System.out.println("Media removed from store.");
        } else {
            System.out.println("Media not found in store.");
        }

        updateStore();
    }

    public static void seeCurrentCart() {
        System.out.println("Items in the current cart:");
        Media[] items = cart.getItemsInCart();
        for (Media item : items) {
            System.out.println(item.getTitle());
        }

        cartMenu();
    }

    public static void cartMenu() {
        System.out.println("Options:");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
            case 1:
                filterMediasInCart();
                break;
            case 2:
                sortMediasInCart();
                break;
            case 3:
                removeMediaFromCart();
                break;
            case 4:
                playMediaFromCart();
                break;
            case 5:
                placeOrder();
                break;
            case 0:
                seeCurrentCart();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                cartMenu();
                break;
        }
    }

    public static void filterMediasInCart() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Options:");
        System.out.println("--------------------------------");
        System.out.println("1. Filter by id");
        System.out.println("2. Filter by title");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
            case 1:
                // Filter medias in cart by id
                break;
            case 2:
                // Filter medias in cart by title
                break;
            case 0:
                cartMenu();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                filterMediasInCart();
                break;
        }
    }

    public static void sortMediasInCart() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Options:");
        System.out.println("--------------------------------");
        System.out.println("1. Sort by title");
        System.out.println("2. Sort by cost");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
            case 1:
                // Sort medias in cart by title
                break;
            case 2:
                // Sort medias in cart by cost
                break;
            case 0:
                cartMenu();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                sortMediasInCart();
                break;
        }
    }

    public static void removeMediaFromCart() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title of the media:");
        String title = scanner.nextLine();

        Media media = cart.searchMedia(title);
        if (media != null) {
            cart.removeMedia(media);
            System.out.println("Media removed from cart.");
        } else {
            System.out.println("Media not found in cart.");
        }

        cartMenu();
    }

    public static void playMediaFromCart() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title of the media:");
        String title = scanner.nextLine();

        Media media = cart.searchMedia(title);
        if (media != null && media instanceof Playable) {
            ((Playable) media).play();
        } else {
            System.out.println("Media not found or not playable.");
        }

        cartMenu();
    }

    public static void placeOrder() {
        System.out.println("Order placed. Thank you!");
        cart.clearCart();
        cartMenu();
    }
}
