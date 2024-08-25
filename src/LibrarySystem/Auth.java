package LibrarySystem;

import java.io.*;
import java.util.*;

public class Auth {
  private List<User> Users;

  public Auth() {
    Users = new ArrayList<>();
  }

  public boolean isRegister(String username, String password, String role) {
    for (User user : Users) {
      if (user.getUsername().equals(username)) {
        return false;
      }
    }
    Users.add(new User(username, password, role));

    return true;
  }

  public User login(String username, String password) {
    for (User user : Users) {
      if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
        return user;
      }
    }

    return null;
  }
}
