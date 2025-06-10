package fed.in.service.impl;

import fed.in.entity.User;
import fed.in.repository.UserRepo;
import fed.in.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public void saveUser() {
    }

    @Override
    public User getUser(Long id) {
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return List.of();
    }

    @Override
    public String registerUser(User user) {
        return "";
    }

    @Override
    public String UpdateUser(Long id, User user) {
        return "";
    }
}
