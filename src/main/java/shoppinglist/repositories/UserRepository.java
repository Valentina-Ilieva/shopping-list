package shoppinglist.repositories;

import org.modelmapper.ModelMapper;
import shoppinglist.domein.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shoppinglist.helpers.LoggedUser;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
