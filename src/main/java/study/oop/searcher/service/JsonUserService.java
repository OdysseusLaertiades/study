package study.oop.searcher.service;

import study.oop.searcher.model.Company;
import study.oop.searcher.model.User;

import java.util.Arrays;

import static java.lang.String.format;

public class JsonUserService implements UserService {

    private User[] usersArr = new User[0];
    User user = new User();

    @Override
    public void saveUser(User user) {
        int i = 0;
        while (i < usersArr.length) {
            if (usersArr[i] == user) {
                throw new RuntimeException(format("user %s already contained  in list", user));
            }
            i++;
        }
        if (i == usersArr.length) {
            usersArr = Arrays.copyOf(usersArr, i + 1);
            usersArr[i] = user;
        }
    }

    @Override
    public void deleteUser(String userId) {
        int idIn = Integer.parseInt(userId);
        if (usersArr.length < idIn) {
            throw new RuntimeException(format("id user %s already contained  in list", userId));
        }
        System.arraycopy(usersArr, idIn + 1, usersArr, idIn - 1, usersArr.length - idIn - 1);
        usersArr = Arrays.copyOf(usersArr, usersArr.length - 1);
    }

    @Override
    public User findUserById(String userId) {
        int idIn = Integer.parseInt(userId);
        if (usersArr.length < idIn) {
            throw new RuntimeException(format("id user %s doesn't contained  in list", userId));
        }
        return usersArr[idIn];
    }

    @Override
    public User updateUserCompany(Company company) {
        if (user.getCompany().equals(company)) {
            throw new RuntimeException(format("company %s already contained  in list", company));
        }
        user.setCompany(company);
        return user;
    }

    @Override
    public User[] findAllByCity(String city) {
        User[] userList = new User[0];
        int i = 0;
        for (User user : usersArr) {
            if (user.getAddress().equals(city)) {
                userList = Arrays.copyOf(userList, i + 1);
                userList[i] = user;
                i++;
            }
        }
        return userList;
    }

    @Override
    public User[] findAllUsers() {
        return usersArr;
    }
}
