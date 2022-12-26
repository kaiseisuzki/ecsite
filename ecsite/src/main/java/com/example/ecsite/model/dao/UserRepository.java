package com.example.ecsite.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ecsite.model.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	List<User> findByUserNameAndPassword(String userName, String password);

}
