package com.example.muza10k.repositories;


import com.example.muza10k.model.Artist;
import org.springframework.data.repository.CrudRepository;


import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface ArtistRepository extends CrudRepository<com.example.muza10k.model.Artist, Long> {
    Optional<com.example.muza10k.model.Artist> getFirstByFirstNameAndLastName(String firstName, String lastName);
    Optional<com.example.muza10k.model.Artist> getFirstByFirstName(String firstName);

    Collection<Artist> getAllArtist();

    Collection<Artist> getByFirstName(String firstName);

    List<Artist> getLastByLastName(String lastName);

    List<Artist> getByNick(String nick);
}

