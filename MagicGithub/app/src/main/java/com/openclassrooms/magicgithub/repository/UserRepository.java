package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.api.FakeApiServiceGenerator;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService;

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
       List<User> users = apiService.getUsers();

        return users;
    }

    public void generateRandomUser() {
       apiService.generateRandomUser();
    }

    public void deleteUser(User user) {
       apiService.deleteUser(user);
    }
}
