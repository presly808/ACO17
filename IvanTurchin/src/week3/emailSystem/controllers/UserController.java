package week3.emailSystem.controllers;

import week3.emailSystem.dataBase.DataBase;
import week3.emailSystem.models.*;

import java.util.Arrays;

public class UserController{

    private DataBase dataBase;
    private User entered;

    private StringBuilder builder = new StringBuilder();

    public UserController(DataBase dataBase) {

        if (dataBase == null) {
            return;
        }

        this.dataBase = dataBase;
    }

    public void checkIn(User user) {

        if (user == null) {
            return;
        }

        dataBase.addUser(user);
        entered = user;
    }

    public void changeUser(User user) {

        if (user == null || !dataBase.contains(user)) {
            return;
        }

        entered = user;
    }

    public void writeLetter(Letter letter) {

        if (letter == null || this.entered == null || !dataBase.contains(this.entered)) {
            return;
        }

        dataBase.addLetter(letter);
    }

    public void removeLetter(int index) {

        if (index < 0 || index >= dataBase.getLetters().length || entered == null) {
            return;
        }

        dataBase.removeLetter(index);
    }

    public String showAllUsers() {
        if (dataBase.getUsers().length == 0) {
            return "no users";
        }

        return Arrays.toString(dataBase.getUsers());
    }

    public void makeFriendRequest(FriendRequest request) {

        dataBase.addFriendRequest(request);
    }

    public String showFriendRequests() {

        String res = "";

        for (int i = 0; i < dataBase.getFriendRequests().length; i++) {
            if (dataBase.getFriendRequests()[i].getIdReceiver() == entered.getId()) {
                res += builder.append(dataBase.getFriendRequests()[i].toString()).append("\n");
            }
        }

        return res;
    }

    public void acceptFriendRequest(int index) {

        if (index < 0 || index >= dataBase.getFriendRequests().length) {
            return;
        }

        dataBase.confirm(index);

    }

    public String showFriends() {

        String res = "";

        for (int i = 0; i < dataBase.getConfirmedRequests().length; i++) {
            if (dataBase.getConfirmedRequests()[i].getIdReceiver() == entered.getId()) {
                res +=builder.append(dataBase.getConfirmedRequests()[i].getCreator().toString()).append("\n");
            }
        }

        return res;
    }

    public String showIncomingLetters(){

        String res = "";

        for (int i = 0; i < dataBase.getLetters().length; i++) {
            if (dataBase.getLetters()[i].getReceiverId() == entered.getId()) {
                res += builder.append(dataBase.getLetters()[i].toString()).append("\n");
            }
        }

        return res;
    }

    public String showSentLetters() {

        String res = "";

        for (int i = 0; i < dataBase.getLetters().length; i++) {
            if (dataBase.getLetters()[i].getOwnerId() == entered.getId()) {
                res += builder.append(dataBase.getLetters()[i].toString()).append("\n");
            }
        }

        return res;
    }

    public User getEntered() {
        return entered;
    }
}
