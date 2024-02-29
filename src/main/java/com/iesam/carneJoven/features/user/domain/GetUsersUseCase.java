package com.iesam.carneJoven.features.user.domain;

import java.util.ArrayList;

public class GetUsersUseCase {
    public UserRepository userRepository;

    public GetUsersUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ArrayList<User> execute() {
        return userRepository.obtainUsers();
    }
}
