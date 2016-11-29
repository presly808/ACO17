package week3.emailSystem.dataBase;

import week3.emailSystem.models.FriendRequest;
import week3.emailSystem.models.Letter;
import week3.emailSystem.models.Request;
import week3.emailSystem.models.User;

import java.util.ArrayList;

public class DataBase {

    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Request> requests = new ArrayList<>();
    private ArrayList<FriendRequest> friendRequests = new ArrayList<>();
    private ArrayList<FriendRequest> confirmedFRequests = new ArrayList<>();
    private ArrayList<Letter> letters = new ArrayList<>();

    public void confirm(int indexOfRequest) {

        if (indexOfRequest < 0 || indexOfRequest >= friendRequests.size()) {

        }

        FriendRequest fRequest = friendRequests.get(indexOfRequest);
        friendRequests.remove(indexOfRequest);
        confirmedFRequests.add(fRequest);
    }

    public boolean contains(User user) {

        return users.indexOf(user) != -1;
    }

    public void addUser(User user) {

        if (user == null || contains(user)) {
            return;
        }

        users.add(user);
    }

    public void removeUser(int index) {

        if (index < 0 || index >= users.size()) {
            return;
        }

        users.remove(index);
    }

    private boolean contains(Request request) {

        return requests.indexOf(request) != -1;
    }

    public void addRequest(Request request) {

        if (request == null || contains(request)) {
            return;
        }

        requests.add(request);
    }

    public void removeRequest(int index) {

        if (index < 0 || index >= requests.size()) {
            return;
        }

        requests.remove(index);
    }

    private boolean contains(FriendRequest request) {

        return friendRequests.indexOf(request) != -1;
    }

    public void addFriendRequest(FriendRequest friendRequest) {

        if (friendRequest == null || contains(friendRequest)) {
            return;
        }

        friendRequests.add(friendRequest);
    }

    public void removeFriendRequest(int index) {

        if (index < 0 || index >= friendRequests.size()) {
            return;
        }

        friendRequests.remove(index);
    }

    public void addLetter(Letter letter) {

        if (letter == null) {
            return;
        }

        letters.add(letter);
    }

    public void removeLetter(int index) {

        if (index < 0 || index >= letters.size()) {
            return;
        }

        letters.remove(index);
    }

    public User[] getUsers() {
        return users.toArray(new User[users.size()]);
    }

    public Request[] getRequests() {
        return requests.toArray(new Request[requests.size()]);
    }

    public FriendRequest[] getFriendRequests() {
        return friendRequests.toArray(new FriendRequest[friendRequests.size()]);
    }

    public Letter[] getLetters() {
        return letters.toArray(new Letter[letters.size()]);
    }

    public FriendRequest[] getConfirmedRequests() {
        return confirmedFRequests.toArray(new FriendRequest[confirmedFRequests.size()]);
    }
}
