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
		Artist artist = new Artist(67778.0);
		artist.setAname("Tom");
		try {
			String msg=artistService.registerArtist(artist);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
