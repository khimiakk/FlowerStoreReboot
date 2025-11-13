package ucu.apps.flowerstorereboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ucu.apps.flowerstorereboot.repository.AppUserRepository;
import ucu.apps.flowerstorereboot.user.AppUser;

@Service
public class AppUserService {

    private final AppUserRepository userRepository;

    @Autowired
    public AppUserService(AppUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<AppUser> getUsers() {
        return userRepository.findAll();
    }

    public AppUser addUser(AppUser user) {
        userRepository.findUserByEmail(user.getEmail())
                .ifPresent(u -> {
                    throw new IllegalStateException("Email already taken");
                });

        return userRepository.save(user);
    }

    public Optional<AppUser> getUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }
}
