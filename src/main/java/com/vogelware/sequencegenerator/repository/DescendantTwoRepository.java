package com.vogelware.sequencegenerator.repository;

import com.vogelware.sequencegenerator.entity.DescendantTwo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DescendantTwoRepository extends JpaRepository<DescendantTwo, Long> {
}