package bank.business;

import bank.business.domain.User;
import java.util.HashMap;
import java.util.Map;

public class UserService {
    private Map<String, User> users;

    public UserService() {
        users = new HashMap<>();
        // Add default users
        users.put("user1", new User("user1", "password1"));
        users.put("user2", new User("user2", "password2"));
    }

    public boolean authenticate(String username, String password) {
        User user = users.get(username);
        return user != null && user.authenticate(password);
    }

    public void addUser(String username, String password) {
        users.put(username, new User(username, password));
    }
}
