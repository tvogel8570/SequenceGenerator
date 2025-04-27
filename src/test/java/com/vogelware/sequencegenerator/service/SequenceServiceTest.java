package com.vogelware.sequencegenerator.service;

import com.vogelware.sequencegenerator.common.ServiceTest;
import com.vogelware.sequencegenerator.repository.DescendantOneRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

@ServiceTest
class SequenceServiceTest {
    @Autowired
    DescendantOneRepository repository;
    @Autowired
    SequenceService cut;

    @BeforeEach
    void setUp() {
        assertThat(cut).isNotNull();
        assertThat(repository).isNotNull();
    }

    @Test
//    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    void createDescendantOne() {
        var result = cut.createDescendantOne();
        assertThat(result).isNotNull();
    }
}