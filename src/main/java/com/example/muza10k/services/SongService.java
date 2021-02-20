package com.example.muza10k.services;

import com.example.muza10k.api.domain.SongDTO;

import java.util.List;

public interface SongService {

    List<SongDTO> getAllSongs();

    SongDTO getSongById(Long id);

    List<SongDTO> getSongByTitle(String title);

    List<SongDTO> getSongByIsmn(String ismn);

    List<SongDTO> getSongByYear(String year);
    

    List<SongDTO> getSongByGenre(String genre);
}
