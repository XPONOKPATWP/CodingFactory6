package gr.aueb.cf.ch12;


import gr.aueb.cf.ch12.hwmodel.UserCredentials;
import gr.aueb.cf.ch12.hwmodel.User;

public class HwUserMain {
    public static void main(String[] args) {
        User user = new User(1L, "John", "Doe");

        UserCredentials userCredentials = new UserCredentials(1L, "johndoe", "password123");

        System.out.println("User: {" + user.getId() + ", " + user.getFirstname() + ", " + user.getLastname() + "}");

        System.out.println("UserCredentials: {" + userCredentials.getId() + ", " + userCredentials.getUsername() + ", " + userCredentials.getPassword() + "}");
    }
}
