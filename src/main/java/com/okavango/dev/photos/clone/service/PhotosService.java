package com.okavango.dev.photos.clone.service;

import com.okavango.dev.photos.clone.model.Photo;
import com.okavango.dev.photos.clone.repository.PhotosRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;

//@Component
@Service
public class PhotosService {

    private final PhotosRepository photosRepository;

    public PhotosService(PhotosRepository photosRepository) {
        this.photosRepository = photosRepository;
    }

    public Iterable<Photo> get(){
        return photosRepository.findAll();
    }

    public Photo get(Integer id) {
        return photosRepository.findById(id).orElse(null);
    }

    public void remove(Integer id) {
         photosRepository.deleteById(id);
    }
    public Photo save(String fileName, String contentType, byte[] data) {
        Photo photo = new Photo();
        photo.setContentType(contentType);
        photo.setFileName(fileName);
        photo.setData(data);
        photosRepository.save(photo);
        return photo;
    }
}
