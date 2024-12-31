package gradproject.webservice.service;

import gradproject.webservice.dto.UserDto;
import gradproject.webservice.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto user);
    User findByEmail(String email);
    User findUserById(Long id);
    List<UserDto> findAllUsers();
}
