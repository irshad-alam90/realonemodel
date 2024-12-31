package com.realone.realonemodel.repository.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.realone.realonemodel.model.users.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByUserId(String username);

}
