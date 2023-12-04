package Ates.AdminDashboard.service;

import Ates.AdminDashboard.model.Mediafile;
import Ates.AdminDashboard.repository.MediafileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediafileService {
    private final MediafileRepository mediafileRepository;

    @Autowired
    public MediafileService(MediafileRepository mediafileRepository) {
        this.mediafileRepository = mediafileRepository;
    }

    public Mediafile addMediafile(Mediafile mediafile) {
        return mediafileRepository.save(mediafile);
    }
    public List<Mediafile> findAllMediafiles(){
        return mediafileRepository.findAll();
    }

    public Mediafile findMediafileByMediaID(Long mediaID) {
        return mediafileRepository.findMediafileByMediaID(mediaID);
    }

    public void deleteMediafile(Long mediaID) {
        mediafileRepository.deleteMediafileByMediaID(mediaID);
    }

}
