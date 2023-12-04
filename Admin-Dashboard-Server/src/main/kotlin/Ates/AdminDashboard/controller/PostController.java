package Ates.AdminDashboard.controller;

import Ates.AdminDashboard.model.Post;
import Ates.AdminDashboard.model.Users;
import Ates.AdminDashboard.service.PostService;
import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/Post")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Post> getPost(@PathVariable("id") Long id) {
        Post post = postService.findPostByPostID(id);
        return new ResponseEntity<>(post, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Post> addPost(@RequestBody Post post) {
        Post newPost = postService.addPost(post);
        return new ResponseEntity<>(newPost, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Post>> getAllPosts() {
        List<Post> posts = postService.findAllPosts();
        return new ResponseEntity<>(posts, HttpStatus.OK);
    }



    @Transactional
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Post> deletePost(@PathVariable("id") Long id) {
        postService.deletePost(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Post> updatePost(@RequestBody Post post) {
        Post updatePost = postService.updatePost(post);
        return new ResponseEntity<>(updatePost, HttpStatus.OK);
    }
}
