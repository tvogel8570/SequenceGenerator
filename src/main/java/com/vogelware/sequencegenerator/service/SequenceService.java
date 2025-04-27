package com.vogelware.sequencegenerator.service;

import com.vogelware.sequencegenerator.entity.DescendantOne;
import com.vogelware.sequencegenerator.entity.DescendantTwo;


public interface SequenceService {
    DescendantOne createDescendantOne();

    DescendantTwo createDescendantTwo();
}
