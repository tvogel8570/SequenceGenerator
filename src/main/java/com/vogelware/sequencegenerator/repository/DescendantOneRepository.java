package com.vogelware.sequencegenerator.repository;

import com.vogelware.sequencegenerator.entity.DescendantOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DescendantOneRepository extends JpaRepository<DescendantOne, Long> {
}