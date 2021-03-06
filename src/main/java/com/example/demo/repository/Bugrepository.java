package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Bug;

@Repository
public interface Bugrepository extends CrudRepository<Bug, Integer> {
	Bug findById(int id);
	List<Bug> findAll();
	

}