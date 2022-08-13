package com.milol.test_vote.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.milol.test_vote.model.Feature;

public interface FeatureRepository extends JpaRepository<Feature, Long> {

}
