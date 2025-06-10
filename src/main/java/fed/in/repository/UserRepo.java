package fed.in.repository;

import fed.in.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    //Adding custom for performing database operation...if needed
    Optional<User> findByEmail(String email);
}
