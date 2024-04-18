/**
 * 
 */
package com.rasool.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rasool.DMS.Models.Dog;

/**
 * @author Khaja Nayab Rasool Shaik
 */
public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);
}
