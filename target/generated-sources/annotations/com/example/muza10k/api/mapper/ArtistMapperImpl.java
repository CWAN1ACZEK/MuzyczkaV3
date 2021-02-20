package com.example.muza10k.api.mapper;

import com.example.muza10k.api.domain.ArtistDTO;
import com.example.muza10k.model.Artist;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-02-19T00:03:03+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.1 (Oracle Corporation)"
)
@Component
public class ArtistMapperImpl implements ArtistMapper {

    @Override
    public ArtistDTO artistToArtistDTO(Artist artist) {
        if ( artist == null ) {
            return null;
        }

        ArtistDTO artistDTO = new ArtistDTO();

        artistDTO.setId( artist.getId() );
        artistDTO.setFirstName( artist.getFirstName() );
        artistDTO.setLastName( artist.getLastName() );
        artistDTO.setNick( artist.getNick() );

        return artistDTO;
    }
}
