package Ates.AdminDashboard.controller;

import Ates.AdminDashboard.model.Users;
import Ates.AdminDashboard.service.UsersService;
import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/Users")
public class UsersController {

    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Users>> getAllUsers(){
        List<Users> users = usersService.findAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Users> getUser(@PathVariable("id") Long id){
        Users user = usersService.findUserByUserID(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Users> addUser(@RequestBody Users user){
        Users newUser = usersService.addUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @Transactional
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Users> deleteUser(@PathVariable("id") Long id){
        usersService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Users> updateUser(@RequestBody Users user) {
        Users updateUser = usersService.updateUser(user);
        return new ResponseEntity<>(updateUser, HttpStatus.OK);
    }
}
