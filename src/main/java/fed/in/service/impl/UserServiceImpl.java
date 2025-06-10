package fed.in.service.impl;

import fed.in.DTOs.UserRequestDto;
import fed.in.DTOs.UserResponseDto;
import fed.in.entity.User;
import fed.in.repository.UserRepo;
import fed.in.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {


    @Override
    public UserResponseDto createUser(UserRequestDto dto) {
        return null;
    }

    @Override
    public List<UserResponseDto> getAllUsers() {
        return List.of();
    }

    @Override
    public UserResponseDto getUserById(Long id) {
        return null;
    }

    @Override
    public UserResponseDto updateUser(Long id, UserRequestDto dto) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }
}
