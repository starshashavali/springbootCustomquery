package com.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.entity.UserEntity;

@Repository("/userRepo")
public interface UserRepositary  extends JpaRepository<UserEntity,Long>{
	

}
