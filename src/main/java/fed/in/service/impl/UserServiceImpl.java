package fed.in.service.impl;

import fed.in.DTOs.UserRequestDto;
import fed.in.DTOs.UserResponseDto;
import fed.in.entity.User;

import fed.in.repository.UserRepo;
import fed.in.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

@Autowired
private final UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    @CacheEvict(value = "users", allEntries = true)
    public UserResponseDto createUser(UserRequestDto dto) {
        User user = new User();
        user.setName(dto.getName());
        user.setLastName(dto.getLastName());
        user.setEmail(dto.getEmail());
        user.setMobile(dto.getMobile());

        User saved = userRepo.save(user);
        return mapToDto(saved);
    }

    @Override
    @Cacheable(value = "users", key = "'allUsers'")
    public List<UserResponseDto> getAllUsers() {
        System.out.println("Fetching Data from DB...");
        return userRepo.findAll().stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    @Cacheable(value = "user", key = "#id")
    public UserResponseDto getUserById(Long id) {
        System.out.println("Fetching from DB...");
        User user = userRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return mapToDto(user);
    }

    @Override
    @CacheEvict(value = "user", key = "#id")
    public UserResponseDto updateUser(Long id, UserRequestDto dto) {
        User user = userRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        user.setName(dto.getName());
        user.setLastName(dto.getLastName());
        user.setEmail(dto.getEmail());
        user.setMobile(dto.getMobile());

        return mapToDto(userRepo.save(user));
    }

    @Override
    @CacheEvict(value = { "user", "users" }, key = "#id", allEntries = true)
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }

    private UserResponseDto mapToDto(User user) {
        return new UserResponseDto(
                user.getId(),
                user.getName(),
                user.getLastName(),
                user.getEmail(),
                user.getMobile()
        );
    }
}
