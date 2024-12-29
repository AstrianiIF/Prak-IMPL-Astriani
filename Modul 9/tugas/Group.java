package tugas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Group {

    public List<User> getUsersSortedByMostRecentlyRegistered() {
        List<User> users = new ArrayList<>();
        if (!userDirectoryExists()) {
            return users;
        }
        addFoundUsersTo(users);
        sortByMostRecentlyRegistered(users);
        return users;
    }

    private boolean userDirectoryExists() {
        return true; // Placeholder
    }

    private void addFoundUsersTo(List<User> users) {
       
    }

    private void sortByMostRecentlyRegistered(List<User> users) {

        Collections.sort(users, (u1, u2) -> u2.getRegistrationDate().compareTo(u1.getRegistrationDate()));
    }
    
    public static void main(String[] args) {
        Group group = new Group();
        List<User> sortedUsers = group.getUsersSortedByMostRecentlyRegistered();

        System.out.println("Users sorted by most recently registered:");
        for (User user : sortedUsers) {
            System.out.println(user.getName() + " - Registered on: " + user.getRegistrationDate());
        }
    }
}

