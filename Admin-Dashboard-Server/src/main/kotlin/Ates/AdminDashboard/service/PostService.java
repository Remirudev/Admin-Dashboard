package Ates.AdminDashboard.service;

import Ates.AdminDashboard.model.Post;
import Ates.AdminDashboard.model.Users;
import Ates.AdminDashboard.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post addPost(Post post) {
        return postRepository.save(post);
    }
    public Post findPostByPostID(Long postID) {
        return postRepository.findPostByPostID(postID);
    }
    public List<Post> findAllPosts(){
        return postRepository.findAll();
    }

    public void deletePost(Long postID) {
        postRepository.deletePostByPostID(postID);
    }
    public Post updatePost(Post post) {
        return postRepository.save(post);
    }
}
