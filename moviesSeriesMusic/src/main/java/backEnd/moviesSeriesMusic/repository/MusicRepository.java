package backEnd.moviesSeriesMusic.repository;

import backEnd.moviesSeriesMusic.domain.Music;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author rpalomino
 */
public interface MusicRepository extends MongoRepository<Music,String> {
}
