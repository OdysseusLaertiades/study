package study.oop.searcher.service;

import study.oop.searcher.model.Company;
import study.oop.searcher.model.User;

public class JsonUserService implements UserService {

  @Override
  public void saveUser(User user) {

  }

  @Override
  public void deleteUser(String userId) {

  }

  @Override
  public User findUserById(String userId) {
    return null;
  }

  @Override
  public User updateUserCompany(String userId, Company company) {
    return null;
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
