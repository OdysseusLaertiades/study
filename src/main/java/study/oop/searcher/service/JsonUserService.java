package study.oop.searcher.service;

import study.oop.searcher.model.Company;
import study.oop.searcher.model.User;

import java.util.ArrayList;

public class JsonUserService implements UserService {
  ArrayList<User> users = new ArrayList();
  ArrayList idUser = new ArrayList();
  User usr = new User();

  @Override
  public void saveUser(User user) {
    users.add(user);
    idUser.add(usr.id);
  }

  @Override
  public void deleteUser(String userId) {
    users.remove(idUser.indexOf(userId));
    idUser.remove(idUser.indexOf(userId));
  }

  @Override
  public User findUserById(String userId) {
    return users.get(idUser.indexOf(userId));
  }

  @Override
  public User updateUserCompany(Company company) {
    User companyOfUser = new User(company);
    return companyOfUser;
  }

  @Override
  public User[] findAllByCity(String city) {
    return new User[0];
  }

  @Override
  public User[] findAllUsers() {
    return new User[0];
  }
}
