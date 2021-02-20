package com.example.muza10k.services;

import com.example.muza10k.api.domain.ArtistDTO;

import java.util.List;

public interface ArtistService {

    List<ArtistDTO> getAllArtists();

    ArtistDTO getArtistById(Long id);

    List<ArtistDTO> getArtistByFirstName(String firstName);

    List<ArtistDTO> getArtistByLastName(String lastName);

    List<ArtistDTO> getArtistByNick(String nick);



}
