/**
 * 
 */
package com.redisexample.model;

import org.springframework.data.redis.core.RedisHash;

/**
 * @author zentere
 *
 */
@RedisHash("user")
public class User {

	public enum Gender {
		MALE, FEMALE
	}

	private String id;
	private String name;
	private Gender gender;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

}
