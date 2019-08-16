package com.cts.mentor.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.cts.mentor.entity.MentorSkills;

public interface MentorSkillRepository extends CrudRepository<MentorSkills, Integer> {
	
	List<MentorSkills> findById1(int id);

}
