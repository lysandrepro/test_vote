package com.milol.test_vote.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.milol.test_vote.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
