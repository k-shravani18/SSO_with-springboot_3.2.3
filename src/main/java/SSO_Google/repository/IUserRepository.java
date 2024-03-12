package SSO_Google.repository;


import SSO_Google.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {


//    @Query("SELECT u FROM User u WHERE u.username = ?1 AND u.password = ?2 AND u.role = ?3")
//    User findByUsernameAndPasswordAndRole(String username, String password);
//    User findUserByUsername(String username);
}
