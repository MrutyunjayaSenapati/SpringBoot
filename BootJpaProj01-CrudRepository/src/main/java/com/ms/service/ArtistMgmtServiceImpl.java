package com.ms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.entity.Artist;
import com.ms.repository.IArtistRepository;
@Service("artistService")
public class ArtistMgmtServiceImpl implements IArtistMgmtService {
	@Autowired
	private IArtistRepository artistRepo;
	
	@Override
	public String registerArtist(Artist artist) {
		System.out.println("InMemory Proxy obj class name:"+artistRepo.getClass());
		
		// TODO Auto-generated method stub
		Artist artist1=artistRepo.save(artist);
		
		return artist1.getDocId()==null?"Artist is not saved(record not inserted)":"Artist is saved (Record inserted)";
	}

}
