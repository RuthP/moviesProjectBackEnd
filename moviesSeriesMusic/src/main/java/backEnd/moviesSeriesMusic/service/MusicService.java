package backEnd.moviesSeriesMusic.service;

import backEnd.moviesSeriesMusic.domain.Music;
import backEnd.moviesSeriesMusic.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author rpalomino
 */
@Service
public class MusicService {

    @Autowired
    private MusicRepository musicRepository;

    public List<Music> listAllMusic () {
      return musicRepository.findAll();
    }

    public Music saveMusic (Music music){
      return musicRepository.save(music);
    }

    public Music findMusicById (String id){

      Optional<Music> music = musicRepository.findById(id);

      if(music.isPresent()){
        return music.get();
      }else{
        return new Music();
      }

    }

    public void deleteMusic (String id){

      Music musicDelete = findMusicById(id);

      musicRepository.delete(musicDelete);

    }

    public Music updateMusic (String id, Music music){

      Music musicUpdate = findMusicById(id);
      musicUpdate.setNameArtistGroup(music.getNameArtistGroup());
      musicUpdate.setNameAlbum(music.getNameAlbum());
      musicUpdate.setYearAlbum(music.getYearAlbum());
      musicUpdate.setGender(music.getGender());
      musicUpdate.setPart(music.getPart());
      musicUpdate.setCoverPage(music.getCoverPage());
      musicUpdate.setSecondCover(music.getSecondCover());

      return musicRepository.save(musicUpdate);

    }
}
