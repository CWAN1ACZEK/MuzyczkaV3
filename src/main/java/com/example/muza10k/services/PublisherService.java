package com.example.muza10k.services;


import com.example.muza10k.api.domain.PublisherDTO;

import java.util.List;

public interface PublisherService {

    List<PublisherDTO> getAllPublishers();

    PublisherDTO getPublisherById(Long id);

    List<PublisherDTO> getPublisherByName(String names);

    List<PublisherDTO> getPublisherByNip(String nip);
}
