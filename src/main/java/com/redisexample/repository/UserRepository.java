/**
 * 
 */
package com.redisexample.repository;

import org.springframework.data.repository.CrudRepository;

import com.redisexample.model.User;

/**
 * @author zentere
 *
 */
public interface UserRepository extends CrudRepository<User, String> {

}
