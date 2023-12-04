package Ates.AdminDashboard.repository;

import Ates.AdminDashboard.model.Post;
import Ates.AdminDashboard.model.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {

    Users findUsersByUserID(Long userID);

    void deleteUsersByUserID(Long userID);
}
