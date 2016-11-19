package car;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        System.out.println("input money that you have: ");
        int money = new Scanner(System.in).nextInt();

        CarUtils utils = new CarUtils();

        toMainMenu:

        while (true) {
            mainMenu();
            int in = new Scanner(System.in).nextInt();

            if (in == 1) {
                while (true) {
                    shopMenu(money);
                    int choose = new Scanner(System.in).nextInt();

                    if (choose == 1) {
                        if (money >= 10000) {
                            System.out.println("You bought Audi");
                            utils.shop(money, "audi");
                            money -= 10000;
                        } else {
                            System.out.println("You haven't enough money");
                        }
                    } else if (choose == 2) {
                        if (money >= 9000) {
                            System.out.println("You bought BMW");
                            utils.shop(money, "bmw");
                            money -= 9000;
                        } else {
                            System.out.println("You haven't enough money");
                        }
                    } else if (choose == 3) {
                        if (money >= 40000) {
                            System.out.println("You bought Ferrari");
                            utils.shop(money, "ferrari");
                            money -= 40000;
                        } else {
                            System.out.println("You haven't enough money");
                        }
                    } else if (choose == 4) {
                        if (money >= 4000) {
                            System.out.println("You bought Ford");
                            utils.shop(money, "ford");
                            money -= 4000;
                        } else {
                            System.out.println("You haven't enough money");
                        }
                    } else if (choose == 5) {
                        continue toMainMenu;
                    } else {
                        System.out.println("Incorrect value");
                    }
                }
            } else if (in == 2) {
                toGarage:

                while (true) {
                    garageMenu(utils.cars.length);
                    int ch = new Scanner(System.in).nextInt();

                    if (ch == 1) {
                        System.out.println(utils.showAll());
                    } else if (ch == 2) {
                        System.out.println("Input index of car, that you wanna sit: ");
                        int index = new Scanner(System.in).nextInt();

                        if (index <= 0 || index > utils.cars.length) {
                            continue toGarage;
                        }
                        while (true) {
                            carMenu(utils.cars[index - 1].getModel(), utils.cars[index - 1].fuel);
                            int carChoose = new Scanner(System.in).nextInt();

                            Car car = utils.cars[index - 1];

                            if (carChoose == 1) {
                                System.out.println("Input key");
                                String key = new Scanner(System.in).next();
                                boolean isOpen = utils.open(car, key);

                                System.out.println(isOpen ? "car opened" : "incorrect key");

                            } else if (carChoose == 2) {
                                System.out.println("Input key");
                                String key = new Scanner(System.in).next();
                                boolean isClosed = utils.close(car, key);

                                System.out.println(isClosed ? "car closed" : "incorrect key");

                            } else if (carChoose == 3) {
                                System.out.println("you have " + money + " dollars" +
                                        "\nInput type of fuel\n80 / 91 / 92 / 95 / 98");
                                String type = new Scanner(System.in).next();

                                System.out.println("Input volume");
                                int volume = new Scanner(System.in).nextInt();

                                money = utils.charge(car, type, money, volume);

                                System.out.println("Car charged by " + car.fuel + "liters\nyour left " + money);
                            } else if (carChoose == 4) {
                                boolean isGoing = utils.go(car);
                                System.out.println(isGoing ? "car is moving" : "nope");
                            } else if (carChoose == 5) {
                                System.out.println(utils.showDetails(car));
                            } else if (carChoose == 6) {
                                continue toGarage;
                            } else {
                                System.out.println("Incorrect value");
                                continue toGarage;
                            }
                        }
                    } else if (ch == 3) {
                        continue toMainMenu;
                    } else {
                        System.out.println("Incorrect value");
                        continue toMainMenu;
                    }
                }
            } else if (in == 3) {
                System.out.println("Input money that you have:");
                money += new Scanner(System.in).nextInt();
                System.out.println("your have " + money + " dollars");
            } else if (in == 4) {
                return;
            }
        }
    }

    private static void mainMenu() {
        System.out.println("Input 1, if you wanna go to the shop\n" +
                           "Input 2, if you wanna go to the garage\n" +
                           "Input 3, if you wanna to update your balance\n" +
                           "Input 4 to exit");
    }

    private static void garageMenu(int countOfCars) {
        System.out.println("*** Garage *** \nCars in garage " + countOfCars + "\n" +
                           "if you wanna to show all cars, input 1\n" +
                           "if you wanna to get car, input 2\n" +
                           "if you wanna to exit, input 3");
    }

    private static void carMenu(String model, double fuel) {
        System.out.println("*** " + model + " ***\n" +
                           "current fuel --> " + fuel + " liters\n" +
                           "if you wanna to open car, input 1\n" +
                           "if you wanna to close car, input 2\n" +
                           "if you wanna to charge car, input 3\n" +
                           "if you wanna to move, input 4\n" +
                           "if you wanna to show details, input 5\n" +
                           "if you wanna to leave car, input 6");
    }

    private static void shopMenu(int money) {
        System.out.println("*** car shop *** \nyou have " + money + " dollars\n" +
                           "1.Audi \n   price - " + 10000 + "\n" +
                           "2.BMW \n   price - " + 9000 + "\n" +
                           "3.Ferrari \n   price - " + 40000 + "\n" +
                           "4.ford \n   price - " + 4000 + "\n" +
                           "Input 5 to exit");
    }
}
