package com.ms.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ms.entity.Artist;
import com.ms.service.IArtistMgmtService;
@Component
public class CrudRepositoryTestRunner implements CommandLineRunner {
@Autowired
	private IArtistMgmtService artistService;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Artist artist = new Artist(99999.0);
//		artist.setAname("Jay");
		try {
		System.out.println(artistService.removeArtistById(1));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
