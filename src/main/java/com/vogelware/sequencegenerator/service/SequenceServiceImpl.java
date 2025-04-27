package com.vogelware.sequencegenerator.service;

import com.vogelware.sequencegenerator.entity.DescendantOne;
import com.vogelware.sequencegenerator.entity.DescendantTwo;
import com.vogelware.sequencegenerator.repository.DescendantOneRepository;
import com.vogelware.sequencegenerator.repository.DescendantTwoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class SequenceServiceImpl implements SequenceService {
    private final DescendantOneRepository repository;
    private final DescendantTwoRepository repositoryTwo;


    @Transactional
    @Override
    public DescendantOne createDescendantOne() {
        return repository.save(new DescendantOne());
    }

    @Override
    public DescendantTwo createDescendantTwo() {
        return repositoryTwo.save(new DescendantTwo());
    }
}
