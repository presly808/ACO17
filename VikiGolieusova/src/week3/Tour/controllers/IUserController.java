package week3.Tour.controllers;

/**
 * Created by Gus on 09.12.2016.
 */
public interface IUserController {
    String showAllTours();

    String buyTourRequest(int id, String name, String phone);

    String findTourByPrice(long money);
}
