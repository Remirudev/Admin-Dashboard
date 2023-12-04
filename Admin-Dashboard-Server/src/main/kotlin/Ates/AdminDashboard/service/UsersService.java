package Ates.AdminDashboard.service;

import Ates.AdminDashboard.model.Post;
import Ates.AdminDashboard.model.Users;
import Ates.AdminDashboard.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    private final UsersRepository usersRepository;

    @Autowired
    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public Users addUser(Users user) {
        return usersRepository.save(user);
    }
    public List<Users> findAllUsers(){
        return usersRepository.findAll();
    }
    public Users findUserByUserID(Long userID) {
        return usersRepository.findUsersByUserID(userID);
    }
    public void deleteUser(Long userID) {
        usersRepository.deleteUsersByUserID(userID);
    }
    public Users updateUser(Users user) {
        return usersRepository.save(user);
    }
}
