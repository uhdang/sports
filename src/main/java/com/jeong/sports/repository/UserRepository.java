package com.jeong.sports.repository;

import com.jeong.sports.api.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
