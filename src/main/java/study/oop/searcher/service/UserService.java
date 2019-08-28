package study.oop.searcher.service;

import study.oop.searcher.model.Company;
import study.oop.searcher.model.User;

public interface UserService {

    void saveUser(User user);

    void deleteUser(String userId);

    User findUserById(String userId);

    User updateUserCompany(String userId, Company company);

    User[] findAllByCity(String city);

    User[] findAllUsers();

}
