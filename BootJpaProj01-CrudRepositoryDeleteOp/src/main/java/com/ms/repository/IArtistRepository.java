package com.ms.repository;

import org.springframework.data.repository.CrudRepository;

import com.ms.entity.Artist;

public interface IArtistRepository extends CrudRepository<Artist,Integer> {

	
	
}
