package fed.in.service;

import fed.in.entity.User;

import java.util.List;

public interface UserService {

    public  void saveUser();
    public User getUser(Long id);
    public List<User> getAllUser();
    public String registerUser(User user);
    public String UpdateUser(Long id,User user);


}
