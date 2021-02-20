package com.example.muza10k.api.mapper;

import com.example.muza10k.api.domain.PublisherDTO;
import com.example.muza10k.model.Publisher;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-02-19T00:03:03+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.1 (Oracle Corporation)"
)
@Component
public class PublisherMapperImpl implements PublisherMapper {

    @Override
    public PublisherDTO publisherToPublisherDTO(Publisher publisher) {
        if ( publisher == null ) {
            return null;
        }

        PublisherDTO publisherDTO = new PublisherDTO();

        publisherDTO.setId( publisher.getId() );
        publisherDTO.setName( publisher.getName() );
        publisherDTO.setNip( publisher.getNip() );
        publisherDTO.setAddress( publisher.getAddress() );

        return publisherDTO;
    }
}
