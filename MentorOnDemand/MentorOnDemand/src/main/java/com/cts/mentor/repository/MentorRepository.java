package com.cts.mentor.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cts.mentor.entity.Mentor;


public interface MentorRepository extends CrudRepository<Mentor, Integer> {

	List<Mentor> findById(int id);
    
	

}
