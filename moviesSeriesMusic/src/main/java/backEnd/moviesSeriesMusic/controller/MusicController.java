package backEnd.moviesSeriesMusic.controller;

import backEnd.moviesSeriesMusic.domain.Music;
import backEnd.moviesSeriesMusic.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author rpalomino
 */
@RestController
@RequestMapping("/music")
public class MusicController {

    @Autowired
    private MusicService musicService;

    @RequestMapping(
      method = RequestMethod.POST
    )
    public Music saveMusic (@RequestBody Music music){
      return musicService.saveMusic(music);
    }

    @RequestMapping(
      method = RequestMethod.GET
    )
    public List<Music> getAllMusic () {
      return musicService.listAllMusic();
    }

    @RequestMapping(
      value = "/{id}",
      method = RequestMethod.GET
    )
    public Music getMusicById (@PathVariable String id){
      return musicService.findMusicById(id);
    }

    @RequestMapping(
      value = "/{id}",
      method = RequestMethod.POST
    )
    public Music updateMusic (@PathVariable String id, @RequestBody Music music){
      return musicService.updateMusic(id,music);
    }

    @RequestMapping(
      value = "/{id}",
      method = RequestMethod.PUT
    )
    public void deleteMusicById (@PathVariable String id){
      musicService.deleteMusic(id);
    }

}
