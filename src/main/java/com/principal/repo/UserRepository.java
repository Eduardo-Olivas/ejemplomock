package com.principal.repo;

import org.springframework.stereotype.Repository;

import com.principal.model.User;

@Repository
public interface UserRepository extends BaseRepository<User, Long> {

}
