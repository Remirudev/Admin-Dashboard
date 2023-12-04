package Ates.AdminDashboard.service;

import Ates.AdminDashboard.model.Postmedia;
import Ates.AdminDashboard.model.Users;
import Ates.AdminDashboard.repository.PostmediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostmediaService {

    private final PostmediaRepository postmediaRepository;

    @Autowired
    public PostmediaService(PostmediaRepository postmediaRepository) {
        this.postmediaRepository = postmediaRepository;
    }

    public Postmedia addPostmedia(Postmedia postmedia) {
        return postmediaRepository.save(postmedia);
    }
    public List<Postmedia> findAllPostmedia(){
        return postmediaRepository.findAll();
    }
    public Postmedia findPostmediaByPostmedia(Long postmedia) {
        return postmediaRepository.findPostmediaByPostmedia(postmedia);
    }
    public void deletePostmedia(Long postmedia) {
        postmediaRepository.deletePostmediaByPostmedia(postmedia);
    }
}
