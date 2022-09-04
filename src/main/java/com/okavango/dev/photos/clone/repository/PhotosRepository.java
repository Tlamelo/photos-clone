package com.okavango.dev.photos.clone.repository;

import com.okavango.dev.photos.clone.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotosRepository extends CrudRepository<Photo,Integer> {

}
