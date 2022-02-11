package com.te.springsecurity.base.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User implements Serializable {

	@Id
	private int userId;
	private String userName;
	private String userPassword;
	private String userRole;
}
