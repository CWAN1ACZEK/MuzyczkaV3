package com.example.muza10k.services;

import com.example.muza10k.api.domain.PublisherDTO;
import com.example.muza10k.api.mapper.PublisherMapper;
import com.example.muza10k.repositories.PublisherRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PublisherServiceImpl implements PublisherService {

    PublisherRepository publisherRepository;
    PublisherMapper publisherMapper;

    public PublisherServiceImpl(PublisherRepository publisherRepository, PublisherMapper publisherMapper) {
        this.publisherRepository = publisherRepository;
        this.publisherMapper = publisherMapper;
    }

    @Override
    public List<PublisherDTO> getAllPublishers() {
        return publisherRepository.getAllPublisher()
                .stream()
                .map(publisherMapper::publisherToPublisherDTO)
                .collect(Collectors.toList());
    }

    @Override
    public PublisherDTO getPublisherById(Long id) {
        return publisherMapper.publisherToPublisherDTO(publisherRepository.findById(id).get());
    }

    @Override
    public List<PublisherDTO> getPublisherByName(String names) {
        return publisherRepository.getAllPublisher()
                .stream()
                .map(publisherMapper::publisherToPublisherDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<PublisherDTO> getPublisherByNip(String nip) {
        return publisherRepository.getAllPublisher()
                .stream()
                .map(publisherMapper::publisherToPublisherDTO)
                .collect(Collectors.toList());
    }


}
