package com.jw.web.accessingdatajpa;


import java.util.List;

import com.jw.web.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    public User findById(long id);
}