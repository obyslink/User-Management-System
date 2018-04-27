package krzysztof.companytask.UserManagementSystem.services;

import krzysztof.companytask.UserManagementSystem.domain.User;

import java.util.Set;

public interface UsersService {
    Set<User> getUsers();
    User getUserById(Long id);
    void deleteUserById(Long id);
}
