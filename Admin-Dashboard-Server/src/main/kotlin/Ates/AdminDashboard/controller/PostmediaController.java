package Ates.AdminDashboard.controller;

import Ates.AdminDashboard.model.Postmedia;
import Ates.AdminDashboard.service.PostmediaService;
import jakarta.transaction.Transactional;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/Postmedia")
public class PostmediaController {

    private final PostmediaService postmediaService;

    public PostmediaController(PostmediaService postmediaService) {
        this.postmediaService = postmediaService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Postmedia>> getAllPostmedia(){
        List<Postmedia> postmedia = postmediaService.findAllPostmedia();
        return new ResponseEntity<>(postmedia, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Postmedia> getPostmediaByPostmedia(@PathVariable("id") Long id){
       Postmedia postmedia = postmediaService.findPostmediaByPostmedia(id);
        return new ResponseEntity<>(postmedia, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Postmedia> addPostmedia(@RequestBody Postmedia postmedia){
        Postmedia newPostmedia = postmediaService.addPostmedia(postmedia);
        return new ResponseEntity<>(newPostmedia, HttpStatus.OK);
    }

    @Transactional
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Postmedia> deletePostmedia(@PathVariable("id") Long id){
        postmediaService.deletePostmedia(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
