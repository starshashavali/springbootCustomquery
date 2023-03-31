package com.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="userdetails")
public class UserEntity {
	@Id
	private Long id;
	private String name;
	private String address;
	private String email;
	private String gender;
	private String status;
	
	

}
