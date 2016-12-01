package travelagency.view;


import travelagency.controller.AdminController;
import travelagency.controller.UserController;
import travelagency.model.Address;
import travelagency.model.Hotel;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by Влад on 29.11.2016.
 */
public class ClientView {

    private Scanner scanner = new Scanner(System.in);
    private AdminController admin;
    private UserController user;

    public ClientView(AdminController admin, UserController user) {
        this.admin = admin;
        this.user = user;
    }

    private void showStartPage() {
        System.out.println("sign in as:\n1. admin\n2. user\n3. exit");
    }

    public void start() {
        int choice = -1;

        while (true) {
            showStartPage();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("enter password");
                    int password = scanner.nextInt();
                    if (password == AdminController.getPassword()) {
                        showAdminMenu();
                    } else {
                        System.out.println("incorrect password");
                        break;
                    }
                case 2:
                    showUserMenu();
                    break;
                case 3:
                    return;
            }
        }
    }

    private void showUserMenu() {
        int choice = -1;

        while (true) {
            System.out.println("what you want?\n1. show all tour\n2. buy tour\n3. filter tour by price\n" +
                    "4. filter tour by country\n5. exit");
            choice = scanner.nextInt();

            if (choice == 5) {
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println(user.showAllTours());
                    break;
                case 2:
                    System.out.println("enter tour id: ");
                    int id = scanner.nextInt();
                    System.out.println("enter info about you in format name/phone/email");
                    String s = scanner.next();
                    String[] info = s.split("/");

                    user.sendTourRequest(id, info[0], info[1], info[2]);
                    break;
                case 3:
                    System.out.println("enter price: ");
                    System.out.println(user.searchByPrice(scanner.nextLong() / 100));
                    break;
                case 4:
                    System.out.println("enter country: ");
                    System.out.println(user.searchByCountry(scanner.next()));
                    break;
            }
        }


    }

    private void showAdminMenu() {
        int choice = -1;

        while (true) {
            System.out.println("what you want?\n1. add tour\n2. remove tour\n3. update tour\n" +
                    "4. show all requests\n5. exit");
            choice = scanner.nextInt();

            if (choice == 5) {
                break;
            }

            switch (choice) {
                case 1:
                    addTourByAdmin();
                    break;
                case 2:
                    System.out.println("enter id tour to be removed: ");
                    admin.removeTour(scanner.nextInt());
                    break;
                case 3:
                    updateTourByAdmin();
                    break;
                case 4:
                    System.out.println(admin.showAllRequests());
                    break;
            }
        }

    }

    private void addTourByAdmin() {
        System.out.println("enter info about tour");

        System.out.println("name: ");
        String name = scanner.next();
        System.out.println("price: ");
        long price = scanner.nextLong() * 100;

        System.out.println("start date in format yyyy/mm/dd");
        String[] date = scanner.next().split("/");
        GregorianCalendar startDate = new GregorianCalendar(Integer.parseInt(date[0]), Integer.parseInt(date[1]),
                Integer.parseInt(date[2]));

        System.out.println("end date in format yyyy/mm/dd");
        date = scanner.next().split("/");
        GregorianCalendar endDate = new GregorianCalendar(Integer.parseInt(date[0]), Integer.parseInt(date[1]),
                Integer.parseInt(date[2]));

        System.out.println("transport by: ");
        String transport = scanner.next();

        System.out.println("info about hotel:\nname:");
        String hotelName = scanner.next();
        System.out.println("address in format country/city/street/house number");
        String[] addressAr = scanner.next().split("/");
        Address address = new Address(addressAr[0], addressAr[1], addressAr[2],
                Integer.parseInt(addressAr[3]));
        System.out.println("price: ");
        long priceHotel = scanner.nextLong();
        System.out.println("rating: ");
        int rating = scanner.nextInt();
        Hotel hotel = new Hotel(hotelName, address, priceHotel, rating);

        admin.addTour(name, price, startDate, endDate, transport, hotel);
    }

    private void updateTourByAdmin() {
        System.out.println("enter id to be updated");
        int id = scanner.nextInt();

        System.out.println("enter new price");
        long newPrice = scanner.nextLong() * 100;

        System.out.println("enter new transport");
        String newTransport = scanner.next();

        admin.updateTour(id, newPrice);
        admin.updateTour(id, newTransport);
    }


}
