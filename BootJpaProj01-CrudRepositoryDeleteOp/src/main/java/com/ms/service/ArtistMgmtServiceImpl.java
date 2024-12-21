package com.ms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.entity.Artist;
import com.ms.repository.IArtistRepository;
@Service("artistService")
public class ArtistMgmtServiceImpl implements IArtistMgmtService {
	@Autowired
	private IArtistRepository artistRepo;
	
	@Override
	public String removeArtistById(int aid) {
//		long count=artistRepo.count();
//		if(count>0) {
//			artistRepo.deleteAll();
//			return count+"no of records are deleted";
//		}
//		return "No records found delete";
		
		Optional<Artist>opt=artistRepo.findById(aid);
		if(opt.isPresent()) {
			
			Artist artist=opt.get();
//			artist.setFee(artist.getFee()+(artist.getFee()*percentage/100.0f));
			artistRepo.save(artist);
			return "Artist is found and the Fee is Modified";
		}
		else {
			return "Artist is not found for Modification";
		}
		
	}

}
