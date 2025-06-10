package fed.in.service;

import fed.in.DTOs.UserRequestDto;
import fed.in.DTOs.UserResponseDto;
import fed.in.entity.User;

import java.util.List;

public interface UserService {

    UserResponseDto createUser(UserRequestDto dto);
    List<UserResponseDto> getAllUsers();
    UserResponseDto getUserById(Long id);
    UserResponseDto updateUser(Long id, UserRequestDto dto);
    void deleteUser(Long id);


}
