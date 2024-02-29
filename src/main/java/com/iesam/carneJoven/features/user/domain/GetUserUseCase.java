package com.iesam.carneJoven.features.user.domain;

public class GetUserUseCase {
    public final UserRepository userRepository;
    public GetUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User execute(String nif) {
        return userRepository.obtainUser(nif);
    }
}
