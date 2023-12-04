package Ates.AdminDashboard.repository;

import Ates.AdminDashboard.model.Mediafile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MediafileRepository extends JpaRepository<Mediafile, Long> {
    void deleteMediafileByMediaID(Long id);

    Mediafile findMediafileByMediaID(Long id);
}
