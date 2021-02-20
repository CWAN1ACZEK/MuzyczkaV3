package com.example.muza10k.repositories;


import com.example.muza10k.model.Publisher;
import org.springframework.data.repository.CrudRepository;


import java.util.List;


public interface PublisherRepository extends CrudRepository<Publisher, Long> {
    List<Publisher> getAllPublisher();
    List<Object> getPublisherByName(String unknown);

}