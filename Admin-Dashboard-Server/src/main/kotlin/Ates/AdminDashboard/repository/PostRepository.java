package Ates.AdminDashboard.repository;

import Ates.AdminDashboard.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    Post findPostByPostID(Long postID);
    void deletePostByPostID(Long postID);
}
