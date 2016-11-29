package week3.emailSystem.tests;

import week3.emailSystem.controllers.UserController;
import week3.emailSystem.dataBase.DataBase;
import week3.emailSystem.models.*;

public class TestUserController {

    public static void main(String[] args) {

        System.out.println("testCheckIn() --> " + testCheckIn() +
                           "\ntestChangeUser() --> " + testChangeUser() +
                           "\ntestWriteLetter() --> " + testWriteLetter() +
                           "\ntestRemoveLetter() --> " + testRemoveLetter() +
                           "\ntestShowAllUsers() --> " + testShowAllUsers() +
                           "\ntestMakeFriendRequest() --> " + testMakeFriendRequest() +
                           "\ntestShowFriendRequests() --> " + testShowFriendRequests() +
                           "\ntestAcceptFriendRequest() --> " + testAcceptFriendRequest() +
                           "\ntestShowFriends() --> " + testSowFriends() +
                           "\ntestShowIncoming() --> " + testShowIncoming() +
                           "\ntestShowSentLetters() --> " + testShowSentLetters());
    }

    private static boolean testCheckIn() {

        DataBase dataBase = new DataBase();
        User user = new User("aaa", "aaa@gmail.com", 1);

        UserController userController = new UserController(dataBase);
        userController.checkIn(user);

        return dataBase.getUsers()[0].equals(user) &&
                userController.getEntered().equals(user);
    }

    private static boolean testChangeUser() {

        DataBase dataBase = new DataBase();
        UserController userController = new UserController(dataBase);

        User user = new User("a", "a", 1);
        User user1 = new User("b", "b", 2);

        userController.checkIn(user1);
        userController.checkIn(user);
        userController.changeUser(user1);


        return userController.getEntered().equals(user1);
    }

    private static boolean testWriteLetter() {

        DataBase dataBase = new DataBase();
        User user = new User("aaa", "aaa@gmail.com", 1);
        Letter letter = new Letter(1, 1, "temp", "text", new Date(2016, 11, 28, new Time(22, 45)));

        UserController userController = new UserController(dataBase);
        userController.checkIn(user);

        userController.writeLetter(letter);

        return dataBase.getLetters()[0].equals(letter);
    }

    private static boolean testRemoveLetter() {

        DataBase dataBase = new DataBase();
        User user = new User("aaa", "aaa@gmail.com", 1);
        Letter letter = new Letter(1, 1, "temp", "text", new Date(2016, 11, 28, new Time(22, 45)));

        UserController userController = new UserController(dataBase);
        userController.checkIn(user);

        userController.writeLetter(letter);
        userController.removeLetter(0);

        return dataBase.getLetters().length == 0;
    }

    private static boolean testShowAllUsers() {

        DataBase dataBase = new DataBase();
        User user = new User("aaa", "aaa@gmail.com", 1);

        UserController userController = new UserController(dataBase);
        userController.checkIn(user);

        return userController.showAllUsers().contains("aaa");
    }

    private static boolean testMakeFriendRequest() {

        DataBase dataBase = new DataBase();
        User user = new User("aaa", "aaa@gmail.com", 2);
        User user1 = new User("receiver", "@gmail.com", 1);

        UserController userController = new UserController(dataBase);
        userController.checkIn(user);
        dataBase.addUser(user1);

        FriendRequest friendRequest = new FriendRequest(user, 1,
                new Date(2016, 11, 28, new Time(23, 3)), new Letter(2, 1, "f", "d",
                new Date(2016, 11, 28, new Time(23, 3))));

        userController.makeFriendRequest(friendRequest);

        return dataBase.getFriendRequests()[0].equals(friendRequest);
    }

    private static boolean testAcceptFriendRequest() {

        DataBase dataBase = new DataBase();
        User user = new User("aaa", "aaa@gmail.com", 2);
        User user1 = new User("receiver", "@gmail.com", 1);

        UserController userController = new UserController(dataBase);
        userController.checkIn(user);
        dataBase.addUser(user1);

        FriendRequest friendRequest = new FriendRequest(user, 1,
                new Date(2016, 11, 28, new Time(23, 3)), new Letter(2, 1, "f", "d",
                new Date(2016, 11, 28, new Time(23, 3))));

        userController.makeFriendRequest(friendRequest);

        userController.checkIn(user1);
        userController.acceptFriendRequest(0);

        return dataBase.getConfirmedRequests()[0].equals(friendRequest);
    }

    private static boolean testShowFriendRequests() {

        DataBase dataBase = new DataBase();
        User user = new User("aaa", "aaa@gmail.com", 2);
        User user1 = new User("receiver", "@gmail.com", 1);

        UserController userController = new UserController(dataBase);
        userController.checkIn(user);
        dataBase.addUser(user1);

        FriendRequest friendRequest = new FriendRequest(user, 1,
                new Date(2016, 11, 28, new Time(23, 3)), new Letter(2, 1,"f", "d",
                new Date(2016, 11, 28, new Time(23, 3))));

        userController.makeFriendRequest(friendRequest);
        userController.checkIn(user1);

        return userController.showFriendRequests().contains(friendRequest.toString());
    }

    private static boolean testSowFriends() {
        DataBase dataBase = new DataBase();
        User user = new User("aaa", "aaa@gmail.com", 2);
        User user1 = new User("receiver", "@gmail.com", 1);

        UserController userController = new UserController(dataBase);
        userController.checkIn(user);
        dataBase.addUser(user1);

        FriendRequest friendRequest = new FriendRequest(user, 1,
                new Date(2016, 11, 28, new Time(23, 3)), new Letter(2, 1, "f", "d",
                new Date(2016, 11, 28, new Time(23, 3))));

        userController.makeFriendRequest(friendRequest);
        userController.checkIn(user1);
        userController.acceptFriendRequest(0);

        return userController.showFriends().contains(user.toString());
    }

    private static boolean testShowIncoming() {

        DataBase dataBase = new DataBase();
        User user = new User("aaa", "aaa@gmail.com", 2);
        User user1 = new User("receiver", "@gmail.com", 1);

        UserController userController = new UserController(dataBase);
        userController.checkIn(user);
        dataBase.addUser(user1);

        Letter letter = new Letter(user.getId(), user1.getId(), "tittle", "text",
                new Date(2016, 11, 29, new Time(16, 4)));
        userController.writeLetter(letter);

        userController.checkIn(user1);
        return userController.showIncomingLetters().contains(letter.toString());
    }

    private static boolean testShowSentLetters() {

        DataBase dataBase = new DataBase();
        UserController userController = new UserController(dataBase);

        User user = new User("aaa", "aaa@gmail.com", 1);
        User user1 = new User("receiver", "res@gmail.com", 2);

        dataBase.addUser(user);
        userController.checkIn(user1);

        Letter letter = new Letter(2, 1, "tittle", "text",
                new Date(2016, 11, 29, new Time(16, 4)));

        userController.writeLetter(letter);

        return userController.showSentLetters().contains(letter.toString());
    }
}
