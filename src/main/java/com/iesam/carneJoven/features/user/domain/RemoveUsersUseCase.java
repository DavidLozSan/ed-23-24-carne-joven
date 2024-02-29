package com.iesam.carneJoven.features.user.domain;

public class RemoveUsersUseCase {
    public final UserRepository userRepository;

    public RemoveUsersUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void execute() {
        this.userRepository.remove();
    }
}
