package study.oop.searcher.service;

import study.oop.searcher.model.Company;
import study.oop.searcher.model.User;

import java.util.ArrayList;

public class JsonUserService implements UserService {

  ArrayList<User> usersArr = new ArrayList<User>();
  User user = new User();
  User[] userArray = new User[usersArr.size()];

  @Override
  public void saveUser(User user) {
    usersArr.add(user);
  }

  @Override
  public void deleteUser(String userId) {
    usersArr.remove(userId);
  }

  @Override
  public User findUserById(String userId) {
    return usersArr.get(Integer.parseInt(userId));
  }

  @Override
  public User updateUserCompany(Company company) {
    user.setCompany(company);
    return user;
  }

  @Override
  public User[] findAllByCity(String city) {
    for (int i = 0; i < userArray.length; i++){
      if (userArray[i].equals(city)) {
        return new User[i];
      }
    }
    return null;
  }

  @Override
  public User[] findAllUsers() {
    for (int i = 0; i < userArray.length; i++){
      if (i > 0) {
        return new User[i];
      }
    }
    return null;
  }
}
