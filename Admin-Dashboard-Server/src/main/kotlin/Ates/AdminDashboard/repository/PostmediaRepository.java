package Ates.AdminDashboard.repository;

import Ates.AdminDashboard.model.Postmedia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostmediaRepository extends JpaRepository<Postmedia, Long> {
    Postmedia findPostmediaByPostmedia(Long postmedia);

    void deletePostmediaByPostmedia(Long postmedia);
}
